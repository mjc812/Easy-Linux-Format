package Start;

import Parser.ELFLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ELFLexer lexer = new ELFLexer(CharStreams.fromFileName("/Users/michaelchung/Documents/410/ELF/src/input.elf"));
        for (Token token : lexer.getAllTokens()) {
            System.out.println(token);
        }
        lexer.reset();
        System.out.println("Done tokenizing");
    }
}