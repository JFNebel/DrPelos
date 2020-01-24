/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Juan Nebel
 */
public class ADomicilio extends Entrega{
    private final List<Producto> productos;
    
    /**
     * Constructor de la clase
     * @param precio
     * @param descripcion
     * @param categoria
     * @param entregado
     * @param origen
     * @param destino 
     */
    public ADomicilio(float precio, String descripcion, String categoria, 
            boolean entregado, Sucursal origen, String destino) {
        super(precio, descripcion, categoria, entregado, origen, destino);
        this.productos = new ArrayList<>();
    }
    
    //Técnica de refactoring: encapsular colección
    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

    public void addProducto(Producto producto) {
         productos.add(producto);
    }
    
    public void removeProducto(Producto producto) {
         productos.remove(producto);
    }   
}
