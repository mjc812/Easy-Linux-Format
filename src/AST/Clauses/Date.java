package AST.Clauses;

import AST.ASTVisitor;

public class Date extends Clause {

    private String date;
    private int condition;

    public Date(String date, int type) {
        this.date = date;
        this.condition = type;
    }

    public String getDate() {
        return date;
    }

    public int getCondition() {
        return condition;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<T, U> visitor) {
        // TODO
        return null;
    }
}
