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
    private Sucursal sucursal;
    
    public Administrador(String userName, String password, String email, String cedula, Sucursal sucursal) {
        super(userName, password, email, cedula);
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void solicitarProducto(){
        //TODO: Lógica de solicitud de producto
    }
    
    public void actualizarStock(){
        //TODO: Lógica de actualizar stock
    }
    
    public void gestionarLocalDatabase(){
        //TODO: Lógica de gestión
    }
    
    public void agregarUsuario(){
        //TODO: Lógica para añadir usuario
    }
    
}
