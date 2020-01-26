/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JHONATAN1
 */
public class Conexion {
    // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private static final String URL = "jdbc:mysql://localhost:3306/DrPelos";
    
    
        // Funcion que va conectarse a mi bd de mysql
    public static Connection getConexion() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(DRIVER );
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(URL, USER , PASS);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                //jLabel1.setText("Conexion establecida");
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            //jLabel1.setText("Error de conexion" + e);
            System.out.println("Error de conexion" + e);
        }
        return con;
    }
    
    /*// Aqui muestra para ver si se conecto
    public static void main(String[] args) {
         Conexion coneccion= new Conexion();
         coneccion.getConexion();
    }*/
}
