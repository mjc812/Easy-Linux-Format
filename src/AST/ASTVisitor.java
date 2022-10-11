package AST;

import AST.Program.*;
import AST.Statements.*;
import AST.Statements.Commands.*;
import AST.Clauses.*;

public interface ASTVisitor<U, T> {
    T visit(Program p, U param);
    T visit(ProgramPath p, U param);
    T visit(Get g, U param);
    T visit(Copy c, U param);
    T visit(Delete d, U param);
    T visit(Move m, U param);
    T visit(Rename r, U param);
    T visit(DateModifiedClause d, U param);
    T visit(InFolderClause f, U param);
    T visit(OwnedByUserClause o, U param);
    T visit(NameClause n, U param);
    T visit(AtPathClause p, U param);
}
