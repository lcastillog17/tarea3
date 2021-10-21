/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demoP2bSpring;

import static gt.edu.umg.demoP2bSpring.AccesoDatos.addEmpleados;
import static gt.edu.umg.demoP2bSpring.AccesoDatos.setEmpleados;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author linda
 */
@Controller
public class ControladorAgregar {
CatalogoEmpleados catalogo= new CatalogoEmpleados();

      @PostMapping("/agregarEmpleado")
    public String agregar(@ModelAttribute @Valid Empleado empleado, BindingResult result, Model model ) {
       // System.out.println("Codigo: " + empleado.getCodigo() + " Nombre: " + empleado.getNombre()+ " Enero: " + empleado.getEnero()+ " Febrero: " + empleado.getFebrero()+ " Marzo: " + empleado.getMarzo());
       String msg=null;
       if (result.hasErrors()){
       msg="Debe llenar todos los campos o ponerlos en el formato correcto";
       }else{
       catalogo.agregar(empleado);
       msg="Dato agregado con exito";
       
       /*double total=empleado.getEnero()+empleado.getFebrero()+empleado.getMarzo();
       empleado.setTotal(total);
       empleado.setPromedio(Math.round((empleado.getTotal()/3) * 100.0) / 100.0); 
       addEmpleados(empleado);*/
       }
       model.addAttribute("msg", msg);
        return "Agregar";
    }
}
