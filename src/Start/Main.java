package Start;

import AST.ASTVisitor;
import AST.Evaluator;
import AST.Node.Node;
import Parser.ELFLexer;
import Parser.ELFParser;
import Parser.ParseTreeToASTVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        ELFLexer lexer = new ELFLexer(CharStreams.fromFileName("src/input.elf"));
        lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);

        ELFParser parser = new ELFParser(tokens);
        ParseTreeToASTVisitor visitor = new ParseTreeToASTVisitor();
        Node parsedProgram = parser.program().accept(visitor);

        // write the file
        ASTVisitor<PrintWriter, Boolean> astVisitor = new Evaluator();
        PrintWriter writer = new PrintWriter(new FileWriter("output.sh"));
        parsedProgram.accept(writer, astVisitor);
        writer.close();
        System.out.println("Done");
    }
}