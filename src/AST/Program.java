package AST;

import AST.Clauses.Clause;
import AST.Statements.Statement;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;

public class Program {
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
}
