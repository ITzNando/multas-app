package com.prestamo.Multas.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioC {

    @GetMapping("/")
    public String inicio(){
        return "rederict:/multas";
    }
    
}
