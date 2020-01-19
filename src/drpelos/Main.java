/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drpelos;

import java.util.ArrayList;
import modelo.Administrador;
import modelo.LocalDataBase;
import modelo.PersonalDeCaja;
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
        
    }
    
}
