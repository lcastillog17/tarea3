/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2clase3;

import java.util.Scanner;

/**
 *
 * @author linda
 */
public class clase3parte2 {//comisiones
    //psvm para que cree el main
    private static String [][] comisiones= new String [3][6];
    
    //final es para declarar constantes
    private static final int NOMBRE=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int TOTAL=4;
    private static final int PROMEDIO=5;
    //metodo que carga informacion
    private static void cargaInformacion(int fila){
    Scanner t= new Scanner(System.in);
    
    System.out.println("Ingrese normbre "+(fila+1));
    comisiones[fila][NOMBRE]=t.nextLine();
    System.out.println("Ingrese ENERO 1");
    comisiones[fila][ENERO]=t.nextLine();
    System.out.println("Ingrese FEBRERO 1");
    comisiones[fila][FEBRERO]=t.nextLine();
    System.out.println("Ingrese MARZO 1");
    comisiones[fila][MARZO]=t.nextLine();
    System.out.println("Ingrese TOTAL 1");
    comisiones[fila][TOTAL]=t.nextLine();
    System.out.println("Ingrese PTOMEDIO 1");
    comisiones[fila][PROMEDIO]=t.nextLine();
            //sout
         
    }
    
    public static void imprimirDecorado(String[][] ma){
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
    
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
        cargaInformacion(i);
        } 
        imprimirDecorado(comisiones);
    }
}
