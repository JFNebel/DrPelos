/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Nebel
 */
public class ClienteTest {
    

    /**
     * Test of addMascota method, of class Cliente.
     */
    @Test
    public void testAddMascota() {
        System.out.println("testAddMascota");
        ArrayList<Mascota> mascT = new ArrayList<>();
        Cliente cliente = new Cliente("Cliente1", "1234", "adsfdsa@hotmail.com", "asdfas");        
        Mascota masc1 = new Mascota( "Tai", "Siamés", cliente, true);
        Mascota masc2 = new Mascota( "Luna", "Molestia", cliente, false);
        Mascota masc3 = new Mascota( "Vitruvio", "Negro", cliente, true);
        
        mascT.add(masc1);
        mascT.add(masc2);
        mascT.add(masc3);
        
        cliente.addMascota(masc1);
        cliente.addMascota(masc2);
        cliente.addMascota(masc3);
        
        assertEquals(mascT, cliente.getMascotas());
    }

    /**
     * Test of removeMascota method, of class Cliente.
     */
    @Test
    public void testRemoveMascota() {
        System.out.println("testRemoveMascota");
        ArrayList<Mascota> mascT = new ArrayList<>();
        Cliente cliente = new Cliente("Cliente1", "1234", "adsfdsa@hotmail.com", "asdfas");        
        Mascota masc1 = new Mascota( "Tai", "Siamés", cliente, true);
        Mascota masc2 = new Mascota( "Luna", "Molestia", cliente, false);
        Mascota masc3 = new Mascota( "Vitruvio", "Negro", cliente, true);
        
        mascT.add(masc1);
        mascT.add(masc3);
        
        cliente.addMascota(masc1);
        cliente.addMascota(masc2);
        cliente.addMascota(masc3);
        
        cliente.removeMascota(masc2);
        
        assertEquals(mascT, cliente.getMascotas());
    }
    
}
