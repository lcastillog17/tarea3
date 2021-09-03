/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author linda
 */
public interface CatalogoEmpleados {
    public void agregarEmpleado(String nombre, String nombreArchivo, Double enero, Double febrero, Double marzo);
    public void listarEmpleado(String nombreArchivo);
    public void buscarEmpleado(String nombreArchivo,double buscar);
    public void iniciarArchivo(String nombreArchivo);
    public String MayorxMes(String nombreArchivo, int mesElegido);
    public String MenorxMes(String nombreArchivo, int mesElegido);
    public String vendioMas3Meses(String nombreArchivo); 
    public void editar2(String nombreArchivo, int col, int fila, String nuevo);
    
     
}
