package AST.Statements.Commands;

import AST.ASTVisitor;
import AST.Clauses.Clause;
import AST.Statements.Command;

import java.util.ArrayList;

public class Move extends Command {

    private String fromVariable;
    private String toVariable;
    private int type;

    public Move(ArrayList<Clause> clauseList, String fromVariable, String toVariable, int type) {
        super(clauseList);
        this.fromVariable = fromVariable;
        this.toVariable = toVariable;
        this.type = type;
    }

    public String getFromVariable() {
        return fromVariable;
    }

    public String getToVariable() {
        return toVariable;
    }

    public int getType() {
        return type;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }
}
