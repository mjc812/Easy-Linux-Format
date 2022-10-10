package AST.Clauses;

import AST.ASTVisitor;
import Parser.ELFLexer;

public class DateModifiedClause extends Clause {

    private String date;
    private int condition;

    public DateModifiedClause(String date, int type) {
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
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }

    @Override
    public int getType() {
        return ELFLexer.DATE;
    }
}
