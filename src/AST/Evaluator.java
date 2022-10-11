package AST;

import AST.Clauses.*;
import AST.Program.*;
import AST.Statements.*;
import AST.Statements.Commands.*;
import Exceptions.ClauseException;
import Exceptions.InvalidDateException;
import Parser.ELFLexer;
import Parser.ELFParser;

import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static Parser.ELFLexer.MOVE;
import static Parser.ELFLexer.MOVEALLFROM;

public class Evaluator implements ASTVisitor<PrintWriter, String> {

    private final static String HOME_PATH_VAR = "HOME_PATH";

    // TODO: possibly make map value some sort of Variable object so we can retain info like recursive, and stuff
    // Map to store current variable assignments, with value being the variables's path representation
    private final Map<String, String> variables = new HashMap<>();
    private final Map<String, List<String>> listOfPaths = new HashMap<>();

    @Override
    public String visit(Program p, PrintWriter writer) {
        p.getProgramPath().accept(writer, this);
        List<Statement> statements = p.getStatementList();
        for (Statement s : statements) {
            s.accept(writer, this);
        }
        return null;
    }

    @Override
    public String visit(ProgramPath p, PrintWriter writer) {
        writer.println(HOME_PATH_VAR + "=\"" + p.getPath() + "\"");
        return null;
    }

    @Override
    public String visit(Get g, PrintWriter writer) {
        // TODO: finish implementing

        String findCommand;
        try {
            findCommand = FindCommand.createFindCommand(g, writer, variables);
        } catch (ClauseException e) {
            // TODO: static error - clause exception
            System.err.println("ERROR - Clause Exception: " + e.toString());
            return null;
        }

        String var = g.getVariable();
        if (g.getGetVariableType() == ELFLexer.GETFILES) {
            // TODO - print get files case
            writer.println("GET FILES");
        } else {
            variables.put(var, null);
            writer.println(var + "=" + findCommand);
        }

        return null;
    }

    /**
     * returns a file path to use based on the given statement's at path, folder, and name clauses
     *
     * @param s statement
     * @return the file path filtered by given name and folder clauses
     */
    private String processFilePathClauses(Statement s) {
        Map<Integer, List<Clause>> clauseMap = new HashMap<>();
        StringBuilder filePath = new StringBuilder();

        filePath.append("$").append(HOME_PATH_VAR);

        for (Clause c : s.getClauseList()) {
            if (!clauseMap.containsKey(c.getType())) {
                clauseMap.put(c.getType(), new ArrayList<>());
            }
            clauseMap.get(c.getType()).add(c);
        }

        if (clauseMap.containsKey(ELFParser.ATPATH)) {
            if (clauseMap.size() > 1) {
                // TODO: static error - cannot have multiple clauses when one is "at path" clause
            }
            AtPathClause apc = (AtPathClause) clauseMap.get(ELFParser.ATPATH).get(0);
            filePath.append(apc.getPath());
        }

        if (clauseMap.containsKey(ELFParser.INFOLDER)) {
            processInFolderClause(clauseMap, filePath);
        }

        if (clauseMap.containsKey(ELFParser.NAME)) {
            // "is" = only clause
            // "prefix = 1 clause
            // "suffix" = 1 clause
            // "contains" = n clauses
            List<Clause> nameClauseList = clauseMap.get(ELFParser.NAME);
            for (Clause c : nameClauseList) {
                NameClause nc = (NameClause) c;
                if (nc.getCondition() == ELFLexer.IS) {
                    if (nameClauseList.size() > 1) {
                        // TODO: static error - cannot have more than 1 clause with a "name is" clause
                    }
                    filePath.append("/").append(nc.getName());
                } else if (nc.getCondition() == ELFLexer.PREFIX) {
                    // TODO: prefix
                    filePath.append("/").append(nc.getName() + "*");
                } else if (nc.getCondition() == ELFLexer.SUFFIX) {
                    // TODO: suffix
                    filePath.append("/").append("*" + nc.getName());
                } else {
                    // TODO: contains
                    filePath.append("/").append("*" + nc.getName() + "*");
                }
            }
        }

        return filePath.toString();
    }


    private void processInFolderClause(Map<Integer, List<Clause>> clauseMap, StringBuilder filePath) {
        InFolderClause inFolderClause = (InFolderClause) clauseMap.get(ELFParser.INFOLDER).get(0);
        String folderVar = inFolderClause.getFolder();
        if (!variables.containsKey(folderVar)) {
            // TODO: static error - attempt to access folder variable that does not exist
        } else {
            filePath.setLength(0);
            filePath.append("$").append(folderVar);
        }
    }

