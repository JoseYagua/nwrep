package com.Lexco.servicios;
 
import com.Lexco.Controller.ComponenteForm;
import com.Lexco.dao.ComponenteDAO;
import com.Lexco.dao.ComponenteDAOImpl;
import java.util.List;
 
public class ComponenteServiceImpl implements ComponenteService{
     
    private ComponenteDAO componenteDAO = new ComponenteDAOImpl();
 
    public void agregarComponente(ComponenteForm componente) {
        // TODO Auto-generated method stub
        componenteDAO.agregarComponente(componente);
    }
 
    public List<ComponenteForm> mostrarComponentes() {
        // TODO Auto-generated method stub
        return componenteDAO.mostrarComponentes();
    }
 
    public void eliminarComponente(Integer id) {
        // TODO Auto-generated method stub
        componenteDAO.eliminarComponente(id);
    }
 
    public void actualizarComponente(ComponenteForm componente) {
        // TODO Auto-generated method stub
        componenteDAO.actualizarComponente(componente);
    }
 
    public ComponenteForm mostrarComponente(int id) {
        // TODO Auto-generated method stub
        return componenteDAO.mostrarComponente(id);
    }
 
}