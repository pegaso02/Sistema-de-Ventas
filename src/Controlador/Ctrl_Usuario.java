/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

public class Ctrl_Usuario {

    // metodoiniciar sesion en bd
    public Boolean loginUser(Usuario objeto) {
        boolean respuesta = false;

        Connection cn = (Connection) Conexion.conectar(); // METODO CONNECTION DE MYSQL Y EL METODO CONECTAR() DE LA CLASE CONEXION
        String sql = "select usuario, password from tb_usuarios where usuario = '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'";
        Statement st; // Statement para ejecutar consultas a la bd
        try {

            st = (Statement) cn.createStatement();
            ResultSetImpl rs = (ResultSetImpl) st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        return respuesta;
    }

}
