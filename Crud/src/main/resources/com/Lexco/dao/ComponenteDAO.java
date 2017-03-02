package com.Lexco.dao;
 
import com.Lexco.Controller.ComponenteForm;
import java.util.List;
 
public interface ComponenteDAO {
     public void agregarComponente(ComponenteForm componente);
     public List<ComponenteForm> mostrarComponentes();
     public void eliminarComponente(Integer id);
     public void actualizarComponente(ComponenteForm componente);
     public ComponenteForm mostrarComponente(int id);
}