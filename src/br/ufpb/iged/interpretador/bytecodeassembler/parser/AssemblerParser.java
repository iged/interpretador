// $ANTLR 3.4 C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g 2012-04-15 19:38:27

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;

import br.ufpb.iged.interpretador.excecoes.LabelException;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public abstract class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NOVA_LINHA", "NULL", "RG03", "SP", "WS", "'0'", "'5'", "':'", "'goto'", "'iadd'", "'iand'", "'iconst_'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_'", "'imul'", "'ineg'", "'ior'", "'irem'", "'istore'", "'istore_'", "'isub'", "'ixor'", "'ldc'", "'m1'", "'nop'"
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
    public static final int ID=4;
    public static final int INT=5;
    public static final int NOVA_LINHA=6;
    public static final int NULL=7;
    public static final int RG03=8;
    public static final int SP=9;
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



    protected abstract void escreverOpcode(Token opc);
    protected abstract void escreverOpcode(Token opc, Token op) throws LabelException;
    protected abstract void definirLabel(Token id) throws LabelException;
      



    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:11:1: programa : ( comando )* ;
    public final void programa() throws RecognitionException, LabelException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:11:10: ( ( comando )* )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:11:12: ( comando )*
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:11:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||(LA1_0 >= 14 && LA1_0 <= 42)||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:11:12: comando
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:1: comando : ( label instrucao | instrucao ) ;
    public final void comando() throws RecognitionException, LabelException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:11: ( label instrucao | instrucao )
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||(LA2_0 >= 14 && LA2_0 <= 42)||LA2_0==44) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:12: label instrucao
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
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:30: instrucao
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:1: label : a= ID ( SP )* ':' ;
    public final void label() throws RecognitionException, LabelException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:7: (a= ID ( SP )* ':' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:9: a= ID ( SP )* ':'
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_label64); 

            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:16: ( SP )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==SP) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:16: SP
            	    {
            	    match(input,SP,FOLLOW_SP_in_label66); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,13,FOLLOW_13_in_label69); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:1: instrucao : ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA ;
    public final void instrucao() throws RecognitionException, LabelException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:10: ( ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:12: ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:12: ( aritmetica | load | store | desvio | logica | 'nop' )?
            int alt4=7;
            switch ( input.LA(1) ) {
                case 15:
                case 18:
                case 31:
                case 34:
                case 37:
                case 40:
                    {
                    alt4=1;
                    }
                    break;
                case 17:
                case 32:
                case 33:
                case 42:
                    {
                    alt4=2;
                    }
                    break;
                case 38:
                case 39:
                    {
                    alt4=3;
                    }
                    break;
                case 14:
                case 19:
                case 20:
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
                    {
                    alt4=4;
                    }
                    break;
                case 16:
                case 35:
                case 36:
                case 41:
                    {
                    alt4=5;
                    }
                    break;
                case 44:
                    {
                    alt4=6;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:13: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao79);
                    aritmetica();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:26: load
                    {
                    pushFollow(FOLLOW_load_in_instrucao83);
                    load();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:33: store
                    {
                    pushFollow(FOLLOW_store_in_instrucao87);
                    store();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:41: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao91);
                    desvio();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:50: logica
                    {
                    pushFollow(FOLLOW_logica_in_instrucao95);
                    logica();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:59: 'nop'
                    {
                    match(input,44,FOLLOW_44_in_instrucao99); 

                    }
                    break;

            }


            match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao103); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' );
    public final void aritmetica() throws RecognitionException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:12: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 37:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:14: a= 'iadd'
                    {
                    a=(Token)match(input,15,FOLLOW_15_in_aritmetica115); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:21:14: a= 'isub'
                    {
                    a=(Token)match(input,40,FOLLOW_40_in_aritmetica136); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:14: a= 'imul'
                    {
                    a=(Token)match(input,34,FOLLOW_34_in_aritmetica157); 

                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:23:14: a= 'idiv'
                    {
                    a=(Token)match(input,18,FOLLOW_18_in_aritmetica178); 

                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:14: a= 'irem'
                    {
                    a=(Token)match(input,37,FOLLOW_37_in_aritmetica199); 

                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:25:14: a= 'iinc'
                    {
                    a=(Token)match(input,31,FOLLOW_31_in_aritmetica220); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:28:1: load : (a= 'iconst_' ( 'm1' | '0' .. '5' ) |a= 'iload_' RG03 |a= 'iload' SP b= INT |a= 'ldc' SP b= INT );
    public final void load() throws RecognitionException, LabelException {
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:28:6: (a= 'iconst_' ( 'm1' | '0' .. '5' ) |a= 'iload_' RG03 |a= 'iload' SP b= INT |a= 'ldc' SP b= INT )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 42:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:28:8: a= 'iconst_' ( 'm1' | '0' .. '5' )
                    {
                    a=(Token)match(input,17,FOLLOW_17_in_load258); 

                    if ( input.LA(1)==43 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:29:8: a= 'iload_' RG03
                    {
                    a=(Token)match(input,33,FOLLOW_33_in_load283); 

                    match(input,RG03,FOLLOW_RG03_in_load285); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:8: a= 'iload' SP b= INT
                    {
                    a=(Token)match(input,32,FOLLOW_32_in_load300); 

                    match(input,SP,FOLLOW_SP_in_load302); 

                    b=(Token)match(input,INT,FOLLOW_INT_in_load308); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:31:8: a= 'ldc' SP b= INT
                    {
                    a=(Token)match(input,42,FOLLOW_42_in_load323); 

                    match(input,SP,FOLLOW_SP_in_load325); 

                    b=(Token)match(input,INT,FOLLOW_INT_in_load331); 

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
    // $ANTLR end "load"



    // $ANTLR start "store"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:1: store : (a= 'istore_' RG03 |a= 'istore' SP b= INT );
    public final void store() throws RecognitionException, LabelException {
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:7: (a= 'istore_' RG03 |a= 'istore' SP b= INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:9: a= 'istore_' RG03
                    {
                    a=(Token)match(input,39,FOLLOW_39_in_store356); 

                    match(input,RG03,FOLLOW_RG03_in_store358); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:35:9: a= 'istore' SP b= INT
                    {
                    a=(Token)match(input,38,FOLLOW_38_in_store374); 

                    match(input,SP,FOLLOW_SP_in_store376); 

                    b=(Token)match(input,INT,FOLLOW_INT_in_store382); 

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
    // $ANTLR end "store"



    // $ANTLR start "logica"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:38:1: logica : (a= 'ineg' |a= 'iand' |a= 'ior' |a= 'ixor' );
    public final void logica() throws RecognitionException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:38:8: (a= 'ineg' |a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:38:10: a= 'ineg'
                    {
                    a=(Token)match(input,35,FOLLOW_35_in_logica403); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:39:10: a= 'iand'
                    {
                    a=(Token)match(input,16,FOLLOW_16_in_logica420); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:40:10: a= 'ior'
                    {
                    a=(Token)match(input,36,FOLLOW_36_in_logica437); 

                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:10: a= 'ixor'
                    {
                    a=(Token)match(input,41,FOLLOW_41_in_logica454); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:1: desvio : (a= 'ifeq' SP b= ID |a= 'ifne' SP b= ID |a= 'iflt' SP b= ID |a= 'ifge' SP b= ID |a= 'ifgt' SP b= ID |a= 'ifle' SP b= ID |a= 'if_icmpeq' SP b= ID |a= 'if_icmpne' SP b= ID |a= 'if_icmplt' SP b= ID |a= 'if_icmpge' SP b= ID |a= 'if_icmpgt' SP b= ID |a= 'if_icmple' SP b= ID |a= 'goto' SP b= ID );
    public final void desvio() throws RecognitionException, LabelException {
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:8: (a= 'ifeq' SP b= ID |a= 'ifne' SP b= ID |a= 'iflt' SP b= ID |a= 'ifge' SP b= ID |a= 'ifgt' SP b= ID |a= 'ifle' SP b= ID |a= 'if_icmpeq' SP b= ID |a= 'if_icmpne' SP b= ID |a= 'if_icmplt' SP b= ID |a= 'if_icmpge' SP b= ID |a= 'if_icmpgt' SP b= ID |a= 'if_icmple' SP b= ID |a= 'goto' SP b= ID )
            int alt9=13;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 27:
                {
                alt9=5;
                }
                break;
            case 28:
                {
                alt9=6;
                }
                break;
            case 19:
                {
                alt9=7;
                }
                break;
            case 24:
                {
                alt9=8;
                }
                break;
            case 23:
                {
                alt9=9;
                }
                break;
            case 20:
                {
                alt9=10;
                }
                break;
            case 21:
                {
                alt9=11;
                }
                break;
            case 22:
                {
                alt9=12;
                }
                break;
            case 14:
                {
                alt9=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:10: a= 'ifeq' SP b= ID
                    {
                    a=(Token)match(input,25,FOLLOW_25_in_desvio476); 

                    match(input,SP,FOLLOW_SP_in_desvio478); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio484); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:45:10: a= 'ifne' SP b= ID
                    {
                    a=(Token)match(input,30,FOLLOW_30_in_desvio501); 

                    match(input,SP,FOLLOW_SP_in_desvio503); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio509); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:46:10: a= 'iflt' SP b= ID
                    {
                    a=(Token)match(input,29,FOLLOW_29_in_desvio526); 

                    match(input,SP,FOLLOW_SP_in_desvio528); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio534); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:47:10: a= 'ifge' SP b= ID
                    {
                    a=(Token)match(input,26,FOLLOW_26_in_desvio551); 

                    match(input,SP,FOLLOW_SP_in_desvio553); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio559); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:48:10: a= 'ifgt' SP b= ID
                    {
                    a=(Token)match(input,27,FOLLOW_27_in_desvio577); 

                    match(input,SP,FOLLOW_SP_in_desvio579); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio585); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:10: a= 'ifle' SP b= ID
                    {
                    a=(Token)match(input,28,FOLLOW_28_in_desvio603); 

                    match(input,SP,FOLLOW_SP_in_desvio605); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio611); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:50:10: a= 'if_icmpeq' SP b= ID
                    {
                    a=(Token)match(input,19,FOLLOW_19_in_desvio629); 

                    match(input,SP,FOLLOW_SP_in_desvio631); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio637); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:51:10: a= 'if_icmpne' SP b= ID
                    {
                    a=(Token)match(input,24,FOLLOW_24_in_desvio655); 

                    match(input,SP,FOLLOW_SP_in_desvio657); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio663); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:52:10: a= 'if_icmplt' SP b= ID
                    {
                    a=(Token)match(input,23,FOLLOW_23_in_desvio681); 

                    match(input,SP,FOLLOW_SP_in_desvio683); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio689); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:53:10: a= 'if_icmpge' SP b= ID
                    {
                    a=(Token)match(input,20,FOLLOW_20_in_desvio707); 

                    match(input,SP,FOLLOW_SP_in_desvio709); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio715); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:54:10: a= 'if_icmpgt' SP b= ID
                    {
                    a=(Token)match(input,21,FOLLOW_21_in_desvio733); 

                    match(input,SP,FOLLOW_SP_in_desvio735); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio741); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:55:10: a= 'if_icmple' SP b= ID
                    {
                    a=(Token)match(input,22,FOLLOW_22_in_desvio759); 

                    match(input,SP,FOLLOW_SP_in_desvio761); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio767); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:56:10: a= 'goto' SP b= ID
                    {
                    a=(Token)match(input,14,FOLLOW_14_in_desvio785); 

                    match(input,SP,FOLLOW_SP_in_desvio787); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio793); 

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


 

    public static final BitSet FOLLOW_comando_in_programa16 = new BitSet(new long[]{0x000017FFFFFFC052L});
    public static final BitSet FOLLOW_label_in_comando36 = new BitSet(new long[]{0x000017FFFFFFC040L});
    public static final BitSet FOLLOW_instrucao_in_comando38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label64 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_SP_in_label66 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_13_in_label69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao79 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_load_in_instrucao83 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_store_in_instrucao87 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_desvio_in_instrucao91 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_logica_in_instrucao95 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44_in_instrucao99 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_aritmetica115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_aritmetica136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_aritmetica157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_aritmetica178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_aritmetica199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_aritmetica220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_load258 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_load260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_load283 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RG03_in_load285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_load300 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_load302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_load308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_load323 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_load325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_load331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_store356 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RG03_in_store358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_store374 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_store376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_store382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_logica403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_logica420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_logica437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_logica454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_desvio476 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_desvio501 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_desvio526 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_desvio551 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_desvio577 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_desvio603 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_desvio629 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_desvio655 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_desvio681 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_desvio707 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_desvio733 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_desvio759 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_desvio785 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio793 = new BitSet(new long[]{0x0000000000000002L});

}