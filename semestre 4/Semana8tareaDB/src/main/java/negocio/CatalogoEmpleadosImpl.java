/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.AccesoDatosJDBC;
import datos.AccesoDatosJDBCImpl;
import dominio.MdEmpleado;

import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author linda
 */
public class CatalogoEmpleadosImpl implements CatalogoEmpleados {
    
      private final AccesoDatosJDBC datos;
    
    public CatalogoEmpleadosImpl(){
        this.datos = new AccesoDatosJDBCImpl(); //poner * en el import datos.*
    }

    @Override
    public void agregarEmpleado(String nombre, Double enero, Double febrero, Double marzo) {
        MdEmpleado Empleados = new MdEmpleado(nombre, enero, febrero, marzo);
        boolean anexar = false;
        try {
           
            datos.escribir(Empleados);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarEmpleado() {
       try {
            List<MdEmpleado> empleados = datos.listar();
            for(MdEmpleado empleado : empleados){
                System.out.println("Empleado: "+empleado);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarEmpleado( double cantidad) {
       String resultado = null;
       String mes=null;
       
        try {
                    List<MdEmpleado> empleados = datos.listar();
                    for(MdEmpleado empleado : empleados){
                    if(Objects.equals(empleado.getEnero(), cantidad)){
                    resultado=empleado.toString(); 
                    mes="enero";
                    
                    }else if (Objects.equals(empleado.getFebrero(),cantidad)) {
                    resultado=empleado.toString();
                    mes="febrero";
                        }else if (Objects.equals(empleado.getMarzo(),cantidad)) {
                    resultado=empleado.toString();
                    mes="marzo";
                        }
                    }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar el empleado");
            ex.printStackTrace();
        }
         System.out.println("Resultado Busqueda: "+resultado+" en el mes: "+mes);
    }


    

    @Override
    public String MayorxMes(int mesElegido) {
       double mayor=0.0;
       
       String nom=null,resultado=null,mess=null;
       
       
        try {
                    List<MdEmpleado> empleados = datos.listar();
                    for(MdEmpleado empleado : empleados){
               if(mesElegido==1){
                   if (empleado.getEnero()>mayor) {
                       mayor=empleado.getEnero();
                       nom=empleado.getNombre();
                       mess="enero";
                   }
                
            }
               else if(mesElegido==2){
                   if (empleado.getFebrero()>mayor) {
                       mayor=empleado.getFebrero();
                        nom=empleado.getNombre();
                        mess="febrero";
                   }  
            }
               else if(mesElegido==3){
                   if (empleado.getMarzo()>mayor) {
                       mayor=empleado.getMarzo();
                        nom=empleado.getNombre();
                        mess="marzo";
                   }  
            }
               resultado="La persona con mayor venta en el mes de: "+mess+" es: "+nom+" y la venta fue de: "+mayor;
                    }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String MenorxMes(int mesElegido) {
               double menor=100000.0;
       
       String nom=null,resultado=null,mess=null;
       
       
        try {
                    List<MdEmpleado> empleados = datos.listar();
                    for(MdEmpleado empleado : empleados){
               if(mesElegido==1){
                   if (empleado.getEnero()<menor) {
                       menor=empleado.getEnero();
                       nom=empleado.getNombre();
                       mess="enero";
                   }
                
            }
               else if(mesElegido==2){
                   if (empleado.getFebrero()<menor) {
                       menor=empleado.getFebrero();
                        nom=empleado.getNombre();
                        mess="febrero";
                   }  
            }
               else if(mesElegido==3){
                   if (empleado.getMarzo()<menor) {
                       menor=empleado.getMarzo();
                        nom=empleado.getNombre();
                        mess="marzo";
                   }  
            }
               resultado="La persona con menor venta en el mes de: "+mess+" es: "+nom+" y la venta fue de: "+menor;
                    }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String vendioMas3Meses() {
        String resultado=null, nom=null;
        double mayor=0.0,num=0.0;
        
                try {
                    List<MdEmpleado> empleados = datos.listar();
                    for(MdEmpleado empleado : empleados){
               if(empleado.getTotal()>mayor){
                num=empleado.getTotal();
                nom=empleado.getNombre();
                mayor=num;
            }
               resultado="La persona con mayor venta en tres meses es: "+nom+" y la venta en tres meses es: "+mayor;
                    }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
                return resultado;
    }

    @Override
    public void editar2(int col, int codigo, String nuevo) {
        int x=0;
    try {
        MdEmpleado NuevoEmple=null;
        String nombre=null;
                    Double enero=0.0;
                    Double febrero=0.0;
                    Double marzo=0.0;
                    List<MdEmpleado> empleados = datos.listar();
                    
                    for(MdEmpleado empleado : empleados){
                    if(empleado.getCodigo() ==codigo){
                     nombre=empleado.getNombre();
                    enero=empleado.getEnero();
                    febrero=empleado.getFebrero();
                    marzo=empleado.getMarzo();
                   
                    
                    }
                    }
                    if(col==1){
               nombre=nuevo;   

            }
                    else if(col==2){
               enero=(Double.valueOf(nuevo));   
            }
                  else if(col==3){
               febrero=(Double.valueOf(nuevo));   
            }
                  else if(col==4){
               marzo=(Double.valueOf(nuevo));   
            }
             NuevoEmple=new MdEmpleado(nombre,enero,febrero,marzo);
             NuevoEmple.setCodigo(codigo);
        
                        datos.editar(NuevoEmple);         
                        
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }
}

   

   
    

