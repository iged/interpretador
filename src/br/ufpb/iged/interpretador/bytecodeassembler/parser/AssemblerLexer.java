// $ANTLR 3.4 C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g 2012-04-10 00:21:37

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AssemblerLexer extends Lexer {
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
    public static final int ID=4;
    public static final int INT=5;
    public static final int NOVA_LINHA=6;
    public static final int TYPE_STRUCT=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AssemblerLexer() {} 
    public AssemblerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AssemblerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:2:6: ( ':' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:2:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:7: ( 'ADD' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:9: 'ADD'
            {
            match("ADD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:4:7: ( 'CREATE_INT' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:4:9: 'CREATE_INT'
            {
            match("CREATE_INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:5:7: ( 'CREATE_NODE' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:5:9: 'CREATE_NODE'
            {
            match("CREATE_NODE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:7: ( 'CREATE_REF' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:9: 'CREATE_REF'
            {
            match("CREATE_REF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:7:7: ( 'DELETE_INT' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:7:9: 'DELETE_INT'
            {
            match("DELETE_INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:7: ( 'DELETE_NODE' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:9: 'DELETE_NODE'
            {
            match("DELETE_NODE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:9:7: ( 'DELETE_REF' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:9:9: 'DELETE_REF'
            {
            match("DELETE_REF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:7: ( 'DIV' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:9: 'DIV'
            {
            match("DIV"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:11:7: ( 'INIT' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:11:9: 'INIT'
            {
            match("INIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:12:7: ( 'JMP' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:12:9: 'JMP'
            {
            match("JMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:13:7: ( 'MULT' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:13:9: 'MULT'
            {
            match("MULT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:7: ( 'NULL' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:14:9: 'NULL'
            {
            match("NULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:15:7: ( 'READ_INFO' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:15:9: 'READ_INFO'
            {
            match("READ_INFO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:7: ( 'READ_INT' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:16:9: 'READ_INT'
            {
            match("READ_INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:17:7: ( 'READ_INTC' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:17:9: 'READ_INTC'
            {
            match("READ_INTC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:7: ( 'READ_REF' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:9: 'READ_REF'
            {
            match("READ_REF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:19:7: ( 'READ_RN' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:19:9: 'READ_RN'
            {
            match("READ_RN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:7: ( 'READ_VET' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:9: 'READ_VET'
            {
            match("READ_VET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:21:7: ( 'SUB' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:21:9: 'SUB'
            {
            match("SUB"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:7: ( 'WRITE_INFO' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:9: 'WRITE_INFO'
            {
            match("WRITE_INFO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:23:7: ( 'WRITE_INT' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:23:9: 'WRITE_INT'
            {
            match("WRITE_INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:7: ( 'WRITE_REF' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:9: 'WRITE_REF'
            {
            match("WRITE_REF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:25:7: ( 'WRITE_RN' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:25:9: 'WRITE_RN'
            {
            match("WRITE_RN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:26:7: ( 'WRITE_VET' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:26:9: 'WRITE_VET'
            {
            match("WRITE_VET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:27:7: ( 'dado' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:27:9: 'dado'
            {
            match("dado"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:28:7: ( 'null' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:28:9: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:29:7: ( 'prox' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:29:9: 'prox'
            {
            match("prox"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:4: ( ( '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:6: ( '-' )? ( '0' .. '9' )+
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:6: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:6: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:49:11: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "TYPE_STRUCT"
    public final void mTYPE_STRUCT() throws RecognitionException {
        try {
            int _type = TYPE_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:51:13: ( 'LISTA' | 'VETOR' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='L') ) {
                alt3=1;
            }
            else if ( (LA3_0=='V') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:51:15: 'LISTA'
                    {
                    match("LISTA"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:52:15: 'VETOR'
                    {
                    match("VETOR"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_STRUCT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:55:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )* )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:55:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:55:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NOVA_LINHA"
    public final void mNOVA_LINHA() throws RecognitionException {
        try {
            int _type = NOVA_LINHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:59:12: ( ';' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:59:14: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOVA_LINHA"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:61:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:61:6: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | INT | TYPE_STRUCT | ID | NOVA_LINHA | WS )
        int alt5=33;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:135: T__30
                {
                mT__30(); 


                }
                break;
            case 23 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:141: T__31
                {
                mT__31(); 


                }
                break;
            case 24 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:147: T__32
                {
                mT__32(); 


                }
                break;
            case 25 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:153: T__33
                {
                mT__33(); 


                }
                break;
            case 26 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:159: T__34
                {
                mT__34(); 


                }
                break;
            case 27 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:165: T__35
                {
                mT__35(); 


                }
                break;
            case 28 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:171: T__36
                {
                mT__36(); 


                }
                break;
            case 29 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:177: INT
                {
                mINT(); 


                }
                break;
            case 30 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:181: TYPE_STRUCT
                {
                mTYPE_STRUCT(); 


                }
                break;
            case 31 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:193: ID
                {
                mID(); 


                }
                break;
            case 32 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:196: NOVA_LINHA
                {
                mNOVA_LINHA(); 


                }
                break;
            case 33 :
                // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:1:207: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\2\uffff\15\22\1\uffff\2\22\3\uffff\20\22\1\65\2\22\1\70\1\22\1"+
        "\72\3\22\1\76\6\22\1\uffff\2\22\1\uffff\1\107\1\uffff\1\110\1\111"+
        "\1\22\1\uffff\1\22\1\114\1\115\1\116\4\22\4\uffff\1\22\3\uffff\2"+
        "\127\2\22\24\uffff\1\154\7\uffff";
    static final String DFA5_eofS =
        "\157\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\1\104\1\122\1\105\1\116\1\115\2\125\1\105\1\125\1"+
        "\122\1\141\1\165\1\162\1\uffff\1\111\1\105\3\uffff\1\104\1\105\1"+
        "\114\1\126\1\111\1\120\2\114\1\101\1\102\1\111\1\144\1\154\1\157"+
        "\1\123\1\124\1\56\1\101\1\105\1\56\1\124\1\56\1\124\1\114\1\104"+
        "\1\56\1\124\1\157\1\154\1\170\1\124\1\117\1\uffff\2\124\1\uffff"+
        "\1\56\1\uffff\2\56\1\137\1\uffff\1\105\3\56\1\101\1\122\2\105\3"+
        "\uffff\1\111\1\137\3\uffff\2\56\2\137\1\116\1\105\1\uffff\1\111"+
        "\1\uffff\2\111\1\106\2\uffff\1\116\1\105\10\uffff\1\103\1\106\6"+
        "\uffff";
    static final String DFA5_maxS =
        "\1\172\1\uffff\1\104\1\122\1\111\1\116\1\115\2\125\1\105\1\125\1"+
        "\122\1\141\1\165\1\162\1\uffff\1\111\1\105\3\uffff\1\104\1\105\1"+
        "\114\1\126\1\111\1\120\2\114\1\101\1\102\1\111\1\144\1\154\1\157"+
        "\1\123\1\124\1\172\1\101\1\105\1\172\1\124\1\172\1\124\1\114\1\104"+
        "\1\172\1\124\1\157\1\154\1\170\1\124\1\117\1\uffff\2\124\1\uffff"+
        "\1\172\1\uffff\2\172\1\137\1\uffff\1\105\3\172\1\101\1\122\2\105"+
        "\3\uffff\1\126\1\137\3\uffff\2\172\2\137\2\116\1\uffff\1\126\1\uffff"+
        "\2\122\1\124\2\uffff\2\116\10\uffff\1\103\1\124\6\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\15\uffff\1\35\2\uffff\1\37\1\40\1\41\40\uffff\1\2\2"+
        "\uffff\1\11\1\uffff\1\13\3\uffff\1\24\10\uffff\1\12\1\14\1\15\2"+
        "\uffff\1\32\1\33\1\34\6\uffff\1\23\1\uffff\1\36\3\uffff\1\21\1\22"+
        "\2\uffff\1\31\1\3\1\4\1\5\1\6\1\7\1\10\1\16\2\uffff\1\27\1\30\1"+
        "\20\1\17\1\25\1\26";
    static final String DFA5_specialS =
        "\157\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\14\uffff\1\17\2\uffff\12\17"+
            "\1\1\1\23\5\uffff\1\2\1\22\1\3\1\4\4\22\1\5\1\6\1\22\1\20\1"+
            "\7\1\10\3\22\1\11\1\12\2\22\1\21\1\13\3\22\6\uffff\3\22\1\14"+
            "\11\22\1\15\1\22\1\16\12\22",
            "",
            "\1\25",
            "\1\26",
            "\1\27\3\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\66",
            "\1\67",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\71",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\112",
            "",
            "\1\113",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "\1\123\10\uffff\1\124\3\uffff\1\125",
            "\1\126",
            "",
            "",
            "",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\22\1\uffff\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133\10\uffff\1\134",
            "",
            "\1\135\10\uffff\1\136\3\uffff\1\137",
            "",
            "\1\140\4\uffff\1\141\3\uffff\1\142",
            "\1\143\4\uffff\1\144\3\uffff\1\145",
            "\1\146\15\uffff\1\147",
            "",
            "",
            "\1\150",
            "\1\151\10\uffff\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\155\15\uffff\1\156",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | INT | TYPE_STRUCT | ID | NOVA_LINHA | WS );";
        }
    }
 

}