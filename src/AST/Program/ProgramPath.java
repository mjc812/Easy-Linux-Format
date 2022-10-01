package AST.Program;

import AST.Node.Node;

public class ProgramPath extends Node {
    private String text;

    public ProgramPath(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}