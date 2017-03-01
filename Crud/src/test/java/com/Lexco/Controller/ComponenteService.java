package com.Lexco.Controller;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SOFTWARE1
 */
public interface ComponenteService {
     public void agregarComponente(ComponenteForm componente);
     public List<ComponenteForm> mostrarComponentes();
     public void eliminarComponente(Integer id);
     public void actualizarComponente(ComponenteForm componente);
     public ComponenteForm mostrarComponente(int id);
}