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
public class Traslado {
    private Recibo recibo;
    private boolean trasladado;
    private Sucursal origen; 
    private String destino;
    private Mascota mascota;

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public boolean isTrasladado() {
        return trasladado;
    }

    public void setTrasladado(boolean trasladado) {
        this.trasladado = trasladado;
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

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    
    
}
