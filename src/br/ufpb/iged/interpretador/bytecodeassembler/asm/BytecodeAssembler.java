package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.TokenStream;

import org.antlr.runtime.Token;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;
import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.LabelException;

public class BytecodeAssembler extends AssemblerParser{

	public static final int TAMANHO_INICIAL_MEMORIA_CODIGO = 1024;
	public static final int TAMANHO_INICIAL_MEMORIA_GLOBAL = 1024;

	protected Map<String,Integer> opcodesInstrucoes =
			new HashMap<String,Integer>();

	protected Map<String, LabelSymbol> labels =
			new HashMap<String, LabelSymbol>();
	protected Map<String, Integer> enderecosMap =
			new HashMap<String, Integer>();
	protected static int ip = 0;
	public static byte[] codigo = new byte[TAMANHO_INICIAL_MEMORIA_CODIGO];
	protected int tamMemoriaGlobalEstruturas = 0;
	protected int tamMemoriaGlobalReferencias = 0;
	protected int tamMemoriaGlobal = 0;


	public BytecodeAssembler(TokenStream lexer, Definicao.Instrucao[] instrucoes) {

		super(lexer);

		for (int i = 1; i < instrucoes.length; i++) {

			opcodesInstrucoes.put(instrucoes[i].nome, instrucoes[i].opcode);

		}

	}

	protected void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException {

		String opcodeTxt = opc.getText();

		if (opcodeTxt.contains("0")) {

			if (tamMemoriaGlobal == 0)

				tamMemoriaGlobal++;

		} else if (opcodeTxt.contains("1")) {

			if (tamMemoriaGlobal == 1)

				tamMemoriaGlobal++;

			else if (tamMemoriaGlobal < 1)

				throw new AcessoIndevidoMemoriaException();

		} else if (opcodeTxt.contains("2")) {

			if (tamMemoriaGlobal == 2)

				tamMemoriaGlobal++;

			else if (tamMemoriaGlobal < 2)

				throw new AcessoIndevidoMemoriaException();

		} else if (opcodeTxt.contains("3")) {

			if (tamMemoriaGlobal == 3)

				tamMemoriaGlobal++;

			else if (tamMemoriaGlobal < 3)

				throw new AcessoIndevidoMemoriaException();

		}

		escreverOpcode(opc);

	}

	protected void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException {

		Integer endereco = new Integer(op.getText());

		if (tamMemoriaGlobal == endereco)

			tamMemoriaGlobal++;

		else if (tamMemoriaGlobal < endereco)

			throw new AcessoIndevidoMemoriaException();

		escreverOpcode(opc, op);

	}

	protected void escreverOpcode(Token opc) {

		String nomeInstrucao = opc.getText();

		Integer opcode = opcodesInstrucoes.get(nomeInstrucao);

		verificarAumentoTamanhoMemoria(ip + 1);

		codigo[ip++] = (byte)(opcode.intValue() & 0xFF);


	}


	protected void escreverOpcode(Token opc, Token op) throws LabelException {

		escreverOpcode(opc);

		escreverOperando(op);

	}

	protected void escreverOperando(Token token) throws LabelException {

		int valor = 0;

		String operandoTxt = token.getText();

		switch(token.getType()) {

		case INT: valor = new Integer(operandoTxt);break;
		case ID: valor = obterEndereco(operandoTxt);break;
		
		}

		escreverInteiro(codigo, ip, valor);

	}

	protected void definirLabel(Token id) throws LabelException {

		LabelSymbol label = labels.get(id.getText());

		if (label != null)
			throw new LabelException("Label duplicado");


		label = new LabelSymbol(id.getText(), ip);

		labels.put(id.getText(), label);

	}

	protected int obterEndereco(String id) throws LabelException {

		LabelSymbol label = labels.get(id);

		if (label == null)

			throw new LabelException("O label referido não existe");


		return label.address;

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

        bytes[indice + 0] = (byte)((valor >> (8 * 3)) & 0xFF);
        bytes[indice + 1] = (byte)((valor >> (8 * 2)) & 0xFF);
        bytes[indice + 2] = (byte)((valor >> (8 * 1)) & 0xFF);
        bytes[indice + 3] = (byte)(valor & 0xFF);
        
        ip += 4;
        
    }

	public static int obterInteiro(byte[] memoria, int indice) {

        int b1 = memoria[indice++]&0xFF;
        int b2 = memoria[indice++]&0xFF;
        int b3 = memoria[indice++]&0xFF;
        int b4 = memoria[indice++]&0xFF;
        int palavra = b1<<(8*3) | b2<<(8*2) | b3<<(8*1) | b4;
        return palavra;
        
    }


	public byte[] obterCodigoMaquina() {

		return codigo;

	}

	public int obterTamanhoMemoriaCodigo() {

		return ip;

	}

	public int getTamMemoriaGlobalReferencias() {
		return tamMemoriaGlobalReferencias;
	}

	public void setTamMemoriaGlobalReferencias(int tamMemoriaGlobalReferencias) {
		this.tamMemoriaGlobalReferencias = tamMemoriaGlobalReferencias;
	}

	public int getTamMemoriaGlobal() {
		return tamMemoriaGlobal;
	}

	public void setTamMemoriaGlobal(
			int tamMemoriaGlobal) {
		this.tamMemoriaGlobal = tamMemoriaGlobal;
	}

	public int getTamMemoriaGlobalEstruturas() {
		return tamMemoriaGlobalEstruturas;
	}

	public void setTamMemoriaGlobalEstruturas(int tamMemoriaGlobalEstruturas) {
		this.tamMemoriaGlobalEstruturas = tamMemoriaGlobalEstruturas;
	}

}
