package AST.Statements.Commands;

import AST.ASTVisitor;
import AST.Clauses.Clause;
import AST.Statements.Command;

import java.util.ArrayList;

public class Rename extends Command {
    private final String variable;
    private final String name;

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
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }
}
