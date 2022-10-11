package AST.Statements;

import AST.ASTVisitor;
import AST.Clauses.Clause;

import java.util.ArrayList;

public class Get extends Statement {
    private final ArrayList<Clause> clauseList;
    private final int variableType;
    private final int getVariableType;
    private final String variable;
    private final boolean recursive;

    public Get(ArrayList<Clause> clauseList, int variableType, int getVariableType, String variable, boolean recursive) {
        this.clauseList = clauseList;
        this.variableType = variableType;
        this.getVariableType = getVariableType;
        this.variable = variable;
        this.recursive = recursive;
    }

    public ArrayList<Clause> getClauseList() {
        return clauseList;
    }

    public int getVariableType() {
        return variableType;
    }

    public int getGetVariableType() {
        return getVariableType;
    }

    public String getVariable() {
        return variable;
    }

    public boolean isRecursive() {
        return recursive;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }
}
