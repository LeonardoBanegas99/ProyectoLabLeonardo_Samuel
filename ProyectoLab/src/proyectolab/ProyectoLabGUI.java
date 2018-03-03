package proyectolab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProyectoLabGUI extends javax.swing.JFrame {

    public ProyectoLabGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registrar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jC_Usuarios = new javax.swing.JComboBox();
        tf_usuario = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_correoelectronico = new javax.swing.JTextField();
        tf_sexo = new javax.swing.JTextField();
        tf_contrasena = new javax.swing.JPasswordField();
        jB_Registro = new javax.swing.JButton();
        dc_fechadenacimiento = new com.toedter.calendar.JDateChooser();
        jd_test = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        log_usuario = new javax.swing.JTextField();
        log_password = new javax.swing.JPasswordField();
        jB_LogIn = new javax.swing.JButton();
        jB_Registrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Usuario: ");

        jLabel2.setText("Contrasena: ");

        jLabel3.setText("Fecha de nacimiento: ");

        jLabel4.setText("Correo electronico:");

        jLabel5.setText("Sexo: ");

        jLabel6.setText("Nombre Completo: ");

        jC_Usuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario Comun", "Usuario Candidato", " " }));

        jB_Registro.setText("Registrar");
        jB_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_RegistroMouseClicked(evt);
            }
        });
        jB_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_registrarLayout = new javax.swing.GroupLayout(jd_registrar.getContentPane());
        jd_registrar.getContentPane().setLayout(jd_registrarLayout);
        jd_registrarLayout.setHorizontalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(dc_fechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_registrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel1)
                            .addGap(78, 78, 78)
                            .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel2)
                            .addGap(58, 58, 58)
                            .addComponent(tf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel6)
                            .addGap(33, 33, 33)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel4)
                            .addGap(33, 33, 33)
                            .addComponent(tf_correoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel5)
                            .addGap(66, 66, 66)
                            .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jC_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(167, 167, 167)
                            .addComponent(jB_Registro)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jd_registrarLayout.setVerticalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(dc_fechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_registrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(tf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(16, 16, 16)
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(14, 14, 14)
                    .addComponent(jLabel3)
                    .addGap(22, 22, 22)
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel4))
                        .addComponent(tf_correoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel5))
                        .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jC_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_Registro))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jButton1.setText("CerrarSesion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_testLayout = new javax.swing.GroupLayout(jd_test.getContentPane());
        jd_test.getContentPane().setLayout(jd_testLayout);
        jd_testLayout.setHorizontalGroup(
            jd_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jd_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_testLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jd_testLayout.setVerticalGroup(
            jd_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jd_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_testLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Contrasena: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Usuario:");

        jB_LogIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB_LogIn.setText("LOG IN");
        jB_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_LogInMouseClicked(evt);
            }
        });

        jB_Registrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB_Registrar.setText("REGISTRAR");
        jB_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_RegistrarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("BIENVENIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel7)
                            .addGap(14, 14, 14)
                            .addComponent(log_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(4, 4, 4)
                            .addComponent(log_password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jB_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(jB_Registrar)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(log_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(log_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(jB_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)
                    .addComponent(jB_Registrar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_LogInMouseClicked
        // TODO add your handling code here:
        if (this.usuarioex(this.log_usuario.getText()) && this.contra(this.log_password.getText(), log_usuario.getText())) {
            jd_test.pack();
            jd_test.setLocationRelativeTo(null);
            jd_test.setVisible(true);
            ProyectoLabGUI.this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta");
        }
    }//GEN-LAST:event_jB_LogInMouseClicked

    private void jB_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_RegistrarMouseClicked
        jd_registrar.pack();
        jd_registrar.setLocationRelativeTo(null);
        jd_registrar.setVisible(true);
        ProyectoLabGUI.this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_RegistrarMouseClicked

    private void jB_RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_RegistroMouseClicked
        // TODO add your handling code here:
        usuario.add(new Usuarios(this.tf_usuario.getText(), this.tf_contrasena.getText(), this.dc_fechadenacimiento.getDate(),
        this.tf_correoelectronico.getText(), this.tf_sexo.getText(), this.tf_nombre.getText()));
        JOptionPane.showMessageDialog(this, "Guardado con exito");
        jd_registrar.setVisible(false);
        ProyectoLabGUI.this.setVisible(true);
    }//GEN-LAST:event_jB_RegistroMouseClicked

    private void jB_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_RegistroActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        jd_test.setVisible(false);
        ProyectoLabGUI.this.setVisible(true);
        log=null;
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoLabGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoLabGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoLabGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoLabGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoLabGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dc_fechadenacimiento;
    private javax.swing.JButton jB_LogIn;
    private javax.swing.JButton jB_Registrar;
    private javax.swing.JButton jB_Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jC_Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JDialog jd_test;
    private javax.swing.JPasswordField log_password;
    private javax.swing.JTextField log_usuario;
    private javax.swing.JPasswordField tf_contrasena;
    private javax.swing.JTextField tf_correoelectronico;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_sexo;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuarios> usuario = new ArrayList();
    Usuarios log;
    public boolean usuarioex(String log) {
        for (Usuarios user : usuario) {
            if (user.getUsuario().equals(log)) {
                return true;
            }
        }
        return false;
    }
    public boolean contra(String pas, String user) {
        for (Usuarios usuario : usuario) {
            if (usuario.getContrasena().equals(pas) && usuario.getUsuario().equals(user)) {
                log = usuario;
                return true;
            }
        }
        return false;
    }
}
