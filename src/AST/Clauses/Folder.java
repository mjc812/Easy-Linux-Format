package AST.Clauses;

public class Folder extends Clause {

    private String folder;

    public Folder(String folder) {
        this.folder = folder;
    }

    public String getFolder() {
        return folder;
    }
}
