/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.Ctrl_Categoria;
import Modelo.Categoria;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class JInternalFrameGestionarCategoria extends javax.swing.JInternalFrame {

    private int idCategoria;
    
    public JInternalFrameGestionarCategoria() {
        initComponents();
        this.setSize(new Dimension (600, 400));
        this.setTitle("Gestionar Categoria");
        this.cargarTablaCategorias();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabelWallPapper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar categorias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCategorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonActualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButtonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Descripcion");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 190, 80));

        jLabelWallPapper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelWallPapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    /*
    * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    * Boton Actualizar Categoria
    * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    */ 
    
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        if(!txtDescripcion.getText().isEmpty()){
            
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlCategoria = new Ctrl_Categoria();
            categoria.setDescripcion(txtDescripcion.getText().trim());
            
            if(controlCategoria.actualizar(categoria, idCategoria)){
                JOptionPane.showMessageDialog(null, "Categoria actualizada ");
                txtDescripcion.setText("");
                this.cargarTablaCategorias();
                
            } else{
                JOptionPane.showMessageDialog(null, "Error al actualizar categoria ");
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Seleccione una categoria ");
            
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    /*
    * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    * Boton Eliminar Categoria
    * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    */ 
    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if(!txtDescripcion.getText().isEmpty()){
            
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlCategoria = new Ctrl_Categoria();
            categoria.setDescripcion(txtDescripcion.getText().trim());
            
            if(!controlCategoria.eliminar(idCategoria)){
                JOptionPane.showMessageDialog(null, "Categoria eliminada ");
                txtDescripcion.setText("");
                this.cargarTablaCategorias();
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar categoria ");
            }
             
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una categoria ");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelWallPapper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableCategorias;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

    /*
    *
    * Metodo para mostrar todas las categorias registradas
    */
    
    private void cargarTablaCategorias(){
        Connection con = (Connection)Conexion.Conexion.conectar();
        DefaultTableModel tableModel = new DefaultTableModel();
        String sql = "select idCategoria, descripcion, estado from tb_categoria";
        Statement st;
        
        try {
            
            st= (Statement)con.createStatement();
            ResultSetImpl rs = (ResultSetImpl)st.executeQuery(sql);
            JInternalFrameGestionarCategoria.jTableCategorias = new JTable(tableModel); // instanciamos el fram, llamamos la tabla categorias.
            JInternalFrameGestionarCategoria.jScrollPane1 .setViewportView(JInternalFrameGestionarCategoria.jTableCategorias);
            
           tableModel.addColumn("IdCategoria");
           tableModel.addColumn("descripcion");
           tableModel.addColumn("estado");
           
           while(rs.next()){
               Object columna [] = new Object[3];
               
               for(int i = 0; i < 3; i++){
                   columna[i] = rs.getObject(i+1);
                   
               }
               tableModel.addRow(columna);
           }
           
           con.close();
            
        } catch (SQLException ex) {
            System.out.println("error al llenar la tabla categoria"+ex);
            
        }
        
        jTableCategorias.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int filaPoint = jTableCategorias.rowAtPoint(e.getPoint());
                int columnaPoint = 0;
                
                if(filaPoint > -1 ){
                    idCategoria = (int) tableModel.getValueAt(filaPoint, columnaPoint);
                    EnviarDatosCategoriaSeleccionada(idCategoria);
                }
            }
        
        });
    }
    
    private void EnviarDatosCategoriaSeleccionada(int idCategoria){
        
        try {
            Connection con = (Connection) Conexion.Conexion.conectar();
            PreparedStatement pst= (PreparedStatement) con.prepareStatement("select * from tb_categoria where idCategoria =  ' " + idCategoria +" ' "  );
            ResultSetImpl rs = (ResultSetImpl) pst.executeQuery();
            
            if(rs.next()){
                txtDescripcion.setText(rs.getString("descripcion"));
            }
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Error al selecionar categoria "+ex);
        }
    }
    
    
}
