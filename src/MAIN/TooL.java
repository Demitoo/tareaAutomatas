package MAIN;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR.ParserTLexer;
import ANTLR.ParserTParser;


public class TooL {
	
	public static void main(String[] args)throws Exception {
		//try{
		/*ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("example/ejemplo0.txt"));
		ParserTestLexer lexer = new ParserTestLexer(input);
        
        Token tok = lexer.nextToken();
		while(tok.getType() != Token.EOF)
		{
			System.out.println( tok.getType() + ":" +
					tok.getLine() + ":" +
					tok.getCharPositionInLine() + ": " +
					tok.getText());
			tok = lexer.nextToken();
		}*/
    	//}catch (TokenStreamException tse){
    	//	System.err.println("Error leyendo tokens: " + tse.toString());
    	//}
        
		
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("example/ejemplo0.txt"));
		ParserTLexer lexer = new ParserTLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserTParser parser = new ParserTParser(tokens);  
        ParseTree tree = parser.program();
        MyVisitor eval = new MyVisitor();
        eval.visit(tree);
        
	}

}
