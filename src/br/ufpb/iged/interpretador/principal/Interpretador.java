package br.ufpb.iged.interpretador.principal;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;
import br.ufpb.iged.interpretador.bytecodeassembler.asm.Definicao;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerLexer;

public class Interpretador {

	public static final String NOME_ARQUIVO_ENTRADA = "entrada.txt";

	public static final int TAMANHO_INICIAL_PILHA_OPERANDOS = 100;

	int ip = 0;

	byte[] codigo;

	int tamanhoCodigo;

	Object[] memoriaGlobal;

	Object[] pilhaOperandos = new Object[TAMANHO_INICIAL_PILHA_OPERANDOS];

	int sp = -1;

	public static void main(String[] args) throws Exception {

		InputStream entrada = new FileInputStream(NOME_ARQUIVO_ENTRADA);

		Interpretador interpretador = new Interpretador();
		if (carregar(interpretador, entrada))
			interpretador.cpu();

	}

	public static boolean carregar(Interpretador interp, InputStream input)
			throws Exception {
		
		try {
			AssemblerLexer assemblerLexer = new AssemblerLexer(
					new ANTLRInputStream(input));
			CommonTokenStream tokens = new CommonTokenStream(assemblerLexer);
			BytecodeAssembler assembler = new BytecodeAssembler(tokens,
					Definicao.instrucoes);
			assembler.programa();
			if (assembler.getNumberOfSyntaxErrors() > 0)
				return false;
			interp.codigo = assembler.obterCodigoMaquina();
			interp.tamanhoCodigo = assembler.obterTamanhoMemoriaCodigo();
			interp.memoriaGlobal = new Object[assembler.getTamMemoriaGlobal()];

		} finally {
			input.close();
		}
		return true;
		
	}

	protected void cpu() {

		int op1, op2;

		short opcode;

		boolean desvio;

		while (ip < tamanhoCodigo) {

			desvio = false;

			opcode = codigo[ip];

			if (opcode < 0)

				opcode = recuperarValorOpcode(opcode);

			switch (opcode) {

			// nenhuma operação

			case Definicao.NOP:
				;
				break;
				
			case Definicao.POP:
				sp-- ;
				break;
				
			case Definicao.POP2:
				sp -= 2 ;
				break;

			// operações aritméticas

			case Definicao.INEG: {

				op1 = (Integer) pilhaOperandos[sp];

				pilhaOperandos[sp] = 0 - op1;

			};
				break;

			case Definicao.IADD: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				pilhaOperandos[sp] = op1 + op2;

			}
				;
				break;

			case Definicao.ISUB: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				pilhaOperandos[sp] = op1 - op2;

			}
				;
				break;

			case Definicao.IMUL: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				pilhaOperandos[sp] = op1 * op2;

			}
				;
				break;

