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
    private String formaDePago;
    private Date fecha;
    
    public Factura(List<Producto> productos, List<Servicio> servicios, float total, Cliente emisor,
            String formaDePago) {
        super(productos, servicios, total);
        this.emisor = emisor;
        this.formaDePago = formaDePago;
        this.fecha = new Date();
        
    }

    public Cliente getEmisor() {
        return emisor;
    }

    public void setEmisor(Cliente emisor) {
        this.emisor = emisor;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
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
