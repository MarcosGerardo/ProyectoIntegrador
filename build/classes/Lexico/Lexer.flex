package Lexico;
import static Lexico.Tokens.*;

%%
%class Lexer
%type Tokens

L=[a-zA-Z_]+
D=[0-9]+
S=[+/-]+
espacio=[ ,\t,\r,\n]+


%{
    public String lexeme;
%}
%%

int |
if |
else |
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
">" {return Mayor;}
"<" {return Menor;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
