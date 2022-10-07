package AST.Clauses;

import AST.ASTVisitor;

public class Modified extends Clause {

    private String user;

    public Modified(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        // TODO
        return null;
    }
}
