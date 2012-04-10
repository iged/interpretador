package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class Definicao {
	
	public static final int INIT = 1;
	public static final int CREATE_INT = 2;	
	public static final int CREATE_NODE = 3;	
	public static final int CREATE_REF = 4;	
	public static final int READ_INT = 5;	
	public static final int READ_INTC = 6;	
	public static final int READ_VET = 7;	
	public static final int READ_RN = 8;	
	public static final int READ_INFO = 9;	
	public static final int READ_REF = 10;	
	public static final int WRITE_INT = 11;
	public static final int WRITE_VET = 12;
	public static final int WRITE_RN = 13;
	public static final int WRITE_INFO = 14;
	public static final int WRITE_REF = 15;
	public static final int DELETE_INT = 16;
	public static final int DELETE_NODE = 17;
	public static final int DELETE_REF = 18;
	public static final int JMP = 19;
	public static final int ADD = 20;
	public static final int SUB = 21;
	public static final int MULT = 22;
	public static final int DIV = 23;
	public static final int LABEL = 24;
	
	public static final int TYPE_STRUCT = AssemblerParser.TYPE_STRUCT;
	public static final int ID = AssemblerParser.ID;
	public static final int INT = AssemblerParser.INT;
	public static final int NOME_REF = AssemblerParser.NOME_REF;
	public static final int NULL = AssemblerParser.NULL;
	
	
	public static class Instrucao {
		
		String nome;
		
		int[] tipo = new int[3];
		
		int n = 0;
		
		public Instrucao (String nome) {
			
			this (nome, 0, 0, 0);
			
		}
		
		public Instrucao (String nome, int a) {
			
			this(nome, a, 0, 0);
			
		}
		
		
		public Instrucao(String nome, int a, int b) {
			
			this(nome, a, b, 0);
			
		}
		
		public Instrucao (String nome, int a, int b, int c) {
			
			this.nome = nome;
			tipo[0] = a;
			tipo[1] = b;
			tipo[2] = c;
			
		}
		
 		
	}
	
	public static Instrucao[] instrucoes = new Instrucao[] {
		null,
		new Instrucao("INIT", TYPE_STRUCT, ID),
		new Instrucao("CREATE_INT", ID),
		new Instrucao("CREATE_NODE", TYPE_STRUCT),
		new Instrucao("CREATE_REF", ID),
		new Instrucao("READ_INT", ID),
		new Instrucao("READ_INTC", INT),
		new Instrucao("READ_VET", ID),
		new Instrucao("READ_RN", ID, NOME_REF),
		new Instrucao("READ_INFO", ID),
		new Instrucao("READ_REF", ID),
		new Instrucao("WRITE_INT", ID),
		new Instrucao("WRITE_VET", ID),
		new Instrucao("WRITE_RN", ID, NOME_REF),
        new Instrucao("WRITE_RN", ID, NOME_REF, NULL),
        new Instrucao("WRITE_INFO", ID),
        new Instrucao("WRITE_REF", ID),
        new Instrucao("WRITE_REF", ID, NULL),
        new Instrucao("DELETE_INT", ID),
        new Instrucao("DELETE_NODE", ID),
        new Instrucao("DELETE_REF", ID),
        new Instrucao("ADD"),
        new Instrucao("SUB"),
        new Instrucao("MULT"),
        new Instrucao("DIV"),
        new Instrucao("JMP"),
		new Instrucao("LABEL")

	};
 

}
