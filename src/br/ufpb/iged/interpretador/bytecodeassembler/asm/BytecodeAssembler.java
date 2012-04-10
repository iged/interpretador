package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.TokenStream;

import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class BytecodeAssembler extends AssemblerParser{
	
	protected Map<String,Integer> opcodesInstrucoes =
	        new HashMap<String,Integer>();

	public BytecodeAssembler(TokenStream lexer, Definicao.Instrucao[] instrucoes) {
		
		super(lexer);
		
		for (int i = 1; i < instrucoes.length; i++) {
			
			opcodesInstrucoes.put(instrucoes[i].nome.toLowerCase(), i);
			
		}
		
	}

}
