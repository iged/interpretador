package br.ufpb.iged.interpretador;

public class main {
	public static void main(String args[]){
		byte [] vet={9, 0, 0, 0, 2, 13, 0, 0, 0, 1, 9, 0, 0, 0, -56, 13, 0, 0, 0, 2,15, 0, 0, 0, 1, 15, 0, 0, 0, 2, 1, 17, 12, 0,65,13, 0, 0, 0, 4};
		Decodificador d=new Decodificador();
		System.out.println(d.Analisador(vet));
	}
}
