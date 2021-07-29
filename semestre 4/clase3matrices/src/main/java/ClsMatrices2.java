import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linda
 */
public class ClsMatrices2 {
    //comisiones
    //psvm para que cree el main
    private static String [][] comisiones= new String [3][6];
    public static Scanner t= new Scanner(System.in);
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

    System.out.println("Ingrese nombre "+(fila+1));
    comisiones[fila][NOMBRE]=t.nextLine();
    System.out.println("Ingrese ENERO 1");
    comisiones[fila][ENERO]=t.nextLine();
    System.out.println("Ingrese FEBRERO 1");
    comisiones[fila][FEBRERO]=t.nextLine();
    System.out.println("Ingrese MARZO 1");
    comisiones[fila][MARZO]=t.nextLine();

            //sout
         
    }
    
    public static void imprimirDecorado(String[][] ma){
        //for para filas
       for (int x = 0; x < ma.length; x++) {
            System.out.print("|");
            for (int y = 0; y < ma[x].length; y++) {
                if(y!=0 && y!=5){
                    System.out.print("Q."+ma[x][y]+".00  ");
                }else{
                System.out.print(ma[x][y]);
                }
                if (y != ma[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
   }
    
    public static int[] totalesPorMes(){
             int[] mes= new int[3];
              for (int x = 0; x < comisiones.length; x++) {
            mes[0]= mes[0]+Integer.parseInt(comisiones[x][ENERO]);
            mes[1]=mes[1]+Integer.parseInt(comisiones[x][FEBRERO]);
            mes[2]= mes[2]+Integer.parseInt(comisiones[x][MARZO]); 
             }
            return mes; 
    }
    
    
    public static void totalesPorPersona(){
        for (int x = 0; x < comisiones.length; x++) {
            comisiones[x][TOTAL]= String.valueOf(Integer.parseInt(comisiones[x][ENERO])+Integer.parseInt(comisiones[x][FEBRERO])+Integer.parseInt(comisiones[x][MARZO]));
        }
    }
    
    public static void promedioPorPersona(){
        int suma=0;
        for (int x = 0; x < comisiones.length; x++) {
            suma=Integer.parseInt(comisiones[x][ENERO])+Integer.parseInt(comisiones[x][FEBRERO])+Integer.parseInt(comisiones[x][MARZO]);
            comisiones[x][PROMEDIO]= String.valueOf(suma/3);
        } 
    }
    
    public static int GranTotal(){
             int[] totalote= totalesPorMes();
             int suma=0;
              for (int x = 0; x < comisiones.length; x++) {
            suma= suma+totalote[x];
             }
            return suma; 
    }
    
   
    
    
    public static String vendioMas(int mes){
            int mayor=0;
            String NumMayor = null;
            
               for (int x = 0; x < comisiones.length; x++) { 
                   if(mes==1){
            if(Integer.parseInt(comisiones[x][ENERO])> mayor){
             mayor=Integer.parseInt(comisiones[x][ENERO]);
             NumMayor=comisiones[x][NOMBRE];
             }
            
                   }
                   if(mes==2){
            if(Integer.parseInt(comisiones[x][FEBRERO])> mayor){
             mayor=Integer.parseInt(comisiones[x][FEBRERO]);
             NumMayor=comisiones[x][NOMBRE];
             }
                   }
            
                   if(mes==3){
            if(Integer.parseInt(comisiones[x][MARZO])> mayor){
             mayor=Integer.parseInt(comisiones[x][MARZO]);
            // NumMayor=String.valueOf(mayor);
             NumMayor=comisiones[x][NOMBRE];
             }
            }
               }

            return NumMayor;
    }
    

     public static String vendioMenos(int mes){
           int menor=100000;
            String NumMenor = null;
            
               for (int x = 0; x < comisiones.length; x++) { 
                   if(mes==1){
            if(Integer.parseInt(comisiones[x][ENERO])< menor){
             menor=Integer.parseInt(comisiones[x][ENERO]);
             NumMenor=comisiones[x][NOMBRE];
             }
            
                   }
                   if(mes==2){
            if(Integer.parseInt(comisiones[x][FEBRERO])< menor){
             menor=Integer.parseInt(comisiones[x][FEBRERO]);
             NumMenor=comisiones[x][NOMBRE];
             }
                   }
            
                   if(mes==3){
            if(Integer.parseInt(comisiones[x][MARZO])< menor){
             menor=Integer.parseInt(comisiones[x][MARZO]);
             NumMenor=comisiones[x][NOMBRE];
             }
            }
               }

            return NumMenor;
    }

     public static String vendioMas3Meses(){
     String numMayor[]= new String [3];
              String nombre[]= new String [3];
              String Nom = null;
            int mayor=0;
            
            for (int x = 0; x < comisiones.length; x++) {
            comisiones[x][TOTAL]= String.valueOf(Integer.parseInt(comisiones[x][ENERO])+Integer.parseInt(comisiones[x][FEBRERO])+Integer.parseInt(comisiones[x][MARZO]));
            numMayor[x]=comisiones[x][TOTAL];
            nombre[x]= comisiones[x][NOMBRE];
            
            if(Integer.parseInt(numMayor[x])>mayor){
             mayor=Integer.parseInt(numMayor[x]);
             Nom=nombre[x];
             }
            }
            return Nom;
    }
     
     public static String vendioMenosTresMeses(){
             String numMenor[]= new String [3];
              String nombre[]= new String [3];
              String Nom = null;
            int menor=1000000;
            
            for (int x = 0; x < comisiones.length; x++) {
            comisiones[x][TOTAL]= String.valueOf(Integer.parseInt(comisiones[x][ENERO])+Integer.parseInt(comisiones[x][FEBRERO])+Integer.parseInt(comisiones[x][MARZO]));
            numMenor[x]=comisiones[x][TOTAL];
            nombre[x]= comisiones[x][NOMBRE];
            
            if(Integer.parseInt(numMenor[x])<menor){
             menor=Integer.parseInt(numMenor[x]);
             Nom=nombre[x];
             }
            }
            return Nom;
    }
     
      private static void editar(int fila, int columna){

    System.out.println("Ingrese el dato nuevo ");
    comisiones[fila-1][columna-1]=t.nextLine();
  
    }
      
      public static String[] BuscarCantidad(int cantidad){
      String encontre[]= new String [2];
      for (int x = 0; x < comisiones.length; x++) {
      
          if(Integer.parseInt(comisiones[x][ENERO])==cantidad){
          encontre[0]=comisiones[x][NOMBRE];
          encontre[1]="Enero";
      }
      
          if(Integer.parseInt(comisiones[x][FEBRERO])==cantidad){
          encontre[0]=comisiones[x][NOMBRE];
          encontre[1]="Febrero";
      }
          if(Integer.parseInt(comisiones[x][MARZO])==cantidad){
          encontre[0]=comisiones[x][NOMBRE];
          encontre[1]="Marzo";
      }    
      }
      return encontre;
      } 
    
    
    public static void main(String[] args) throws IOException {
       // BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
       String linea;
       int opcion=0;
       while(opcion != 7){
        System.out.println("Eliga una opcion");
       System.out.println(" 1.Ingresar información\n 2.Quien vendio mas y quien vendio menos por mes\n 3.quien vendio mas en los tres meses\n "
               + "4.Editar datos nombre o cantidad vendida\n 5.buscar datos por cantidad\n 6.desplegar en pantalla la matriz\n 7.Salir");
       linea = t.nextLine();
       opcion=Integer.parseInt(linea);
        
       switch(opcion)
{
   case 1 :
      System.out.println("INGRESO DE INFORMACION");
      for(int i=0;i<3;i++){
        cargaInformacion(i);
      }
      System.out.println("Información ingresada");
      break;
      
      
    case 2 :
        String mesess[]= new String [3];
         mesess[0]="ENERO";
         mesess[1]="FEBRERO";
         mesess[2]="MARZO";
        int mesDeseado;
      System.out.println("QUIEN VENDIÓ MAS Y MENOS POR MES");
      System.out.println("Ingrese el mes que desea saber(sabiendo que enero=1, febrero=2 y marzo=3)");
      mesDeseado=Integer.parseInt(t.nextLine());
      System.out.println("LA PERSONA QUE VENDIÓ MÁS DE "+mesess[mesDeseado-1]+" ES: "+vendioMas(mesDeseado));
      System.out.println("LA PERSONA QUE VENDIÓ MENOS DE "+mesess[mesDeseado-1]+" ES: "+vendioMenos(mesDeseado));
      break;
      
      
      
    case 3 :
     System.out.println("QUIEN VENDIÓ MAS POR LOS TRES MESES");
     System.out.println("la venta mas grande fue de: "+vendioMas3Meses());
     System.out.println("la venta mas pequeña fue de: "+vendioMenosTresMeses());
      break;
      
      
      
     case 4 :
         int fila, columna;
      System.out.println("EDITAR DATOS");
      totalesPorPersona();
      promedioPorPersona();
      imprimirDecorado(comisiones);
      System.out.println("Ingrese en que fila está el dato que quiere modificar");
      fila=Integer.parseInt(t.nextLine());
      System.out.println("Ingrese en que columna está el dato que quiere modificar");
      columna=Integer.parseInt(t.nextLine());
      editar(fila,columna);
      totalesPorPersona();
       promedioPorPersona();
       System.out.println("DATOS EDITADOS");
      break;
    
      
     case 5 :
         int cantidad;
         String buscar[]= new String [2];
     System.out.println("BUSCAR DATOS POR CANTIDAD");
     System.out.println("Ingrese la cantidad que desea buscar ");
     cantidad=Integer.parseInt(t.nextLine());
     buscar=BuscarCantidad(cantidad);
     System.out.println("El nombre de la persona que vendió esa cantidad:  "+buscar[0]);
     System.out.println("El mes en el que la persona vendió esa cantidad:  "+buscar[1]);
      break;
      
    case 6 :
     System.out.println("DESPLEGAR EN PANTALLA LA MATRIZ");
        int totalMes[]= totalesPorMes();
         String meses[]= new String [3];
         meses[0]="enero";
         meses[1]="febrero";
         meses[2]="marzo";
        totalesPorPersona();
        promedioPorPersona();
        imprimirDecorado(comisiones);
        
        for (int x = 0; x < comisiones.length; x++) {
        System.out.println("El gran total por mes de "+meses[x]+"  Q." + totalMes[x]+".00");
         }
        System.out.println("El gran total por meses es: "+ "Q." + GranTotal() +".00");
      break;
      case 7:
          break;
       }
    }
       
        /*
        for(int i=0;i<3;i++){
        cargaInformacion(i);
        } 
        imprimirDecorado(comisiones);
*/
    }
}