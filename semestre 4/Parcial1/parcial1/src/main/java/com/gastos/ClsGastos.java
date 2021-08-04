/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gastos;

import java.util.Scanner;

/**
 *
 * @author linda
 */
public class ClsGastos {
    private double seguro;
    private double flete;
    private double impuesto;
    private double acarreo;
    private double comisiones;
    
     private Scanner t= new Scanner(System.in);
     
      public void llenaInformacion(){
          System.out.println("      INGRESE LOS GASTOS      ");
        System.out.println("Seguro: ");
        setSeguro(getT().nextDouble());
        System.out.println("Flete: ");
        setFlete(getT().nextDouble());
        System.out.println("Impuesto: ");
        setImpuesto(getT().nextDouble());
        System.out.println("Acarreo: ");
        setAcarreo(getT().nextDouble());
        System.out.println("Comisiones: ");
        setComisiones(getT().nextDouble());
        
        
    }

    /**
     * @return the seguro
     */
    public double getSeguro() {//get mostrar 
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(double seguro) {//set modificar
        this.seguro = seguro;
    }

    /**
     * @return the flete
     */
    public double getFlete() {
        return flete;
    }

    /**
     * @param flete the flete to set
     */
    public void setFlete(double flete) {
        this.flete = flete;
    }

    /**
     * @return the impuesto
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * @return the acarreo
     */
    public double getAcarreo() {
        return acarreo;
    }

    /**
     * @param acarreo the acarreo to set
     */
    public void setAcarreo(double acarreo) {
        this.acarreo = acarreo;
    }

    /**
     * @return the comisiones
     */
    public double getComisiones() {
        return comisiones;
    }

    /**
     * @param comisiones the comisiones to set
     */
    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    /**
     * @return the t
     */
    public Scanner getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(Scanner t) {
        this.t = t;
    }
}
