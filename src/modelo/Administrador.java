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
    
    /**
     * Constructor de la clase
     * @param userName
     * @param password
     * @param email
     * @param cedula 
     */
    public Administrador(String userName, String password, String email, String cedula) {
        super(userName, password, email, cedula);
    }

    
    /**
     * Obedece al literal 13
     * @param nombre
     * @param cantidad
     */
    public void solicitarProducto(String nombre, int cantidad){
        //TODO:
        /** En caso de no tener el producto debo añadirlo a la lista de productos
         *  En caso de tener el producto registrado en stock, aumentar la cantidad 
         */
    }
    
    /**
     * Obedece al literal 13
     * @param nombre
     * @param cantidad
     */
    public void actualizarStock(String nombre, int cantidad){
        //TODO:
        /** Aquí debe haber un patrón de diseño
         * Debo poder aumentar y disminuir cantidad de un producto
         */
    }
    
    
    //Funcionalidades a ser añadidas en actualizaciones futuras
    public void gestionarLocalDatabase(){
        //TODO: Funcionalidad en construcción
    }
    
    public void agregarUsuario(){
        //TODO: Funcionalidad en construcción
    }
    
}
