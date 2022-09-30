package AST.Clauses;

public class Date extends Clause {

    private String date;
    private int condition;

    public Date(String date, int type) {
        this.date = date;
        this.condition = type;
    }

    public String getDate() {
        return date;
    }

    public int getCondition() {
        return condition;
    }
}