    @Override
    public String visit(Copy c, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public String visit(Delete d, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public String visit(Move m, PrintWriter writer) {
        int moveType = m.getType();
        // TODO: remove when get all is implemented
        variables.put("rockFiles", "$homeworkFolder/*rock*");
        variables.put("oldHwk", "$HOME_PATH/SFU*");

        if (!isVarDeclared(m.getToVariable()) || !isVarDeclared(m.getFromVariable())) {
            // TODO: static check failed - variable(s) not declared
        }

        String fromPath = variables.get(m.getFromVariable());

        switch (moveType) {
            case MOVEALLFROM:
                Path path = Paths.get(fromPath);
                String folderPath = path.getParent().toString();
                String fileFilter = path.getFileName().toString();

                // TODO: add modified and date and recursively with -mtime and -mindepth
                writer.println(String.format(
                        "find \"%s\" -name \"%s\" -exec mv '{}' \"$%s\" \\;",
                        folderPath, fileFilter, m.getToVariable()));
                break;
            case MOVE:
                writer.println(String.format("mv \"%s\" \"$%s\"", fromPath, m.getToVariable()));
                break;
        }
        return null;
    }

    @Override
    public String visit(Rename r, PrintWriter writer) {
        if (!r.getClauseList().isEmpty()) {
            // TODO: do something
        }

        if (!isVarDeclared(r.getVariable())) {
            // TODO: static error, nonexistent variable
        }

        // need to put the full path in the rename target
        String fromPath = variables.get(r.getVariable());
        Path path = Paths.get(fromPath);
        String folderPath = path.getParent().toString();

        writer.println(String.format("mv \"$%s\" \"%s/%s\"", r.getVariable(), folderPath, r.getName()));
        return null;
    }

    // NOT USED
    @Override
    public String visit(DateModifiedClause d, PrintWriter param) {
        return null;
    }

    @Override
    public String visit(InFolderClause f, PrintWriter param) {
        return null;
    }

    @Override
    public String visit(OwnedByUserClause m, PrintWriter param) {
        return null;
    }

    @Override
    public String visit(NameClause n, PrintWriter param) {
        return null;
    }

    @Override
    public String visit(AtPathClause p, PrintWriter param) {
        return null;
    }

    private boolean isVarDeclared(String variable) {
        return variables.containsKey((variable));
    }


    public static class FindCommand {
        public static String createFindCommand(Get g, PrintWriter writer, Map<String, String> variables) throws ClauseException {
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

            String result = processAtPathClause(clauseMap, g, writer, variables, findCommand);
            if (result != null) return result;
            processInFolderClause(clauseMap, variables, findCommand, type);
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
                    case ELFLexer.ON:
                        findCommand.append(" -newermt ").append(dateStr).append(" ! -newermt ").append(dayAfterDateStr);
                        break;
                    case ELFLexer.BEFORE:
                        findCommand.append(" ! -newermt ").append(dateStr);
                        break;
                    case ELFLexer.AFTER:
                        findCommand.append(" -newermt ").append(dayAfterDateStr);
                        break;
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
                    case ELFLexer.IS:
                        if (nameClauseList.size() > 1) {
                            throw new ClauseException("Cannot have multiple name clauses when one is a \"name is\" clauses");
                        }
                        findCommandStr.append("\"").append(nc.getName()).append("\"");
                        break;
                    case ELFLexer.CONTAINS:
                        findCommandStr.append("\"*").append(nc.getName()).append("*\"");
                        break;
                    case ELFLexer.PREFIX:
                        if (hasPrefixClause) {
                            throw new ClauseException("Cannot have multiple \"prefix\" clauses");
                        }
                        findCommandStr.append("\"").append(nc.getName()).append("*\"");
                        hasPrefixClause = true;
                        break;
                    case ELFLexer.SUFFIX:
                        if (hasSuffixClause) {
                            throw new ClauseException("Cannot have multiple \"suffix\" clauses");
                        }
                        findCommandStr.append("\"*").append(nc.getName()).append("\"");
                        hasSuffixClause = true;
                        break;
                }
            }
        }

        private static void processInFolderClause(Map<Integer, List<Clause>> clauseMap, Map<String, String> variables, StringBuilder findCommandStr, String type) throws ClauseException {
            if (!clauseMap.containsKey(ELFParser.INFOLDER)) {
                findCommandStr.append(" \"").append("$HOME_PATH").append("\"").append(" -type ").append(type);
                return;
            }

            List<Clause> inFolderClauses = clauseMap.get(ELFParser.INFOLDER);
            if (inFolderClauses.size() > 1) {
                throw new ClauseException("Cannot have multiple \"in folder\" clauses");
            }
            InFolderClause inFolderClause = (InFolderClause) inFolderClauses.get(0);
            String folderVar = inFolderClause.getFolder();
            if (!variables.containsKey(folderVar)) {
                throw new ClauseException("Tried to access folder variable that does not exist");
            } else {
                findCommandStr.append(" \"").append("$").append(folderVar).append("\"").append(" -type ").append(type);
            }
        }

        private static String processAtPathClause(Map<Integer, List<Clause>> clauseMap, Get g, PrintWriter writer, Map<String, String> variables, StringBuilder findCommandStr) throws ClauseException {
            if (!clauseMap.containsKey(ELFParser.ATPATH)) {
                return null;
            }

            if (clauseMap.size() > 1) {
                throw new ClauseException("Cannot have multiple clauses when one is an \"at path\" clause");
            }
            AtPathClause apc = (AtPathClause) clauseMap.get(ELFParser.ATPATH).get(0);
            String filePath = "\"$HOME_PATH\"" + apc.getPath();
            writer.println("filePath=" + filePath);
            variables.put("filePath", filePath);
            findCommandStr.append(" \"").append("$filePath").append("\"");
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
