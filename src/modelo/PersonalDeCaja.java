/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/** OJO, chequear el caso de BLAOTING para clases muy extensas (muchos métodos)
 * Es posible que sea necesario hacer otra clase o una interfaz
 * @author Juan Nebel
 */
public class PersonalDeCaja extends Usuario{
    
    /**
     * Constructor de la clase
     * @param userName
     * @param password
     * @param email
     * @param cedula 
     */
    public PersonalDeCaja(String userName, String password, String email, String cedula) {
        super(userName, password, email, cedula);
    }
    
    /**
     * Obedece al literal 8
     * @param cliente 
     */
    public void agregarCliente(Cliente cliente){
        //TODO: Lógica para agregar un Cliente a la base de datos
    }
    
    /**
     * Debe poder recibir un cliento y tanto un productos como un servicios
     * @param cliente
     * @param productos
     * @param servicios
     */
    public void generarCotización(Cliente cliente, List<Producto> productos, List<Servicio> servicios){
        //TODO: Lógica para generar un recibo
    }
    
    
    
    
    /**
     * genera un recibo y
     * Almacena el recibo en la base de datos
     */
    public void realizarVenta(){
        //TODO: Lógica para realizar una venta
    }
    
    public void generarRecibo(){
        //TODO: Lógica para generar un recibo
    }
    
    public void consultarEntrega(){
        //TODO: Lógica para consultar entregas
    }
    
    
    
    public void consultarTraslado(){
        //TODO: Query a la base de datos
    }
    
    public void buscarProducto(String nombre){
        //TODO: Query a la base de datos
    }
    
    public void buscarServicio(){
        //TODO: Lógica para buscar servicios
    }

    @Override
    public String toString() {
        return "PersonalDeCaja{" + this.userName + '}';
    }
    
    
}
