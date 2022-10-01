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

    //program

    @Override
    public Program visitProgram(ELFParser.ProgramContext ctx) {
        ArrayList<Statement> statementList= new ArrayList<>();
        ProgramPath path = visitPath(ctx.path());

        for (ELFParser.StatementContext currentStatement : ctx.statement()) {
            Statement statement = visitStatement(currentStatement);
            statementList.add(statement);
        }

        Program program = new Program(path, statementList);

        return program;
    }

    @Override
    public ProgramPath visitPath(ELFParser.PathContext ctx) {
        ProgramPath programPath = new ProgramPath(ctx.TEXT().getText());
        return programPath;
    }

    @Override
    public Statement visitStatement(ELFParser.StatementContext ctx) {
        Statement statement = visitStatementType(ctx.statementType());
        return statement;
    }

    @Override
    public Statement visitStatementType(ELFParser.StatementTypeContext ctx) {
        if (ctx.get() != null) {
            Get get = visitGet(ctx.get());
            return get;
        } else {
            Command command = visitCommand(ctx.command());
            return command;
        }
    }

    //get

    @Override
    public Get visitGet(ELFParser.GetContext ctx) {
        String variable = ctx.VAR_TEXT().getText();
        boolean recursive = ctx.getType().RECURSIVELY() != null;
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
            getVariableType = ELFLexer.FOLDER;
        }

        for (ELFParser.GetClauseContext getClause : ctx.getClause()) {
            Clause clause = visitGetClause(getClause);
            clauseArrayList.add(clause);
        }

        Get get = new Get(clauseArrayList, variableType, getVariableType, variable, recursive);

        return get;
    }

    //command

    @Override
    public Command visitCommand(ELFParser.CommandContext ctx) {

        Command command;

        ArrayList<Clause> clauseArrayList = new ArrayList<>();
        for (ELFParser.CommandClauseContext commandClauseContext : ctx.commandClause()) {
            Clause clause = visitCommandClause(commandClauseContext);
            clauseArrayList.add(clause);
        }

        if (ctx.commandChoice().delete() != null) {
            String variable = ctx.commandChoice().delete().VAR_TEXT().getText();
            int type;
            if (ctx.commandChoice().delete().deleteChoice().DELETE() != null) {
                type = ELFLexer.DELETE;
            } else {
                type = ELFLexer.DELETEALLFROM;
            }
            command = new Delete(clauseArrayList, variable, type);
        } else if (ctx.commandChoice().move() != null) {
            String fromVariable = ctx.commandChoice().move().VAR_TEXT(0).getText();
            String toVariable = ctx.commandChoice().move().VAR_TEXT(1).getText();
            int type;
            if (ctx.commandChoice().move().moveChoice().MOVE() != null) {
                type = ELFLexer.MOVE;
            } else {
                type = ELFLexer.MOVEALLFROM;
            }
            command = new Move(clauseArrayList, fromVariable, toVariable, type);
        } else if (ctx.commandChoice().copy() != null) {
            String fromVariable = ctx.commandChoice().copy().VAR_TEXT(0).getText();
            String toVariable = ctx.commandChoice().copy().VAR_TEXT(1).getText();
            int type;
            if (ctx.commandChoice().copy().copyChoice().COPY() != null) {
                type = ELFLexer.COPY;
            } else {
                type = ELFLexer.COPYALLFROM;
            }
            command = new Copy(clauseArrayList, fromVariable, toVariable, type);
        } else {
            String variable = ctx.commandChoice().rename().VAR_TEXT().getText();
            String name = ctx.commandChoice().rename().TEXT().getText();

            command = new Rename(clauseArrayList, variable, name);
        }

        return command;
    }

    //clause

    @Override
    public Clause visitGetClause(ELFParser.GetClauseContext ctx) {
        if (ctx.nameClause() != null) {
            return visitNameClause(ctx.nameClause());
        } else if (ctx.modifiedClause() != null) {
            return visitModifiedClause(ctx.modifiedClause());
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
        } else if (ctx.modifiedClause() != null) {
            return visitModifiedClause(ctx.modifiedClause());
        } else {
            return visitDateClause(ctx.dateClause());
        }
    }

    @Override
    public Name visitNameClause(ELFParser.NameClauseContext ctx) {
        String text = ctx.NAME().getText();
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

        Name name = new Name(text, condition);

        return name;
    }

    @Override
    public Modified visitModifiedClause(ELFParser.ModifiedClauseContext ctx) {
        String text = ctx.TEXT().getText();

        Modified modified = new Modified(text);

        return modified;
    }

    @Override
    public Date visitDateClause(ELFParser.DateClauseContext ctx) {
        String dateText = ctx.TEXT().getText();
        int condition;

        if (ctx.dateCondition().BEFORE() != null) {
            condition = ELFLexer.BEFORE;
        } else if (ctx.dateCondition().ON() != null) {
            condition = ELFLexer.ON;
        } else  {
            condition = ELFLexer.AFTER;
        }

        Date date = new Date(dateText, condition);

        return date;
    }

    @Override
    public Folder visitFolderClause(ELFParser.FolderClauseContext ctx) {
        String text = ctx.TEXT().getText();

        Folder folder = new Folder(text);

        return folder;
    }

    @Override
    public Path visitPathClause(ELFParser.PathClauseContext ctx) {
        String text = ctx.TEXT().getText();

        Path path = new Path(text);

        return path;
    }
}
