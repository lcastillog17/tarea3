
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linda
 */
public class ClsTarea1Dolares {
    public static void main(String arg[]) throws IOException{

    //hhacer un programa de consola que pida un nombre de la persona, una cantidad de dinero y le pregunte
    //si lo quiere convertir a dolares, euros o yuanes
       BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
       String nombre,linea;
       int dinero,opcion;
       double dolar, euro, yuanes;
       System.out.println("Cual es tu nombre");
       nombre = lector.readLine();
       System.out.println("Ingrese una cantidad de dinero en quetzales");
       linea = lector.readLine();
       dinero=Integer.parseInt(linea);
       dolar=(dinero*0.13);
       euro=(dinero*0.11);
       yuanes=(dinero*0.84);
       
       System.out.println("Eliga una opcion");
       System.out.println(" 1.Dolares\n 2.Euros\n 3.Yuanes");
       linea = lector.readLine();
       opcion=Integer.parseInt(linea);
       System.out.println("Nombre: "+nombre);
       switch(opcion)
{
   case 1 :
      System.out.println("El resultado en dolares es ="+dolar);
      break;
    case 2 :
      System.out.println("El resultado en euros es ="+euro);
      break;
    case 3 :
     System.out.println("El resultado en Yuanes es ="+yuanes);
      break;
       }     
   }
}

