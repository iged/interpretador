package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class BytecodeAssembler extends AssemblerParser{

	public BytecodeAssembler(TokenStream lexer, RecognizerSharedState state) {
		
		super(lexer);
		
	}

}
