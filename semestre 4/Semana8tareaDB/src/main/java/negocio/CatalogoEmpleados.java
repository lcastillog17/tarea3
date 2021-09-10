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
    public void agregarEmpleado( String nombre, Double enero, Double febrero, Double marzo);
    public void listarEmpleado();
    public void buscarEmpleado(double cantidad);
    public String MayorxMes(int mesElegido);
    public String MenorxMes(int mesElegido);
    public String vendioMas3Meses(); 
    public void editar2(int col, int codigo, String nuevo);
    
}
