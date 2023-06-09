package AST.Statements.Commands;

import AST.ASTVisitor;
import AST.Clauses.Clause;
import AST.Statements.Command;

import java.util.ArrayList;

public class Delete extends Command {
    private final String variable;
    private final int type;

    public Delete(String variable, int type) {
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
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }
}
