/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorCaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
     
     boolean noVacio=!(this.view.jTextField1.getText().isEmpty() && this.view.jTextField2.getText().isEmpty() && this.view.jTextField3.getText().isEmpty() && this.view.jTextField4.getText().isEmpty()
             && this.view.jTextField5.getText().isEmpty() && this.view.jTextField6.getText().isEmpty() && this.view.jTextField7.getText().isEmpty());
     if(noVacio)
     {
       try {
         String nombre=this.view.jTextField1.getText();
         String apellido=this.view.jTextField2.getText();
         String direccion=this.view.jTextField3.getText();
         int cedula=Integer.parseInt(this.view.jTextField4.getText());
         String correo=this.view.jTextField5.getText();
         String celular=this.view.jTextField6.getText();
         String telefono=this.view.jTextField7.getText();
         
         personal.agregarCliente(new Cliente(nombre,apellido,cedula,direccion,correo,celular,telefono));
       }
       catch(Exception e) {
         JOptionPane.showMessageDialog(null,"Ingreso incorrecto de datos");
       }

         
         
         //llamar agregarcliente de la clase personaldecaja
         //falta agregar barras a la vista
         //personal.agregarCliente(new Cliente(nombre,apellido,cedula,direccion));
    }
    
    
    
    
}
}
