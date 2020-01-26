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
import modelo.MetodosConexion;
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
     
     boolean noVacio=!(this.view.txtnombre.getText().isEmpty() && this.view.txtapellido.getText().isEmpty() && this.view.txtdireccion.getText().isEmpty() && this.view.txtcedula.getText().isEmpty()
             && this.view.txtcorreo.getText().isEmpty() && this.view.txtcelular.getText().isEmpty() && this.view.txtelefono.getText().isEmpty());
     if(noVacio)
     {
       try {
         String nombre=this.view.txtnombre.getText();
         String apellido=this.view.txtapellido.getText();
         String direccion=this.view.txtdireccion.getText();
         int cedula=Integer.parseInt(this.view.txtcedula.getText());
         String correo=this.view.txtcorreo.getText();
         String celular=this.view.txtcelular.getText();
         String telefono=this.view.txtelefono.getText();
         
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
