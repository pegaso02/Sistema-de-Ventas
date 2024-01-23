/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Conexion local

    public static Connection conectar() { // METODO TIPO CONNECTION EL CUAL ES DE MYSQL

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_ventas", "root", "020616");
            return con;
        } catch (SQLException e) {
            System.out.println("Error con la conexion " + e);
        }
        return null;

    }
}
