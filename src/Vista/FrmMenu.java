/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author PC
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     * @return 
     */
    
    public static JDesktopPane JDesktopPaneMenu;
    
    public FrmMenu() { // CONSTRUCTOR

        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setTitle("Sistema de ventas");
        this.setLayout(null); // desactivas el administrador de diseño automatico
        JDesktopPaneMenu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.JDesktopPaneMenu.setBounds(0, 0, ancho, (alto - 110));
        this.add(JDesktopPaneMenu);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemNuevoUsuario = new javax.swing.JMenuItem();
        jMenuItemGestionarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemNuevoProducto = new javax.swing.JMenuItem();
        jMenuItemGestionarProducto = new javax.swing.JMenuItem();
        jMenuItemActualizarStock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemNuevoCliente = new javax.swing.JMenuItem();
        jMenuItemGestionarCliente = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemNuevaCategoria = new javax.swing.JMenuItem();
        jMenuItemGestionarCategorias = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemNuevaVenta = new javax.swing.JMenuItem();
        jMenuItemGestionarVenta = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItemReportesClientes = new javax.swing.JMenuItem();
        jMenuItemReportesCategorias = new javax.swing.JMenuItem();
        jMenuItemReportesProductos = new javax.swing.JMenuItem();
        jMenuItemReportesVentas = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItemVerHistorial = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png"))); // NOI18N
        jMenuUsuario.setText("Usuario");
        jMenuUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuUsuario.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItemNuevoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo-cliente.png"))); // NOI18N
        jMenuItemNuevoUsuario.setText("Nuevo usuario");
        jMenuItemNuevoUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItemNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemNuevoUsuario);

        jMenuItemGestionarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemGestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/configuraciones.png"))); // NOI18N
        jMenuItemGestionarUsuario.setText("Gestionar usuarios");
        jMenuItemGestionarUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuUsuario.add(jMenuItemGestionarUsuario);

        jMenuBar1.add(jMenuUsuario);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(180, 50));

        jMenuItemNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo-producto.png"))); // NOI18N
        jMenuItemNuevoProducto.setText("Nuevo producto");
        jMenuItemNuevoProducto.setPreferredSize(new java.awt.Dimension(180, 50));
        jMenuItemNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemNuevoProducto);

        jMenuItemGestionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/producto.png"))); // NOI18N
        jMenuItemGestionarProducto.setText("Gestionar producto");
        jMenuItemGestionarProducto.setPreferredSize(new java.awt.Dimension(180, 50));
        jMenuItemGestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemGestionarProducto);

        jMenuItemActualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo.png"))); // NOI18N
        jMenuItemActualizarStock.setText("Actualizar Strock");
        jMenuItemActualizarStock.setPreferredSize(new java.awt.Dimension(180, 50));
        jMenuItemActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActualizarStockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemActualizarStock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItemNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo-cliente.png"))); // NOI18N
        jMenuItemNuevoCliente.setText("Nuevo cliente");
        jMenuItemNuevoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu3.add(jMenuItemNuevoCliente);

        jMenuItemGestionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cliente.png"))); // NOI18N
        jMenuItemGestionarCliente.setText("Gestionar cliente");
        jMenuItemGestionarCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItemGestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemGestionarCliente);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/categorias.png"))); // NOI18N
        jMenu5.setText("Categoria");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItemNuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo.png"))); // NOI18N
        jMenuItemNuevaCategoria.setText("Nueva Categoria");
        jMenuItemNuevaCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItemNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemNuevaCategoria);

        jMenuItemGestionarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/categorias.png"))); // NOI18N
        jMenuItemGestionarCategorias.setText("Gestionar Categoria");
        jMenuItemGestionarCategorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItemGestionarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionarCategoriasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemGestionarCategorias);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/carrito.png"))); // NOI18N
        jMenu6.setText("Facturar");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenuItemNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/anadir.png"))); // NOI18N
        jMenuItemNuevaVenta.setText("Nueva venta");
        jMenuItemNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaVentaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemNuevaVenta);

        jMenuItemGestionarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/configuraciones.png"))); // NOI18N
        jMenuItemGestionarVenta.setText("Gestionar venta");
        jMenu6.add(jMenuItemGestionarVenta);

        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reportes.png"))); // NOI18N
        jMenu8.setText("Reportes");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItemReportesClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reporte1.png"))); // NOI18N
        jMenuItemReportesClientes.setText("Reportes cliente");
        jMenuItemReportesClientes.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu8.add(jMenuItemReportesClientes);

        jMenuItemReportesCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reporte1.png"))); // NOI18N
        jMenuItemReportesCategorias.setText("Reportes categoria");
        jMenuItemReportesCategorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu8.add(jMenuItemReportesCategorias);

        jMenuItemReportesProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reporte1.png"))); // NOI18N
        jMenuItemReportesProductos.setText("Reportes producto");
        jMenuItemReportesProductos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu8.add(jMenuItemReportesProductos);

        jMenuItemReportesVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reporte1.png"))); // NOI18N
        jMenuItemReportesVentas.setText("Reportes ventas");
        jMenuItemReportesVentas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu8.add(jMenuItemReportesVentas);

        jMenuBar1.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/historial1.png"))); // NOI18N
        jMenu9.setText("Historial");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItemVerHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/historial1.png"))); // NOI18N
        jMenuItemVerHistorial.setText("Ver historial");
        jMenuItemVerHistorial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu9.add(jMenuItemVerHistorial);

        jMenuBar1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cerrar-sesion.png"))); // NOI18N
        jMenu10.setText("Cerrar Sesion");
        jMenu10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu10.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cerrar-sesion.png"))); // NOI18N
        jMenuItemCerrarSesion.setText("Cerrar sesion");
        jMenuItemCerrarSesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu10.add(jMenuItemCerrarSesion);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNuevoUsuarioActionPerformed

    private void jMenuItemNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoProductoActionPerformed
        
        JInternalFrameProducto Interproducto = new JInternalFrameProducto();
        JDesktopPaneMenu.add(Interproducto);
        Interproducto.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItemNuevoProductoActionPerformed

    private void jMenuItemGestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGestionarProductoActionPerformed

    private void jMenuItemGestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGestionarClienteActionPerformed

    private void jMenuItemActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActualizarStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemActualizarStockActionPerformed

    private void jMenuItemNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaCategoriaActionPerformed
        // TODO add your handling code here:
        JInternalFrameCategoria InterCategoria = new JInternalFrameCategoria();
        JDesktopPaneMenu.add(InterCategoria);
        InterCategoria.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemNuevaCategoriaActionPerformed

    private void jMenuItemGestionarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionarCategoriasActionPerformed
        JInternalFrameGestionarCategoria gestionarCategoria = new JInternalFrameGestionarCategoria();
        JDesktopPaneMenu.add(gestionarCategoria);
        gestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemGestionarCategoriasActionPerformed

    private void jMenuItemNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaVentaActionPerformed
        
    }//GEN-LAST:event_jMenuItemNuevaVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemActualizarStock;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemGestionarCategorias;
    private javax.swing.JMenuItem jMenuItemGestionarCliente;
    private javax.swing.JMenuItem jMenuItemGestionarProducto;
    private javax.swing.JMenuItem jMenuItemGestionarUsuario;
    private javax.swing.JMenuItem jMenuItemGestionarVenta;
    private javax.swing.JMenuItem jMenuItemNuevaCategoria;
    private javax.swing.JMenuItem jMenuItemNuevaVenta;
    private javax.swing.JMenuItem jMenuItemNuevoCliente;
    private javax.swing.JMenuItem jMenuItemNuevoProducto;
    private javax.swing.JMenuItem jMenuItemNuevoUsuario;
    private javax.swing.JMenuItem jMenuItemReportesCategorias;
    private javax.swing.JMenuItem jMenuItemReportesClientes;
    private javax.swing.JMenuItem jMenuItemReportesProductos;
    private javax.swing.JMenuItem jMenuItemReportesVentas;
    private javax.swing.JMenuItem jMenuItemVerHistorial;
    private javax.swing.JMenu jMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
