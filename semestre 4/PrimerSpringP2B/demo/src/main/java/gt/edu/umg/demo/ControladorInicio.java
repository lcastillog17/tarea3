/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demo;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jeant
 */

@Controller
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(Model model) {
        var msg = "Desde el controlador...";
        var persona = new Persona();
        persona.setNombre("Antonio");
        persona.setApellido("Barrera");
        persona.setEmail("abcde");
        persona.setTelefono("12345");
        var persona2 = new Persona();
        persona2.setNombre("Daniela");
        persona2.setApellido("Castillo");
        persona2.setEmail("edcba");
        persona2.setTelefono("54321");
        var personas = Arrays.asList(persona,persona2);
//        var personas = new ArrayList();
        model.addAttribute("personas", personas);
        model.addAttribute("msg", msg);
        return "index";
    }
}