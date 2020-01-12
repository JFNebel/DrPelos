/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**Revisar que los setters y getters sí sean necesarios una vez ya avanzado el programa
 *
 * @author Juan Nebel
 */
public class Sucursal {
    private LocalDataBase localDataBase;
    private Administrador administrador;
    private List<PersonalDeCaja> personalDeCaja;

    public LocalDataBase getLocalDataBase() {
        return localDataBase;
    }

    public void setLocalDataBase(LocalDataBase localDataBase) {
        this.localDataBase = localDataBase;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public List<PersonalDeCaja> getPersonalDeCaja() {
        return personalDeCaja;
    }

    public void setPersonalDeCaja(List<PersonalDeCaja> personalDeCaja) {
        this.personalDeCaja = personalDeCaja;
    }
    
    
    
}
