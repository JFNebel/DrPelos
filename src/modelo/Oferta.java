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
public abstract class Oferta {
    protected float precio;
    protected String descripcion;
    protected String categoria;

    
    
    
    /**
     * Constructor de la clase
     * @param nombre
     * @param precio
     * @param descripcion
     * @param categoria 
     */
    public Oferta(float precio, String descripcion, String categoria) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
    
    //Setters & Getters
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
