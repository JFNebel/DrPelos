/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JHONATAN1
 */
public class TipoPago {
    private int idPago;
    private String descripcionPago;

    public TipoPago(int idPago, String descripcionPago) {
        this.idPago = idPago;
        this.descripcionPago = descripcionPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getDescripcionPago() {
        return descripcionPago;
    }

    public void setDescripcionPago(String descripcionPago) {
        this.descripcionPago = descripcionPago;
    }
    
    
}
