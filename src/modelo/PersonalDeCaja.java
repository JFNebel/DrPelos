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
    
    
    /**Recibe una lista de productos y servicios y retorna una cotización
     * Debe poder recibir un cliento y tanto un productos como un servicios
     * @param productos
     * @param servicios
     * @return 
     */
    public Cotizacion generarCotización(List<Producto> productos, List<Servicio> servicios){
        float total = 0;
        for(Producto p : productos){
            total = total + p.getPrecio();
        }
        for(Servicio s : servicios){
            total = total + s.getPrecio();
        }
        return new Cotizacion(productos, servicios, total);
    }
     
    /**
     * Obedece al literal 8
     * @param cliente 
     */
    public void agregarCliente(Cliente cliente){
        //TODO: Lógica para agregar un Cliente a la base de datos
        
    }
    
    /** 
     * Llama a generarFactura y almacena esta factura en la base de datos
     * @param cotizacion
     * @param cliente
     * @param formaDePago
     */
    public void realizarVenta(Cotizacion cotizacion, Cliente cliente, String formaDePago){
        Factura factura = generarFactura(cotizacion, cliente, formaDePago);
        //TODO: Lógica para almacenar la factura en base de datos local
    }
    
    /**
     * Retorna una factura usando una cotización previa, un cliente y su forma de pago
     * @param cotizacion
     * @param cliente
     * @param formaDePago
     * @return 
     */
    public Factura generarFactura(Cotizacion cotizacion, Cliente cliente, String formaDePago){
        return new Factura(cotizacion.getProductos(), cotizacion.getServicios(), cotizacion.getTotal(), cliente, formaDePago);
    }
    
    
    /**
     * Hace una consulta sobre una entrega a la base de datos por medio del id del recibo
     * @param recibo 
     */
    public void consultarEntrega(Recibo recibo){
        
        //TODO: Query a la base de datos
    }
    
    
    /**
     * Hace una consulta sobre un traslado a la base de datos por medio del id del recibo
     * @param recibo 
     */
    public void consultarTraslado(Recibo recibo){
        //TODO: Query a la base de datos
    }
    
    /**
     * Hace una consulta sobre un producto a la base de datos por medio del nombre
     * @param nombre 
     */
    public void buscarProducto(String nombre){
        //TODO: Query a la base de datos
    }
    
    /**
     * Hace una consulta sobre un servicio a la base de datos por medio del nombre
     * @param nombre 
     */
    public void buscarServicio(String nombre){
        //TODO: Lógica para buscar servicios
    }

    @Override
    public String toString() {
        return "PersonalDeCaja{" + this.userName + '}';
    }
    
    
}
