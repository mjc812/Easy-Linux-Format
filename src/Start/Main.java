package Start;

import AST.Clauses.*;
import AST.Program;
import AST.ProgramPath;
import AST.Statements.Command;
import AST.Statements.Get;
import AST.Statements.Statement;
import Parser.ELFLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ELFLexer lexer = new ELFLexer(CharStreams.fromFileName("src/input.elf"));
        for (Token token : lexer.getAllTokens()) {
            //System.out.println(token);
        }
        lexer.reset();
        System.out.println("Done tokenizing");

        Clause c0 = new Name("name", 2);
        Clause c1 = new Date("0202", 3);
        Clause c2 = new Path("path/here", 1);
        ArrayList<Clause> clauseArrayList = new ArrayList<>();
        clauseArrayList.add(c0);
        clauseArrayList.add(c1);
        clauseArrayList.add(c2);

        Clause c3 = new Folder("name", 2);
        Clause c4 = new Modified("0202");
        ArrayList<Clause> clauseArrayList2 = new ArrayList<>();
        clauseArrayList.add(c3);
        clauseArrayList.add(c4);

        Get get = new Get(5, 6, "Var1", true, clauseArrayList);
        Command command = new Command(0, "lhs", "rhs", clauseArrayList2);
        ArrayList<Statement> statementList = new ArrayList<>();
        statementList.add(get);
        statementList.add(command);

        ProgramPath programPath = new ProgramPath("here");

        Program program = new Program(programPath, statementList);

        // using
        ProgramPath programPath1 = program.getProgramPath();
        programPath1.getText();
        System.out.println("programPath1.getText(): " + programPath1.getText());

        ArrayList<Statement> statementListFromProgram = program.getStatementList();
        Statement statement = statementListFromProgram.get(0);
        if (statement instanceof Get) {
            System.out.println("instance of get");
            Get getNode = (Get) statement;
            System.out.println(getNode.isRecursive());
            ArrayList<Clause> clauseList = statement.getClauseList();
            Clause currClause = clauseList.get(0);
            if (currClause instanceof Name) {
                System.out.println("it is a name node");
            }
        } else {
            System.out.println("instance of command");
        }
    }
}