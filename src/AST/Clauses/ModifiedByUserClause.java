package AST.Clauses;

import AST.ASTVisitor;
import Parser.ELFParser;

public class ModifiedByUserClause extends Clause {

    private String user;

    public ModifiedByUserClause(String user) {
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
        return ELFParser.MODIFIED;
    }
}
