package com.Lexco.servicios;
 
import com.Lexco.Controller.ComponenteForm;
import java.util.List;

 
public interface ComponenteService {
     public void agregarComponente(ComponenteForm componente);
     public List<ComponenteForm> mostrarComponentes();
     public void eliminarComponente(Integer id);
     public void actualizarComponente(ComponenteForm componente);
     public ComponenteForm mostrarComponente(int id);
}