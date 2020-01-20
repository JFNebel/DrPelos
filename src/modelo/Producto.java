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


    /**
     * Constructor de la clase producto
     * @param nombre
     * @param precio
     * @param descripcion
     * @param categoria 
     */
    public Producto(String nombre, float precio, String descripcion, String categoria) {
        super(nombre, precio, descripcion, categoria);
    }

    
}
