package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.TokenStream;

import org.antlr.runtime.Token;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class BytecodeAssembler extends AssemblerParser{
	
	public static final int TAMANHO_INICIAL_MEMORIA_CODIGO = 1024;
	public static final int TAMANHO_INICIAL_MEMORIA_GLOBAL = 1024;
	
	protected Map<String,Integer> opcodesInstrucoes =
	        new HashMap<String,Integer>();

	 protected Map<String, LabelSymbol> labels = // label scope
		        new HashMap<String, LabelSymbol>();
	 protected Map<String, Integer> enderecosMap  = new HashMap<String, Integer>(); 
	 protected static int ip = 0; // Instruction pointer; used to fill code[]
	 protected static byte[] codigo = new byte[TAMANHO_INICIAL_MEMORIA_CODIGO]; // code memory
	 protected int tamMemoriaGlobalEstruturas = 0;
	 protected int tamMemoriaGlobalReferencias = 0;
	 protected int tamMemoriaGlobalVariaveisInteiras = 0;
	 

	public BytecodeAssembler(TokenStream lexer, Definicao.Instrucao[] instrucoes) {
		
		super(lexer);
		
		for (int i = 1; i < instrucoes.length; i++) {
			
			opcodesInstrucoes.put(instrucoes[i].nome, i);
			
		}
		
	}
	
	protected void escreverOpcode(Token opc) {
		
		String nomeInstrucao = opc.getText();
		
		Integer opcode = opcodesInstrucoes.get(nomeInstrucao);
		
		verificarAumentoTamanhoMemoria(ip + 1);
		
		codigo[ip++] = (byte) (opcode.intValue() & 0xFF);
		
		
	}
	
	
	protected void init(Token opcode, Token typeStruct, Token id, Token size) {
		
		escreverOpcode(opcode);
		
		int valorTipo;
		
		if (typeStruct.getText().equalsIgnoreCase("LISTA"))
			valorTipo = 1;
		else
			valorTipo = 2;
		
		escreverInteiro(codigo, ip, valorTipo);
		
		setTamMemoriaGlobalEstruturas(++tamMemoriaGlobalEstruturas);
		
		escreverInteiro(codigo, ip, tamMemoriaGlobalEstruturas);
		
		enderecosMap.put(id.getText(), tamMemoriaGlobalEstruturas);
		
		if (size != null) 
			
			escreverInteiro(codigo, ip, new Integer(size.getText()));
			
		
	}
	
	protected void createInt(Token opcode, Token id) {
		
		setTamMemoriaGlobalVariaveisInteiras(++tamMemoriaGlobalVariaveisInteiras);
		
		escreverOpcode(opcode);
		
		escreverInteiro(codigo, ip, tamMemoriaGlobalVariaveisInteiras);
		
		enderecosMap.put(id.getText(), tamMemoriaGlobalVariaveisInteiras);
		
	}
	
	protected void createNode(Token opcode, Token typeStruct) {
		
		setTamMemoriaGlobalReferencias(++tamMemoriaGlobalReferencias);
		
		escreverOpcode(opcode);
		
		int valorTipo;
		
		if (typeStruct.getText().equalsIgnoreCase("LISTA"))
			valorTipo = 1;
		else
			valorTipo = 2;
		
		escreverInteiro(codigo, ip, valorTipo);
		
	}
	
	protected void createRef(Token opcode, Token id) {
		
		setTamMemoriaGlobalReferencias(++tamMemoriaGlobalReferencias);
		
		escreverOpcode(opcode);
		
		escreverInteiro(codigo, ip, tamMemoriaGlobalReferencias);
		
		enderecosMap.put(id.getText(), tamMemoriaGlobalReferencias);
		
	}
	
	protected void escreverOperando(Token token) {
		
		int valor;
		
		String operandoTxt = token.getText();
		
		switch(token.getType()) {
		
		case INT: valor = new Integer(operandoTxt);break;
		case ID: valor = obterEndereco(operandoTxt);break;
		
		}
		
	}
	
	protected void escreverOpcode(Token opc, Token op) {
		
		escreverOpcode(opc);
		escreverOperando(op);
		
	}
	
	protected int obterEndereco(String id) {
		
		return 0;
		
	}
	
	protected static void verificarAumentoTamanhoMemoria(int indice) {
		
        if ( indice >= codigo.length ) {
        	
            int tamanho = Math.max(indice, codigo.length) * 2;
            byte[] novaMemoriaCodigo = new byte[tamanho];
            System.arraycopy(codigo, 0 , novaMemoriaCodigo, 0, codigo.length);
            codigo = novaMemoriaCodigo;
            
        }
        
    }
	
	
	public static void escreverInteiro(byte[] bytes, int indice, int valor) {
		
		verificarAumentoTamanhoMemoria(ip + 4);
		
        bytes[indice + 0] = (byte)((valor >> (8 * 3)) & 0xFF); // get highest byte
        bytes[indice + 1] = (byte)((valor >> (8 * 2)) & 0xFF);
        bytes[indice + 2] = (byte)((valor >> (8 * 1)) & 0xFF);
        bytes[indice + 3] = (byte)(valor & 0xFF);
        
        ip += 4;
        
    }

	public int getTamMemoriaGlobalReferencias() {
		return tamMemoriaGlobalReferencias;
	}

	public void setTamMemoriaGlobalReferencias(int tamMemoriaGlobalReferencias) {
		this.tamMemoriaGlobalReferencias = tamMemoriaGlobalReferencias;
	}

	public int getTamMemoriaGlobalVariaveisInteiras() {
		return tamMemoriaGlobalVariaveisInteiras;
	}

	public void setTamMemoriaGlobalVariaveisInteiras(
			int tamMemoriaGlobalVariaveisInteiras) {
		this.tamMemoriaGlobalVariaveisInteiras = tamMemoriaGlobalVariaveisInteiras;
	}

	public int getTamMemoriaGlobalEstruturas() {
		return tamMemoriaGlobalEstruturas;
	}

	public void setTamMemoriaGlobalEstruturas(int tamMemoriaGlobalEstruturas) {
		this.tamMemoriaGlobalEstruturas = tamMemoriaGlobalEstruturas;
	}

}
