/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasenum2;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author linda
 */
public class ejemplo2 {
    
    
    //Scanner es una clase que nos permite obtener la entrada de datos primitivos(string, int, double, etc)
    private static Scanner teclado =new Scanner(System.in);
    
    public static void ejemplo1(){
     //ponemos sout y tabulador y me tira eso para escribir
        //System.out.println("Hola mundo");
        String EdadStr="20";
        int edad= Integer.parseInt(EdadStr);
        //ponemos soutv y tabulador y me tira eso de aca abajo
        System.out.println("edad = " + edad);
        
        String valorPIa ="3.1416";
        //cuando Double es con D mayuscula es porque es un objeto
        double pi= Double.parseDouble(valorPIa);
        System.out.println("pi= "+pi);  
        
        String saludo="hola";
                //el charAt devuelve el valor en la posición que indiquemos en los parentesis
                char c=saludo.charAt(3);
                System.out.println("c = " + c); //va devolver a porque es el espacio 3
                
                
             Scanner teclado=new Scanner(System.in);
             
             System.out.println("Dime tu edad en letras");
             //el next line lee toda una linea, hasta el salto de linea deja de leer
             char letra =teclado.nextLine().charAt(1);
             System.out.println("edad = " + letra);
             
             //valueOf convierte un valor u objeto en su representación de tipo String
             String texto= String.valueOf(1234);
             
             short s=129;
             byte h=(byte)s; //convertir la s que era short a byte
             
}
    
    public static void Area(){
        double radio;
        double area;
        String valorS;
        valorS=JOptionPane.showInputDialog("dame el radio");//para que tire esto en un cuadro de dialogo
        radio=Double.parseDouble(valorS);
       // System.out.println("Ingrese el radio ");
        //radio=teclado.nextDouble();
        area=Math.PI * Math.pow(radio, 2); //el math pow es para elevar
        System.out.println("area = " + area);
    }
    
    public static void CodigoA(){
        //convertir de numero a letra por ascii
    String texto;
    int codigo=0;
        System.out.println("Ingresa un numero ");
        texto= teclado.nextLine();
        
        codigo=Integer.parseInt(texto);
        char caracter=(char)codigo; //estoy pasando a char el codigo que me dieron
        System.out.println("caracter = " + caracter);
    }
    public static void letra(){
        String palabra="Jutiapa";
        String AScii="";
        
        for(int x=0; x<palabra.length();x++){
            System.out.println("letra = " + palabra.charAt(x)+"Codigo= "+(int)palabra.charAt(x));
            
        }
    }
    
    public static String Codifica(String palabra,int llave){
        //String palabra="Jutiapa";
        int codificar=0;
        String Resultado="";
        //int llave=10;
        
       for(int x=0; x<palabra.length();x++){
       //x=1;
       codificar=(int)palabra.charAt(x);//convierte la posicion 1 de la palabra a codigo
       codificar= codificar+llave;//el codigo de la posicion uno le suma el parametro llave que le envian
       char caracter =(char)codificar;//convierte a caracter el codigo
       Resultado=Resultado+caracter;//le va sumando al caracter hasta quue el if termina
       
       }
        return Resultado;
    }
        public static String descodifica(String palabra,int llave){
        //String palabra="Jutiapa";
        int codificar=0;
        String Resultado="";
        //int llave=10;
        
       for(int x=0; x<palabra.length();x++){
       //x=1;
       codificar=(int)palabra.charAt(x);//convierte la posicion 1 de la palabra a codigo
       codificar= codificar+llave;//el codigo de la posicion uno le suma el parametro llave que le envian
       char caracter =(char)codificar;//convierte a caracter el codigo
       Resultado=Resultado+caracter;//le va sumando al caracter hasta quue el if termina
        }
       
        int descodificar=0;
        String Resultadodescodificado="";
        
       for(int x=0; x<Resultado.length();x++){
       //x=1;
       descodificar=(int)Resultado.charAt(x);//convierte la posicion 1 de la palabra a codigo
       descodificar= descodificar-3;//el codigo de la posicion uno le suma el parametro llave que le envian
       char caracter =(char)descodificar;//convierte a caracter el codigo
       Resultadodescodificado=Resultadodescodificado+caracter;//le va sumando al caracter hasta quue el if termina    
       }
       
        return Resultadodescodificado;
    }
    
    
    
    public static void main(String arg[]) {
       //ejemplo1();
       // Area();
      //CodigoA();
      //letra();
      String pal;
      String res;
      String descodif;
        System.out.println("Ingresa una plabra");
        pal=teclado.nextLine();
        res = Codifica(pal,3);
        System.out.println("RES PALABR CODIFICADA = " + res);
        //para descodificar
        descodif = descodifica(pal,3);
        System.out.println("RES PALABR DESCODIFICADA = " + descodif);
    }
}
