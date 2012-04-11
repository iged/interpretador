package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.TokenStream;

import antlr.Token;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class BytecodeAssembler extends AssemblerParser{
	
	public static final int TAMANHO_INICIAL_MEMORIA_CODIGO = 1024;
	public static final int TAMANHO_INICIAL_MEMORIA_GLOBAL = 1024;
	
	protected Map<String,Integer> opcodesInstrucoes =
	        new HashMap<String,Integer>();

	 protected Map<String, LabelSymbol> labels = // label scope
		        new HashMap<String, LabelSymbol>();
	 protected int ip = 0; // Instruction pointer; used to fill code[]
	 protected byte[] codigo = new byte[TAMANHO_INICIAL_MEMORIA_CODIGO]; // code memory
	 

	public BytecodeAssembler(TokenStream lexer, Definicao.Instrucao[] instrucoes) {
		
		super(lexer);
		
		for (int i = 1; i < instrucoes.length; i++) {
			
			opcodesInstrucoes.put(instrucoes[i].nome, i);
			
		}
		
	}
	
	protected void escreverOpcode(Token token) {
		
		String nomeInstrucao = token.getText();
		
		Integer opcode = opcodesInstrucoes.get(nomeInstrucao);
		
		verificarAumentoTamanhoMemoria(ip + 1);
		
		codigo[ip++] = (byte) (opcode.intValue() & 0xFF);
		
		
	}
	
	protected void escreverOperando(Token token) {
		
		int valor;
		
		String operandoTxt = token.getText();
		
		switch(token.getType()) {
		
		case INT: valor = new Integer(operandoTxt);break;
		case ID: valor = obterEndereco(operandoTxt);break;
		
		}
		
	}
	
	protected int obterEndereco(String id) {
		
		return 0;
		
	}
	
	protected void verificarAumentoTamanhoMemoria(int index) {
		
        if ( index >= codigo.length ) {
        	
            int tamanho = Math.max(index, codigo.length) * 2;
            byte[] novaMemoriaCodigo = new byte[tamanho];
            System.arraycopy(codigo, 0 , novaMemoriaCodigo, 0, codigo.length);
            codigo = novaMemoriaCodigo;
            
        }
        
    }
	
	public static void writeInt(byte[] bytes, int index, int value) {
        bytes[index+0] = (byte)((value>>(8*3))&0xFF); // get highest byte
        bytes[index+1] = (byte)((value>>(8*2))&0xFF);
        bytes[index+2] = (byte)((value>>(8*1))&0xFF);
        bytes[index+3] = (byte)(value&0xFF);
    }

}
