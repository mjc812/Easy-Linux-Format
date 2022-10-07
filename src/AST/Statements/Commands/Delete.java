package AST.Statements.Commands;

import AST.ASTVisitor;
import AST.Clauses.Clause;
import AST.Statements.Command;

import java.util.ArrayList;

public class Delete extends Command {

    private String variable;
    private int type;

    public Delete(ArrayList<Clause> clauseList, String variable, int type) {
        super(clauseList);
        this.variable = variable;
        this.type = type;
    }

    public String getVariable() {
        return variable;
    }

    public int getType() {
        return type;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<T, U> visitor) {
        // TODO
        return null;
    }
}
