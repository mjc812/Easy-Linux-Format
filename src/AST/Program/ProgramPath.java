package AST.Program;

import AST.ASTVisitor;
import AST.Node.Node;

public class ProgramPath extends Node {
    private String text;

    public ProgramPath(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<T, U> visitor) {
        // TODO
        return null;
    }
}
