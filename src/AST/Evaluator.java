package AST;

import AST.Clauses.*;
import AST.Program.*;
import AST.Statements.*;
import AST.Statements.Commands.*;
import Parser.ELFLexer;
import Parser.ELFParser;

import java.io.PrintWriter;
import java.util.*;

public class Evaluator implements ASTVisitor<PrintWriter, String> {

    private final static String HOME_PATH_VAR = "HOME_PATH";

    private final Set<String> variables = new HashSet<>();

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
        Map<Integer, List<Clause>> clauseMap = new HashMap<>();

        if (g.getGetVariableType() == ELFLexer.GETFOLDER || g.getGetVariableType() == ELFLexer.GETFILE) {
            StringBuilder filePath = new StringBuilder();
            filePath.append("\"$").append(HOME_PATH_VAR);

            // process the clauses
            for (Clause c : g.getClauseList()) {
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
                    } else if (nc.getCondition() == ELFLexer.SUFFIX) {
                        // TODO: suffix
                    } else {
                        // TODO: contains
                    }
                }
            }
            // TODO: Date clause, Modified clause


            filePath.append("\"");
            variables.add(g.getVariable());
            writer.println(g.getVariable() + "=" + filePath.toString());
        }
        return null;
    }

    private void processInFolderClause(Map<Integer, List<Clause>> clauseMap, StringBuilder filePath) {
        InFolderClause inFolderClause = (InFolderClause) clauseMap.get(ELFParser.INFOLDER).get(0);
        String folderVar = inFolderClause.getFolder();
        if (!variables.contains(folderVar)) {
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
        // TODO
        return null;
    }

    @Override
    public String visit(Rename r, PrintWriter writer) {
        // TODO
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
}