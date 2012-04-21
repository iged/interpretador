package br.ufpb.iged.interpretador.excecoes;

public class AcessoIndevidoMemoriaException extends Exception{

/**
*
*/
private static final long serialVersionUID = 2321754267568937083L;

public AcessoIndevidoMemoriaException() {

super("Acesso indevido à memória");

}

public AcessoIndevidoMemoriaException(String msg) {

super(msg);

}

}