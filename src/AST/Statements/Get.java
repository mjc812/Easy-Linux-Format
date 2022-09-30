package AST.Statements;

import AST.Clauses.Clause;

import java.util.ArrayList;

public class Get extends Statement {
    private int variableType;
    private int getType;
    private String variable;
    private boolean recursive;

    public Get(ArrayList<Clause> clauseList, int variableType, int getType, String variable, boolean recursive) {
        super(clauseList);
        this.clauseList = clauseList;
        this.variableType = variableType;
        this.getType = getType;
        this.variable = variable;
        this.recursive = recursive;
    }

    public int getVariableType() {
        return variableType;
    }

    public int getGetType() {
        return getType;
    }

    public String getVariable() {
        return variable;
    }

    public boolean isRecursive() {
        return recursive;
    }

}
