/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drpelos;

import java.util.ArrayList;
import modelo.ADomicilio;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Cotizacion;
import modelo.Entrega;
import modelo.Factura;
import modelo.LocalDataBase;
import modelo.Mascota;
import modelo.PersonalDeCaja;
import modelo.Producto;
import modelo.Oferta;
import modelo.Sucursal;
import modelo.Traslado;

/**
 *
 * @author Juan Nebel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    }
    
}













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

//        //Pruebas sobre la clase cliente
//        ArrayList<Mascota> mascotas = new ArrayList<>();
//        Cliente cliente = new Cliente("Cliente1", "1234", "adsfdsa@hotmail.com", "asdfas", mascotas);
//        
//        System.out.println("Print de las mascotas vacias: ");
//        for(Mascota m : cliente.getMascotas()){
//            System.out.println(m);
//        }
//        
//        Mascota masc1 = new Mascota( "Tai", "Siamés", cliente, true);
//        Mascota masc2 = new Mascota( "Luna", "Molestia", cliente, false);
//        Mascota masc3 = new Mascota( "Vitruvio", "Negro", cliente, true);
//        
//        cliente.addMascota(masc1);
//        cliente.addMascota(masc2);
//        cliente.addMascota(masc3);
//  
//
//        System.out.println("Print de las 3 mascotas: ");
//        for(Mascota m : cliente.getMascotas()){
//            System.out.println(m);
//        }
//        
//        cliente.removeMascota(masc2);
//        System.out.println("Print después de remover a Luna");
//     
//        
//        for(Mascota m : cliente.getMascotas()){
//            System.out.println(m);
//        }


//        Prueba de entrega
//        LocalDataBase localDataBase = new LocalDataBase();
//        PersonalDeCaja removible = new PersonalDeCaja("OdioPuro", "1234", "adsfdsa@hotmail.com", "asdfas");
//        PersonalDeCaja noEsta = new PersonalDeCaja("holi", "1234", "adsfdsa@hotmail.com", "asdfas");
//        Administrador admin = new Administrador("Admin", "1234", "adsfdsa@hotmail.com", "asdfas");
//        ArrayList<PersonalDeCaja> personalDeCaja = new ArrayList<>();
//        personalDeCaja.add(new PersonalDeCaja("Juanito", "1234", "adsfdsa@hotmail.com", "asdfas")); 
//        personalDeCaja.add(new PersonalDeCaja("Mengano", "1234", "adsfdsa@hotmail.com", "asdfas")); 
//        personalDeCaja.add(new PersonalDeCaja("ByronChaMadre", "1234", "adsfdsa@hotmail.com", "asdfas")); 
//        personalDeCaja.add(new PersonalDeCaja("Batusai", "1234", "adsfdsa@hotmail.com", "asdfas")); 
//        personalDeCaja.add(removible); 
//       
//        Sucursal sucursal = new Sucursal(localDataBase, admin, personalDeCaja);
//        Entrega ent1 = new Entrega(123.43f,  "no tocar la puerta, tocar el timbre", "Servicios especiales", 
//             true, sucursal,  "Casa de juanito");
//        
//        System.out.println("Probando obtener campos de clases padres: ");
//        System.out.println(ent1.getDescripcion());
//        
//             
//        
//        //Pruebas de ADomicilio
//        ADomicilio dom1 = new ADomicilio(250.43f,  "Llamenme al cel, mi timbre no funciona", "Servicios especiales", 
//             true, sucursal,  "Casa de menganito que compro productos");
//        Producto p1 = new Producto("Chocolate", 5.99f, "describiendo producto","alimento");
//        Producto p2 = new Producto("Leche", 7.99f, "describiendo producto","alimento");
//        dom1.addProducto(p1);
//        dom1.addProducto(p2);
//        
//        for(Producto p : dom1.getProductos()){
//            System.out.println(p);
//        }
//        
//        System.out.println("Removiendo leche");
//        dom1.removeProducto(p2);
//        
//        for(Producto p : dom1.getProductos()){
//            System.out.println(p);
//        }
//        
//        
//        
//        //Pruebas de traslado
//        Traslado tras1 = new Traslado(250.43f,  "Cuiden a mi mascota por favor", "Servicios veterinarios", 
//             true, sucursal,  "Casa de lolita que nos encargó a su gato");
//        Cliente cliente = new Cliente("Cliente1", "1234", "adsfdsa@hotmail.com", "asdfas");
//        Mascota masc1 = new Mascota( "Tai", "Siamés", cliente, true);
//        Mascota masc2 = new Mascota( "Luna", "Molestia", cliente, false);
//        Mascota masc3 = new Mascota( "Vitruvio", "Negro", cliente, true);
//        
//        tras1.addMascota(masc1);
//        tras1.addMascota(masc2);
//        tras1.addMascota(masc3);
//        
//        
//        for(Mascota m : tras1.getMascotas()){
//            System.out.println(m);
//        }
//        
//        System.out.println("Removiendo Luna");
//        tras1.removeMascota(masc2);
//        
//        for(Mascota m : tras1.getMascotas()){
//            System.out.println(m);
//        }