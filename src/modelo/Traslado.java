/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Juan Nebel
 */
public class Traslado extends Entrega{
    private final List<Mascota> mascotas;
    
    public Traslado(float precio, String descripcion, String categoria, 
            boolean entregado, Sucursal origen, String destino) {
        super(precio, descripcion, categoria, entregado, origen, destino);
        this.mascotas = new ArrayList<>();
    }
    
    //Técnica de refactoring: encapsular colección
    public List<Mascota> getMascotas() {
        return Collections.unmodifiableList(mascotas);
    }

    public void addMascota(Mascota mascota) {
         mascotas.add(mascota);
    }
    
    public void removeMascota(Mascota mascota) {
         mascotas.remove(mascota);
    }
    
}
