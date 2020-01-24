/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Juan Nebel
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String domicilio;
    private final List<Mascota> mascotas;

    /**
     * Constructor de la clase Cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param domicilio
     */
    public Cliente(String nombre, String apellido, String cedula, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.domicilio = domicilio;
        this.mascotas = new ArrayList<>();
    }

    
    //Técnica de refactoring: encapsular colección
    public List<Mascota> getMascotas() {
        return Collections.unmodifiableList(mascotas);
    }

    public void addMascota(Mascota mascota) {
         mascotas.add(mascota);
    }
    
    public void removeMascota(Mascota mascota) {
         mascotas.remove(mascota);
    }
    
    
    
    //Setters & Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", domicilio=" + domicilio + ", mascotas=" + mascotas + '}';
    }
    
    
    
}
