/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Collections;
import java.util.List;

/** Esta clase peca de primitive obsesion, hacer un refractoring para arreglar
 *
 * @author Juan Nebel
 */
public abstract class Recibo {
    protected List<Producto> productos;
    protected List<Servicio> servicios;
    protected float total;

    public Recibo(List<Producto> productos, List<Servicio> servicios, float total) {
        this.productos = productos;
        this.servicios = servicios;
        this.total = total;
    }

    
    
    //Técnica de refactoring: encapsular colecciónes
    public List<Servicio> getServicios() {
        return Collections.unmodifiableList(servicios);
    }

    public void addServicio(Servicio servicio) {
         servicios.add(servicio);
    }
    
    public void removeServicio(Servicio servicio) {
         servicios.remove(servicio);
    }
    
    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

    public void addProducto(Producto producto) {
         productos.add(producto);
    }
    
    public void removeProducto(Producto producto) {
         productos.remove(producto);
    }
    
    
    
    //Setters & Getters
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
}
