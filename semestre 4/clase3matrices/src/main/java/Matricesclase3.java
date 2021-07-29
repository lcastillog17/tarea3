
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linda
 */
public class Matricesclase3 { //la del inge se llama ClsMatrices
   private static String[][] ma= new String [8][8]; 
    private static void cargaMatriz(){
        for (int c=0; c<ma.length;c++){
            for (int f=0; f<ma.length;f++){
                ma[f][c]="X";
    }
}
    }
    
        public static void imprimeMatriz(){
            for (int c=0; c<ma.length;c++){
                 for (int f=0; f<ma.length;f++){
                 System.out.print(" ");
                 }
            }
        }
        
        public static void imprimirDecorado(){
       for (int x = 0; x < ma.length; x++) {
            System.out.print("|");
            for (int y = 0; y < ma[x].length; y++) {
                System.out.print(ma[x][y]);
                if (y != ma[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
   }
        
        //que ponga p en las columnas pares
        public static void columnasPares(){
        for (int c=0; c<ma.length;c++){
            for (int f=0; f<ma.length;f++){
                if (f%2==0){
                ma[c][f]="P";//para que ponga p en las columnas impares
                }
            }
        }
        }
        
        //para hacer una X en la matriz
        public static void columnasX(){
         for (int f=0; f<ma.length;f++){
         ma[f][f]="\\";
          ma[f][ma.length-f]="/";
         }
        }
        
        //para hacer L al reves en la matriz
        public static void columnasL(){
            for (int f=0; f<ma.length;f++){
            ma[0][f]="L"; //fila 0 columna f
            ma[f][ma.length-1]="L";
            ma[ma.length-1][f]="L";
            ma[f][0]="L";
            }
        }
        
        public static void main(String[] args){
            cargaMatriz();
            imprimirDecorado();
            System.out.println("resultados:");
            System.out.println(" ");
            columnasL();
            imprimirDecorado();
        }
}
