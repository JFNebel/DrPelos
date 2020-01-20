/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.Random;

/** Esta clase peca de primitive obsesion, hacer un refractoring para arreglar
 *
 * @author Juan Nebel
 */
public abstract class Recibo {
    protected int id;
    protected List<Producto> productos;
    protected List<Oferta> servicios;
    protected float total;

    public Recibo(List<Producto> productos, List<Oferta> servicios, float total) {
        Random rand = new Random();
        id = rand.nextInt(1000000);
        this.id = id;
        this.productos = productos;
        this.servicios = servicios;
        this.total = total;
    }

    
    
    
    //Setters & Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Oferta> getServicios() {
        return servicios;
    }

    public void setServicios(List<Oferta> servicios) {
        this.servicios = servicios;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
}
