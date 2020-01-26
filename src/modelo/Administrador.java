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
public class Administrador extends Usuario {
    Sucursal sucursal;
    
    /**
     * Constructor de la clase
     * @param userName
     * @param password
     * @param email
     * @param cedula 
     */
    public Administrador(String userName, String password, String email, int cedula) {
        super(userName, password, email, cedula);
    }

    
    /**
     * Método que permite aumentar una cantidad determinada de un producto en el stock local
     * @param producto
     * @param cantidad
     */
    public void solicitarProducto(Producto producto, int cantidad){
        sucursal.getLocalDataBase().addProducto(producto, cantidad); //El método add producto hace la validación de si está o no en la localDatabase
    }
    
    /**
     * Método que permite modificar la cantidad disponible de un producto (actualiza)
     * @param producto
     * @param cantidad
     */
    public void actualizarStock(Producto producto, int cantidad){
        sucursal.getLocalDataBase().addProducto(producto, cantidad);        
    }

    //Setters & Getters
    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
    //Funcionalidades a ser añadidas en actualizaciones futuras (el documento no pide su implementación)
    public void gestionarLocalDatabase(){
        //Funcionalidad en construcción
    }
    
    public void agregarUsuario(){
        // Funcionalidad en construcción
    }
    
    
}
