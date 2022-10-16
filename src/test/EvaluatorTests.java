package test;

import AST.ASTVisitor;
import AST.Evaluator;
import AST.Node.Node;
import Parser.ELFLexer;
import Parser.ELFParser;
import Parser.ParseTreeToASTVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class EvaluatorTests {
    private final String TEST_INPUT_FILE = "src/test/test_input.elf";
    private final String TEST_OUTPUT_FILE = "src/test/test_output.elf";
    private PrintWriter testWriter;

    @BeforeEach
    public void Setup() throws IOException {
        testWriter = new PrintWriter(new FileWriter(TEST_INPUT_FILE));
        testWriter.write("path = get path /Home/Path;");
    }
    public boolean parseInput() throws IOException {
        ELFLexer lexer = new ELFLexer(CharStreams.fromFileName(TEST_INPUT_FILE));
        lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);

        ELFParser parser = new ELFParser(tokens);
        ParseTreeToASTVisitor visitor = new ParseTreeToASTVisitor();
        Node parsedProgram = parser.program().accept(visitor);

        ASTVisitor<PrintWriter, Boolean> astVisitor = new Evaluator();
        PrintWriter writer = new PrintWriter(new FileWriter(TEST_OUTPUT_FILE));
        boolean success = parsedProgram.accept(writer, astVisitor);

        writer.close();
        return success;
    }

    public String readLastLine(BufferedReader reader) throws IOException {
        String last = "", line;

        while ((line = reader.readLine()) != null) {
            last = line;
        }
        return last;
    }

    @Test
    public void TestGetSuccess_FileIsName() throws IOException {
        String input = "file myFile = get file where name is dude;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertTrue(output.contains("-maxdepth 1"));
        br.close();
    }

    @Test
    public void TestGetSuccess_Files() throws IOException {
        String input = "files myFiles = get all files where name is dude;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertTrue(output.contains("-maxdepth 1"));
        assertFalse(output.contains("-quit"));
        br.close();
    }

    @Test
    public void TestGetSuccess_FileMultipleContainsName() throws IOException {
        String input = "file myFile = get file where name contains dude, AND name contains someone, AND name contains hi;";
        testWriter.write(input);
        testWriter.close();
        String[] expectedFlags = {"\"$HOME_PATH\"", "-maxdepth 1", "-type f", "-name \"*dude*\"", "-name \"*someone*\"", "-name \"*hi*\"", "-quit"};

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        for (String flag : expectedFlags) {
            assertTrue(output.contains(flag));
        }
        br.close();
    }

    @Test
    public void TestGetSuccess_FileContainsPrefixSuffixName() throws IOException {
        String input = "file myFile = get file where name contains dude, AND name contains someone, AND name prefix hi, AND name suffix bye;";
        testWriter.write(input);
        testWriter.close();
        String[] expectedFlags = {"-type f","-name \"*dude*\"", "-name \"*someone*\"","-name \"hi*\"", "-name \"*bye\""};

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        for (String flag : expectedFlags) {
            assertTrue(output.contains(flag));
        }
        br.close();
    }

    @Test
    public void TestGetFail_FileMultipleNameConditionsWithIs() throws IOException {
        String input = "file myFile = get file where name is dude, AND name contains someone, AND name prefix hi, AND name prefix bye;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetFail_FileMultiplePrefix() throws IOException {
        String input = "file myFile = get file where name is dude, AND name prefix someone, AND name prefix hi;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetFail_FileMultipleSuffix() throws IOException {
        String input = "file myFile = get file where name suffix dude, AND name suffix someone;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetSuccess_FileRecursivelyOnFile() throws IOException {
        String input = "file myFile = get file recursively where name is dude;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("-maxdepth"));
        br.close();
    }

    @Test
    public void TestGetSuccess_RecursivelyOnFiles() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                files myFiles = get all files recursively where in folder myFolder;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("maxdepth"));
        br.close();
    }

    @Test
    public void TestGetSuccess_RecursivelyOnFolder() throws IOException {
        String input = "folder myFolder = get folder recursively where name is dude;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("-maxdepth"));
        br.close();
    }

    @Test
    public void TestGetFileFail_MismatchType() throws IOException {
        String input = "file myFile = get folder recursively where name is dude;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetFolderFail_MismatchType() throws IOException {
        String input = "file myFolder = get folder where name is dude;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetFail_MismatchTypeFileFiles() throws IOException {
        String input =
                """
                file myFiles = get all files where in folder myFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetFolderFail_MultipleDateClauses() throws IOException {
        String input = "folder myFolder = get folder where date modified on 2022-02-02, AND date modified before 2022-02-01;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }


    @Test
    public void TestGetFail_UseFileAsFolder() throws IOException {
        String input =
                """
                file file1 = get file where name is hi;
                file file2 = get file where in folder file1;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetSuccess_SingledOwnedByClause() throws IOException {
        String input = "file testfile = get file where owned by dude, AND owned by someone;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetFail_MultipleOwnedByClauses() throws IOException {
        String input = "file testfile = get file where owned by dude, AND owned by someone;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("-user dude"));
        br.close();
    }

    @Test
    public void TestMoveFail_UseFileAsFolder() throws IOException {
        String input =
        """
        file file1 = get file where name is hi;
        file file2 = get file where name is hello;
        move file1 to file2;
        """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestMoveFail_UninitializedFile() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                move file to myFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("mv"));

        br.close();
    }

    @Test
    public void TestMoveSuccess_FileToFolder() throws IOException {
        String input =
                """
                file myFile = get file where name is hi;
                folder myFolder = get folder where name is hi;
                move myFile to myFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);
    }

    @Test
    public void TestMoveFail_UninitializedFolder() throws IOException {
        String input =
                """
                file myFile = get file where name is hi;
                move myFile to myFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("mv"));

        br.close();
    }

    @Test
    public void TestMoveSuccess_FilesToFolder() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                files myFiles = get all files in myFolder;
                move all from myFiles to myFolder;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);
    }

    @Test
    public void TestMoveSuccess_FolderToFolder() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                folder myOtherFolder = get folder where name is hey;
                move myFolder to myOtherFolder;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);
    }

    @Test
    public void TestMoveFail_FolderToFile() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                files myFiles = get all files where in folder myFolder;
                move myFolder to myFiles;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetFail_InFolderWrongType() throws IOException {
        String input =
                """
                file notFolder = get file where name is hi;
                files myFiles = get all files where in folder notFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestGetSuccess_MultipleClauses() throws IOException {
        String input = "file testfile = get file where owned by dude, AND date modified before 2022-02-02, AND name contains hi;";
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertTrue(output.contains("-user dude"));
        assertTrue(output.contains("-newermt 2022-02-02"));
        assertTrue(output.contains("-name \"*hi*\""));

        br.close();
    }

    @Test
    public void TestRenameSuccess_File() throws IOException {
        String input =
                """
                file myFile = get file where name is hi;
                rename myFile as hi;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);
    }

    @Test
    public void TestRenameSuccess_Folder() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                rename myFolder as hi;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);
    }

    @Test
    public void TestRenameFail_FilesType() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                files myFiles = get all files where in folder myFolder;
                rename myFiles as hi;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("mv"));
        br.close();
    }

    @Test
    public void TestCopySuccess_FilesToFolder() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                files myFiles = get all files where in folder myFolder;
                copy all from myFiles to myFolder;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);
    }

    @Test
    public void TestCopySuccess_FolderToFolder() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                folder myOtherFolder = get folder where name is yes;
                copy myFolder to myOtherFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertTrue(output.contains("cp"));
        br.close();
    }

    @Test
    public void TestCopySuccess_FileToFolder() throws IOException {
        String input =
                """
                folder myFolder = get folder where name is hi;
                file myFile = get file where in folder myFolder;
                copy myFile to myFolder;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertTrue(output.contains("cp"));
        br.close();
    }

    @Test
    public void TestCopyFail_FilesToFile() throws IOException {
        String input =
                """
                file myFile = get file where name is hi;
                files myFiles = get all files where name contains hi;
                copy all from myFiles to myFile;
                """;        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestCopyFail_AllFromOnFile() throws IOException {
        String input =
                """
                file myFile = get file where name is hi;
                file myFolder = get folder name contains hi;
                copy all from myFile to myFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestDeleteSuccess_File() throws IOException {
        String input =
                """
                file myFile = get file where name is hi;
                delete myFIle;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestDeleteSuccess_Folder() throws IOException {
        String input =
                """
                file myFolder = get folder name contains hi;
                delete myFolder;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }

    @Test
    public void TestDeleteSuccess_Files() throws IOException {
        String input =
                """
                files myFiles = get all files where name is hey;
                delete all from myFiles;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertTrue(success);
    }

    @Test
    public void TestDeleteFail_MismatchTypeFile() throws IOException {
        String input =
                """
                files myFiles = get all files where name is hey;
                delete myFiles;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);

        BufferedReader br = new BufferedReader(new FileReader(new File(TEST_OUTPUT_FILE)));
        String output = readLastLine(br);
        assertFalse(output.contains("rm"));
        br.close();
    }

    @Test
    public void TestDeleteFail_MismatchTypeFiles() throws IOException {
        String input =
                """
                file myFile = get file where name is hey;
                delete all from myFile;
                """;
        testWriter.write(input);
        testWriter.close();

        boolean success = parseInput();
        assertFalse(success);
    }
}
