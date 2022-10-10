package AST.Clauses;

import AST.ASTVisitor;
import Parser.ELFLexer;

public class NameClause extends Clause {

    private int condition;
    private String name;

    public NameClause(String name, int condition) {
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

    @Override
    public int getType() {
        return ELFLexer.NAME;
    }
}
