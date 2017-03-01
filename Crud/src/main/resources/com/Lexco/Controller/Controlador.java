/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Lexco.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
/**
 *
 * @author SOFTWARE1
 */

@Controller

public class Controlador {
    
    
   private ComponenteService componenteService= new ComponenteServiceImpl();
     
    @RequestMapping(value="/agregarComponentes.html", method = RequestMethod.POST)
    public ModelAndView guardarComponente(@ModelAttribute("componenteForm") ComponentesFrom componente) {
        System.out.println("Ingreso a componente guardado");
        componenteService.agregarComponente(componente);
        System.out.println("Componente guardado");
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
     
    @RequestMapping(value="/actualizarComponentes.html", method = RequestMethod.POST)
    public ModelAndView actualizarComponente(@ModelAttribute("componenteForm") ComponentesFrom componente) {
        System.out.println("Ingreso a componente actualizado");
        componenteService.actualizarComponente(componente);
        System.out.println("Componente actualizado");
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
     
    @RequestMapping(value="/eliminarComponentes.html/{componenteId}", method = RequestMethod.GET)
    public ModelAndView eliminarComponente(@PathVariable("componenteId") Integer componenteId) {
        System.out.println("Ingreso a componente eliminado");
        componenteService.eliminarComponente(componenteId);
        System.out.println("Componente actualizado");
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
     
    @RequestMapping(value="/mostrarComponentes.html", method = RequestMethod.GET)
    public ModelAndView mostrarComponentes() {
        System.out.println("Se muestran todos los componentes");
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
    
}
