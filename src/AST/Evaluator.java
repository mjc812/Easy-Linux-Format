package AST;

import AST.Clauses.*;
import AST.Program.Program;
import AST.Program.ProgramPath;
import AST.Statements.Commands.Copy;
import AST.Statements.Commands.Delete;
import AST.Statements.Commands.Move;
import AST.Statements.Commands.Rename;
import AST.Statements.Get;

import java.io.PrintWriter;

public class Evaluator implements ASTVisitor<PrintWriter, Void> {

    @Override
    public Void visit(Program p, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(ProgramPath p, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Get g, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Copy c, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Delete d, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Move m, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Rename r, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Date d, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Folder f, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Modified m, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Name n, PrintWriter writer) {
        // TODO
        return null;
    }

    @Override
    public Void visit(Path p, PrintWriter writer) {
        // TODO
        return null;
    }
}
