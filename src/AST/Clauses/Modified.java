package AST.Clauses;

public class Modified extends Clause {

    private String user;

    public Modified(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
