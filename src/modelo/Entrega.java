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
public class Entrega extends Servicio{
    private boolean entregado;
    private Sucursal origen; 
    private String destino;

    /**
     * Constructor de la clase
     * @param precio
     * @param descripcion
     * @param categoria
     * @param entregado
     * @param origen
     * @param destino 
     */
    public Entrega(float precio, String descripcion, String categoria, 
            boolean entregado, Sucursal origen, String destino) {
        super(precio, descripcion, categoria);
        this.entregado = entregado;
        this.origen = origen;
        this.destino = destino;
    }

    //Setters & Getters
    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Sucursal getOrigen() {
        return origen;
    }

    public void setOrigen(Sucursal origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
    
    
    
    
}
