package AST.Program;

import AST.ASTVisitor;
import AST.Node.Node;
import AST.Statements.Statement;

import java.util.ArrayList;

public class Program extends Node {
    private ProgramPath path;
    private ArrayList<Statement> statementList;

    public Program(ProgramPath path, ArrayList<Statement> statementList) {
        this.path = path;
        this.statementList = statementList;
    }

    public ProgramPath getProgramPath() {
        return path;
    }

    public ArrayList<Statement> getStatementList() {
        return statementList;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }
}
