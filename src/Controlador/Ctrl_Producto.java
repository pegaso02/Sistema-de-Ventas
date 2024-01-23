
package Controlador;

import Modelo.Producto;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Ctrl_Producto {
        
        /*
        *
        *Metodo para guardar producto
        *
        */
    
    public Boolean Guardar(Producto objeto){
        boolean respuesta = false;
        Connection con = (Connection)Conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = (PreparedStatement) con.prepareStatement("insert into tb_producto values(?,?,?,?,?,?,?,?) ");
            consulta.setInt(1, 0); // Pasamos como parametro 0, porque el id es autoincrementable en la base de datos
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            con.close();
            
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al guardar producto" + e);
            
        }

        return respuesta;
    }
    
    /*
    *
    *Metodo para verificar si existe el producto en la bd
    *
    */
    
    public boolean existeProducto(String producto){
        
        boolean respuesta = false;
        String sql = "select nombre from tb_producto where nombre = '"+producto+" '";
        Statement st;
        
        try {
            Connection con = (Connection)Conexion.Conexion.conectar();
            st = (Statement)con.createStatement();
            ResultSetImpl rs = (ResultSetImpl)st.executeQuery(sql);
            
            while(rs.next()){
            respuesta = true;
        }
        st.close();
        rs.close();
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "error al verificar");
        }
        
        return respuesta;

    }
    
    
}
