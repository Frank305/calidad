package Vista;
import Control.Iniciar;
import Control.Usuario;
import Modelo.SqlUsuario;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Login extends javax.swing.JFrame{
    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtIp = new javax.swing.JPasswordField();
        cmdAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIu.setBorder(null);
        txtIu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIuActionPerformed(evt);
            }
        });
        txtIu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIuKeyTyped(evt);
            }
        });
        jPanel1.add(txtIu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 177, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 177, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre De Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 177, 20));

        txtIp.setBorder(null);
        txtIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpActionPerformed(evt);
            }
        });
        txtIp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIpKeyTyped(evt);
            }
        });
        jPanel1.add(txtIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, 20));

        cmdAceptar.setText("INICIAR SESION");
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/login.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 170, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 0, 262, 440));

        panel1.setColorPrimario(new java.awt.Color(153, 255, 153));
        panel1.setColorSecundario(new java.awt.Color(102, 153, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(panelCurves2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 440));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIuActionPerformed

    }//GEN-LAST:event_txtIuActionPerformed

    private void txtIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpActionPerformed

    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed
                Iniciar modSq = new Iniciar();
        Usuario mo = new Usuario();
        if (modSq.iniciarSession()) {
            this.dispose();
        }
    }//GEN-LAST:event_cmdAceptarActionPerformed

    private void txtIuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIuKeyTyped
        char cTeclaPresioanda=evt.getKeyChar();
        if (cTeclaPresioanda==KeyEvent.VK_ENTER) {
            cmdAceptar.doClick();
        }
    }//GEN-LAST:event_txtIuKeyTyped

    private void txtIpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIpKeyTyped
        char cTeclaPresioanda=evt.getKeyChar();
        if (cTeclaPresioanda==KeyEvent.VK_ENTER) {
            cmdAceptar.doClick();
        }
    }//GEN-LAST:event_txtIpKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves2;
    public static javax.swing.JPasswordField txtIp;
    public static javax.swing.JTextField txtIu;
    // End of variables declaration//GEN-END:variables

}
