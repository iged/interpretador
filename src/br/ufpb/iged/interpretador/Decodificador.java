package br.ufpb.iged.interpretador;

import java.nio.ByteBuffer;

public class Decodificador {
	ByteBuffer x;

	public Object getparametro(int ind_Inst, char tipo_inst){
		switch(tipo_inst){
		case 'I':
			return x.getInt(ind_Inst+1);
		case 'F':
			return  x.getFloat(ind_Inst+1);
		case 'C':
			return x.getChar(ind_Inst+1);
		default:
			return null;
		}

	}


	public String Analisador(byte [] vet){
		x=ByteBuffer.wrap(vet);
		String exp="";
		int total_Bits=vet.length, ind_inst=0;
		while(ind_inst<total_Bits){

			switch(vet[ind_inst]){
			case 1:
				exp+="IADD\n";
				ind_inst++;
				break;
			case 2:
				exp+="FADD\n";
				ind_inst++;
				break;
			case 3:
				exp+="IMUL\n";
				ind_inst++;
				break;
			case 4:
				exp+="FMUL\n";
				ind_inst++;
				break;
			case 5:
				exp+="ISUB\n";
				ind_inst++;
				break;
			case 6:
				exp+="fSUB\n";
				ind_inst++;
				break;
			case 7:
				exp+="IDIV\n";
				ind_inst++;
				break;
			case 8:
				exp+="FDIV\n";
				ind_inst++;
				break;
			case 9:
				exp+="ICONST "+getparametro(ind_inst,'I')+"\n";
				ind_inst+=5;
				break;
			case 10:
				exp+="FCONST "+getparametro(ind_inst,'F')+"\n";
				ind_inst+=5;
				break;
			case 11://Esse tem que ajeitar
				exp+="SCONST "+getparametro(ind_inst,'S')+"\n";
				ind_inst+=5;
				break;
			case 12:
				exp+="CCONST "+getparametro(ind_inst,'C')+"\n";
				ind_inst+=3;
				break;
			case 13:
				exp+="STORE "+getparametro(ind_inst,'I')+"\n";
				ind_inst+=5;
				break;
			case 14:
				exp+="GSTORE "+getparametro(ind_inst,'I')+"\n";
				ind_inst+=5;
				break;
			case 15:
				exp+="LOAD "+getparametro(ind_inst,'I')+"\n";
				ind_inst+=5;
				break;
			case 16:
				exp+="GLOAD "+getparametro(ind_inst,'I')+"\n";
				ind_inst+=5;
				break;
			case 17:
				exp+="PRINT\n";
				ind_inst++;
			case 18:

			}
		}
		return exp;
		
		//teste teste teste
	}
}
