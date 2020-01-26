/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Juan Nebel
 */
public class Factura extends Recibo{
    private Cliente emisor;
    private TipoPago formaDePago;
    private Date fecha;
    private int idFactura;
    
    public Factura(List<Producto> productos, List<Servicio> servicios, float total, Cliente emisor,
            TipoPago formaDePago) {
        super(productos, servicios, total);
        this.emisor = emisor;
        this.formaDePago = formaDePago;
        this.fecha = new Date();
        this.idFactura= generarAleatorio();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int generarAleatorio(){
        return(int)(Math.random()*100+1);
    }
            
    public Cliente getEmisor() {
        return emisor;
    }

    public void setEmisor(Cliente emisor) {
        this.emisor = emisor;
    }

    public int getFormaDePago() {
        return formaDePago.getIdPago();
    }

    public void setFormaDePago(TipoPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Factura{" + "emisor=" + emisor + ", formaDePago=" + formaDePago + ", fecha=" + fecha +'}';
    }
    
    
}
