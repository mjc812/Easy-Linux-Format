package AST.Clauses;

public abstract class Clause {
    protected String text;
    protected int type;

    public String getText() {
        return text;
    }

    public int getType() {
        return type;
    }
}
