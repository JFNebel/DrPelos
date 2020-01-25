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
    private int cedula;
    private String domicilio;
    private final List<Mascota> mascotas;
    private String correo;
    private String celular;
    private String telefono;

    /**
     * Constructor de la clase Cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param domicilio
     */
    public Cliente(String nombre, String apellido, int cedula, String domicilio, String correo, String celular, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.domicilio = domicilio;
        this.mascotas = new ArrayList<>();
        this.correo= correo;
        this.telefono=telefono;
        this.celular= celular;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
