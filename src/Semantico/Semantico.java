
package Semantico;

/**
 * @author Marcos
 */
  
public class Semantico {
    
 public static void main(String[] args){
        
        //COMBINACIONES ENTRE OPERADORES OP1 OP2
            String[][] c1= new String[10][4];
            c1[0][0] = "OP1"; 
            c1[0][1] = "OP2";
            c1[1][0] = "E";
            c1[1][1] = "E";
            c1[2][0] = "E";
            c1[2][1] = "R";
            c1[3][0] = "R";
            c1[3][1] = "E";
            c1[4][0] = "R";
            c1[4][1] = "R";
            c1[5][0] = "C";
            c1[5][1] = "C";
            c1[6][0] = "C";
            c1[6][1] = "S";
            c1[7][0] = "S";
            c1[7][1] = "C";
            c1[8][0] = "S";
            c1[8][1] = "S";
            c1[9][0] = "B";
            c1[9][1] = "B";
//COMBINACION SUMAS MULTIPLICACION RESTA IDENTIFICADOR DOS

  c1[0][2] = "+,*,-";
  c1[1][2] = "E";
  c1[2][2] = "R";
  c1[3][2] = "R";
  c1[4][2] = "R";
  c1[5][2] = "X";
  c1[6][2] = "X";
  c1[7][2] = "X";
  c1[8][2] = "X";
  c1[9][2] = "X";
  
  
//COMBINACION DIVISION IDENTIFICADOR TRES

  c1[0][3] = "/";
  c1[1][3] = "R";
  c1[2][3] = "R";
  c1[3][3] = "R";
  c1[4][3] = "R";
  c1[5][3] = "X";
  c1[6][3] = "X";
  c1[7][3] = "X";
  c1[8][3] = "X";
  c1[9][3] = "X";
  


//IMPRESIONDE DE COMBINACION DE OPERADORES
     for (int x=0; x < c1.length; x++) {
  System.out.print("|");
    for (int y=0; y < c1[x].length; y++) {
      System.out.print (c1[x][y]);
      if (y!=c1[x].length-1) System.out.print("\t");
    }
  System.out.println("|");
}
    }
}

