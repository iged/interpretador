grammar Assembler;

@members {

  protected void init(Token opcode, Token typeStruct, Token id, Token size);
  protected void createInt(Token opcode, Token id);
  protected void createNode(Token opcode, Token typeStruct);
  protected void createRef(Token opcode, Token id);
  protected void readIntC(Token opcode, Token intc);
  protected void readRn(Token opcode, Token id, Token nomeRef);
  protected void escreverLeituraReferencia(Token opcode, Token id);
  
}

programa : comando*
         ;

comando : (label instrucao | instrucao);
         
label : ID ':';

instrucao: (aritmetica | manipulacao | desvio)? NOVA_LINHA;

aritmetica : 'ADD'
           | 'SUB'
           | 'MULT'
           | 'DIV'
           ;
      
manipulacao: (iniciar | criar | ler | escrever | deletar);

desvio : 'JMP' ID;
  
iniciar: a = 'INIT' TYPE_STRUCT b = ID INT? {init($a, $TYPE_STRUCT, $b, $INT);};  
      
criar : a = 'CREATE_INT' b = ID {createInt($a, $b);}
      | a = 'CREATE_NODE' TYPE_STRUCT {createNode($a, $TYPE_STRUCT);}
      | a = 'CREATE_REF' b = ID {createRef($a, $b);}
      ;

ler : a = 'READ_INT' b = ID {escreverLeituraReferencia($a, $b);}
    | a = 'READ_INTC' INT {readIntC($a, $INT);}
    | a = 'READ_VET' b = ID {escreverLeituraReferencia($a, $b);}
    | a = 'READ_RN' b = ID NOME_REF {readRn($a, $b, $NOME_REF);}
    | a = 'READ_INFO' b = ID {escreverLeituraReferencia($a, $b);}
    | a = 'READ_REF' b = ID {escreverLeituraReferencia($a, $b);}
    ;

escrever : 'WRITE_INT' ID
         | 'WRITE_VET' ID
         | 'WRITE_RN' ID NOME_REF NULL?
         | 'WRITE_INFO' ID
         | 'WRITE_REF' ID NULL?
         ;

deletar : 'DELETE_INT' ID
        | 'DELETE_NODE' ID
        | 'DELETE_REF' ID
        ;

NOME_REF: ('dado' | 'prox');

NULL: ('null' | 'NULL'); 

INT: '-'? '0'..'9'+ ;

TYPE_STRUCT : 'LISTA'
            | 'VETOR'
            ;

ID:  ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

//LETRA: ('a'..'z' | 'A'..'Z');

NOVA_LINHA : ';';

WS : (' ' | '\t' | '\r' | '\n') {skip();} ;