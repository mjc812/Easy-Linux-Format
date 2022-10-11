package Parser;

import AST.Clauses.*;
import AST.Node.Node;
import AST.Program.Program;
import AST.Program.ProgramPath;
import AST.Statements.Command;
import AST.Statements.Commands.Copy;
import AST.Statements.Commands.Delete;
import AST.Statements.Commands.Move;
import AST.Statements.Commands.Rename;
import AST.Statements.Get;
import AST.Statements.Statement;

import java.util.ArrayList;

public class ParseTreeToASTVisitor extends ELFParserBaseVisitor<Node> {

    //temp variables
    ArrayList<Clause> clauseArrayList;

    //program

    @Override
    public Program visitProgram(ELFParser.ProgramContext ctx) {
        ArrayList<Statement> statementList= new ArrayList<>();
        ProgramPath path = visitPath(ctx.path());

        for (ELFParser.StatementContext currentStatement : ctx.statement()) {
            Statement statement = visitStatement(currentStatement);
            statementList.add(statement);
        }

        return new Program(path, statementList);
    }

    @Override
    public ProgramPath visitPath(ELFParser.PathContext ctx) {
        return new ProgramPath(ctx.TEXT().getText());
    }

    @Override
    public Statement visitStatement(ELFParser.StatementContext ctx) {
        return visitStatementType(ctx.statementType());
    }

    @Override
    public Statement visitStatementType(ELFParser.StatementTypeContext ctx) {
        if (ctx.get() != null) {
            return visitGet(ctx.get());
        } else {
            return visitCommand(ctx.command());
        }
    }

    //get

    @Override
    public Get visitGet(ELFParser.GetContext ctx) {
        String variable = ctx.VAR_TEXT().getText();
        boolean recursive = ctx.RECURSIVELY() != null;
        int variableType;
        int getVariableType;
        ArrayList<Clause> clauseArrayList = new ArrayList<>();

        if (ctx.type().FILE() != null) {
            variableType = ELFLexer.FILE;
        } else if (ctx.type().FILES() != null) {
            variableType = ELFLexer.FILES;
        } else {
            variableType = ELFLexer.FOLDER;
        }

        if (ctx.getType().GETFILE() != null) {
            getVariableType = ELFLexer.GETFILE;
        } else if (ctx.getType().GETFILES() != null) {
            getVariableType = ELFLexer.GETFILES;
        } else {
            getVariableType = ELFLexer.GETFOLDER;
        }

        for (ELFParser.GetClauseContext getClause : ctx.getClause()) {
            Clause clause = visitGetClause(getClause);
            clauseArrayList.add(clause);
        }

        return new Get(clauseArrayList, variableType, getVariableType, variable, recursive);
    }

    //command

    @Override
    public Command visitCommand(ELFParser.CommandContext ctx) {

        Command command;

        if (ctx.delete() != null) {
            command = visitDelete(ctx.delete());
        } else if (ctx.move() != null) {
            command = visitMove(ctx.move());
        } else if (ctx.copy() != null) {
            command = visitCopy(ctx.copy());
        } else {
            command = visitRename(ctx.rename());
        }

        return command;
    }

    @Override
    public Delete visitDelete(ELFParser.DeleteContext ctx) {
        String variable = ctx.VAR_TEXT().getText();
        int type;
        if (ctx.deleteChoice().DELETE() != null) {
            type = ELFLexer.DELETE;
        } else {
            type = ELFLexer.DELETEALLFROM;
        }
        return new Delete(variable, type);
    }

    @Override
    public Move visitMove(ELFParser.MoveContext ctx) {
        String fromVariable = ctx.VAR_TEXT(0).getText();
        String toVariable = ctx.VAR_TEXT(1).getText();
        int type;
        if (ctx.moveChoice().MOVE() != null) {
            type = ELFLexer.MOVE;
        } else {
            type = ELFLexer.MOVEALLFROM;
        }
        return new Move(fromVariable, toVariable, type);
    }

    @Override
    public Copy visitCopy(ELFParser.CopyContext ctx) {
        String fromVariable = ctx.VAR_TEXT(0).getText();
        String toVariable = ctx.VAR_TEXT(1).getText();
        int type;
        if (ctx.copyChoice().COPY() != null) {
            type = ELFLexer.COPY;
        } else {
            type = ELFLexer.COPYALLFROM;
        }
        return new Copy(fromVariable, toVariable, type);
    }

    @Override
    public Rename visitRename(ELFParser.RenameContext ctx) {
        String variable = ctx.VAR_TEXT().getText();
        String name = ctx.TEXT().getText();
        return new Rename(variable, name);
    }

    //clause

    @Override
    public Clause visitGetClause(ELFParser.GetClauseContext ctx) {
        if (ctx.nameClause() != null) {
            return visitNameClause(ctx.nameClause());
        } else if (ctx.ownedClause() != null) {
            return visitOwnedClause(ctx.ownedClause());
        } else if (ctx.dateClause() != null) {
            return visitDateClause(ctx.dateClause());
        } else if (ctx.folderClause() != null) {
            return visitFolderClause(ctx.folderClause());
        } else {
            return visitPathClause(ctx.pathClause());
        }
    }

    @Override
    public Clause visitCommandClause(ELFParser.CommandClauseContext ctx) {
        if (ctx.nameClause() != null) {
            return visitNameClause(ctx.nameClause());
        } else if (ctx.ownedClause() != null) {
            return visitOwnedClause(ctx.ownedClause());
        } else {
            return visitDateClause(ctx.dateClause());
        }
    }

    @Override
    public NameClause visitNameClause(ELFParser.NameClauseContext ctx) {
        String text = ctx.TEXT().getText();
        int condition;

        if (ctx.nameCondition().IS() != null) {
            condition = ELFLexer.IS;
        } else if (ctx.nameCondition().CONTAINS() != null) {
            condition = ELFLexer.CONTAINS;
        } else if (ctx.nameCondition().PREFIX() != null) {
            condition = ELFLexer.PREFIX;
        } else {
            condition = ELFLexer.SUFFIX;
        }

        return new NameClause(text, condition);
    }

    @Override
    public OwnedByUserClause visitOwnedClause(ELFParser.OwnedClauseContext ctx) {
        String text = ctx.TEXT().getText();

        return new OwnedByUserClause(text);
    }

    @Override
    public DateModifiedClause visitDateClause(ELFParser.DateClauseContext ctx) {
        String dateText = ctx.TEXT().getText();
        int condition;

        if (ctx.dateCondition().BEFORE() != null) {
            condition = ELFLexer.BEFORE;
        } else if (ctx.dateCondition().ON() != null) {
            condition = ELFLexer.ON;
        } else  {
            condition = ELFLexer.AFTER;
        }

        return new DateModifiedClause(dateText, condition);
    }

    @Override
    public InFolderClause visitFolderClause(ELFParser.FolderClauseContext ctx) {
        String text = ctx.TEXT().getText();

        return new InFolderClause(text);
    }

    @Override
    public AtPathClause visitPathClause(ELFParser.PathClauseContext ctx) {
        String text = ctx.TEXT().getText();

        return new AtPathClause(text);
    }
}
