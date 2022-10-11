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
        String findCommand;
        try {
            findCommand = FindCommand.createFindCommand(g, variables);
        } catch (ClauseException e) {
            System.err.println("ERROR - Clause Exception: " + e);
            return false;
        } catch (VariableNotDeclaredException e) {
            System.err.println("ERROR - Variable Exception: " + e);
            return false;
        }

        String var = g.getVariable();
        variables.put(var, g.getVariableType());
        writer.println(var + "=" + findCommand);

        return true;
    }

    // Copy cases: (1) copy one file to a folder, (2) copy many files to a folder
    // (3) copy a folder to a folder
    @Override
    public Boolean visit(Copy c, PrintWriter writer) {
        String result = "cp ";
        String destFolderName = "";
        String sourceFileName = "";
        String[] tempfiles = {"file1", "file2"};
        // TODO : figure out inputs, do linux copy command

        if(c.getType() == ELFLexer.COPY) {
            // single file/folder -> folder
            // does get from variable need the path in front of it??
            result += c.getFromVariable() + " " + c.getToVariable();
        } else if (c.getType() == ELFLexer.COPYALLFROM) {
            // multiple files -> folder
            // find folder (at c.getFromVariable) and then get path of each file and then iterate over all
            for (String s : tempfiles) {
                result += s + " ";
            }
        }
        return true;
    }

    @Override
    public Boolean visit(Delete d, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Boolean visit(Move m, PrintWriter writer) {
        String fromVar = m.getFromVariable();
        String toVar = m.getToVariable();

        if (varNotDeclared(fromVar)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable "
                    + fromVar + " which does not exist");
            return false;
        } else if (varNotDeclared(toVar)) {
            System.err.println("ERROR - Variable Exception: attempted to access variable "
                    + toVar + " which does not exist");
            return false;
        }

        // TODO: Handle Clause Checks

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

        // TODO: Handle Clause Checks

        writer.println("parentDir=$(dirname \"$" + var + "\")");
        writer.println("mv \"$" + var + "\" \"$parentDir/" + newName + "\"");

        return true;
    }

    // NOT USED
    @Override
    public Boolean visit(DateModifiedClause d, PrintWriter param) {
        return null;
    }

    @Override
    public Boolean visit(InFolderClause f, PrintWriter param) {
        return null;
    }

    @Override
    public Boolean visit(OwnedByUserClause m, PrintWriter param) {
        return null;
    }

    @Override
    public Boolean visit(NameClause n, PrintWriter param) {
        return null;
    }

    @Override
    public Boolean visit(AtPathClause p, PrintWriter param) {
        return null;
    }

    private boolean varNotDeclared(String variable) {
        return !variables.containsKey((variable));
    }


    public static class FindCommand {
        public static String createFindCommand(Get g, Map<String, Integer> variables) throws ClauseException, VariableNotDeclaredException {
            Map<Integer, List<Clause>> clauseMap = new HashMap<>();

            StringBuilder findCommand = new StringBuilder();
            String type = getType(g);
            findCommand.append("$(find");

            for (Clause c : g.getClauseList()) {
                if (!clauseMap.containsKey(c.getType())) {
                    clauseMap.put(c.getType(), new ArrayList<>());
                }
                clauseMap.get(c.getType()).add(c);
            }

            String result = processAtPathClause(clauseMap, g, findCommand);
            if (result != null) return result;
            processInFolderClause(clauseMap, variables, findCommand);

            if (!g.isRecursive()) {
                findCommand.append(" -maxdepth 1");
            }
            findCommand.append(" -type ").append(type);

            processNameClause(clauseMap, findCommand);
            processOwnedByUserClause(clauseMap, findCommand);
            processDateClause(clauseMap, findCommand);

            endFindCommand(g, findCommand);
            return findCommand.toString();
        }

        private static void processDateClause(Map<Integer, List<Clause>> clauseMap, StringBuilder findCommand) throws ClauseException {
            if (clauseMap.containsKey(ELFLexer.DATE)) {
                List<Clause> dateClauseList = clauseMap.get(ELFLexer.DATE);
                if (dateClauseList.size() > 1) {
                    throw new ClauseException("Cannot have multiple date clauses");
                }
                DateModifiedClause dc = (DateModifiedClause) dateClauseList.get(0);

                Date date;
                try {
                    date = createDate(dc.getDate());
                } catch (InvalidDateException e) {
                    throw new ClauseException("Invalid date");
                }

                String dateStr = formatDate(date);
                Date dayAfter = getDayAfter(date);
                String dayAfterDateStr = formatDate(dayAfter);
                switch (dc.getCondition()) {
                    case ELFLexer.ON ->
                            findCommand.append(" -newermt ").append(dateStr).append(" ! -newermt ").append(dayAfterDateStr);
                    case ELFLexer.BEFORE -> findCommand.append(" ! -newermt ").append(dateStr);
                    case ELFLexer.AFTER -> findCommand.append(" -newermt ").append(dayAfterDateStr);
                }
            }
        }

        private static void processOwnedByUserClause(Map<Integer, List<Clause>> clauseMap, StringBuilder findCommandStr) throws ClauseException {
            if (!clauseMap.containsKey(ELFLexer.OWNED)) {
                return;
            }
            List<Clause> ownedClauseList = clauseMap.get(ELFLexer.OWNED);
            if (ownedClauseList.size() > 1) {
                throw new ClauseException("Cannot have multiple \"owned by\" clauses");
            }
            OwnedByUserClause oc = (OwnedByUserClause) ownedClauseList.get(0);
            findCommandStr.append(" -user ").append(oc.getUser());
        }

        private static void processNameClause(Map<Integer, List<Clause>> clauseMap, StringBuilder findCommandStr) throws ClauseException {
            if (!clauseMap.containsKey(ELFParser.NAME)) {
                return;
            }

            List<Clause> nameClauseList = clauseMap.get(ELFParser.NAME);
            boolean hasPrefixClause = false;
            boolean hasSuffixClause = false;

            for (Clause c : nameClauseList) {
                NameClause nc = (NameClause) c;
                findCommandStr.append(" -name ");
                switch (nc.getCondition()) {
                    case ELFLexer.IS -> {
                        if (nameClauseList.size() > 1) {
                            throw new ClauseException("Cannot have multiple name clauses when one is a \"name is\" clauses");
                        }
                        findCommandStr.append("\"").append(nc.getName()).append("\"");
                    }
                    case ELFLexer.CONTAINS -> findCommandStr.append("\"*").append(nc.getName()).append("*\"");
                    case ELFLexer.PREFIX -> {
                        if (hasPrefixClause) {
                            throw new ClauseException("Cannot have multiple \"prefix\" clauses");
                        }
                        findCommandStr.append("\"").append(nc.getName()).append("*\"");
                        hasPrefixClause = true;
                    }
                    case ELFLexer.SUFFIX -> {
                        if (hasSuffixClause) {
                            throw new ClauseException("Cannot have multiple \"suffix\" clauses");
                        }
                        findCommandStr.append("\"*").append(nc.getName()).append("\"");
                        hasSuffixClause = true;
                    }
                }
            }
        }

        private static void processInFolderClause(Map<Integer, List<Clause>> clauseMap, Map<String, Integer> variables, StringBuilder findCommandStr) throws ClauseException, VariableNotDeclaredException {
            if (!clauseMap.containsKey(ELFParser.INFOLDER)) {
                findCommandStr.append(" \"").append("$HOME_PATH").append("\"");
                return;
            }

            List<Clause> inFolderClauses = clauseMap.get(ELFParser.INFOLDER);
            if (inFolderClauses.size() > 1) {
                throw new ClauseException("Cannot have multiple \"in folder\" clauses");
            }
            InFolderClause inFolderClause = (InFolderClause) inFolderClauses.get(0);
            String folderVar = inFolderClause.getFolder();
            if (!variables.containsKey(folderVar)) {
                throw new VariableNotDeclaredException("Tried to access folder variable that does not exist");
            } else {
                findCommandStr.append(" \"").append("$").append(folderVar).append("\"");
            }
        }

        private static String processAtPathClause(Map<Integer, List<Clause>> clauseMap, Get g, StringBuilder findCommandStr) throws ClauseException {
            if (!clauseMap.containsKey(ELFParser.ATPATH)) {
                return null;
            }

            if (g.getGetVariableType() == ELFLexer.GETFILES) {
                throw new ClauseException("Cannot have an \"at path\" clause on type \"files\"");
            }

            if (clauseMap.size() > 1) {
                throw new ClauseException("Cannot have multiple clauses when one is an \"at path\" clause");
            }
            AtPathClause apc = (AtPathClause) clauseMap.get(ELFParser.ATPATH).get(0);
            String filePath = "\"$HOME_PATH\"" + apc.getPath();
            findCommandStr.append(" ").append(filePath);
            endFindCommand(g, findCommandStr);
            return findCommandStr.toString();
        }

        private static void endFindCommand(Get g, StringBuilder findCommand) {
            if (!(g.getGetVariableType() == ELFLexer.GETFILES)) {
                findCommand.append(" -print -quit");
            }
            findCommand.append(")");
        }

        private static Date createDate(String dateStr) throws InvalidDateException {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
            sdfrmt.setLenient(false);
            try {
                return sdfrmt.parse(dateStr);
            } catch (ParseException e) {
                throw new InvalidDateException("");
            }
        }

        private static Date getDayAfter(Date date) {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            return c.getTime();
        }

        private static String formatDate(Date date) {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
            return sdfrmt.format(date);
        }

        private static String getType(Get g) {
            if (g.getGetVariableType() == ELFLexer.GETFOLDER) {
                return "d";
            }
            return "f";
        }
    }
}
