/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demoP2bSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author linda
 */
@Controller
public class ControladorEliminar {
    @PostMapping("/eliminarEmpleado")
    public String editar(@ModelAttribute Empleado empleado, Model model) {
         CatalogoEmpleados catalogo= new CatalogoEmpleados();
         //List<Empleado> empleados= AccesoDatos.getEmpleados();
        var msg = catalogo.borrar(empleado.getCodigo());
        if (msg==null){
            msg="NO SE ENCONTRO EL DATO";
        }
        model.addAttribute("msg", msg);
        catalogo.borrar(empleado.getCodigo());
       model.addAttribute("empleados", AccesoDatos.getEmpleados());
        return "Eliminar";
    }
}
