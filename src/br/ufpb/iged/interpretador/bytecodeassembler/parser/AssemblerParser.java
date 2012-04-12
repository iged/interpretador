// $ANTLR 3.4 C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g 2012-04-12 11:17:41

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public abstract class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NOME_REF", "NOVA_LINHA", "NULL", "TYPE_STRUCT", "WS", "':'", "'ADD'", "'CREATE_INT'", "'CREATE_NODE'", "'CREATE_REF'", "'DELETE_INT'", "'DELETE_NODE'", "'DELETE_REF'", "'DIV'", "'INIT'", "'JMP'", "'MULT'", "'READ_INFO'", "'READ_INT'", "'READ_INTC'", "'READ_REF'", "'READ_RN'", "'READ_VET'", "'SUB'", "'WRITE_INFO'", "'WRITE_INT'", "'WRITE_REF'", "'WRITE_RN'", "'WRITE_VET'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NOME_REF=6;
    public static final int NOVA_LINHA=7;
    public static final int NULL=8;
    public static final int TYPE_STRUCT=9;
    public static final int WS=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AssemblerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AssemblerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return AssemblerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g"; }



    protected abstract void init(Token opcode, Token typeStruct, Token id, Token size);
    protected abstract void createInt(Token opcode, Token id);
    protected abstract void createNode(Token opcode, Token typeStruct);
    protected abstract void createRef(Token opcode, Token id);
    protected abstract void readIntC(Token opcode, Token intc);
    protected abstract void readRn(Token opcode, Token id, Token nomeRef);
    protected abstract void escreverLeituraReferencia(Token opcode, Token id);
      



    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:15:1: programa : ( comando )* ;
    public final void programa() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:15:10: ( ( comando )* )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:15:12: ( comando )*
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:15:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||(LA1_0 >= 12 && LA1_0 <= 34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:15:12: comando
            	    {
            	    pushFollow(FOLLOW_comando_in_programa16);
            	    comando();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "programa"



    // $ANTLR start "comando"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:1: comando : ( label instrucao | instrucao ) ;
    public final void comando() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:11: ( label instrucao | instrucao )
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||(LA2_0 >= 12 && LA2_0 <= 34)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:12: label instrucao
                    {
                    pushFollow(FOLLOW_label_in_comando36);
                    label();

                    state._fsp--;


                    pushFollow(FOLLOW_instrucao_in_comando38);
                    instrucao();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:30: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_comando42);
                    instrucao();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "comando"



    // $ANTLR start "label"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:1: label : ID ':' ;
    public final void label() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:7: ( ID ':' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:9: ID ':'
            {
            match(input,ID,FOLLOW_ID_in_label60); 

            match(input,11,FOLLOW_11_in_label62); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "label"



    // $ANTLR start "instrucao"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:1: instrucao : ( aritmetica | manipulacao | desvio )? NOVA_LINHA ;
    public final void instrucao() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:10: ( ( aritmetica | manipulacao | desvio )? NOVA_LINHA )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:12: ( aritmetica | manipulacao | desvio )? NOVA_LINHA
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:12: ( aritmetica | manipulacao | desvio )?
            int alt3=4;
            switch ( input.LA(1) ) {
                case 12:
                case 19:
                case 22:
                case 29:
                    {
                    alt3=1;
                    }
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 20:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    {
                    alt3=2;
                    }
                    break;
                case 21:
                    {
                    alt3=3;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:13: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao70);
                    aritmetica();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:26: manipulacao
                    {
                    pushFollow(FOLLOW_manipulacao_in_instrucao74);
                    manipulacao();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:40: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao78);
                    desvio();

                    state._fsp--;


                    }
                    break;

            }


            match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao82); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "instrucao"



    // $ANTLR start "aritmetica"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:1: aritmetica : ( 'ADD' | 'SUB' | 'MULT' | 'DIV' );
    public final void aritmetica() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:12: ( 'ADD' | 'SUB' | 'MULT' | 'DIV' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:
            {
            if ( input.LA(1)==12||input.LA(1)==19||input.LA(1)==22||input.LA(1)==29 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "aritmetica"



    // $ANTLR start "manipulacao"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:1: manipulacao : ( iniciar | criar | ler | escrever | deletar ) ;
    public final void manipulacao() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:12: ( ( iniciar | criar | ler | escrever | deletar ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:14: ( iniciar | criar | ler | escrever | deletar )
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:14: ( iniciar | criar | ler | escrever | deletar )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 13:
            case 14:
            case 15:
                {
                alt4=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                {
                alt4=3;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt4=4;
                }
                break;
            case 16:
            case 17:
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:15: iniciar
                    {
                    pushFollow(FOLLOW_iniciar_in_manipulacao161);
                    iniciar();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:25: criar
                    {
                    pushFollow(FOLLOW_criar_in_manipulacao165);
                    criar();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:33: ler
                    {
                    pushFollow(FOLLOW_ler_in_manipulacao169);
                    ler();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:39: escrever
                    {
                    pushFollow(FOLLOW_escrever_in_manipulacao173);
                    escrever();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:50: deletar
                    {
                    pushFollow(FOLLOW_deletar_in_manipulacao177);
                    deletar();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "manipulacao"



    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:32:1: desvio : 'JMP' ID ;
    public final void desvio() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:32:8: ( 'JMP' ID )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:32:10: 'JMP' ID
            {
            match(input,21,FOLLOW_21_in_desvio186); 

            match(input,ID,FOLLOW_ID_in_desvio188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "desvio"



    // $ANTLR start "iniciar"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:1: iniciar : a= 'INIT' TYPE_STRUCT b= ID ( INT )? ;
    public final void iniciar() throws RecognitionException {
        Token a=null;
        Token b=null;
        Token TYPE_STRUCT1=null;
        Token INT2=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:8: (a= 'INIT' TYPE_STRUCT b= ID ( INT )? )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:10: a= 'INIT' TYPE_STRUCT b= ID ( INT )?
            {
            a=(Token)match(input,20,FOLLOW_20_in_iniciar201); 

            TYPE_STRUCT1=(Token)match(input,TYPE_STRUCT,FOLLOW_TYPE_STRUCT_in_iniciar203); 

            b=(Token)match(input,ID,FOLLOW_ID_in_iniciar209); 

            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:40: ( INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:40: INT
                    {
                    INT2=(Token)match(input,INT,FOLLOW_INT_in_iniciar211); 

                    }
                    break;

            }


            init(a, TYPE_STRUCT1, b, INT2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iniciar"



    // $ANTLR start "criar"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:36:1: criar : (a= 'CREATE_INT' b= ID |a= 'CREATE_NODE' TYPE_STRUCT |a= 'CREATE_REF' b= ID );
    public final void criar() throws RecognitionException {
        Token a=null;
        Token b=null;
        Token TYPE_STRUCT3=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:36:7: (a= 'CREATE_INT' b= ID |a= 'CREATE_NODE' TYPE_STRUCT |a= 'CREATE_REF' b= ID )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:36:9: a= 'CREATE_INT' b= ID
                    {
                    a=(Token)match(input,13,FOLLOW_13_in_criar234); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_criar240); 

                    createInt(a, b);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:37:9: a= 'CREATE_NODE' TYPE_STRUCT
                    {
                    a=(Token)match(input,14,FOLLOW_14_in_criar256); 

                    TYPE_STRUCT3=(Token)match(input,TYPE_STRUCT,FOLLOW_TYPE_STRUCT_in_criar258); 

                    createNode(a, TYPE_STRUCT3);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:38:9: a= 'CREATE_REF' b= ID
                    {
                    a=(Token)match(input,15,FOLLOW_15_in_criar274); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_criar280); 

                    createRef(a, b);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "criar"



    // $ANTLR start "ler"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:1: ler : (a= 'READ_INT' b= ID |a= 'READ_INTC' INT |a= 'READ_VET' b= ID |a= 'READ_RN' b= ID NOME_REF |a= 'READ_INFO' b= ID |a= 'READ_REF' b= ID );
    public final void ler() throws RecognitionException {
        Token a=null;
        Token b=null;
        Token INT4=null;
        Token NOME_REF5=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:5: (a= 'READ_INT' b= ID |a= 'READ_INTC' INT |a= 'READ_VET' b= ID |a= 'READ_RN' b= ID NOME_REF |a= 'READ_INFO' b= ID |a= 'READ_REF' b= ID )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 26:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:7: a= 'READ_INT' b= ID
                    {
                    a=(Token)match(input,24,FOLLOW_24_in_ler301); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_ler307); 

                    escreverLeituraReferencia(a, b);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:42:7: a= 'READ_INTC' INT
                    {
                    a=(Token)match(input,25,FOLLOW_25_in_ler321); 

                    INT4=(Token)match(input,INT,FOLLOW_INT_in_ler323); 

                    readIntC(a, INT4);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:43:7: a= 'READ_VET' b= ID
                    {
                    a=(Token)match(input,28,FOLLOW_28_in_ler337); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_ler343); 

                    escreverLeituraReferencia(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:7: a= 'READ_RN' b= ID NOME_REF
                    {
                    a=(Token)match(input,27,FOLLOW_27_in_ler357); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_ler363); 

                    NOME_REF5=(Token)match(input,NOME_REF,FOLLOW_NOME_REF_in_ler365); 

                    readRn(a, b, NOME_REF5);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:45:7: a= 'READ_INFO' b= ID
                    {
                    a=(Token)match(input,23,FOLLOW_23_in_ler379); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_ler385); 

                    escreverLeituraReferencia(a, b);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:46:7: a= 'READ_REF' b= ID
                    {
                    a=(Token)match(input,26,FOLLOW_26_in_ler399); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_ler405); 

                    escreverLeituraReferencia(a, b);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ler"



    // $ANTLR start "escrever"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:1: escrever : ( 'WRITE_INT' ID | 'WRITE_VET' ID | 'WRITE_RN' ID NOME_REF ( NULL )? | 'WRITE_INFO' ID | 'WRITE_REF' ID ( NULL )? );
    public final void escrever() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:10: ( 'WRITE_INT' ID | 'WRITE_VET' ID | 'WRITE_RN' ID NOME_REF ( NULL )? | 'WRITE_INFO' ID | 'WRITE_REF' ID ( NULL )? )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case 32:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:12: 'WRITE_INT' ID
                    {
                    match(input,31,FOLLOW_31_in_escrever420); 

                    match(input,ID,FOLLOW_ID_in_escrever422); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:50:12: 'WRITE_VET' ID
                    {
                    match(input,34,FOLLOW_34_in_escrever435); 

                    match(input,ID,FOLLOW_ID_in_escrever437); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:51:12: 'WRITE_RN' ID NOME_REF ( NULL )?
                    {
                    match(input,33,FOLLOW_33_in_escrever450); 

                    match(input,ID,FOLLOW_ID_in_escrever452); 

                    match(input,NOME_REF,FOLLOW_NOME_REF_in_escrever454); 

                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:51:35: ( NULL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NULL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:51:35: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_escrever456); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:52:12: 'WRITE_INFO' ID
                    {
                    match(input,30,FOLLOW_30_in_escrever470); 

                    match(input,ID,FOLLOW_ID_in_escrever472); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:53:12: 'WRITE_REF' ID ( NULL )?
                    {
                    match(input,32,FOLLOW_32_in_escrever485); 

                    match(input,ID,FOLLOW_ID_in_escrever487); 

                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:53:27: ( NULL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NULL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:53:27: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_escrever489); 

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "escrever"



    // $ANTLR start "deletar"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:56:1: deletar : ( 'DELETE_INT' ID | 'DELETE_NODE' ID | 'DELETE_REF' ID );
    public final void deletar() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:56:9: ( 'DELETE_INT' ID | 'DELETE_NODE' ID | 'DELETE_REF' ID )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:56:11: 'DELETE_INT' ID
                    {
                    match(input,16,FOLLOW_16_in_deletar508); 

                    match(input,ID,FOLLOW_ID_in_deletar510); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:57:11: 'DELETE_NODE' ID
                    {
                    match(input,17,FOLLOW_17_in_deletar522); 

                    match(input,ID,FOLLOW_ID_in_deletar524); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:58:11: 'DELETE_REF' ID
                    {
                    match(input,18,FOLLOW_18_in_deletar536); 

                    match(input,ID,FOLLOW_ID_in_deletar538); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "deletar"

    // Delegated rules


 

    public static final BitSet FOLLOW_comando_in_programa16 = new BitSet(new long[]{0x00000007FFFFF092L});
    public static final BitSet FOLLOW_label_in_comando36 = new BitSet(new long[]{0x00000007FFFFF080L});
    public static final BitSet FOLLOW_instrucao_in_comando38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label60 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_label62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao70 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_manipulacao_in_instrucao74 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_desvio_in_instrucao78 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciar_in_manipulacao161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_criar_in_manipulacao165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ler_in_manipulacao169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_escrever_in_manipulacao173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deletar_in_manipulacao177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_desvio186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_iniciar201 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TYPE_STRUCT_in_iniciar203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_iniciar209 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_INT_in_iniciar211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_criar234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_criar240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_criar256 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TYPE_STRUCT_in_criar258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_criar274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_criar280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ler301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ler321 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_ler323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ler337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ler357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler363 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NOME_REF_in_ler365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ler379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ler399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_escrever420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_escrever435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_escrever450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NOME_REF_in_escrever454 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NULL_in_escrever456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_escrever470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_escrever485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever487 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NULL_in_escrever489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_deletar508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_deletar510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_deletar522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_deletar524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_deletar536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_deletar538 = new BitSet(new long[]{0x0000000000000002L});

}