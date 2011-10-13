package br.ufpb.iged.interpretador;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

enum OpTipo {
	INT, FLOAT, CHAR
}

class OpInfo {
	public String nome;
	public byte code;
	public OpTipo tipo;
	public int param;

	public OpInfo(String nome, byte code, OpTipo tipo, int param) {
		super();
		this.nome = nome;
		this.code = code;
		this.tipo = tipo;
		this.param = param;
	}
}

public class GeraTabela {

	Scanner s;

	public GeraTabela(String nomeArq) throws IOException
	{
		this.s = new Scanner(new FileInputStream(new File(nomeArq)));
	}

	public GeraTabela(InputStream stream)
	{
		this.s = new Scanner(stream);
	}

	public boolean existeProxima()
	{
		return s.hasNext();
	}

	public OpInfo proximaInst()
	{
		if (!s.hasNext())
			return null;

		String nome = s.next();
		byte code = s.nextByte();
		String tipoTmp = s.next();
		int param = s.nextInt();
		OpTipo tipo;

		if (tipoTmp.equals("I"))
			tipo = OpTipo.INT;
		else if (tipoTmp.equals("F"))
			tipo = OpTipo.FLOAT;
		else
			tipo = OpTipo.CHAR;

		return new OpInfo(nome, code, tipo, param);
	}

	public static void gera()
	{
		Scanner s = new Scanner("IADD    1    I    4\nFADD    2    F    4");

		while (s.hasNext())
		{
			String nome = s.next();
			int code = s.nextInt();
			String tipo = s.next();
			int param = s.nextInt();

			System.out.println(": " + nome + " - " + code + " - " + tipo + " - " + param);
		}
	}

	public static void main(String[] args)
	{
		GeraTabela.gera();
	}
}
