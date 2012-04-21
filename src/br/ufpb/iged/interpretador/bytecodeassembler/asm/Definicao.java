package br.ufpb.iged.interpretador.bytecodeassembler.asm;

import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerParser;

public class Definicao {

	public static final int NOP = 0x0;

	public static final int ICONSTM1 = 0x2;
	public static final int ICONST0 = 0x3;
	public static final int ICONST1 = 0x4;
	public static final int ICONST2 = 0x5;
	public static final int ICONST3 = 0x6;
	public static final int ICONST4 = 0x7;
	public static final int ICONST5 = 0x8;
	public static final int LDC = 0x12;
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
    public static final int POP = 0x57;
    public static final int POP2 = 0x58;
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

	public static Instrucao[] instrucoes = new Instrucao[] { null,
			new Instrucao("nop", Definicao.NOP),
			new Instrucao("iconst_m1", Definicao.ICONSTM1),
			new Instrucao("iconst_0", Definicao.ICONST0),
			new Instrucao("iconst_1", Definicao.ICONST1),
			new Instrucao("iconst_2", Definicao.ICONST2),
			new Instrucao("iconst_3", Definicao.ICONST3),
			new Instrucao("iconst_4", Definicao.ICONST4),
			new Instrucao("iconst_5", Definicao.ICONST5),
			new Instrucao("ldc", INT, Definicao.LDC),
			new Instrucao("iload", INT, Definicao.ILOAD),
			new Instrucao("iload_0", Definicao.ILOAD0),
			new Instrucao("iload_1", Definicao.ILOAD1),
			new Instrucao("iload_2", Definicao.ILOAD2),
			new Instrucao("iload_3", Definicao.ILOAD3),
			new Instrucao("istore", INT, Definicao.ISTORE),
			new Instrucao("istore_0", Definicao.ISTORE0),
			new Instrucao("istore_1", Definicao.ISTORE1),
			new Instrucao("istore_2", Definicao.ISTORE2),
			new Instrucao("istore_3", Definicao.ISTORE3),
			new Instrucao("pop", Definicao.POP),
			new Instrucao("pop2", Definicao.POP2),
			new Instrucao("iadd", Definicao.IADD),
			new Instrucao("isub", Definicao.ISUB),
			new Instrucao("imul", Definicao.IMUL),
			new Instrucao("idiv", Definicao.IDIV),
			new Instrucao("irem", Definicao.IREM),
			new Instrucao("ineg", Definicao.INEG),
			new Instrucao("iand", Definicao.IADD),
			new Instrucao("ior", Definicao.IOR),
			new Instrucao("ixor", Definicao.IXOR),
			new Instrucao("iinc", Definicao.IINC),
			new Instrucao("ifeq", ID, Definicao.IFEQ),
			new Instrucao("ifne", ID, Definicao.IFNE),
			new Instrucao("iflt", ID, Definicao.IFLT),
			new Instrucao("ifge", ID, Definicao.IFGE),
			new Instrucao("ifgt", ID, Definicao.IFGT),
			new Instrucao("ifle", ID, Definicao.IFLE),
			new Instrucao("if_icmpeq", ID, Definicao.IF_ICMPEQ),
			new Instrucao("if_icmpne", ID, Definicao.IF_ICMPNE),
			new Instrucao("if_icmplt", ID, Definicao.IF_ICMPLT),
			new Instrucao("if_icmpge", ID, Definicao.IF_ICMPGE),
			new Instrucao("if_icmpgt", ID, Definicao.IF_ICMPGT),
			new Instrucao("if_icmple", ID, Definicao.IF_ICMPLE),
			new Instrucao("goto", ID, Definicao.GOTO)

	};
 

}
