/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Nebel
 */
public class Mascota {
    private String nombre;
    private String raza;
    private Cliente dueno;
    private boolean transportable;

    /**
     * Constructor de la clase
     * @param nombre
     * @param raza
     * @param dueno
     * @param transportable 
     */
    public Mascota(String nombre, String raza, Cliente dueno, boolean transportable) {
        this.nombre = nombre;
        this.raza = raza;
        this.dueno = dueno;
        this.transportable = transportable;
    }

    
    //Setters & Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    public boolean isTransportable() {
        return transportable;
    }

    public void setTransportable(boolean transportable) {
        this.transportable = transportable;
    }

    /**
     * Metodo toString(), no colocar el dueño para evitar 
     * @return 
     */
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", raza=" + raza + ", transportable=" + transportable + '}';
    }

    

    
    
    
    
    
    
}
