package Controlador;

import Modelo.Categoria;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Ctrl_Categoria {

    // METODO PARA REGISTRAR CATEGORIA
    public boolean guardar(Categoria objeto) {

        boolean respuesta = false;
        
        Connection con = Conexion.Conexion.conectar();

        try {
            java.sql.PreparedStatement consulta = con.prepareStatement("insert into tb_categoria values (?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            con.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar categoria" + e);

        }

        return respuesta;
    }

    
        // metodo para consiltar si existe la categoria
    
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        
        String sql = "select descripcion from tb_categoria where descripcion = ' "+ categoria +"'";
        Statement st;
        
        try {
            Connection con = Conexion.Conexion.conectar();
            st = (Statement) con.createStatement();
            ResultSetImpl rs = (ResultSetImpl) st.executeQuery(sql);
            
            while(rs.next()){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error conexion");
            
        }
        
        return respuesta;
    }
    
    /*
    * * * * * * * * * * * * * * * * * * * * * * * *
    * Metodo para actualizar categoria
    * * * * * * * * * * * * * * * * * * * * * * * *
    */
    
    public Boolean actualizar(Categoria objeto, int idCategoria){
            
        Boolean respuesta = false;
        
        Connection con = Conexion.Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) con.prepareStatement("update tb_categoria set descripcion=? where idCategoria = ' "+idCategoria+"'");
            consulta.setString(1, objeto.getDescripcion());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar categoria "+ex);
        }

        return respuesta;
    }
    
    /*
    * * * * * * * * * * * * * * * * * * * * * * * *
    * Metodo para Eliminar categoria
    * * * * * * * * * * * * * * * * * * * * * * * *
    */
    
    public Boolean eliminar(int idCategoria ){
        
        boolean respuesta  = false;
        
        Connection con = Conexion.Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) con.prepareStatement("delete from tb_categoria where idCategoria = ' "+idCategoria+" ' ");
            consulta.executeUpdate();
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            con.close();
            
            
            
        } catch (SQLException e) {
            
            
        }
            
        
        
        return respuesta;
        
    }

}
