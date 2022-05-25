/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LexicoSintactico;

import java.io.File;

/**
 *
 * @author Marcos
 */
public class Principal {
    public static void main(String[] args) {
        
        String ruta = "C:/Users/Marcos/Documents/NetBeansProjects/ProyectoIntegrador/src/Lexico/Lexer.flex";
        String ruta2 = "C:/Users/Marcos/Documents/NetBeansProjects/ProyectoIntegrador/src/Lexico/LexerCup.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    
}
    }

