package AST.Clauses;

import AST.ASTVisitor;

public class Folder extends Clause {

    private String folder;

    public Folder(String folder) {
        this.folder = folder;
    }

    public String getFolder() {
        return folder;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        // TODO
        return null;
    }
}
