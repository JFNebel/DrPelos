/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drpelos;

import java.util.ArrayList;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Cotizacion;
import modelo.Factura;
import modelo.LocalDataBase;
import modelo.Mascota;
import modelo.PersonalDeCaja;
import modelo.Producto;
import modelo.Oferta;
import modelo.Sucursal;

/**
 *
 * @author Juan Nebel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
        //Prueba de PersonalDeCaja
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Oferta> servicios = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        productos.add(new Producto("Chocolate", 5.99f, "describiendo producto","alimento"));
        productos.add(new Producto("leche", 4.01f, "describiendo producto","alimento"));
        PersonalDeCaja pers = new PersonalDeCaja("Personita de caja", "1234", "adsfdsa@hotmail.com", "asdfas");
        Cliente cliente = new Cliente("Cliente1", "1234", "adsfdsa@hotmail.com", "asdfas", mascotas);
        System.out.println(pers);
        
        Cotizacion coti = pers.generarCotización(productos, servicios);
        System.out.println(coti);
        
        
        Factura fact = pers.generarFactura(coti, cliente, "efectivo");
        System.out.println(fact);
        **/
        
        
        
        /**
        //Prueba de protected:
        Administrador admin = new Administrador("Admin", "1234", "adsfdsa@hotmail.com", "asdfas");
        System.out.println(admin.getUserName());
        **/
        
        
        
        /**
        //Prueba de Sucursal
        LocalDataBase localDataBase = new LocalDataBase();
        PersonalDeCaja removible = new PersonalDeCaja("OdioPuro", "1234", "adsfdsa@hotmail.com", "asdfas");
        PersonalDeCaja noEsta = new PersonalDeCaja("holi", "1234", "adsfdsa@hotmail.com", "asdfas");
        Administrador admin = new Administrador("Admin", "1234", "adsfdsa@hotmail.com", "asdfas");
        ArrayList<PersonalDeCaja> personalDeCaja = new ArrayList<>();
        personalDeCaja.add(new PersonalDeCaja("Juanito", "1234", "adsfdsa@hotmail.com", "asdfas")); 
        personalDeCaja.add(new PersonalDeCaja("Mengano", "1234", "adsfdsa@hotmail.com", "asdfas")); 
        personalDeCaja.add(new PersonalDeCaja("ByronChaMadre", "1234", "adsfdsa@hotmail.com", "asdfas")); 
        personalDeCaja.add(new PersonalDeCaja("Batusai", "1234", "adsfdsa@hotmail.com", "asdfas")); 
        personalDeCaja.add(removible); 
       
        Sucursal sucursal = new Sucursal(localDataBase, admin, personalDeCaja);
        
        //Intento de cambio
        sucursal.addPersonalDeCaja(new PersonalDeCaja("Novato", "1234", "adsfdsa@hotmail.com", "asdfas"));
        
        //Acceso al personal
        for(PersonalDeCaja p : sucursal.getPersonalDeCaja()){
            System.out.println(p);
        }
        
        System.out.println("Luego de la removida: ");
        System.out.println("");
        
        sucursal.removePersonalDeCaja(removible);
        sucursal.removePersonalDeCaja(noEsta);
        sucursal.removePersonalDeCaja(removible);
        
        for(PersonalDeCaja p : sucursal.getPersonalDeCaja()){
            System.out.println(p);
        }
        
        //Si necesitas remover de manera más específica hacer un equals
       **/
    }
    
}
