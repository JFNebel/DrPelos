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
public abstract class Usuario {
    protected String userName;
    protected String password;
    protected String email;
    protected String cedula;

    public Usuario(String userName, String password, String email, String cedula) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.cedula = cedula;
    }
    
    
}
