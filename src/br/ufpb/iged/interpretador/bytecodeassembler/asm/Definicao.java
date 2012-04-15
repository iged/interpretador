package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class Definicao {
	
	/*public static final int INIT = 1;
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
	public static final int LABEL = 24;*/
	
	public static final int NOP = 0x0; 
	
	public static final int ICONSTM1 = 0x2;
	public static final int ICONST0 = 0x3;
	public static final int ICONST1 = 0x4;
	public static final int ICONST2  = 0x5; 
	public static final int ICONST3 = 0x6; 
	public static final int ICONST4  = 0x7;
	public static final int ICONST5  = 0x8;
	public static final int LDC	= 0x12;
    public static final int ILOAD = 0x15;
    public static final int ILOAD0 = 0x1A;
    public static final int ILOAD1 = 0x1B;
    public static final int ILOAD2 = 0x1C;
    public static final int ILOAD3 = 0x1D;
    public static final int ISTORE = 0x36;
    public static final int ISTORE0 = 0x3B;
    public static final int ISTORE1 = 0x3C;
    public static final int ISTORE2 = 0x3D;
    public static final int ISTORE3 = 0x3E;
    public static final int IADD = 0x60;
    public static final int ISUB = 0x64;
    public static final int IMUL = 0x68;
    public static final int IDIV = 0x6C;
    public static final int IREM = 0x70;
    public static final int INEG = 0x74;
    public static final int IAND = 0x7E;
    public static final int IOR = 0x80;
    public static final int IXOR = 0x82;
    public static final int IINC = 0x84;
    public static final int IFEQ = 0x99;
    public static final int IFNE = 0x9A;
    public static final int IFLT = 0x9B;
    public static final int IFGE = 0x9C;
    public static final int IFGT = 0x9D;
    public static final int IFLE = 0x9E;
    public static final int IF_ICMPEQ = 0x9F;
    public static final int IF_ICMPNE = 0xA0;
    public static final int IF_ICMPLT = 0xA1;
    public static final int IF_ICMPGE = 0xA2;
    public static final int IF_ICMPGT = 0xA3;
    public static final int IF_ICMPLE = 0xA4;
    public static final int GOTO = 0xA7;
       
	
	/*public static final int TYPE_STRUCT = AssemblerParser.TYPE_STRUCT;
	public static final int ID = AssemblerParser.ID;
	public static final int INT = AssemblerParser.INT;
	public static final int NOME_REF = AssemblerParser.NOME_REF;
	public static final int NULL = AssemblerParser.NULL;*/
    
    public static final int ID = AssemblerParser.ID;
    public static final int INT= AssemblerParser.INT;
    public static final int NOVA_LINHA = AssemblerParser.NOVA_LINHA;
    public static final int NULL = AssemblerParser.NULL;
    public static final int RG03 = AssemblerParser.RG03;
    public static final int SP = AssemblerParser.SP;
    public static final int WS = AssemblerParser.WS;
	
	
	public static class Instrucao {
		
		String nome;
		
		int tipo;
		
		int n = 0;
		
		public Instrucao (String nome) {
			
			this (nome, 0);
			
		}
		
		public Instrucao (String nome, int a) {
			
			this.nome = nome;
			
			tipo = a;
			
		}
		
 		
	}
	
	public static Instrucao[] instrucoes = new Instrucao[] {
		null,
		/*new Instrucao("INIT", TYPE_STRUCT, ID),
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
		new Instrucao("LABEL")*/
		
		new Instrucao("NOP"),
		new Instrucao ("ICONSTM1"),
		new Instrucao("ICONST0"),
		new Instrucao("ICONST1"),
		new Instrucao("ICONST2"),
	    new Instrucao("ICONST3"),
	    new Instrucao("ICONST4"),
	    new Instrucao("ICONST5"),
	    new Instrucao("LDC", INT),
	    new Instrucao("ILOAD", INT),
	    new Instrucao("ILOAD0"),
	    new Instrucao("ILOAD1"),
	    new Instrucao("ILOAD2"),
	    new Instrucao("ILOAD3"),
	    new Instrucao("ISTORE", INT),
	    new Instrucao("ISTORE0"),
	    new Instrucao("ISTORE1"),
		new Instrucao("ISTORE2"),
		new Instrucao("ISTORE3"),
		new Instrucao("IADD"),
		new Instrucao("ISUB"),
		new Instrucao("IMUL"),
		new Instrucao("IDIV"),
	    new Instrucao("IREM"),
	    new Instrucao("INEG"),
	    new Instrucao("IAND"),
	    new Instrucao("IOR"),
	    new Instrucao("IXOR"),
	    new Instrucao("IINC"),
	    new Instrucao("IFEQ", ID),
	    new Instrucao("IFNE", ID),
	    new Instrucao("IFLT", ID),
	    new Instrucao("IFGE", ID),
	    new Instrucao("IFGT", ID),
	    new Instrucao("IFLE", ID),
	    new Instrucao("IF_ICMPEQ", ID),
	    new Instrucao("IF_ICMPNE", ID),
	    new Instrucao("IF_ICMPLT", ID),
	    new Instrucao("IF_ICMPGE", ID),
	    new Instrucao("IF_ICMPGT", ID),
	    new Instrucao("IF_ICMPLE", ID),
	    new Instrucao("GOTO", ID)

	};
 

}
