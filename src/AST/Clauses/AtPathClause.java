package AST.Clauses;

import AST.ASTVisitor;
import Parser.ELFLexer;

public class AtPathClause extends Clause {
    private final String path;

    public AtPathClause(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public <U, T> T accept(U param, ASTVisitor<U, T> visitor) {
        return visitor.visit(this, param);
    }

    @Override
    public int getType() {
        return ELFLexer.ATPATH;
    }
}
