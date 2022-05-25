package Sintatico;
import java_cup.runtime.Symbol;

%%
%class Lexer
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L=[a-zA-Z_]+
D=[0-9]+
S=[+/-]+
espacio=[ ,\t,\r, \n]+


%{
    private Symbol symbol(int type, Object value){
return new Symbol(type, yyline, yycolumn, value);
}
    private Symbol symbol(int type){
return new Symbol(type, yyline, yycolumn);
}
%}
%%

int | { return new Symbol(sym.Int, yychar,yyline, yytext());}
if | {return new Symbol(sym.If, yychar,yyline, yytext());}
else | {return new Symbol(sym.Else, yychar,yyline, yytext());}
while {return new Symbol(sym.Int, yychar,yyline, yytext());}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return new Symbol(sym.Igual, yychar,yyline, yytext());}
"+" { return new Symbol(sym.Suma, yychar,yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar,yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar,yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar,yyline, yytext());}


"{" {return new Symbol(sym.Llave_a, yychar,yyline, yytext());}
"{" {return new Symbol(sym.Llave_c, yychar,yyline, yytext());}
"(" {return new Symbol(sym.Parentesis_a, yychar,yyline, yytext());}
"(" {return new Symbol(sym.Parentesis_c, yychar,yyline, yytext());}
"main" {return new Symbol(sym.Main, yychar,yyline, yytext());}
";" {return new Symbol(sym.P_coma, yychar,yyline, yytext());}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}

