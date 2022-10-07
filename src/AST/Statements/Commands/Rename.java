package AST.Statements.Commands;

import AST.ASTVisitor;
import AST.Clauses.Clause;
import AST.Statements.Command;

import java.util.ArrayList;

public class Rename extends Command {

    private String variable;
    private String name;

    public Rename(ArrayList<Clause> clauseList, String variable, String name) {
        super(clauseList);
        this.variable = variable;
        this.name = name;
    }

    public String getVariable() {
        return variable;
    }

    public String getName() {
        return name;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<T, U> visitor) {
        // TODO
        return null;
    }
}
