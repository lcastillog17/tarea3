/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demoP2bSpring;

import static gt.edu.umg.demoP2bSpring.AccesoDatos.setEmpleados;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author linda
 */
@Controller
public class ControladorEditar {

    CatalogoEmpleados catalogo = new CatalogoEmpleados();

    @PostMapping("/editarEmpleado")
    public String editar(@ModelAttribute @Valid Empleado empleado, BindingResult result, Model model) {
        //List<Empleado> empleados= AccesoDatos.getEmpleados();

        String msg;

        if (result.hasErrors()) {
            msg = "Debe llenar todos los campos o ponerlos en el formato correcto";
        } else {
            msg = catalogo.editar2(empleado.getCodigo(), empleado.getNombre(), empleado.getEnero(), empleado.getFebrero(), empleado.getMarzo());
            if (msg == null) {
                msg = "El codigo que busca no se encuentra";
            } else {
                catalogo.editar2(empleado.getCodigo(), empleado.getNombre(), empleado.getEnero(), empleado.getFebrero(), empleado.getMarzo());
                msg = "Dato editado con exito";
            }
        }
            model.addAttribute("msg", msg);
            model.addAttribute("empleados", AccesoDatos.getEmpleados());
            return "Editar";
        }
}
