/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/** OJO, chequear el caso de BLAOTING para clases muy extensas (muchos métodos)
 * Es posible que sea necesario hacer otra clase o una interfaz
 * @author Juan Nebel
 */
public class PersonalDeCaja extends Usuario{
    
    public PersonalDeCaja(String userName, String password, String email, String cedula) {
        super(userName, password, email, cedula);
    }
    
    public void generarRecibo(){
        //TODO: Lógica para generar un recibo
    }
    
    public void realizarVenta(){
        //TODO: Lógica para realizar una venta
    }
    
    public void agregarCliente(){
        //TODO: Lógica para agregar un Cliente
    }
    
    public void consultarEntrega(){
        //TODO: Lógica para consultar entregas
    }
    
    
    
    public void consultarTraslado(){
        //TODO: Lógica para consultar traslados
    }
    
    public void buscarProducto(){
        //TODO: Lógica para buscar productos
    }
    
    public void buscarServicio(){
        //TODO: Lógica para buscar servicios
    }

    @Override
    public String toString() {
        return "PersonalDeCaja{" + this.userName + '}';
    }
    
    
}
