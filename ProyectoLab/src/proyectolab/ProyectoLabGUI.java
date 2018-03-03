package proyectolab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProyectoLabGUI extends javax.swing.JFrame {

    public ProyectoLabGUI() {
        initComponents();
        // votos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameBuscarCandidatos = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaBuscarCandidatos = new javax.swing.JList<>();
        btnseguirCandidato = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
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
        FrameUsuarioComun = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        FrameModDatos = new javax.swing.JFrame();
        tf_ModUsuario = new javax.swing.JTextField();
        tf_ModContra = new javax.swing.JTextField();
        tf_ModFechaNac = new javax.swing.JTextField();
        tf_ModCorreo = new javax.swing.JTextField();
        tf_ModSexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_ModNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnRegresarModDatos = new javax.swing.JButton();
        FrameIniciarSesion = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        log_usuario = new javax.swing.JTextField();
        log_password = new javax.swing.JPasswordField();
        jB_LogIn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRegistro1 = new javax.swing.JButton();
        btnIniciarSesion1 = new javax.swing.JButton();

        FrameBuscarCandidatos.setPreferredSize(new java.awt.Dimension(600, 500));
        FrameBuscarCandidatos.setSize(new java.awt.Dimension(600, 500));

        jScrollPane4.setViewportView(ListaBuscarCandidatos);

        btnseguirCandidato.setText("Seguir");

        javax.swing.GroupLayout FrameBuscarCandidatosLayout = new javax.swing.GroupLayout(FrameBuscarCandidatos.getContentPane());
        FrameBuscarCandidatos.getContentPane().setLayout(FrameBuscarCandidatosLayout);
        FrameBuscarCandidatosLayout.setHorizontalGroup(
            FrameBuscarCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameBuscarCandidatosLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnseguirCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        FrameBuscarCandidatosLayout.setVerticalGroup(
            FrameBuscarCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameBuscarCandidatosLayout.createSequentialGroup()
                .addGroup(FrameBuscarCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameBuscarCandidatosLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameBuscarCandidatosLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnseguirCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_registrar.setSize(new java.awt.Dimension(500, 500));

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
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(94, 94, 94)
                            .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jd_registrarLayout.createSequentialGroup()
                            .addComponent(jC_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_Registro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_registrarLayout.createSequentialGroup()
                            .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_correoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dc_fechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jd_registrarLayout.setVerticalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dc_fechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_correoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Registro))
                .addContainerGap(137, Short.MAX_VALUE))
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

        FrameUsuarioComun.setTitle("Usuario Comun");
        FrameUsuarioComun.setAlwaysOnTop(true);
        FrameUsuarioComun.setLocation(new java.awt.Point(600, 100));
        FrameUsuarioComun.setMaximumSize(new java.awt.Dimension(800, 650));
        FrameUsuarioComun.setMinimumSize(new java.awt.Dimension(800, 650));
        FrameUsuarioComun.setPreferredSize(new java.awt.Dimension(800, 650));
        FrameUsuarioComun.setResizable(false);
        FrameUsuarioComun.setSize(new java.awt.Dimension(800, 650));

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jLabel16.setText("Candidatos Seguidos");

        jLabel17.setText("Amigos");

        jButton3.setText("Cargar Acta");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jMenu1.setText("Datos");

        jMenuItem1.setText("Modificar Datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Candidatos");

        jMenuItem4.setText("Candidatos");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Amigos");

        jMenuItem3.setText("Agregar Amigos");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Buzon");

        jMenuItem5.setText("Mensajes Recibidos");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Enviar Mensaje");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        FrameUsuarioComun.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout FrameUsuarioComunLayout = new javax.swing.GroupLayout(FrameUsuarioComun.getContentPane());
        FrameUsuarioComun.getContentPane().setLayout(FrameUsuarioComunLayout);
        FrameUsuarioComunLayout.setHorizontalGroup(
            FrameUsuarioComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                .addGroup(FrameUsuarioComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                        .addGap(623, 623, 623)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                        .addGroup(FrameUsuarioComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(FrameUsuarioComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameUsuarioComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        FrameUsuarioComunLayout.setVerticalGroup(
            FrameUsuarioComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addGap(16, 16, 16)
                .addGroup(FrameUsuarioComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        FrameModDatos.setSize(new java.awt.Dimension(500, 500));

        jLabel10.setText("Usuario");

        jLabel11.setText("Contraseña");

        jLabel12.setText("Fecha de Nacimiento");

        jLabel13.setText("Correo Electronico");

        jLabel14.setText("Sexo");

        jLabel15.setText("Nombre Completo");

        jButton2.setText("Modificar Datos");

        btnRegresarModDatos.setText("Regresar");
        btnRegresarModDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarModDatosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameModDatosLayout = new javax.swing.GroupLayout(FrameModDatos.getContentPane());
        FrameModDatos.getContentPane().setLayout(FrameModDatosLayout);
        FrameModDatosLayout.setHorizontalGroup(
            FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModDatosLayout.createSequentialGroup()
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModDatosLayout.createSequentialGroup()
                        .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameModDatosLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(32, 32, 32)
                                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ModSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(tf_ModFechaNac)
                                    .addComponent(tf_ModNombre)
                                    .addComponent(tf_ModCorreo)
                                    .addComponent(tf_ModContra)
                                    .addComponent(tf_ModUsuario)))
                            .addGroup(FrameModDatosLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresarModDatos)))
                .addContainerGap())
        );
        FrameModDatosLayout.setVerticalGroup(
            FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModDatosLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(FrameModDatosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tf_ModCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_ModContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_ModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tf_ModFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(tf_ModSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnRegresarModDatos)
                .addContainerGap())
        );

        FrameIniciarSesion.setSize(new java.awt.Dimension(500, 500));

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("BIENVENIDO");

        javax.swing.GroupLayout FrameIniciarSesionLayout = new javax.swing.GroupLayout(FrameIniciarSesion.getContentPane());
        FrameIniciarSesion.getContentPane().setLayout(FrameIniciarSesionLayout);
        FrameIniciarSesionLayout.setHorizontalGroup(
            FrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameIniciarSesionLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(FrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_LogIn)
                    .addGroup(FrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FrameIniciarSesionLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(58, 58, 58)
                            .addComponent(log_password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameIniciarSesionLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(log_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameIniciarSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(182, 182, 182))
        );
        FrameIniciarSesionLayout.setVerticalGroup(
            FrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameIniciarSesionLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel9)
                .addGap(53, 53, 53)
                .addGroup(FrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(FrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addComponent(jB_LogIn)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setSize(new java.awt.Dimension(300, 300));

        btnRegistro1.setText("Registrarse");
        btnRegistro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistro1MouseClicked(evt);
            }
        });
        btnRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro1ActionPerformed(evt);
            }
        });

        btnIniciarSesion1.setText("Iniciar Sesion");
        btnIniciarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesion1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnIniciarSesion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        log = null;
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        FrameModDatos.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRegresarModDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarModDatosMouseClicked
        this.setVisible(true);
        FrameModDatos.setVisible(false);
    }//GEN-LAST:event_btnRegresarModDatosMouseClicked

    private void btnRegistro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistro1MouseClicked
        this.setVisible(false);
        jd_registrar.setVisible(true);
    }//GEN-LAST:event_btnRegistro1MouseClicked

    private void btnRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistro1ActionPerformed

    private void btnIniciarSesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesion1MouseClicked
        this.setVisible(false);
        FrameIniciarSesion.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesion1MouseClicked

    private void jB_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_LogInMouseClicked
        if (this.usuarioex(this.log_usuario.getText()) && this.contra(this.log_password.getText(), log_usuario.getText())) {
            jd_test.pack();
            jd_test.setLocationRelativeTo(null);
            jd_test.setVisible(true);
            FrameIniciarSesion.setVisible(false);
            FrameUsuarioComun.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta");
        }
    }//GEN-LAST:event_jB_LogInMouseClicked

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
                System.out.println("hola");
                new ProyectoLabGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrameBuscarCandidatos;
    private javax.swing.JFrame FrameIniciarSesion;
    private javax.swing.JFrame FrameModDatos;
    private javax.swing.JFrame FrameUsuarioComun;
    private javax.swing.JList<String> ListaBuscarCandidatos;
    private javax.swing.JButton btnIniciarSesion1;
    private javax.swing.JButton btnRegistro1;
    private javax.swing.JButton btnRegresarModDatos;
    private javax.swing.JButton btnseguirCandidato;
    private com.toedter.calendar.JDateChooser dc_fechadenacimiento;
    private javax.swing.JButton jB_LogIn;
    private javax.swing.JButton jB_Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jC_Usuarios;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JDialog jd_test;
    private javax.swing.JPasswordField log_password;
    private javax.swing.JTextField log_usuario;
    private javax.swing.JTextField tf_ModContra;
    private javax.swing.JTextField tf_ModCorreo;
    private javax.swing.JTextField tf_ModFechaNac;
    private javax.swing.JTextField tf_ModNombre;
    private javax.swing.JTextField tf_ModSexo;
    private javax.swing.JTextField tf_ModUsuario;
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
