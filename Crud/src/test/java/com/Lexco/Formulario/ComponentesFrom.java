package com.Lexco.Formulario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author SOFTWARE1
 */
@Entity
@Table(name="componentes")
public class ComponentesFrom {
     
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
     
    @Column(name="nombre")
    private String nombre;
     
    @Column(name="direccion")
    private String direccion;
     
    @Column(name="telefono")
    private String telefono;
     
    @Column(name="email")
    private String email;
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     
    public String toString(){
         
        return "Componentes: "+this.id+", "+this.nombre+", "+this.direccion+", "+this.telefono+", "+this.email;
    }
}