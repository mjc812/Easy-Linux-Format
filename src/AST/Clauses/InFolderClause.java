package AST.Clauses;

import AST.ASTVisitor;
import Parser.ELFParser;

public class InFolderClause extends Clause {

    private String folder;

    public InFolderClause(String folder) {
        this.folder = folder;
    }

    public String getFolder() {
        return folder;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }

    @Override
    public int getType() {
        return ELFParser.INFOLDER;
    }
}
