package Start;

import AST.Clauses.*;
import AST.Node.Node;
import AST.Program.Program;
import AST.Program.ProgramPath;
import AST.Statements.Command;
import AST.Statements.Commands.Copy;
import AST.Statements.Commands.Delete;
import AST.Statements.Get;
import AST.Statements.Statement;
import Parser.ELFLexer;
import Parser.ELFParser;
import Parser.ParseTreeToASTVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ELFLexer lexer = new ELFLexer(CharStreams.fromFileName("src/input.elf"));
        for (Token token : lexer.getAllTokens()) {
            //System.out.println(token);
        }
        lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);

        ELFParser parser = new ELFParser(tokens);
        ParseTreeToASTVisitor visitor = new ParseTreeToASTVisitor();
        Node parsedProgram = parser.program().accept(visitor);

        // TODO: create the file
    }
}