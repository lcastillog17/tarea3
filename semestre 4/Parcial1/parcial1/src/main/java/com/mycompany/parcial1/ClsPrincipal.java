/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial1;

import com.gastos.ClsGastos;
import com.producto.ClsProductos;
import com.prorrateofacturas.ClsProrrateo;
import java.util.Scanner;

/**
 *
 * @author linda
 */
public class ClsPrincipal {

     
     public static void main (String [] args){
     Scanner t= new Scanner(System.in);
      
      System.out.println("¿Cuántos datos ingresará? ");  
      int fila = t.nextInt();
      ClsProrrateo matrix=new ClsProrrateo (fila);
      t.nextLine();
    ClsProductos productos= new ClsProductos();
    ClsGastos gastos= new ClsGastos();
    gastos.llenaInformacion();
    
     for (int x = 0; x < fila; x++) {
    productos.llenaInformacion();
    matrix.AgregaProductoMatrix(productos);
      
     }
      matrix.AgregaGasto(gastos);
     
        
       
      matrix.pasoTres();
      matrix.pasoCuatro();
      matrix.pasoCinco();
      matrix.pasoSeis();
      matrix.pasoSiete();
      matrix.pasoOcho();
      matrix.CostoxUnidad();
      matrix.CostoTotal();
      matrix.GranTotal();
      matrix.Comprobar();
      
      matrix.imprimirDecorado();
      System.out.println("      El gran total es: "+matrix.GranTotal());
       System.out.println("     La comprobacion es:"+matrix.Comprobar());
       

    /*
    productos.setUnidad(10);
    productos.setDescripcion("Juan");
    productos.setPrecio(100);
     matrix.AgregaProductoMatrix(productos);
     System.out.println("-----------imprimir matrix-------------");
    matrix.imprimirDecorado();*/
     }
     
     
}
