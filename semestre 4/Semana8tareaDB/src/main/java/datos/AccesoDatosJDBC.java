/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

package datos;

import dominio.MdEmpleado;

import excepciones.*;
import java.util.List;

/**
 *
 * @author linda
 */
public interface AccesoDatosJDBC {
    public List<MdEmpleado> listar () throws LecturaDatosEx;
    void escribir(MdEmpleado empleados) throws EscrituraDatosEx;
    void editar(MdEmpleado empleados) throws EscrituraDatosEx;
    void borrar(int codigo) throws AccesoDatosEx;
  //  public String buscar(double buscar) throws LecturaDatosEx;
    //public void borrar() throws AccesoDatosEx;
       /* public List<AccesoDatosJDBC> seleccion();
    public int insert(AccesoDatosJDBC alumno);*/
    
}
