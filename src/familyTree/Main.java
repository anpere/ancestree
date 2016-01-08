package familyTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import familyParser.*;
public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File("src/familyTree/perez_lastra.fl");
		String familyTree = fileToString(file);
		CharStream stream = new ANTLRInputStream(familyTree);
		familyLexer lexer = new familyLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		lexer.reportErrorsAsExceptions();
		familyParser parser = new familyParser(tokens);
		parser.reportErrorsAsExceptions();
		ParseTree tree = parser.root();
		ParseTreeWalker walker = new ParseTreeWalker();
		ImplementedFamilyListener familyListener = new ImplementedFamilyListener();
		walker.walk(familyListener, tree);
		Family family = familyListener.getFamily();
		
		PrintWriter writer = new PrintWriter("family.gv", "UTF-8");
		writer.println("graph G{");
		writer.println(family.toString());
		writer.println("}");
		writer.close();
	}
	private static String fileToString(File file) throws IOException{
	    String fileString = "";
	    FileReader fileReader = new FileReader(file);
	    BufferedReader bufferedFile = new BufferedReader(fileReader);
	    String line;
	    while((line=bufferedFile.readLine()) != null) {
	        fileString += line;
	        fileString += "\n";
	    }
	    bufferedFile.close();
        return fileString;
	}

}
