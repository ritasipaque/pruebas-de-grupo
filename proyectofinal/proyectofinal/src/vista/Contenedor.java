/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import Mantenimientos.Almacenamiento_Departamento;

import modelo.Usuarios;

/**
 *
 */
public class Contenedor extends javax.swing.JFrame {

    Usuarios mod;

    public Contenedor() {
        initComponents();
    }

    Contenedor(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        if (mod.getIdTipo() == 1) {
            MANTENIMIENTOS.setVisible(true);
            NOMINA.setVisible(true);
            CONCEPTO.setVisible(true);
            SALIR.setVisible(true);
        } else {
            NOMINA.setVisible(true);
           MANTENIMIENTOS.setVisible(true);
           SALIR.setVisible(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MANTENIMIENTOS = new javax.swing.JMenu();
        subMenuAddProducto = new javax.swing.JMenuItem();
        subMenuEditProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        NOMINA = new javax.swing.JMenu();
        subMenuAddProvedor = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        CONCEPTO = new javax.swing.JMenu();
        subMenuAddProvedor1 = new javax.swing.JMenuItem();
        SALIR = new javax.swing.JMenu();
        subMenuAddProvedor2 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/blu2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MANTENIMIENTOS.setText("Mantenimientos");
        MANTENIMIENTOS.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        subMenuAddProducto.setText("Mantenimientos Empleados");
        subMenuAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAddProductoActionPerformed(evt);
            }
        });
        MANTENIMIENTOS.add(subMenuAddProducto);

        subMenuEditProducto.setText("Mantenimiento Departamento");
        subMenuEditProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuEditProductoActionPerformed(evt);
            }
        });
        MANTENIMIENTOS.add(subMenuEditProducto);

        jMenuItem1.setText("Mnatenimiento Puestos");
        MANTENIMIENTOS.add(jMenuItem1);

        jMenuBar1.add(MANTENIMIENTOS);

        NOMINA.setText("Nomina");
        NOMINA.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        subMenuAddProvedor.setText("Planilla");
        NOMINA.add(subMenuAddProvedor);

        jMenuItem2.setText("Registro Empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        NOMINA.add(jMenuItem2);

        jMenuItem4.setText("Bitacora");
        NOMINA.add(jMenuItem4);

        jMenuItem5.setText("Recibo");
        NOMINA.add(jMenuItem5);

        jMenuBar1.add(NOMINA);

        CONCEPTO.setText("Concepto");
        CONCEPTO.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        subMenuAddProvedor1.setText("Mantenimiento Concepto ");
        CONCEPTO.add(subMenuAddProvedor1);

        jMenuBar1.add(CONCEPTO);

        SALIR.setText("Salir");
        SALIR.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        subMenuAddProvedor2.setText("Salir de Sistema");
        subMenuAddProvedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAddProvedor2ActionPerformed(evt);
            }
        });
        SALIR.add(subMenuAddProvedor2);

        jMenuBar1.add(SALIR);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuAddProvedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAddProvedor2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_subMenuAddProvedor2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void subMenuAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAddProductoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_subMenuAddProductoActionPerformed

    private void subMenuEditProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuEditProductoActionPerformed
       // ALMACENAMIENTO DEPARTAMENTOS
 Almacenamiento_Departamento frm = new Almacenamiento_Departamento();
         frm.setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_subMenuEditProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CONCEPTO;
    private javax.swing.JMenu MANTENIMIENTOS;
    private javax.swing.JMenu NOMINA;
    private javax.swing.JMenu SALIR;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem subMenuAddProducto;
    private javax.swing.JMenuItem subMenuAddProvedor;
    private javax.swing.JMenuItem subMenuAddProvedor1;
    private javax.swing.JMenuItem subMenuAddProvedor2;
    private javax.swing.JMenuItem subMenuEditProducto;
    // End of variables declaration//GEN-END:variables
}
