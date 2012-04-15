package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class Definicao {
	
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
		
		int opcode;
		
		int n = 0;
		
		public Instrucao (String nome, int opcode) {
			
			this (nome, 0, opcode);
			
		}
		
		public Instrucao (String nome, int a, int opcode) {
			
			this.nome = nome;
			
			tipo = a;
			
			this.opcode = opcode;
			
		}
		
 		
	}
	
	public static Instrucao[] instrucoes = new Instrucao[] {
		null,
		new Instrucao("NOP", Definicao.NOP),
		new Instrucao ("ICONSTM1", Definicao.ICONSTM1),
		new Instrucao("ICONST0", Definicao.ICONST0),
		new Instrucao("ICONST1", Definicao.ICONST1),
		new Instrucao("ICONST2", Definicao.ICONST2),
	    new Instrucao("ICONST3", Definicao.ICONST3),
	    new Instrucao("ICONST4", Definicao.ICONST4),
	    new Instrucao("ICONST5", Definicao.ICONST5),
	    new Instrucao("LDC", INT, Definicao.LDC),
	    new Instrucao("ILOAD", INT, Definicao.ILOAD),
	    new Instrucao("ILOAD0", Definicao.ILOAD0),
	    new Instrucao("ILOAD1", Definicao.ILOAD1),
	    new Instrucao("ILOAD2", Definicao.ILOAD2),
	    new Instrucao("ILOAD3", Definicao.ILOAD3),
	    new Instrucao("ISTORE", INT, Definicao.ISTORE),
	    new Instrucao("ISTORE0", Definicao.ISTORE0),
	    new Instrucao("ISTORE1", Definicao.ISTORE1),
		new Instrucao("ISTORE2", Definicao.ISTORE2),
		new Instrucao("ISTORE3", Definicao.ISTORE3),
		new Instrucao("IADD", Definicao.IADD),
		new Instrucao("ISUB", Definicao.ISUB),
		new Instrucao("IMUL", Definicao.IMUL),
		new Instrucao("IDIV", Definicao.IDIV),
	    new Instrucao("IREM", Definicao.IREM),
	    new Instrucao("INEG", Definicao.INEG),
	    new Instrucao("IAND", Definicao.IADD),
	    new Instrucao("IOR", Definicao.IOR),
	    new Instrucao("IXOR", Definicao.IXOR),
	    new Instrucao("IINC", Definicao.IINC),
	    new Instrucao("IFEQ", ID, Definicao.IFEQ),
	    new Instrucao("IFNE", ID, Definicao.IFNE),
	    new Instrucao("IFLT", ID, Definicao.IFLT),
	    new Instrucao("IFGE", ID, Definicao.IFGE),
	    new Instrucao("IFGT", ID, Definicao.IFGT),
	    new Instrucao("IFLE", ID, Definicao.IFLE),
	    new Instrucao("IF_ICMPEQ", ID, Definicao.IF_ICMPEQ),
	    new Instrucao("IF_ICMPNE", ID, Definicao.IF_ICMPNE),
	    new Instrucao("IF_ICMPLT", ID, Definicao.IF_ICMPLT),
	    new Instrucao("IF_ICMPGE", ID, Definicao.IF_ICMPGE),
	    new Instrucao("IF_ICMPGT", ID, Definicao.IF_ICMPGT),
	    new Instrucao("IF_ICMPLE", ID, Definicao.IF_ICMPLE),
	    new Instrucao("GOTO", ID, Definicao.GOTO)

	};
 

}
