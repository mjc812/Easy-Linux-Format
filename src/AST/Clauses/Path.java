package AST.Clauses;

public class Path extends Clause {

    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
