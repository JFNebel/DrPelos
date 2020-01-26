/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public PersonalDeCaja(String userName, String password, String email, int cedula) {
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
    Connection conectar;//
    PreparedStatement pst;
    ResultSet rs;
    public boolean agregarCliente(Cliente cliente){
        //Lógica para agregar un Cliente a la base de datos
        String sql = "INSERT INTO Cliente (cedula,nombre,correo,celular,telefono,direccion) VALUES (?,?,?,?,?,?)";


        try 
        {
        conectar = Conexion.getConexion();
        pst = conectar.prepareStatement(sql);
        
        pst.setInt(1,cliente.getCedula());
        pst.setString(2, cliente.getNombre()+" "+cliente.getApellido());
        pst.setString(3, cliente.getCorreo());
        pst.setString(4, cliente.getCelular());
        pst.setString(5, cliente.getTelefono());
        pst.setString(6, cliente.getDomicilio());
        
        int i = pst.executeUpdate();         
            
        if (i != 0)
        {    //visualiza
                //JOptionPane.showMessageDialog(null,"Los datos se han guardado satisfactoriamente");
                return true;
        }else{
            //visualiza
            //JOptionPane.showMessageDialog(null,"Error en la transaccion");
                return false;
        }
            
        }catch(SQLException e){            
            //para mostrar el error
            //JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    /** 
     * Llama a generarFactura y almacena esta factura en la base de datos
     * @param cotizacion
     * @param cliente
     * @param formaDePago
     */
    public boolean realizarVenta(Cotizacion cotizacion, Cliente cliente, TipoPago formaDePago){
        Factura factura = generarFactura(cotizacion, cliente, formaDePago);
        //Lógica para almacenar la factura en base de datos local
        String sql = "INSERT INTO Cliente (idFactura,fechaEmision,sucursal,cliente,usuarioEmisor,tipoPago,iva,total) VALUES (?,?,?,?,?,?,?,?)";
        try 
        {
        conectar = Conexion.getConexion();
        pst = conectar.prepareStatement(sql);
        
        pst.setInt(1,factura.getIdFactura());
        pst.setDate(2, (Date) factura.getFecha());
        pst.setInt(3, Sucursal.generarAleatorio());
        pst.setInt(4, cliente.getCedula());
        pst.setInt(5,this.getCedula());
        pst.setInt(6, formaDePago.getIdPago());
        pst.setInt(7, 12);
        pst.setInt(8, (int)(cotizacion.getTotal()));
        
        int i = pst.executeUpdate();         
            
        if (i != 0)
        {    //visualiza
                //JOptionPane.showMessageDialog(null,"Los datos se han guardado satisfactoriamente");
                return true;
        }else{
            //visualiza
            //JOptionPane.showMessageDialog(null,"Error en la transaccion");
                return false;
        }
            
        }catch(SQLException e){            
            //para mostrar el error
            //JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    /**
     * Retorna una factura usando una cotización previa, un cliente y su forma de pago
     * @param cotizacion
     * @param cliente
     * @param formaDePago
     * @return 
     */
    public Factura generarFactura(Cotizacion cotizacion, Cliente cliente, TipoPago formaDePago){
        return new Factura(cotizacion.getProductos(), cotizacion.getServicios(), cotizacion.getTotal(), cliente, formaDePago);
    }
    
    
    /**
     * Hace una consulta sobre una entrega a la base de datos por medio del id del recibo 
     * @param tabla
     * @param campo
     */
    public void consultarEntrega(String tabla,String campo){ 
        //TODO: Query a la base de datos
        String sql = "SELECT * FROM "+tabla+"WHERE clave= ?";

        try{
            conectar= Conexion.getConexion();
            pst = conectar.prepareStatement(sql);
            pst.setString(1,campo);
            rs = pst.executeQuery();
            
            if(rs.next()){
                //metodo para mostrar en la vista(rs.getCampo("id"))
                //asi para todos los campos que se quiera mostrar en la vista
            }
            
        }
        catch(SQLException e){            
        //para mostrar el error
            //JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e);
        }
    }
    
    
    /**
     * Hace una consulta sobre un traslado a la base de datos por medio del id del recibo
     * @param recibo 
     */
    public void consultarTraslado(Recibo recibo){
        // Query a la base de datos
        
    }
    
    /**
     * Hace una consulta sobre un producto a la base de datos por medio del nombre
     * @param nombre 
     */
    public void buscarProducto(String nombre){
        //Query a la base de datos
        String sql = "SELECT * FROM Producto WHERE clave= ?";

        try{
            conectar= Conexion.getConexion();
            pst = conectar.prepareStatement(sql);
            pst.setString(1,nombre);
            rs = pst.executeQuery();
            
            if(rs.next()){
                //metodo_para_mostrar_en_la_vista(rs.getCampo("id"))
                //asi para todos los campos que se quiera mostrar en la vista
            }
            
        }
        catch(SQLException e){            
        //para mostrar el error
            //JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e);
        }
    }
    
    /**
     * Hace una consulta sobre un servicio a la base de datos por medio del nombre
     * @param nombre 
     */
    public void buscarServicio(String nombre){
        //Lógica para buscar servicios
        String sql = "SELECT * FROM Servicio WHERE clave= ?";

        try{
            conectar= Conexion.getConexion();
            pst = conectar.prepareStatement(sql);
            pst.setString(1,nombre);
            rs = pst.executeQuery();
            
            if(rs.next()){
//                // segun el campo que se valla a mostrar
                //metodo para mostrar en la vista(rs.getCampo("id"))
                //asi para todos los campos que se quiera mostrar en la vista
            }
            
        }
        catch(SQLException e){            
        //para mostrar el error
            //JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "PersonalDeCaja{" + this.userName + '}';
    }
    
    
    
}
