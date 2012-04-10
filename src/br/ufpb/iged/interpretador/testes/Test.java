
package br.ufpb.iged.interpretador.testes;

import org.antlr.runtime.*;

import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerLexer;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class Test {
	
    public static void main(String[] args) throws Exception {
    	
        CharStream entrada = new ANTLRFileStream("entrada.txt");
        
        AssemblerLexer lexer = new AssemblerLexer(entrada);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        AssemblerParser parser = new AssemblerParser(tokens);
        parser.programa();
        
    }
    
}