			case Definicao.IDIV: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				pilhaOperandos[sp] = op1 / op2;

			}
				;
				break;

			case Definicao.IREM: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				pilhaOperandos[sp] = op1 % op2;

			}
				;
				break;

			case Definicao.IINC: {

				op1 = (Integer) pilhaOperandos[sp];

				pilhaOperandos[sp] = ++op1;

			}
				;
				break;

			// operações de empilhamento de constantes

			case Definicao.ICONST0: {

				sp++;

				pilhaOperandos[sp] = 0;

			}
				;
				break;

			case Definicao.ICONST1: {

				sp++;

				pilhaOperandos[sp] = 1;

			}
				;
				break;

			case Definicao.ICONST2: {

				sp++;

				pilhaOperandos[sp] = 2;

			}
				;
				break;

			case Definicao.ICONST3: {

				sp++;

				pilhaOperandos[sp] = 3;

			}
				;
				break;

			case Definicao.ICONST4: {

				sp++;

				pilhaOperandos[sp] = 4;

			}
				;
				break;

			case Definicao.ICONST5: {

				sp++;

				pilhaOperandos[sp] = 5;

			}
				;
				break;

			case Definicao.ICONSTM1: {

				sp++;

				pilhaOperandos[sp] = -1;

			}
				;
				break;

			case Definicao.LDC: {

				sp++;

				op1 = obterOperandoInteiro();

				pilhaOperandos[sp] = op1;

			}
				;
				break;

			// operações de load

			case Definicao.ILOAD0: {

				sp++;

				pilhaOperandos[sp] = memoriaGlobal[0];

			}
				;
				break;

			case Definicao.ILOAD1: {

				sp++;

				pilhaOperandos[sp] = memoriaGlobal[1];

			}
				;
				break;

			case Definicao.ILOAD2: {

				sp++;

				pilhaOperandos[sp] = memoriaGlobal[2];

			}
				;
				break;

			case Definicao.ILOAD3: {

				sp++;

				pilhaOperandos[sp] = memoriaGlobal[3];

			}
				;
				break;

			case Definicao.ILOAD: {

				sp++;

				op1 = obterOperandoInteiro();

				pilhaOperandos[sp] = memoriaGlobal[op1];

			}
				;
				break;

			// operações de store

			case Definicao.ISTORE0: {

				memoriaGlobal[0] = pilhaOperandos[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE1: {

				memoriaGlobal[1] = pilhaOperandos[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE2: {

				memoriaGlobal[2] = pilhaOperandos[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE3: {

				memoriaGlobal[3] = pilhaOperandos[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE: {

				op1 = obterOperandoInteiro();

				memoriaGlobal[op1] = pilhaOperandos[sp];
				
				sp--;

			}
				;
				break;

			// operações lógicas

			case Definicao.IAND: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				op1 = op1 & op2;

				sp--;

			}
				;
				break;

			case Definicao.IOR: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				op1 = op1 | op2;

				sp--;

			}
				;
				break;

			case Definicao.IXOR: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				op1 = op1 ^ op2;

				sp--;

			}
				;
				break;

			// operações de desvio condicional

			case Definicao.IFEQ: {

				op1 = (Integer) pilhaOperandos[sp];

				if (op1 == 0) {

					desviar();

					desvio = true;

				} else

					pilhaOperandos[sp] = 0;

			}
				;
				break;

			case Definicao.IFNE: {

				op1 = (Integer) pilhaOperandos[sp];

				if (op1 != 0) {

					desviar();

					desvio = true;

				} else

					pilhaOperandos[sp] = 0;

			}
				;
				break;

			case Definicao.IFLT: {

				op1 = (Integer) pilhaOperandos[sp];

				if (op1 > 0) {

					desviar();

					desvio = true;

				} else

					pilhaOperandos[sp] = 0;

			}
				;
				break;

			case Definicao.IFGE: {

				op1 = (Integer) pilhaOperandos[sp];

				if (op1 >= 0) {

					desviar();

					desvio = true;

				} else

					pilhaOperandos[sp] = 0;

			}
				;
				break;

			case Definicao.IFGT: {

				op1 = (Integer) pilhaOperandos[sp];

				if (op1 > 0) {

					desviar();

					desvio = true;

				} else

					pilhaOperandos[sp] = 0;

			}
				;
				break;

			case Definicao.IFLE: {

				op1 = (Integer) pilhaOperandos[sp];

				if (op1 <= 0) {

					desviar();

					desvio = true;

				} else

					pilhaOperandos[sp] = 0;

			}
				;
				break;

			case Definicao.IF_ICMPEQ: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				if (op1 == op2) {

					desviar();

					desvio = true;

				} else {

					pilhaOperandos[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPNE: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				if (op1 != op2) {

					desviar();

					desvio = true;

				} else {

					pilhaOperandos[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPLT: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				if (op1 < op2) {

					desviar();

					desvio = true;

				} else {

					pilhaOperandos[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPGE: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				if (op1 >= op2) {

					desviar();

					desvio = true;

				} else {

					pilhaOperandos[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPGT: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				if (op1 > op2) {

					desviar();

					desvio = true;

				} else {

					pilhaOperandos[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPLE: {

				op1 = (Integer) pilhaOperandos[sp - 1];

				op2 = (Integer) pilhaOperandos[sp];

				sp--;

				if (op1 <= op2) {

					desviar();

					desvio = true;

				} else {

					pilhaOperandos[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			// desvio incondicional
			case Definicao.GOTO: {

				op1 = obterOperandoInteiro();

				ip = op1;

				desvio = true;

			}
				;
				break;

			}

			if (!desvio)

				ip++;

			// Para testes
			exibirTela();

		}

	}

	protected void desviar() {

		pilhaOperandos[sp] = 1;

		int op = obterOperandoInteiro();

		ip = op;

	}

	protected int obterOperandoInteiro() {

		int op = BytecodeAssembler.obterInteiro(codigo, ip + 1);

		ip += 4;

		return op;

	}

	protected short recuperarValorOpcode(short a) {

		return (short) (128 + (128 + a));

	}

	// Usado somente para testes
	protected void exibirTela() {

		int i;

		System.out.println("IP: " + ip);

		System.out.println("SP: " + sp);

		System.out.print("Memória do código: ");

		for (i = 0; i < codigo.length; i++)

			System.out.print(codigo[i] + " ");

		System.out.print("\n");

		System.out.print("Memória global das variáveis: ");

		for (i = 0; i < memoriaGlobal.length; i++)

			System.out.print(memoriaGlobal[i] + " ");

		System.out.print("\n");

		System.out.print("Pilha: ");

		for (i = 0; i < pilhaOperandos.length; i++)

			System.out.print(pilhaOperandos[i] + " ");

		System.out.print("\n\n");

		System.out
				.print("Pressione qualquer tecla para ir para a próxima instrução: ");

		Scanner in = new Scanner(System.in);

		in.next();

	}

}
