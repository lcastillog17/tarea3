/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prorrateofacturas;

import com.producto.ClsProductos;
import com.gastos.ClsGastos;
import java.text.DecimalFormat;

/**
 *
 * @author linda
 */
public class ClsProrrateo {
     private static String[] Vgastos = new String[5];
     ClsProductos productos= new ClsProductos();
     DecimalFormat df = new DecimalFormat("#.00"); //es para crear un formato para darle a la variable
    
     private static String[][] prorrateo = new String[100][7];
     
     private static final int UNIDAD =0;
    private static final int DESCRIPCION =1;
    private static final int PRECIO =2;
    private static final int GASTOVALOR =3;
    private static final int GASTOPESO =4;
    private static final int COSTOUNIDAD =5;
    private static final int COSTOTOTAL =6;
    private static final int PESO =7;
    
    private int filaActual=0;

    private final int MAX_FILAS=100;
    private final int MAX_COLUMNAS=8;
    
    private int totalFilas=0;
     
    public ClsProrrateo(int filas){
       if (filas > MAX_FILAS){
            throw(new IllegalArgumentException());
        }else {
       totalFilas=filas;
       prorrateo= new String [totalFilas][MAX_COLUMNAS];
       }
    }
    
       public String AgregaProductoMatrix(ClsProductos vende) {
        if (filaActual >= MAX_FILAS) {
            return "Ya llegaste al tope";
        } else {
           
            prorrateo[filaActual][UNIDAD] = vende.getUnidad()+"";
            prorrateo[filaActual][DESCRIPCION] = vende.getDescripcion()+"";
            prorrateo[filaActual][PRECIO] = vende.getPrecio()+"";
            prorrateo[filaActual][PESO] = vende.getPeso()+"";
            filaActual ++;
            
        }
        return "OK!";
    }

       
       
       
       public void AgregaGasto(ClsGastos gastos) {
           
            Vgastos[0] = gastos.getSeguro()+"";
            Vgastos[1]= gastos.getFlete()+"";
            Vgastos[2]= gastos.getImpuesto()+"";   
            Vgastos[3]= gastos.getAcarreo()+"";
            Vgastos[4]= gastos.getComisiones()+""; 
       }
    
    public  void imprimirDecorado(){
       
       for (int x = 0; x < prorrateo.length; x++) {
            System.out.print("|");
            for (int y = 0; y < prorrateo[x].length-1; y++) {
                if(y>1){
                    System.out.print(df.format(Double.valueOf(prorrateo[x][y])));
                }else{
                System.out.print(prorrateo[x][y]);
                }
                if (y != prorrateo[x].length - 2) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
   }
    
    public static Double pasoUno(){
        Double total1=0.0;
     for (int x = 0; x < prorrateo.length; x++) {
         total1=total1+(Double.valueOf(prorrateo[x][UNIDAD])*Double.valueOf(prorrateo[x][PRECIO]));
     }
         return total1;
    } 
    
     public static Double pasoDos(){
        
        Double total2=0.0;
     for (int x = 0; x < Vgastos.length; x+=2) {
         total2=total2+(Double.valueOf(Vgastos[x]));
     }
         return total2;
    } 
     
    public static Double pasoTres(){
        Double total3=pasoDos()/pasoUno();
     
         return total3;   
}
    
        public static void pasoCuatro(){
        Double total4;
        for (int x = 0; x < prorrateo.length; x++) {
        total4=Double.valueOf(prorrateo[x][PRECIO])*pasoTres();
        prorrateo[x][GASTOVALOR]=total4+"";
                }
       
}
        
 public static Double pasoCinco(){
        Double total5=0.0;

        for (int x = 0; x < prorrateo.length; x++) {
        total5=total5+(Double.valueOf(prorrateo[x][UNIDAD])*Double.valueOf(prorrateo[x][PESO]));
                }
       return total5;
} 
 
  public static Double pasoSeis(){
        Double total6=0.0;
        total6=Double.valueOf(Vgastos[1])+Double.valueOf(Vgastos[3]);
       return total6;
} 
  
   public static Double pasoSiete(){
       Double total7=0.0;
       total7=pasoSeis()/pasoCinco();
       return total7;
} 
   
      public static void pasoOcho(){
       Double total8=0.0;
        for (int x = 0; x < prorrateo.length; x++) {
       total8=Double.valueOf(prorrateo[x][PESO])*pasoSiete();
       prorrateo[x][GASTOPESO]=total8+"";
        }
        
}
            public static void CostoxUnidad(){
       Double total=0.0;
        for (int x = 0; x < prorrateo.length; x++) {
       total=Double.valueOf(prorrateo[x][PRECIO])+Double.valueOf(prorrateo[x][GASTOVALOR])+Double.valueOf(prorrateo[x][GASTOPESO]);
       prorrateo[x][COSTOUNIDAD]=total+"";
        }
            }
        
        public static void CostoTotal(){
       Double total=0.0;
        for (int x = 0; x < prorrateo.length; x++) {
       total=Double.valueOf(prorrateo[x][COSTOUNIDAD])*Double.valueOf(prorrateo[x][UNIDAD]);
       prorrateo[x][COSTOTOTAL]=total+"";
        }    
}
        public static double GranTotal(){
       Double Gtotal=0.0;
       
        for (int x = 0; x < prorrateo.length; x++) {
       Gtotal=Gtotal+Double.valueOf(prorrateo[x][COSTOTOTAL]);
        }
        return Gtotal;
        }
        
       public static String Comprobar(){
       Double comprob=0.0;
       String resul;
       comprob=pasoUno()+pasoDos()+pasoSeis();

        if (comprob==GranTotal()){
        resul= "Correcta :))";
        }else{
        resul="incorrecta :((";
        }
        return resul;
        }
       
        
}
