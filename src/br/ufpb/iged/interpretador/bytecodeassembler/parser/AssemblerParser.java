// $ANTLR 3.4 C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g 2012-04-15 01:31:48

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AssemblerParser extends Parser {
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



    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:1: programa : ( comando )* ;
    public final void programa() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:10: ( ( comando )* )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:12: ( comando )*
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||(LA1_0 >= 14 && LA1_0 <= 42)||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:12: comando
            	    {
            	    pushFollow(FOLLOW_comando_in_programa10);
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:1: comando : ( label instrucao | instrucao ) ;
    public final void comando() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:11: ( label instrucao | instrucao )
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:11: ( label instrucao | instrucao )
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
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:12: label instrucao
                    {
                    pushFollow(FOLLOW_label_in_comando30);
                    label();

                    state._fsp--;


                    pushFollow(FOLLOW_instrucao_in_comando32);
                    instrucao();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:30: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_comando36);
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:1: label : ID ( SP )* ':' ;
    public final void label() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:7: ( ID ( SP )* ':' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:9: ID ( SP )* ':'
            {
            match(input,ID,FOLLOW_ID_in_label54); 

            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:12: ( SP )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==SP) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:12: SP
            	    {
            	    match(input,SP,FOLLOW_SP_in_label56); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,13,FOLLOW_13_in_label59); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:1: instrucao : ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA ;
    public final void instrucao() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:10: ( ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:12: ( aritmetica | load | store | desvio | logica | 'nop' )? NOVA_LINHA
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:12: ( aritmetica | load | store | desvio | logica | 'nop' )?
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
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:13: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao67);
                    aritmetica();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:26: load
                    {
                    pushFollow(FOLLOW_load_in_instrucao71);
                    load();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:33: store
                    {
                    pushFollow(FOLLOW_store_in_instrucao75);
                    store();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:41: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao79);
                    desvio();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:50: logica
                    {
                    pushFollow(FOLLOW_logica_in_instrucao83);
                    logica();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:59: 'nop'
                    {
                    match(input,44,FOLLOW_44_in_instrucao87); 

                    }
                    break;

            }


            match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao91); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:12:1: aritmetica : ( 'iadd' | 'isub' | 'imul' | 'idiv' | 'irem' | 'iinc' );
    public final void aritmetica() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:12:12: ( 'iadd' | 'isub' | 'imul' | 'idiv' | 'irem' | 'iinc' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:
            {
            if ( input.LA(1)==15||input.LA(1)==18||input.LA(1)==31||input.LA(1)==34||input.LA(1)==37||input.LA(1)==40 ) {
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



    // $ANTLR start "load"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:1: load : ( 'iconst_' ( 'm1' | '0' .. '5' ) | 'iload_' RG03 | 'iload' SP INT | 'ldc' SP INT );
    public final void load() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:6: ( 'iconst_' ( 'm1' | '0' .. '5' ) | 'iload_' RG03 | 'iload' SP INT | 'ldc' SP INT )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 42:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:8: 'iconst_' ( 'm1' | '0' .. '5' )
                    {
                    match(input,17,FOLLOW_17_in_load206); 

                    if ( input.LA(1)==43 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:21:8: 'iload_' RG03
                    {
                    match(input,33,FOLLOW_33_in_load225); 

                    match(input,RG03,FOLLOW_RG03_in_load227); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:8: 'iload' SP INT
                    {
                    match(input,32,FOLLOW_32_in_load236); 

                    match(input,SP,FOLLOW_SP_in_load238); 

                    match(input,INT,FOLLOW_INT_in_load240); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:23:8: 'ldc' SP INT
                    {
                    match(input,42,FOLLOW_42_in_load249); 

                    match(input,SP,FOLLOW_SP_in_load251); 

                    match(input,INT,FOLLOW_INT_in_load253); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:26:1: store : ( 'istore_' RG03 | 'istore' SP INT );
    public final void store() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:26:7: ( 'istore_' RG03 | 'istore' SP INT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:26:9: 'istore_' RG03
                    {
                    match(input,39,FOLLOW_39_in_store272); 

                    match(input,RG03,FOLLOW_RG03_in_store274); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:27:9: 'istore' SP INT
                    {
                    match(input,38,FOLLOW_38_in_store284); 

                    match(input,SP,FOLLOW_SP_in_store286); 

                    match(input,INT,FOLLOW_INT_in_store288); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:1: logica : ( 'ineg' | 'iand' | 'ior' | 'ixor' );
    public final void logica() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:8: ( 'ineg' | 'iand' | 'ior' | 'ixor' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:
            {
            if ( input.LA(1)==16||(input.LA(1) >= 35 && input.LA(1) <= 36)||input.LA(1)==41 ) {
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
    // $ANTLR end "logica"



    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:36:1: desvio : ( 'ifeq' SP ID | 'ifne' SP ID | 'iflt' SP ID | 'ifge' SP ID | 'ifgt' SP ID | 'ifle' SP ID | 'if_icmpeq' SP ID | 'if_icmpne' SP ID | 'if_icmplt' SP ID | 'if_icmpge' SP ID | 'if_icmpgt' SP ID | 'if_icmple' SP ID | 'goto' SP ID );
    public final void desvio() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:36:8: ( 'ifeq' SP ID | 'ifne' SP ID | 'iflt' SP ID | 'ifge' SP ID | 'ifgt' SP ID | 'ifle' SP ID | 'if_icmpeq' SP ID | 'if_icmpne' SP ID | 'if_icmplt' SP ID | 'if_icmpge' SP ID | 'if_icmpgt' SP ID | 'if_icmple' SP ID | 'goto' SP ID )
            int alt7=13;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 19:
                {
                alt7=7;
                }
                break;
            case 24:
                {
                alt7=8;
                }
                break;
            case 23:
                {
                alt7=9;
                }
                break;
            case 20:
                {
                alt7=10;
                }
                break;
            case 21:
                {
                alt7=11;
                }
                break;
            case 22:
                {
                alt7=12;
                }
                break;
            case 14:
                {
                alt7=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:36:10: 'ifeq' SP ID
                    {
                    match(input,25,FOLLOW_25_in_desvio352); 

                    match(input,SP,FOLLOW_SP_in_desvio354); 

                    match(input,ID,FOLLOW_ID_in_desvio356); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:37:10: 'ifne' SP ID
                    {
                    match(input,30,FOLLOW_30_in_desvio368); 

                    match(input,SP,FOLLOW_SP_in_desvio370); 

                    match(input,ID,FOLLOW_ID_in_desvio372); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:38:10: 'iflt' SP ID
                    {
                    match(input,29,FOLLOW_29_in_desvio385); 

                    match(input,SP,FOLLOW_SP_in_desvio387); 

                    match(input,ID,FOLLOW_ID_in_desvio389); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:39:10: 'ifge' SP ID
                    {
                    match(input,26,FOLLOW_26_in_desvio401); 

                    match(input,SP,FOLLOW_SP_in_desvio403); 

                    match(input,ID,FOLLOW_ID_in_desvio405); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:40:10: 'ifgt' SP ID
                    {
                    match(input,27,FOLLOW_27_in_desvio418); 

                    match(input,SP,FOLLOW_SP_in_desvio420); 

                    match(input,ID,FOLLOW_ID_in_desvio422); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:10: 'ifle' SP ID
                    {
                    match(input,28,FOLLOW_28_in_desvio435); 

                    match(input,SP,FOLLOW_SP_in_desvio437); 

                    match(input,ID,FOLLOW_ID_in_desvio439); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:42:10: 'if_icmpeq' SP ID
                    {
                    match(input,19,FOLLOW_19_in_desvio452); 

                    match(input,SP,FOLLOW_SP_in_desvio454); 

                    match(input,ID,FOLLOW_ID_in_desvio456); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:43:10: 'if_icmpne' SP ID
                    {
                    match(input,24,FOLLOW_24_in_desvio469); 

                    match(input,SP,FOLLOW_SP_in_desvio471); 

                    match(input,ID,FOLLOW_ID_in_desvio473); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:10: 'if_icmplt' SP ID
                    {
                    match(input,23,FOLLOW_23_in_desvio486); 

                    match(input,SP,FOLLOW_SP_in_desvio488); 

                    match(input,ID,FOLLOW_ID_in_desvio490); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:45:10: 'if_icmpge' SP ID
                    {
                    match(input,20,FOLLOW_20_in_desvio503); 

                    match(input,SP,FOLLOW_SP_in_desvio505); 

                    match(input,ID,FOLLOW_ID_in_desvio507); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:46:10: 'if_icmpgt' SP ID
                    {
                    match(input,21,FOLLOW_21_in_desvio520); 

                    match(input,SP,FOLLOW_SP_in_desvio522); 

                    match(input,ID,FOLLOW_ID_in_desvio524); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:47:10: 'if_icmple' SP ID
                    {
                    match(input,22,FOLLOW_22_in_desvio537); 

                    match(input,SP,FOLLOW_SP_in_desvio539); 

                    match(input,ID,FOLLOW_ID_in_desvio541); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:48:10: 'goto' SP ID
                    {
                    match(input,14,FOLLOW_14_in_desvio554); 

                    match(input,SP,FOLLOW_SP_in_desvio556); 

                    match(input,ID,FOLLOW_ID_in_desvio558); 

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


 

    public static final BitSet FOLLOW_comando_in_programa10 = new BitSet(new long[]{0x000017FFFFFFC052L});
    public static final BitSet FOLLOW_label_in_comando30 = new BitSet(new long[]{0x000017FFFFFFC040L});
    public static final BitSet FOLLOW_instrucao_in_comando32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label54 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_SP_in_label56 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_13_in_label59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao67 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_load_in_instrucao71 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_store_in_instrucao75 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_desvio_in_instrucao79 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_logica_in_instrucao83 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44_in_instrucao87 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_load206 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_load208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_load225 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RG03_in_load227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_load236 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_load238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_load240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_load249 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_load251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_load253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_store272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RG03_in_store274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_store284 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_store286 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_store288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_desvio352 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_desvio368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_desvio385 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_desvio401 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_desvio418 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_desvio435 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_desvio452 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_desvio469 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_desvio486 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_desvio503 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_desvio520 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_desvio537 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_desvio554 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SP_in_desvio556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio558 = new BitSet(new long[]{0x0000000000000002L});

}