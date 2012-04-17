// $ANTLR 3.4 C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g 2012-04-17 16:32:57

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;

import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.LabelException;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public abstract class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NOVA_LINHA", "NULL", "WS", "':'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'ior'", "'irem'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'nop'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
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
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NOVA_LINHA=6;
    public static final int NULL=7;
    public static final int WS=8;

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



    protected abstract void escreverOpcode(Token opc);
    protected abstract void escreverOpcode(Token opc, Token op) throws LabelException;
    protected abstract void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
    protected abstract void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
    protected abstract void definirLabel(Token id) throws LabelException;
      



    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:13:1: programa : ( comando )* ;
    public final void programa() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:13:10: ( ( comando )* )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:13:12: ( comando )*
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:13:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||(LA1_0 >= 10 && LA1_0 <= 51)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:13:12: comando
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:1: comando : ( label instrucao | instrucao ) ;
    public final void comando() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:11: ( label instrucao | instrucao )
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||(LA2_0 >= 10 && LA2_0 <= 51)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:12: label instrucao
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
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:30: instrucao
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:1: label : a= ID ':' ;
    public final void label() throws RecognitionException, LabelException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:7: (a= ID ':' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:9: a= ID ':'
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_label64); 

            match(input,9,FOLLOW_9_in_label66); 

            definirLabel(a);

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:1: instrucao : ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA ;
    public final void instrucao() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:10: ( ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:12: ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:12: ( aritmetica | load | store | desvio | logica | 'nop' )?
            int alt3=7;
            switch ( input.LA(1) ) {
                case 11:
                case 20:
                case 33:
                case 39:
                case 40:
                case 42:
                case 48:
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
                case 19:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 50:
                    {
                    alt3=2;
                    }
                    break;
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                    {
                    alt3=3;
                    }
                    break;
                case 10:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                    {
                    alt3=4;
                    }
                    break;
                case 12:
                case 41:
                case 49:
                    {
                    alt3=5;
                    }
                    break;
                case 51:
                    {
                    alt3=6;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:13: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao76);
                    aritmetica();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:26: load
                    {
                    pushFollow(FOLLOW_load_in_instrucao80);
                    load();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:33: store
                    {
                    pushFollow(FOLLOW_store_in_instrucao84);
                    store();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:41: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao88);
                    desvio();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:50: logica
                    {
                    pushFollow(FOLLOW_logica_in_instrucao92);
                    logica();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:59: 'nop'
                    {
                    match(input,51,FOLLOW_51_in_instrucao96); 

                    }
                    break;

            }


            match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao100); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' );
    public final void aritmetica() throws RecognitionException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:12: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 48:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 42:
                {
                alt4=5;
                }
                break;
            case 33:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:14: a= 'iadd'
                    {
                    a=(Token)match(input,11,FOLLOW_11_in_aritmetica112); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:23:14: a= 'isub'
                    {
                    a=(Token)match(input,48,FOLLOW_48_in_aritmetica133); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:14: a= 'imul'
                    {
                    a=(Token)match(input,39,FOLLOW_39_in_aritmetica154); 

                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:25:14: a= 'idiv'
                    {
                    a=(Token)match(input,20,FOLLOW_20_in_aritmetica175); 

                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:26:14: a= 'irem'
                    {
                    a=(Token)match(input,42,FOLLOW_42_in_aritmetica196); 

                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:27:14: a= 'iinc'
                    {
                    a=(Token)match(input,33,FOLLOW_33_in_aritmetica217); 

                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:28:14: a= 'ineg'
                    {
                    a=(Token)match(input,40,FOLLOW_40_in_aritmetica238); 

                    escreverOpcode(a);

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
    // $ANTLR end "aritmetica"



    // $ANTLR start "load"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:31:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INT |a= 'ldc' INT );
    public final void load() throws RecognitionException, LabelException {
        Token a=null;
        Token INT1=null;
        Token INT2=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:31:6: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INT |a= 'ldc' INT )
            int alt5=13;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 35:
                {
                alt5=8;
                }
                break;
            case 36:
                {
                alt5=9;
                }
                break;
            case 37:
                {
                alt5=10;
                }
                break;
            case 38:
                {
                alt5=11;
                }
                break;
            case 34:
                {
                alt5=12;
                }
                break;
            case 50:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:31:8: a= 'iconst_m1'
                    {
                    a=(Token)match(input,19,FOLLOW_19_in_load276); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:32:8: a= 'iconst_0'
                    {
                    a=(Token)match(input,13,FOLLOW_13_in_load291); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:33:8: a= 'iconst_1'
                    {
                    a=(Token)match(input,14,FOLLOW_14_in_load306); 

                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:8: a= 'iconst_2'
                    {
                    a=(Token)match(input,15,FOLLOW_15_in_load321); 

                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:35:8: a= 'iconst_3'
                    {
                    a=(Token)match(input,16,FOLLOW_16_in_load336); 

                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:36:8: a= 'iconst_4'
                    {
                    a=(Token)match(input,17,FOLLOW_17_in_load350); 

                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:37:8: a= 'iconst_5'
                    {
                    a=(Token)match(input,18,FOLLOW_18_in_load364); 

                    escreverOpcode(a);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:38:8: a= 'iload_0'
                    {
                    a=(Token)match(input,35,FOLLOW_35_in_load378); 

                    escreverOpcode(a);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:39:8: a= 'iload_1'
                    {
                    a=(Token)match(input,36,FOLLOW_36_in_load393); 

                    escreverOpcode(a);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:40:8: a= 'iload_2'
                    {
                    a=(Token)match(input,37,FOLLOW_37_in_load408); 

                    escreverOpcode(a);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:8: a= 'iload_3'
                    {
                    a=(Token)match(input,38,FOLLOW_38_in_load423); 

                    escreverOpcode(a);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:42:8: a= 'iload' INT
                    {
                    a=(Token)match(input,34,FOLLOW_34_in_load438); 

                    INT1=(Token)match(input,INT,FOLLOW_INT_in_load440); 

                    escreverOpcode(a, INT1);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:43:8: a= 'ldc' INT
                    {
                    a=(Token)match(input,50,FOLLOW_50_in_load455); 

                    INT2=(Token)match(input,INT,FOLLOW_INT_in_load457); 

                    escreverOpcode(a, INT2);

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
    // $ANTLR end "load"



    // $ANTLR start "store"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:46:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INT );
    public final void store() throws RecognitionException, AcessoIndevidoMemoriaException, LabelException {
        Token a=null;
        Token INT3=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:46:7: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INT )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case 46:
                {
                alt6=3;
                }
                break;
            case 47:
                {
                alt6=4;
                }
                break;
            case 43:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:46:9: a= 'istore_0'
                    {
                    a=(Token)match(input,44,FOLLOW_44_in_store482); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:47:9: a= 'istore_1'
                    {
                    a=(Token)match(input,45,FOLLOW_45_in_store498); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:48:9: a= 'istore_2'
                    {
                    a=(Token)match(input,46,FOLLOW_46_in_store514); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:9: a= 'istore_3'
                    {
                    a=(Token)match(input,47,FOLLOW_47_in_store530); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:50:9: a= 'istore' INT
                    {
                    a=(Token)match(input,43,FOLLOW_43_in_store546); 

                    INT3=(Token)match(input,INT,FOLLOW_INT_in_store548); 

                    verificarAumentoMemoriaGlobal(a, INT3);

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
    // $ANTLR end "store"



    // $ANTLR start "logica"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:53:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' );
    public final void logica() throws RecognitionException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:53:8: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 49:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:53:10: a= 'iand'
                    {
                    a=(Token)match(input,12,FOLLOW_12_in_logica569); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:54:10: a= 'ior'
                    {
                    a=(Token)match(input,41,FOLLOW_41_in_logica586); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:55:10: a= 'ixor'
                    {
                    a=(Token)match(input,49,FOLLOW_49_in_logica603); 

                    escreverOpcode(a);

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
    // $ANTLR end "logica"



    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:58:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID );
    public final void desvio() throws RecognitionException, LabelException {
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:58:8: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 28:
                {
                alt8=4;
                }
                break;
            case 29:
                {
                alt8=5;
                }
                break;
            case 30:
                {
                alt8=6;
                }
                break;
            case 21:
                {
                alt8=7;
                }
                break;
            case 26:
                {
                alt8=8;
                }
                break;
            case 25:
                {
                alt8=9;
                }
                break;
            case 22:
                {
                alt8=10;
                }
                break;
            case 23:
                {
                alt8=11;
                }
                break;
            case 24:
                {
                alt8=12;
                }
                break;
            case 10:
                {
                alt8=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:58:10: a= 'ifeq' b= ID
                    {
                    a=(Token)match(input,27,FOLLOW_27_in_desvio625); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio631); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:59:10: a= 'ifne' b= ID
                    {
                    a=(Token)match(input,32,FOLLOW_32_in_desvio648); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio654); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:60:10: a= 'iflt' b= ID
                    {
                    a=(Token)match(input,31,FOLLOW_31_in_desvio671); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio677); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:61:10: a= 'ifge' b= ID
                    {
                    a=(Token)match(input,28,FOLLOW_28_in_desvio694); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio700); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:62:10: a= 'ifgt' b= ID
                    {
                    a=(Token)match(input,29,FOLLOW_29_in_desvio718); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio724); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:63:10: a= 'ifle' b= ID
                    {
                    a=(Token)match(input,30,FOLLOW_30_in_desvio742); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio748); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:64:10: a= 'if_icmpeq' b= ID
                    {
                    a=(Token)match(input,21,FOLLOW_21_in_desvio766); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio772); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:65:10: a= 'if_icmpne' b= ID
                    {
                    a=(Token)match(input,26,FOLLOW_26_in_desvio790); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio796); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:66:10: a= 'if_icmplt' b= ID
                    {
                    a=(Token)match(input,25,FOLLOW_25_in_desvio814); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio820); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:67:10: a= 'if_icmpge' b= ID
                    {
                    a=(Token)match(input,22,FOLLOW_22_in_desvio838); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio844); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:68:10: a= 'if_icmpgt' b= ID
                    {
                    a=(Token)match(input,23,FOLLOW_23_in_desvio862); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio868); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:69:10: a= 'if_icmple' b= ID
                    {
                    a=(Token)match(input,24,FOLLOW_24_in_desvio886); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio892); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:70:10: a= 'goto' b= ID
                    {
                    a=(Token)match(input,10,FOLLOW_10_in_desvio910); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio916); 

                    escreverOpcode(a, b);

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
    // $ANTLR end "desvio"

    // Delegated rules


 

    public static final BitSet FOLLOW_comando_in_programa16 = new BitSet(new long[]{0x000FFFFFFFFFFC52L});
    public static final BitSet FOLLOW_label_in_comando36 = new BitSet(new long[]{0x000FFFFFFFFFFC40L});
    public static final BitSet FOLLOW_instrucao_in_comando38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label64 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_label66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao76 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_load_in_instrucao80 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_store_in_instrucao84 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_desvio_in_instrucao88 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_logica_in_instrucao92 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51_in_instrucao96 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_aritmetica112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_aritmetica133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_aritmetica154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_aritmetica175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_aritmetica196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_aritmetica217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_aritmetica238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_load276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_load291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_load306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_load321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_load336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_load350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_load364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_load378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_load393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_load408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_load423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_load438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_load440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_load455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_load457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_store482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_store498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_store514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_store530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_store546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_store548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_logica569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_logica586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_logica603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_desvio625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_desvio648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_desvio671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_desvio694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_desvio718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_desvio742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_desvio766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_desvio790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_desvio814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_desvio838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_desvio862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_desvio886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_desvio910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio916 = new BitSet(new long[]{0x0000000000000002L});

}