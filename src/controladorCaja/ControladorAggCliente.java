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

    private final AggCliente view;
    private PersonalDeCaja personal;

    public ControladorAggCliente(AggCliente view) {
        this.view = view;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        boolean noVacio = !(this.view.getTxtnombre().isEmpty() && this.view.getTxtapellido().isEmpty() && this.view.getTxtdireccion().isEmpty() && this.view.getTxtcedula().isEmpty()
                && this.view.getTxtcorreo().isEmpty() && this.view.getTxtcelular().isEmpty() && this.view.getTxtelefono().isEmpty());
        if (noVacio) {
            try {
                String nombre = this.view.getTxtnombre();
                String apellido = this.view.getTxtapellido();
                String direccion = this.view.getTxtdireccion();
                int cedula = Integer.parseInt(this.view.getTxtcedula());
                String correo = this.view.getTxtcorreo();
                String celular = this.view.getTxtcelular();
                String telefono = this.view.getTxtelefono();

                personal.agregarCliente(new Cliente(nombre, apellido, cedula, direccion, correo, celular, telefono));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingreso incorrecto de datos");
            }

        }

    }
}
