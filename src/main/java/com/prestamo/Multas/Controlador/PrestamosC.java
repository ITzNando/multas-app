package com.prestamo.Multas.Controlador;

import com.prestamo.Multas.Service.PrestamosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/multas") 
public class PrestamosC {
    

    @Autowired
    private PrestamosService prestamosService; 

    @GetMapping("")
    public String home(Model model) throws Exception{
        model.addAttribute("prestamos", prestamosService.findAll());
        return"inicio";
    }

    @GetMapping("/select")
    public String Multa(Model model) throws Exception{
        model.addAttribute("prestamos", prestamosService.findByMulta());
        return "select";
    }

   

    
}
