/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Nebel
 */
public class Directivo extends Usuario {
    
    public Directivo(String userName, String password, String email, String cedula) {
        super(userName, password, email, cedula);
    }
    
    public void consultarCentralDatabase(){
        //TODO: lógica de consulta a la base de datos central
    }
    
    public void consultarLocalDatabase(){
        //TODO: lógica de consulta a la base de datos local
    }
    
    public void agregarUsuario(){
        //TODO: lógica para agregar a un nuevo empleado
    }
}
