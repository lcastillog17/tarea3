/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demoP2bSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author linda
 */
@Controller
public class ControladorBuscarCantidad {

    CatalogoEmpleados catalogo = new CatalogoEmpleados();

    @PostMapping(value = "/buscarEmpleado")
    public String recoverPass(@RequestParam("cantidad") Double cantidad, Model model) {
        String msg = catalogo.buscarEmpleado(cantidad);
        model.addAttribute("msg", msg);
        return "BuscaPorCantidad";
    }
}
