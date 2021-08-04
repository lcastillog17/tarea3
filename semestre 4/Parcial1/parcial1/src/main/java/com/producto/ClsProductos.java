/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.producto;

import java.util.Scanner;

/**
 *
 * @author linda
 */
public class ClsProductos {
    private int unidad;
    private String descripcion;
    private double precio;
    private double peso;

    
    private Scanner t= new Scanner(System.in);
    
    public void llenaInformacion(){
   
        //se usa con sout tabulador
        System.out.println("      INGRESE VALORES DE LA TABLA         ");
        System.out.println("Unidad: ");
        setUnidad(t.nextInt());
        t.nextLine();
        System.out.println("Descripcion: ");
        setDescripcion(t.nextLine());
        System.out.println("Precio: ");
        setPrecio(t.nextDouble());
        System.out.println("Peso: ");
        setPeso(t.nextDouble());
        
        
    }

    /**
     * @return the unidad
     */
    public int getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
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
