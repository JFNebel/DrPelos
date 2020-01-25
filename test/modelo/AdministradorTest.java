/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Nebel
 */
public class AdministradorTest {
    HashMap<Producto, Integer> stock;
    Producto p2 = new Producto("leche", 4.01f, "describiendo producto","alimento");
    Administrador admin = new Administrador("Admin", "1234", "adsfdsa@hotmail.com", 12344);
    ArrayList<PersonalDeCaja> personalDeCaja = new ArrayList<>();
    List<Factura> transacciones = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Servicio> servicios = new ArrayList<>();
    List<Entrega> entregas = new ArrayList<>();
    
    /**
     * Test of addMascota method, of class Cliente.
     */
    @Test
    public void testSolicitarProducto() {
        stock = new HashMap();
        int valorInicialLeche = 3;
        stock.put(p2, valorInicialLeche);      
        LocalDataBase localDataBase = new LocalDataBase(stock, transacciones,clientes, entregas, servicios);
        Sucursal sucursal = new Sucursal(localDataBase, admin, personalDeCaja);
        admin.setSucursal(sucursal);
        

        int lechesAdicionales = 97;
        int result = 100; //97 leches mas 3 leches originales
        admin.solicitarProducto(p2, lechesAdicionales);
        
        assertTrue(result==localDataBase.getStock().get(p2));
        
  

    }
    
    
    /**
     * Test of addMascota method, of class Cliente.
     */
    @Test
    public void testActualizarStock() {
        stock = new HashMap();
        int valorInicialLeche = 100;
        stock.put(p2, valorInicialLeche);      
        LocalDataBase localDataBase = new LocalDataBase(stock, transacciones,clientes, entregas, servicios);
        Sucursal sucursal = new Sucursal(localDataBase, admin, personalDeCaja);
        admin.setSucursal(sucursal);
        

        int lechesARestar = -75;
        int result = 25; //97 leches mas 3 leches originales
        admin.actualizarStock(p2, lechesARestar);
        
        assertTrue(result==localDataBase.getStock().get(p2));
        


    }

    
    
}
