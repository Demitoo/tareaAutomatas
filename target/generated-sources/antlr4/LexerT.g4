lexer grammar LexerT;
//PALABRAS
BEGIN: 'Commence';
END: 'Endo';
READ: 'read';
PRINT: 'print';
IF:'if';
ELSE:'else';
FOR:'for';
WHILE:'while';
NUMBER_:'nat';
STRING_:'string';
TRUE:'true';
FALSE:'false';
FLOAT_:'float';
PI_:'pi';
RAIZ:'sqrt';
COSENO:'cos';
SENO:'sen';
LOGARITMO:'log';




//Simbolos

CORCHETE1:'[';
CORCHETE2:']';
PARENTESIS1:'(';
PARENTESIS2:')';
LLAVE1:'{';
LLAVE2:'}';
//operadores matematicos
SUMA:'+';
RESTA:'-';
DIVISION:'/';
MULTIPLICACION:'*';



//logicos
Y :'YY';
O : 'OO';
OLOGICO : Y | O;

//relacional
EQUAL:'===';
IGUAL:'=';


//Variables
ID: [a-z]+;
NUMBER :[0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING : '"' .*? '"';
WS : [ \t\r\n]+ -> skip ;

//CONSTANTES
PI:'3.14';
