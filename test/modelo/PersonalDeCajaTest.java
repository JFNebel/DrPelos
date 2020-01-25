/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Nebel
 */
public class PersonalDeCajaTest {
    
    /**
     * Test of generarCotización method, of class PersonalDeCaja.
     */
    @Test
    public void testGenerarCotización() {
        System.out.println("testGenerarCotización");
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Servicio> servicios = new ArrayList<>();
        productos.add(new Producto("Chocolate", 5.99f, "describiendo producto","alimento"));
        productos.add(new Producto("leche", 4.01f, "describiendo producto","alimento"));
        PersonalDeCaja pers = new PersonalDeCaja("Personita de caja", "1234", "adsfdsa@hotmail.com", 9324);
        Cotizacion result = pers.generarCotización(productos, servicios);
        assertNotNull(result);
    }

    
    /**
     * Test of generarFactura method, of class PersonalDeCaja.
     */
    @Test
    public void testGenerarFactura(){
        System.out.println("testGenerarFactura");
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Servicio> servicios = new ArrayList<>();
        productos.add(new Producto("Chocolate", 5.99f, "describiendo producto","alimento"));
        productos.add(new Producto("leche", 4.01f, "describiendo producto","alimento"));
        PersonalDeCaja pers = new PersonalDeCaja("Personita de caja", "1234", "adsfdsa@hotmail.com", 5490);
        Cotizacion cotizacion = pers.generarCotización(productos, servicios);
        TipoPago formaDePago = new TipoPago(1,"Efectivo") ;
         Cliente cliente = new Cliente("Cliente1", "Santana",950,"villa del rey", "adsfdsa@hotmail.com","0926378864","0930229");
        Factura result = pers.generarFactura(cotizacion, cliente, formaDePago);
        assertNotNull(result);
    }
    
    
    /**
     * Test of realizarVenta method, of class PersonalDeCaja.
     */
    @Test
    public void testRealizarVenta() {
        // TODO: Crear prueba unitaria cuando exista conectividad
    }

    

    
    /**
     * Test of agregarCliente method, of class PersonalDeCaja.
     */
    @Test
    public void testAgregarCliente() {
        // TODO: Crear prueba unitaria cuando exista conectividad
    }
    
    
    /**
     * Test of consultarEntrega method, of class PersonalDeCaja.
     */
    @Test
    public void testConsultarEntrega() {
        // TODO: Crear prueba unitaria cuando exista conectividad
    }

    /**
     * Test of consultarTraslado method, of class PersonalDeCaja.
     */
    @Test
    public void testConsultarTraslado() {
        // TODO: Crear prueba unitaria cuando exista conectividad
    }

    /**
     * Test of buscarProducto method, of class PersonalDeCaja.
     */
    @Test
    public void testBuscarProducto() {
        // TODO: Crear prueba unitaria cuando exista conectividad
    }

    /**
     * Test of buscarServicio method, of class PersonalDeCaja.
     */
    @Test
    public void testBuscarServicio() {
        // TODO: Crear prueba unitaria cuando exista conectividad
    }
    
    
}
