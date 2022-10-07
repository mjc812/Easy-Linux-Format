package AST.Clauses;

import AST.ASTVisitor;

public class Path extends Clause {

    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        // TODO
        return null;
    }
}
