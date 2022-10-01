package AST.Statements;

import AST.Clauses.Clause;
import AST.Node.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class Statement extends Node {
    protected ArrayList<Clause> clauseList;

    public Statement(ArrayList<Clause> clauseList) {
        this.clauseList = clauseList;
    }

    public ArrayList<Clause> getClauseList() {
        return clauseList;
    }
}
