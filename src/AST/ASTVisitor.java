package AST;

import AST.Program.*;
import AST.Statements.*;
import AST.Statements.Commands.*;
import AST.Clauses.*;

import java.io.PrintWriter;

public interface ASTVisitor<U, T> {
    // Program
    public T visit(Program p, U param);
    public T visit(ProgramPath p, U param);
    // Statements
    public T visit(Get g, U param);
    public T visit(Copy c, U param);
    public T visit(Delete d, U param);
    public T visit(Move m, U param);
    public T visit(Rename r, U param);
    // Clauses
    public T visit(Date d, U param);
    public T visit(Folder f, U param);
    public T visit(Modified m, U param);
    public T visit(Name n, U param);
    public T visit(Path p, U param);
}
