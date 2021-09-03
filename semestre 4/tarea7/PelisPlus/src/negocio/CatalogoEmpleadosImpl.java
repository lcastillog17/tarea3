/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.AccesoDatos;
import datos.AccesoDatosImpl;
import dominio.MdEmpleado;

import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author linda
 */
public class CatalogoEmpleadosImpl implements CatalogoEmpleados {
    
      private final AccesoDatos datos;
    
    public CatalogoEmpleadosImpl(){
        this.datos = new AccesoDatosImpl(); //poner * en el import datos.*
    }

    @Override
    public void agregarEmpleado(String nombre, String nombreArchivo, Double enero, Double febrero, Double marzo) {
        MdEmpleado Empleados = new MdEmpleado(nombre, enero, febrero, marzo);
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);//bandera si anexa o no
            datos.escribir(Empleados, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarEmpleado(String nombreArchivo) {
       try {
            List<MdEmpleado> empleados = datos.listar(nombreArchivo);
            for(MdEmpleado empleado : empleados){
                System.out.println("Empleado: "+empleado);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarEmpleado(String nombreArchivo, double buscar) {
       String resultado = null;
        try {
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar el empleado");
            ex.printStackTrace();
        }
         System.out.println("Resultado Busqueda:"+resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if(datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //crearmos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }

    }

    @Override
    public String MayorxMes(String nombreArchivo, int mesElegido) {
       double mayor=0.0;
       
       String nom=null,resultado=null,mess=null;
       
       
        try {
                    List<MdEmpleado> empleados = datos.listar(nombreArchivo);
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
    public String MenorxMes(String nombreArchivo, int mesElegido) {
               double menor=100000.0;
       
       String nom=null,resultado=null,mess=null;
       
       
        try {
                    List<MdEmpleado> empleados = datos.listar(nombreArchivo);
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
    public String vendioMas3Meses(String nombreArchivo) {
        String resultado=null, nom=null;
        double mayor=0.0,num=0.0;
        
                try {
                    List<MdEmpleado> empleados = datos.listar(nombreArchivo);
                    for(MdEmpleado empleado : empleados){
               if(empleado.getTotal()>mayor){
                num=empleado.getTotal();
                nom=empleado.getNombre();
            }
               resultado="La persona con mayor venta en tres meses es: "+nom+" y la venta en tres meses es: "+num;
                    }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
                return resultado;
    }

    @Override
    public void editar2(String nombreArchivo, int col, int fila, String nuevo) {
        int x=0;
    try {
        
                    List<MdEmpleado> empleados = datos.listar(nombreArchivo);
                    if(col==1){
               empleados.get(fila-1).setNombre(nuevo);   
            }
                    else if(col==2){
               empleados.get(fila-1).setEnero(Double.valueOf(nuevo));   
            }
                  else if(col==3){
               empleados.get(fila-1).setFebrero(Double.valueOf(nuevo));   
            }
                  else if(col==4){
               empleados.get(fila-1).setMarzo(Double.valueOf(nuevo));   
            }
                   
                        boolean anexar = false;
                     for(MdEmpleado empleado : empleados){
                        datos.escribir(empleado, nombreArchivo, anexar);
                        anexar=datos.existe(nombreArchivo);
                     }
                    
                        
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

   

   
    
}
