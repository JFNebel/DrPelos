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
public class JefeDeBodega extends Usuario{
    
    /**
     * Constructor de la clase
     * @param userName
     * @param password
     * @param email
     * @param cedula 
     */
    public JefeDeBodega(String userName, String password, String email, String cedula) {
        super(userName, password, email, cedula);
    }
    
    //Funcionalidades a ser añadidas en actualizaciones futuras
    public void gestionarPrecios(){
        //TODO: Funcionalidad en construcción
    }
    
    public void confirmarEntrega(){
        //TODO: Funcionalidad en construcción
    }
}
