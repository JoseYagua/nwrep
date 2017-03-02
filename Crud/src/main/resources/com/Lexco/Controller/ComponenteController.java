/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Lexco.Controller;

import com.Lexco.servicios.ComponenteService;
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
public class ComponenteController {
 
    private ComponenteService componenteService= (ComponenteService) new ComponenteServiceImpl();
     
    @RequestMapping(value="/agregarComponentes.htm", method = RequestMethod.POST)
    public ModelAndView guardarComponente(@ModelAttribute("componenteForm") ComponenteForm componente) {
        componenteService.agregarComponente(componente);
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
     
    @RequestMapping(value="/actualizarComponentes.htm", method = RequestMethod.POST)
    public ModelAndView actualizarComponente(@ModelAttribute("componenteForm") ComponenteForm componente) {
        componenteService.actualizarComponente(componente);
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
     
    @RequestMapping(value="/eliminarComponentes.htm/{componenteId}", method = RequestMethod.GET)
    public ModelAndView eliminarComponente(@PathVariable("componenteId") Integer componenteId) {
        componenteService.eliminarComponente(componenteId);
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
     
    @RequestMapping(value="/modificarComponentes.htm/{componenteId}", method = RequestMethod.GET)
    public ModelAndView modificarComponente(@PathVariable("componenteId") Integer componenteId) {
        ComponenteForm componente=componenteService.mostrarComponente(componenteId);
        ModelAndView modelo= new ModelAndView("agregarComponentes" , "mensaje", "Usuario Correcto");
        modelo.addObject("mensajeComponente","Modificar Componente");
        modelo.addObject("componenteForm", componente);
        return modelo;
    }
     
    @RequestMapping(value="/volverComponente.htm", method = RequestMethod.GET)
    public ModelAndView volverComponente() {
        ModelAndView modelo= new ModelAndView("agregarComponentes" , "mensaje", "Usuario Correcto");
        modelo.addObject("mensajeComponente","Agregar Componente");
        modelo.addObject("componenteForm", new ComponenteForm());
        return modelo;
    }
     
    @RequestMapping(value="/mostrarComponentes.htm", method = RequestMethod.GET)
    public ModelAndView mostrarComponentes() {
        return new ModelAndView("mostrarComponentes" , "listaComponentes", componenteService.mostrarComponentes());
    }
}