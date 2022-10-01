package AST.Statements;

import AST.Clauses.Clause;

import java.util.ArrayList;
import java.util.List;

public abstract class Statement {
    protected ArrayList<Clause> clauseList;

    public Statement(ArrayList<Clause> clauseList) {
        this.clauseList = clauseList;
    }

    public ArrayList<Clause> getClauseList() {
        return clauseList;
    }
}
