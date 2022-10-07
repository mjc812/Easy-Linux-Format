package AST.Clauses;

import AST.ASTVisitor;

public class Name extends Clause {

    private int condition;
    private String name;

    public Name(String name, int condition) {
        this.condition = condition;
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }
}
