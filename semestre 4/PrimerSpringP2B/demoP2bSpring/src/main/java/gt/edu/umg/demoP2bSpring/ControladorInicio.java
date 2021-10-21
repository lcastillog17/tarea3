/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demoP2bSpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author linda
 */
@Controller
public class ControladorInicio {
   CatalogoEmpleados catalogo= new CatalogoEmpleados();
    
            
        @GetMapping("/")
        public String inicio(Model model) {//la funcion model es para mandar info a la parte visual
        var msg = "Desde el controlador...";
       /* var persona = new MdEmpleado();
        persona.setCodigo(907);
        persona.setNombre("Barrera");
        persona.setEnero(10);
        persona.setFebrero(11);
        persona.setMarzo(9);
        persona.setTotal(20);
        var persona2 = new MdEmpleado();
        persona2.setCodigo(456);
        persona2.setNombre("Barrera");
        persona2.setEnero(15);
        persona2.setFebrero(15);
        persona2.setMarzo(15);
        persona2.setTotal(45);
        var personas = Arrays.asList(persona,persona2);//cree un arraylist de esos los objetos que estam em personas que son persona y persona2
        var personas = new ArrayList();
        model.addAttribute("personas", personas);
        model.addAttribute("msg", msg);*/
        return "index";
    }
    
    
     @GetMapping("/listar")
      public String listar(Model model) {
          model.addAttribute("empleados", AccesoDatos.getEmpleados());
     /*   var msg = "Desde el controlador...";
        var persona = new Empleado();
        persona.setCodigo(907);
        persona.setNombre("Barrera");
        persona.setEnero(10);
        persona.setFebrero(11);
        persona.setMarzo(9);
        persona.setTotal(20);
        var persona2 = new Empleado();
        persona2.setCodigo(456);
        persona2.setNombre("Barrera");
        persona2.setEnero(15);
        persona2.setFebrero(15);
        persona2.setMarzo(15);
        persona2.setTotal(45);
        var personas = Arrays.asList(persona,persona2);//cree un arraylist de esos los objetos que estam em personas que son persona y persona2
//        var personas = new ArrayList();
        model.addAttribute("personas", personas);
        model.addAttribute("msg", msg);*/
        return "listar";
    }
      
          @GetMapping("/Agregar")
      public String Agregar() {
       return "Agregar";
      } 
      
      
      @GetMapping("/Editar")
      public String Editar(Model model,@ModelAttribute Empleado empleado) {
       model.addAttribute("empleados", AccesoDatos.getEmpleados());
       return "Editar";
      } 
      
       @GetMapping("/Eliminar")
      public String Eliminar(Model model) {
          model.addAttribute("empleados", AccesoDatos.getEmpleados());
       return "Eliminar";
      } 
       @GetMapping("/BuscaPorCantidad")
      public String BuscaPorCantidad() {
       return "BuscaPorCantidad";
      } 
      
     @GetMapping("/Mayor3meses")
      public String Mayor3meses(Model model) {
       var msg = catalogo.vendioMas3Meses();
       if (msg==null){
      msg="NO HAY VENDEDORES";
       }
        model.addAttribute("msg", msg);
       return "Mayor3meses";
      }
      
      @GetMapping("/MayorMenorMes")
      public String MayorMenorMes() {
       return "MayorMenorMes";
      }
      
}
