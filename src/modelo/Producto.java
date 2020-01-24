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
public class Producto extends Oferta{
    private String nombre;


    /**
     * Constructor de la clase producto
     * @param nombre
     * @param precio
     * @param descripcion
     * @param categoria 
     */
    public Producto(String nombre, float precio, String descripcion, String categoria) {
        super(precio, descripcion, categoria);
        this.nombre = nombre;
    }
    
    
    //Setters & Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * toString() method
     * @return 
     */
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + '}';
    }
    
    
    

    
}
