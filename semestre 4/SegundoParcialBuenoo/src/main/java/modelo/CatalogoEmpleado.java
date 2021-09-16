/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javafx.scene.control.Alert;

/**
 *
 * @author linda
 */
public class CatalogoEmpleado {
    private final AccesoDatosJDBC datos;
    
    public CatalogoEmpleado(){
        this.datos = new AccesoDatosJDBC(); //poner * en el import datos.*
    }


    public void agregarEmpleado(String nombre, Double enero, Double febrero, Double marzo) {
        MdEmpleado Empleados = new MdEmpleado(nombre, enero, febrero, marzo);
        boolean anexar = false;
        try {
            datos.escribir(Empleados);
        } catch (Exception ex) {
          //  System.out.println("Error de acceso a datos");
          new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
           // ex.printStackTrace();
        }
    }


    public List<MdEmpleado> listarEmpleado() {
          List<MdEmpleado> empleados = null;
       try {
          
             empleados = datos.listar();
            for(MdEmpleado empleado : empleados){
                empleados.add(empleado);
               // System.out.println("Empleado: "+empleado);
            }
        } catch (Exception ex) {
          //  System.out.println("Error de acceso a datos");
        // new Alert(Alert.AlertType.ERROR, ex.toString()).showAndWait();
           // ex.printStackTrace();
           
        }
        return empleados;
       
    }
    


    public String buscarEmpleado( double cantidad) {
       String resultado = null;
       String mes=null;
       String resultadoFinal;
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
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
           // System.out.println("Error al buscar el empleado");
           // ex.printStackTrace();
        }
        
         resultadoFinal="Resultado Busqueda: "+resultado+" en el mes: "+mes;
         return resultadoFinal;
    }
    
        public String buscarEmpleadoPorCod( int cod) {
       String resultado = null;
       String mes=null;
       String resultadoFinal;
        try {
                    List<MdEmpleado> empleados = datos.listar();
                    for(MdEmpleado empleado : empleados){
                    if(Objects.equals(empleado.getCodigo(), cod)){
                    resultado=empleado.toString(); 
                    }
                    }
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
           // System.out.println("Error al buscar el empleado");
           // ex.printStackTrace();
        }

         return resultado;
    }


    

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
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
          //  System.out.println("Error de acceso a datos");
          //  ex.printStackTrace();
        }
        return resultado;
    }


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
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
          //  System.out.println("Error de acceso a datos");
          //  ex.printStackTrace();
        }
        return resultado;
    }


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
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
            //System.out.println("Error de acceso a datos");
            //ex.printStackTrace();
        }
                return resultado;
    }

   
    public void editar2(int codigo, String nuevoNombre, String nuevoEnero, String nuevoFebrero, String nuevoMarzo) {
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
                    nombre=nuevoNombre;
                    enero=Double.valueOf(nuevoEnero);
                    febrero=Double.valueOf(nuevoFebrero);
                    marzo=Double.valueOf(nuevoMarzo);
                   
                    
                    }
                    }
             NuevoEmple=new MdEmpleado(nombre,enero,febrero,marzo);
             NuevoEmple.setCodigo(codigo);
        
                        datos.editar(NuevoEmple);         
                        
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
          //  System.out.println("Error de acceso a datos");
         //   ex.printStackTrace();
        }
    }

    
    public void borrar(int cod) {
         try {
            datos.borrar(cod);
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
           //  System.out.println("Error de acceso a datos");
           // ex.printStackTrace();
        }
    }
}
