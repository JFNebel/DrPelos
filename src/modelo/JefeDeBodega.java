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
    
    public JefeDeBodega(String userName, String password, String email, String cedula) {
        super(userName, password, email, cedula);
    }
    
    public void gestionarPrecios(){
        //TODO: Lógica de gestión
    }
    
    public void confirmarEntrega(){
        //TODO: Lógica de confirmación de entrega
    }
}
