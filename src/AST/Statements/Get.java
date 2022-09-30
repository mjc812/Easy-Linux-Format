package AST.Statements;

import AST.Clauses.Clause;

import java.util.ArrayList;

public class Get extends Statement {
    private int type;
    private int getType;
    private String text;
    private boolean recursive;

    public Get(int type, int getType, String var, boolean recursive,ArrayList<Clause> clauseList) {
        this.clauseList = clauseList;
        this.type = type;
        this.getType = getType;
        this.text = var;
        this.recursive = recursive;
    }

    public boolean isRecursive() {
        return recursive;
    }
}
