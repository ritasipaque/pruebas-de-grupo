/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONAL
 */
 /**
 las   variables  simbre  globales  de  toda  la nonis y de  "bancos " 
 */


public class dcfd extends javax.swing.JFrame {
/**
 en e el  frama y aqui pongan  el  de bonificacion =  bono 14  a aguinaldo
 * los  egresos 
 * sueldo
 * tanmbien que  pongan  el  numero de   cuentas  y  banco  a que  pertenezen
 */
    
    float sueldoExtra, comisiones, otrosIngresos,bonficacion =250 ;
     float igss=(float) 0.83;  float isr;   float anticipos, dj, otrosDescuentos;
       float igss1;  
      float totDesc;
         String nombree;
        String puestoo;
          float sueldoLiquido;
           float sueldo;
            float totIngresos,horas ;
            float id;
    /**
     * Creates new form dcfd
     */
    public dcfd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        n1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        p1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        a = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        aviso = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s1 = new javax.swing.JRadioButton();
        nop = new javax.swing.JRadioButton();
        c1 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        c_h = new javax.swing.JLabel();
        c3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ava = new javax.swing.JRadioButton();
        nop1 = new javax.swing.JRadioButton();
        p3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id de  empelado");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ID.setText("jLabel2");

        jLabel2.setText("nombre de  empleado");

        n1.setText("jLabel2");

        jLabel3.setText("puesto de  empleado");

        p1.setText("jLabel2");

        jLabel4.setText("Status en la emplesa");

        a.setText("Activo");

        jRadioButton2.setText("Suspendido");

        aviso.setText("jLabel5");

        jLabel5.setText("posse comisiones");

        s1.setText("Si");

        nop.setText("No");

        c1.setText("jLabel5");

        c_h.setText("jLabel5");

        jLabel6.setText("posee hora extras");

        ava.setText("Si");

        nop1.setText("No");

        p3.setText("jLabel2");

        jLabel7.setText("total de  ingresos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(n1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ID))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(p1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(a)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButton2)
                                            .addGap(61, 61, 61)
                                            .addComponent(aviso)))
                                    .addComponent(s1))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(ava)
                                        .addGap(18, 18, 18)
                                        .addComponent(nop1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addComponent(nop)
                                        .addGap(18, 18, 18)
                                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p3)
                                    .addComponent(c_h)
                                    .addComponent(c1))))
                        .addContainerGap(613, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(a)
                    .addComponent(jRadioButton2)
                    .addComponent(aviso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(ava))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nop1)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c_h)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(s1)
                    .addComponent(nop)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(p3))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   /**
 *
 *  se  extrae  se calcula y  se manda tanto como  afuera de  la condicion como  adento
 */
        
        id=Float.parseFloat(tid.getText());
      sueldoExtra=Float.parseFloat(c3.getText());
    c3.setText(String.valueOf(sueldoExtra));
      comisiones=Float.parseFloat(c.getText());
 c3.setText(String.valueOf(sueldoExtra));
        c1.setText(String.valueOf(comisiones));
          c3.setText(String.valueOf(sueldoExtra));
         nombree=n.getText();
            n1.setText(nombree);
            puestoo=p.getText();
            p1.setText(puestoo);
              horas=(float) (sueldoExtra*1.5);
               totIngresos = (float) (sueldo+horas+comisiones+otrosIngresos);
                p3.setText(String.valueOf(totIngresos));
     /**
 *
 *  se  escoje un un  radio buton   de los  de si  y con la  condicion  se calcacula o no
 */
                      if (a.isSelected())     {
             aviso.setText("activo");   }
else {
             aviso.setText("despedido");
         }  
                      if (s1.isSelected())     {
                         c1.setText(String.valueOf(comisiones));
          }
                      else {
             aviso.setText("0.0");}
 if (ava.isSelected())     {
      sueldoExtra=Float.parseFloat(c3.getText());
      horas=(float) (sueldoExtra*1.5);
     c_h.setText(String.valueOf(horas));
     
     /**
 *
 * obserbaciones   en el frame tiene que  llegar todo  hasta con el  el  para que  se salga  se el  resultado   si no error 
 * cualquier  cosa  me dicen
 */
     
     
     
          }
  else {
             aviso.setText("0.0");}
     


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(dcfd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dcfd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dcfd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dcfd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dcfd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton ava;
    private javax.swing.JLabel aviso;
    private javax.swing.JTextField c;
    private javax.swing.JLabel c1;
    private javax.swing.JTextField c3;
    private javax.swing.JLabel c_h;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField n;
    private javax.swing.JLabel n1;
    private javax.swing.JRadioButton nop;
    private javax.swing.JRadioButton nop1;
    private javax.swing.JTextField p;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p3;
    private javax.swing.JRadioButton s1;
    private javax.swing.JTextField tid;
    // End of variables declaration//GEN-END:variables
}
