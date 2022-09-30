package AST.Statements;

import AST.Clauses.Clause;

import java.util.ArrayList;

public class Command extends Statement {
    private int type;
    private String lhsText;
    private String rhsText;

    public Command(int type, String lhsText, String rhsText, ArrayList<Clause> clauseList) {
        this.clauseList = clauseList;
        this.type = type;
        this.lhsText = lhsText;
        this.rhsText = rhsText;
    }
}
