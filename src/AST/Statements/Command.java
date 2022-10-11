package AST.Statements;

import AST.Clauses.Clause;

import java.util.ArrayList;

public abstract class Command extends Statement {
    public Command(ArrayList<Clause> clauseList) {
        super(clauseList);
    }
}
