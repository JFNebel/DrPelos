/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Juan Nebel
 */
public class Sucursal {
    private LocalDataBase localDataBase;
    private Administrador administrador;
    private final List<PersonalDeCaja> personalDeCaja;

    /**
     * Constructor de la clase
     * @param localDataBase
     * @param administrador
     * @param personalDeCaja 
     */
    public Sucursal(LocalDataBase localDataBase, Administrador administrador, List<PersonalDeCaja> personalDeCaja) {
        this.localDataBase = localDataBase;
        this.administrador = administrador;
        this.personalDeCaja = personalDeCaja;
    }
    
    

    //Técnica de refactoring: encapsular colección
    public List<PersonalDeCaja> getPersonalDeCaja() {
        return Collections.unmodifiableList(personalDeCaja);
    }

    public void addPersonalDeCaja(PersonalDeCaja persona) {
         personalDeCaja.add(persona);
    }
    
    public void removePersonalDeCaja(PersonalDeCaja persona) {
         personalDeCaja.remove(persona);
    }
    
    
    
    
    //Setters & Getters
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
  
}
