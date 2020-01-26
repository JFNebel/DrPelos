/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Juan Nebel
 */
public class LocalDataBase {
    private final Map<Producto, Integer> stock; //Mapa de productos y su cantidad
    private final List<Factura> transacciones;
    private final List<Cliente> clientes;
    private final List<Entrega> entregas;
    private final List<Servicio> servicios;

    public LocalDataBase(HashMap<Producto, Integer> stock, List<Factura> transacciones, 
            List<Cliente> clientes, List<Entrega> entregas, List<Servicio> servicios) {
        this.stock = stock;
        this.transacciones = transacciones;
        this.clientes = clientes;
        this.entregas = entregas;
        this.servicios = servicios;
    }

    

   
    
    //Técnica de encapsulamiento de HashMap
    public Map<Producto, Integer> getStock() {
        return stock;
    }
    public void addProducto(Producto producto, int cantidad) {
        if(stock.containsKey(producto))          
            stock.replace(producto, stock.get(producto)+ cantidad);
        else
            stock.put(producto, cantidad);
    }
    public void removeProducto(Producto producto) {
         stock.remove(producto);
    }
    
    
    //Técnica de encapsulamiento de listas
    public List<Factura> getTransacciones() {
        return Collections.unmodifiableList(transacciones);
    }
    public void addMascota(Factura factura) {
         transacciones.add(factura);
    }
    public void removeMascota(Factura factura) {
         transacciones.remove(factura);
    }
    
    //Técnica de encapsulamiento de listas
    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }
    public void addCliente(Cliente cliente) {
         clientes.add(cliente);
    }
    public void removeCliente(Cliente cliente) {
         clientes.remove(cliente);
    }
    
     
    //Técnica de encapsulamiento de listas
   public List<Entrega> getEntregas() {
        return Collections.unmodifiableList(entregas);
    }
    public void addEntrega(Entrega entrega) {
         entregas.add(entrega);
    }
    public void removeEntrega(Entrega entrega) {
         entregas.remove(entrega);
    }
    
    //Técnica de encapsulamiento de listas
   public List<Servicio> getServicios() {
        return Collections.unmodifiableList(servicios);
    }

    public void addServicio(Servicio servicio) {
         servicios.add(servicio);
    }
    
    public void removeServicio(Servicio servicio) {
         servicios.remove(servicio);
    }
    
}
