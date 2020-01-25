/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorCaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PersonalDeCaja;
import modelo.Cliente;
import vista.PersonalDeCaja.AggCliente;

/**
 *
 * @author Familia
 */
public class ControladorAggCliente implements ActionListener {
    private AggCliente view;
    private PersonalDeCaja personal;
    public ControladorAggCliente(AggCliente view) {
        this.view = view;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     String nombre=this.view.jTextField1.getText();
     String apellido=this.view.jTextField2.getText();
     String direccion=this.view.jTextField3.getText();
     String cedula=this.view.jTextField4.getText();
     boolean noVacio=!(nombre.isEmpty() && apellido.isEmpty() && direccion.isEmpty() && cedula.isEmpty());
     if(noVacio)
     {
         //llamar agregarcliente de la clase personaldecaja
         personal.agregarCliente(new Cliente(nombre,apellido,cedula,direccion));
    }
    
    
    
    
}
}
