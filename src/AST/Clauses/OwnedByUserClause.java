package AST.Clauses;

import AST.ASTVisitor;
import Parser.ELFParser;

public class OwnedByUserClause extends Clause {

    private final String user;

    public OwnedByUserClause(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }

    @Override
    public int getType() {
        return ELFParser.OWNED;
    }
}
