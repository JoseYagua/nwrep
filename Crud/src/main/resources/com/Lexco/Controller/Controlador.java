/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Lexco.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SOFTWARE1
 */

@Controller

public class Controlador {
    
    
  /*  @RequestMapping(value="/agregarComponentes.html", method = RequestMethod.POST)
    
    public ModelAndView guardarComponente(@ModelAttribute("componenteForm") ComponenteForm componente) {
        System.out.println("Ingreso a componente guardado");
        componenteService.agregarComponente(componente);
        System.out.println("Componente guardado");
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
    
    */
    
}
