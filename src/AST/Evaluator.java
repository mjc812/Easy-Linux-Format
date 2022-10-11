package AST;

import AST.Clauses.*;
import AST.Program.*;
import AST.Statements.*;
import AST.Statements.Commands.*;
import Exceptions.ClauseException;
import Exceptions.InvalidDateException;
import Exceptions.VariableNotDeclaredException;
import Parser.ELFLexer;
import Parser.ELFParser;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Evaluator implements ASTVisitor<PrintWriter, Boolean> {
    private final static String HOME_PATH_VAR = "HOME_PATH";
    private final Map<String, Integer> variables = new HashMap<>(); // <Name, Type>

    @Override
    public Boolean visit(Program p, PrintWriter writer) {
        p.getProgramPath().accept(writer, this);
        List<Statement> statements = p.getStatementList();
        boolean success = true;
        for (Statement s : statements) {
            success = success && s.accept(writer, this);
        }
        return success;
    }

    @Override
    public Boolean visit(ProgramPath p, PrintWriter writer) {
        writer.println(HOME_PATH_VAR + "=\"" + p.getPath() + "\"");
        return true;
    }

    @Override
    public Boolean visit(Get g, PrintWriter writer) {
        String var = g.getVariable();
        writer.print(var + "=");
        try {
            printFindCommand(g, writer);
        } catch (ClauseException e) {
            System.err.println("ERROR - Clause Exception: " + e);
            return false;
        } catch (VariableNotDeclaredException e) {
            System.err.println("ERROR - Variable Exception: " + e);
            return false;
        }
        variables.put(var, g.getVariableType());
        return true;
    }

    @Override
    public Boolean visit(Copy c, PrintWriter writer) {
        String toVar = c.getToVariable();
        String fromVar = c.getFromVariable();

        if (varNotDeclared(toVar)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable "
                    + toVar + " which does not exist");
            return false;
        }else if (varNotDeclared(fromVar)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable "
                    + fromVar + " which does not exist");
            return false;
        }

        if (variables.get(toVar) != ELFLexer.FOLDER) {
            System.err.println("ERROR - Type Error: " + toVar + " is not a folder");
            return false;
        }

        if (c.getType() == ELFLexer.COPY) {
            if (variables.get(fromVar) == ELFLexer.FILES) {
                System.err.println("ERROR - Type Error: first parameter of \"copy\" command cannot be a list type");
                return false;
            }
            writer.println("cp \"$" + fromVar + "\" \"$" + toVar + "\"");
        } else {
            if (variables.get(fromVar) != ELFLexer.FILES) {
                System.err.println("ERROR - Type Error: first parameter of \"copy all\" command must be a list type");
                return false;
            }
            writer.println("for file in $" + fromVar);
            writer.println("do");
            writer.println("\tcp \"$file\" \"$" + toVar + "\"");
            writer.println("done");
        }

        return true;
    }

    @Override
    public Boolean visit(Delete d, PrintWriter writer) {
        String var = d.getVariable();

        if (varNotDeclared(var)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable "
                    + var + " which does not exist");
            return false;
        }

        if (d.getType() == ELFLexer.DELETE) {
            if (variables.get(var) == ELFLexer.FILES) {
                System.err.println("ERROR - Type Error: parameter of \"delete\" command cannot be a list type");
                return false;
            }
            writer.println("rm -r \"$" + var + "\"");
        } else {
            if (variables.get(var) != ELFLexer.FILES) {
                System.err.println("ERROR - Type Error: parameter of \"delete\" command must be a list type");
                return false;
            }
            writer.println("for file in $" + var);
            writer.println("do");
            writer.println("\trm -r \"$file\"");
            writer.println("done");
        }

        return true;
    }

    @Override
    public Boolean visit(Move m, PrintWriter writer) {
        String fromVar = m.getFromVariable();
        String toVar = m.getToVariable();

        if (varNotDeclared(toVar)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable "
                    + toVar + " which does not exist");
            return false;
        } else if (varNotDeclared(fromVar)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable "
                    + fromVar + " which does not exist");
            return false;
        }

        if (variables.get(toVar) != ELFLexer.FOLDER) {
            System.err.println("ERROR - Type Error: " + toVar + " is not a folder");
            return false;
        }

        if (m.getType() == ELFLexer.MOVE) {
            if (variables.get(fromVar) == ELFLexer.FILES) {
                System.err.println("ERROR - Type Error: first parameter of \"move\" command cannot be a list type");
                return false;
            }
            writer.println("mv \"$" + fromVar + "\" \"$" + toVar + "\"");
        } else {
            if (variables.get(fromVar) != ELFLexer.FILES) {
                System.err.println("ERROR - Type Error: first parameter of \"move all\" command must be a list type");
                return false;
            }
            writer.println("for file in $" + fromVar);
            writer.println("do");
            writer.println("\tmv \"$file\" \"$" + toVar + "\"");
            writer.println("done");
        }

        return true;
    }

    @Override
    public Boolean visit(Rename r, PrintWriter writer) {
        String var = r.getVariable();
        String newName = r.getName();

        if (varNotDeclared(var)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable \""
                    + var + "\" which does not exist");
            return false;
        }
        if (variables.get(var) == ELFLexer.FILES) {
            System.err.println("ERROR - Type Exception: parameter of \"rename\" cannot be a list type.");
            return false;
        }

        writer.println("parentDir=$(dirname \"$" + var + "\")");
        writer.println("mv \"$" + var + "\" \"$parentDir/" + newName + "\"");

        return true;
    }

    @Override
    public Boolean visit(DateModifiedClause d, PrintWriter writer) {
        Date date;
        try {
            date = createDate(d.getDate());
        } catch (InvalidDateException e) {
            return false;
        }
        String dateStr = formatDate(date);
        Date dayAfter = getDayAfter(date);
        String dayAfterDateStr = formatDate(dayAfter);
        switch (d.getCondition()) {
            case ELFLexer.ON -> writer.print(" -newermt " + dateStr + " ! -newermt " + dayAfterDateStr);
            case ELFLexer.BEFORE -> writer.print(" ! -newermt " + dateStr);
            case ELFLexer.AFTER ->  writer.print(" -newermt " + dayAfterDateStr);
        }
        return true;
    }

    @Override
    public Boolean visit(InFolderClause f, PrintWriter writer) {
        String folderVar = f.getFolder();
        if (!variables.containsKey(folderVar)) {
            return false;
        } else {
            writer.print(" \"$" + folderVar + "\"");
            return true;
        }
    }

    @Override
    public Boolean visit(OwnedByUserClause o, PrintWriter writer) {
        writer.print(" -user " + o.getUser());
        return true;
    }

    @Override
    public Boolean visit(NameClause n, PrintWriter writer) {
        writer.print(" -name ");
        switch (n.getCondition()) {
            case ELFLexer.IS -> writer.print("\"" + n.getName() + "\"");
            case ELFLexer.CONTAINS -> writer.print("\"*" + n.getName() + "*\"");
            case ELFLexer.PREFIX -> writer.print("\"" + n.getName() + "*\"");
            case ELFLexer.SUFFIX -> writer.print("\"*" + n.getName() + "\"");
        }
        return true;
    }

    @Override
    public Boolean visit(AtPathClause p, PrintWriter writer) {
        writer.print(" \"$HOME_PATH\"" + p.getPath());
        return true;
    }

    private boolean varNotDeclared(String variable) {
        return !variables.containsKey((variable));
    }

    private void printFindCommand(Get g, PrintWriter writer) throws ClauseException, VariableNotDeclaredException {
        Map<Integer, List<Clause>> clauseMap = new HashMap<>();

        String type = getType(g);
        writer.print("$(find");

        for (Clause c : g.getClauseList()) {
            if (!clauseMap.containsKey(c.getType())) {
                clauseMap.put(c.getType(), new ArrayList<>());
            }
            clauseMap.get(c.getType()).add(c);
        }

        if (clauseMap.containsKey(ELFLexer.ATPATH)) {
            processAtPathClause(clauseMap, g, writer);
            return;
        }
        processInFolderClause(clauseMap, writer);

        if (!g.isRecursive()) {
            writer.print(" -maxdepth 1");
        }
        writer.print(" -type " + type);

        processNameClause(clauseMap, writer);
        processOwnedByUserClause(clauseMap, writer);
        processDateClause(clauseMap, writer);

        endFindCommand(g, writer);
    }

    private void processDateClause(Map<Integer, List<Clause>> clauseMap, PrintWriter writer) throws ClauseException {
        if (clauseMap.containsKey(ELFLexer.DATE)) {
            List<Clause> dateClauseList = clauseMap.get(ELFLexer.DATE);
            if (dateClauseList.size() > 1) {
                throw new ClauseException("Cannot have multiple date clauses");
            }
            DateModifiedClause dc = (DateModifiedClause) dateClauseList.get(0);
            boolean success = dc.accept(writer, this);
            if (!success) {
                throw new ClauseException("Invalid date");
            }
        }
    }

    private void processOwnedByUserClause(Map<Integer, List<Clause>> clauseMap, PrintWriter writer) throws ClauseException {
        if (!clauseMap.containsKey(ELFLexer.OWNED)) {
            return;
        }
        List<Clause> ownedClauseList = clauseMap.get(ELFLexer.OWNED);
        if (ownedClauseList.size() > 1) {
            throw new ClauseException("Cannot have multiple \"owned by\" clauses");
        }
        OwnedByUserClause oc = (OwnedByUserClause) ownedClauseList.get(0);
        oc.accept(writer, this);
    }

    private void processNameClause(Map<Integer, List<Clause>> clauseMap, PrintWriter writer) throws ClauseException {
        if (!clauseMap.containsKey(ELFParser.NAME)) {
            return;
        }
        List<Clause> nameClauseList = clauseMap.get(ELFParser.NAME);
        boolean hasPrefixClause = false;
        boolean hasSuffixClause = false;

        for (Clause c : nameClauseList) {
            NameClause nc = (NameClause) c;
            if (nc.getCondition() == ELFLexer.IS && nameClauseList.size() > 1) {
                throw new ClauseException("Cannot have multiple name clauses when one is a \"name is\" clauses");
            } else if (nc.getCondition() == ELFLexer.PREFIX) {
                if (hasPrefixClause) {
                    throw new ClauseException("Cannot have multiple \"prefix\" clauses");
                }
                hasPrefixClause = true;
            } else if (nc.getCondition() == ELFLexer.SUFFIX) {
                if (hasSuffixClause) {
                    throw new ClauseException("Cannot have multiple \"suffix\" clauses");
                }
                hasSuffixClause = true;
            }
            nc.accept(writer, this);
        }
    }

    private void processInFolderClause(Map<Integer, List<Clause>> clauseMap, PrintWriter writer) throws ClauseException, VariableNotDeclaredException {
        if (!clauseMap.containsKey(ELFParser.INFOLDER)) {
            writer.print(" \"$HOME_PATH\"");
            return;
        }
        List<Clause> inFolderClauses = clauseMap.get(ELFParser.INFOLDER);
        if (inFolderClauses.size() > 1) {
            throw new ClauseException("Cannot have multiple \"in folder\" clauses");
        }
        InFolderClause fc = (InFolderClause) inFolderClauses.get(0);
        boolean success = fc.accept(writer, this);
        if (!success) {
            throw new VariableNotDeclaredException("Tried to access folder variable that does not exist");
        }
    }

    private void processAtPathClause(Map<Integer, List<Clause>> clauseMap, Get g, PrintWriter writer) throws ClauseException {
        if (g.getGetVariableType() == ELFLexer.GETFILES) {
            throw new ClauseException("Cannot have an \"at path\" clause on type \"files\"");
        }
        if (clauseMap.size() > 1) {
            throw new ClauseException("Cannot have multiple clauses when one is an \"at path\" clause");
        }
        List<Clause> atPathClauses = clauseMap.get(ELFParser.ATPATH);
        if (atPathClauses.size() > 1) {
            throw new ClauseException("Cannot have multiple \"at path\" clauses");
        }
        AtPathClause pc = (AtPathClause) atPathClauses.get(0);
        pc.accept(writer, this);
        endFindCommand(g, writer);
    }

    private void endFindCommand(Get g, PrintWriter writer) {
        if (!(g.getGetVariableType() == ELFLexer.GETFILES)) {
            writer.print(" -print -quit");
        }
        writer.print(")\n");
    }

    private Date createDate(String dateStr) throws InvalidDateException {
        SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
        sdfrmt.setLenient(false);
        try {
            return sdfrmt.parse(dateStr);
        } catch (ParseException e) {
            throw new InvalidDateException("");
        }
    }

    private Date getDayAfter(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 1);
        return c.getTime();
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
        return sdfrmt.format(date);
    }

    private String getType(Get g) {
        if (g.getGetVariableType() == ELFLexer.GETFOLDER) {
            return "d";
        }
        return "f";
    }
}
