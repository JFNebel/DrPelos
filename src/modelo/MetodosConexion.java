/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ricar
 */
public class MetodosConexion {

    private static PreparedStatement sentenciaPreparada;
    private static ResultSet resultado;
    private static String sql;
    private static int resultadoNumero;

    public static int guardar(String cedula, String nombre, String correo, String celular, String telefono, String direccion) {
        int resultado = 0;
        Connection conexionBd = null;

        String sentenciaGuardar = ("INSERT INTO cliente (cedula, nombre, correo, celular, telefono, direccion) VALUES (?,?,?,?,?,?)");
        try {
            conexionBd = Conexion.getConexion();
            sentenciaPreparada = conexionBd.prepareStatement(sentenciaGuardar);
            sentenciaPreparada.setString(1, cedula);
            sentenciaPreparada.setString(2, nombre);
            sentenciaPreparada.setString(3, correo);
            sentenciaPreparada.setString(4, celular);
            sentenciaPreparada.setString(5, telefono);
            sentenciaPreparada.setString(6, direccion);

            resultado = sentenciaPreparada.executeUpdate();
            sentenciaPreparada.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String buscarNombre(String usuario) {
        String busquedaNombre = null;
        Connection conexionBd = null;
        try {
            conexionBd = Conexion.getConexion();
            String sentenciaBuscar = ("SELECT nombre FROM usuario WHERE correo = '" + usuario + "'");
            sentenciaPreparada = conexionBd.prepareStatement(sentenciaBuscar);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                busquedaNombre = nombre;

            }
            conexionBd.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return busquedaNombre;
    }

    public static String buscarUsuario(String usuario, String clave) {
        String busquedaUsuario = null;
        Connection conexionBd = null;
        try {
            conexionBd = Conexion.getConexion();
            String sentenciaBuscarUsuario = ("SELECT nombre,cedula FROM usuario WHERE usu = '" + usuario + "' && contraseña= '" + clave + "'");
            sentenciaPreparada = conexionBd.prepareStatement(sentenciaBuscarUsuario);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                busquedaUsuario = "usuario encontrado";

            } else {
                busquedaUsuario = "usuario no encontrado";

            }
            conexionBd.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return busquedaUsuario;
    }
}
