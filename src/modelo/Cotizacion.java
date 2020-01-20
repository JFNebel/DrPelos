/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Juan Nebel
 */
public class Cotizacion extends Recibo{
    
    public Cotizacion(List<Producto> productos, List<Servicio> servicios, float total) {
        super(productos, servicios, total);
    }
    
    
    
}
