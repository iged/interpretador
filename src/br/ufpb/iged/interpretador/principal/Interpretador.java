package br.ufpb.iged.interpretador.principal;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;
import br.ufpb.iged.interpretador.bytecodeassembler.asm.Definicao;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerLexer;

public class Interpretador {
	
	public static final String NOME_ARQUIVO_ENTRADA = "entrada.txt";
	
	public static final int TAMANHO_INICIAL_PILHA_OPERANDOS = 100;
	
	int ip;
	
    byte[] codigo;
    
    int tamanhoCodigo;
    
    Object[] memoriaGlobal;
    
    Object[] pilhaOperandos = new Object[TAMANHO_INICIAL_PILHA_OPERANDOS];
    
    int sp = -1;
    
    boolean trace = false;
    
    public static void main(String[] args) throws Exception{
    	
        /*boolean trace = false;
        boolean disassemble = false;
        boolean dump = false;
        String filename=null;
        int i = 0;
        while ( i<args.length ) {
            if ( args[i].equals("-trace") ) { trace = true; i++; }
            else if ( args[i].equals("-dis") ) { disassemble = true; i++; }
            else if ( args[i].equals("-dump") ) { dump = true; i++; }
            else { filename = args[i]; i++; }
        } */

        InputStream entrada  = new FileInputStream(NOME_ARQUIVO_ENTRADA);

        Interpretador interpretador = new Interpretador();
        carregar(interpretador, entrada);
        //interpretador.trace = trace;
        //interpretador.exec();
        //if ( disassemble ) interpretador.disassemble();
        //if ( dump) interpretador.coredump();
    	
    }
    
    public static boolean carregar(Interpretador interp, InputStream input) throws Exception {
        boolean hasErrors = false;
        try {
            AssemblerLexer assemblerLexer =
                new AssemblerLexer(new ANTLRInputStream(input));
            CommonTokenStream tokens = new CommonTokenStream(assemblerLexer);
            BytecodeAssembler assembler =
                new BytecodeAssembler(tokens, Definicao.instrucoes);
            assembler.programa();
            interp.codigo = assembler.obterCodigoMaquina();
            interp.tamanhoCodigo = assembler.obterTamanhoMemoriaCodigo();
            interp.memoriaGlobal = new Object[assembler.getTamMemoriaGlobal()];
           /* interp.disasm = new DisAssembler(interp.code,
                                             interp.codeSize,
                                             interp.constPool);
            hasErrors = assembler.getNumberOfSyntaxErrors()>0;*/
        }
        finally {
            input.close();
        }
        return hasErrors;
    }


}
