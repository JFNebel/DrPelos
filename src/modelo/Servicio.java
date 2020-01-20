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
public class Servicio extends Oferta{
    
    /**
     * Constructor de la clase Servicio
     * @param nombre
     * @param precio
     * @param descripcion
     * @param categoria 
     */
    public Servicio(String nombre, float precio, String descripcion, String categoria) {
        super(nombre, precio, descripcion, categoria);
    }
    
}
