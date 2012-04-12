grammar Assembler;

@members {

  protected void init(Token opcode, Token typeStruct, Token id, Token size);
  protected void createInt(Token opcode, Token id);
  protected void createNode(Token opcode, Token typeStruct);
  protected void createRef(Token opcode, Token id);

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

ler : 'READ_INT' ID
    | 'READ_INTC' INT
    | 'READ_VET' ID
    | 'READ_RN' ID NOME_REF
    | 'READ_INFO' ID
    | 'READ_REF' ID
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