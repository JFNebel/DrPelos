/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JHONATAN1
 */
public class Conexion {
    // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="123456";
    private static final String url="jdbc:mysql://localhost/DrPelos";
    
    
        // Funcion que va conectarse a mi bd de mysql
    public static Connection getConexion() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
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