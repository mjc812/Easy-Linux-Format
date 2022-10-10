package AST;

import AST.Clauses.*;
import AST.Program.*;
import AST.Statements.*;
import AST.Statements.Commands.*;
import Parser.ELFLexer;
import Parser.ELFParser;

import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static Parser.ELFLexer.MOVE;
import static Parser.ELFLexer.MOVEALLFROM;

public class Evaluator implements ASTVisitor<PrintWriter, String> {

    private final static String HOME_PATH_VAR = "HOME_PATH";

    // TODO: possibly make map value some sort of Variable object so we can retain info like recursive, and stuff
    // Map to store current variable assignments, with value being the variables's path representation
    private final Map<String, String> variables = new HashMap<>();

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

        if (g.getGetVariableType() == ELFLexer.GETFOLDER || g.getGetVariableType() == ELFLexer.GETFILE) {
            String filePath = processFilePathClauses(g);

            // TODO: Process Date clause, Modified clause
            variables.put(g.getVariable(), filePath);
            writer.println(String.format("%s=\"%s\"", g.getVariable(), filePath));
        }
        return null;
    }

    /**
     * returns a file path to use based on the given statement's at path, folder, and name clauses
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
                    filePath.append("/").append(nc.getName()+ "*");
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
    public String visit(ModifiedByUserClause m, PrintWriter param) {
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
}
