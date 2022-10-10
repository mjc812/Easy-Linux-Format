package AST.Program;

import AST.ASTVisitor;
import AST.Node.Node;

public class ProgramPath extends Node {
    private final String path;

    public ProgramPath(String text) {
        this.path = text;
    }

    public String getPath() {
        return path;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }
}
