package proyectolab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

public class ProyectoLabGUI extends javax.swing.JFrame {
    
    private Scanner sc = null;
    
    public ProyectoLabGUI() {
        initComponents();
        // votos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameUsuarioCandidato = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_publicar = new javax.swing.JTextArea();
        b_publicar = new javax.swing.JButton();
        pb_votos = new javax.swing.JProgressBar();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        mi_modificardatos = new javax.swing.JMenuItem();
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
        ListaAmigos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCargarActas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        FrameModDatos = new javax.swing.JFrame();
        tf_ModUsuario = new javax.swing.JTextField();
        tf_ModCorreo = new javax.swing.JTextField();
        tf_ModContra = new javax.swing.JTextField();
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
        dtModFecha = new com.toedter.calendar.JDateChooser();
        FrameIniciarSesion = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        log_usuario = new javax.swing.JTextField();
        log_password = new javax.swing.JPasswordField();
        jB_LogIn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jd_ModUsuarioCandidato = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tf_ModUsuario1 = new javax.swing.JTextField();
        tf_ModContra1 = new javax.swing.JTextField();
        tf_ModFecNaci1 = new javax.swing.JTextField();
        tf_ModCorreo1 = new javax.swing.JTextField();
        tf_ModSexo1 = new javax.swing.JTextField();
        tf_ModNombre1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        bt_RegreModDatos1 = new javax.swing.JButton();
        FrameActas = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tf_JoseAlfonsoDiaz = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tf_SalvadorNasralla = new javax.swing.JTextField();
        tf_EliseoVallecillo = new javax.swing.JTextField();
        tf_Lucas = new javax.swing.JTextField();
        tf_LuisZelaya = new javax.swing.JTextField();
        tf_Romeo = new javax.swing.JTextField();
        tf_isaias = new javax.swing.JTextField();
        tf_marlenealvarenga = new javax.swing.JTextField();
        tf_JOH = new javax.swing.JTextField();
        btn_GuardarResultados = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        FrameAmigos = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaUsuariosComunes = new javax.swing.JList<>();
        jLabel34 = new javax.swing.JLabel();
        POPUPAgregarAmigos = new javax.swing.JPopupMenu();
        JMIAgregarAmigo = new javax.swing.JMenuItem();
        POPUPAmigos = new javax.swing.JPopupMenu();
        JMIEliminarAmigo = new javax.swing.JMenuItem();
        DialogSeguirCandidato = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel35 = new javax.swing.JLabel();
        FrameMensajeria = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        ListaMensajes = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        taMensaje = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tfMensajeriaEmisor = new javax.swing.JTextField();
        tfMensajeriaReceptor = new javax.swing.JTextField();
        lblTituloMensaje = new javax.swing.JLabel();
        btnRedactarMensaje = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        DialogRedactarMensaje = new javax.swing.JDialog();
        jScrollPane10 = new javax.swing.JScrollPane();
        taMensajeEnviar = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tfEnviarEmisor = new javax.swing.JTextField();
        tfEnviarReceptor = new javax.swing.JTextField();
        tfEnviarTitulo = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        btnEnviarMensaje = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        ListaEnviarMensajeAmigo = new javax.swing.JList<>();
        btnRegistro1 = new javax.swing.JButton();
        btnIniciarSesion1 = new javax.swing.JButton();

        FrameUsuarioCandidato.setBounds(new java.awt.Rectangle(600, 100, 800, 600));
        FrameUsuarioCandidato.setName("FrameUsuarioCandidado"); // NOI18N

        ta_publicar.setColumns(20);
        ta_publicar.setRows(5);
        jScrollPane3.setViewportView(ta_publicar);

        b_publicar.setText("Publicar");
        b_publicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_publicarMouseClicked(evt);
            }
        });

        pb_votos.setMaximum(180000);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Porcentaje de votos");

        jButton5.setText("Cerrar Sesion");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jMenu5.setText("Datos");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        mi_modificardatos.setText("Modificar Datos");
        mi_modificardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificardatosActionPerformed(evt);
            }
        });
        jMenu5.add(mi_modificardatos);

        jMenuBar2.add(jMenu5);

        FrameUsuarioCandidato.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout FrameUsuarioCandidatoLayout = new javax.swing.GroupLayout(FrameUsuarioCandidato.getContentPane());
        FrameUsuarioCandidato.getContentPane().setLayout(FrameUsuarioCandidatoLayout);
        FrameUsuarioCandidatoLayout.setHorizontalGroup(
            FrameUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameUsuarioCandidatoLayout.createSequentialGroup()
                .addGroup(FrameUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrameUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrameUsuarioCandidatoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton5)
                            .addGap(351, 351, 351)
                            .addComponent(b_publicar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrameUsuarioCandidatoLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pb_votos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        FrameUsuarioCandidatoLayout.setVerticalGroup(
            FrameUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameUsuarioCandidatoLayout.createSequentialGroup()
                .addGroup(FrameUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameUsuarioCandidatoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pb_votos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameUsuarioCandidatoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel18)))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(FrameUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_publicar)
                    .addComponent(jButton5))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setText("Usuario: ");

        jLabel2.setText("Contrasena: ");

        jLabel3.setText("Fecha de nacimiento: ");

        jLabel4.setText("Correo electronico:");

        jLabel5.setText("Sexo: ");

        jLabel6.setText("Nombre Completo: ");

        jC_Usuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario Comun", "Usuario Candidato" }));

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
                            .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_correoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jd_registrarLayout.createSequentialGroup()
                                    .addComponent(dc_fechadenacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(2, 2, 2)))))
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(15, 15, 15)
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
        FrameUsuarioComun.setMinimumSize(new java.awt.Dimension(800, 650));
        FrameUsuarioComun.setResizable(false);

        ListaAmigos.setModel(new DefaultListModel());
        ListaAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaAmigos);

        jScrollPane2.setViewportView(jList2);

        jLabel16.setText("Candidatos Seguidos");

        jLabel17.setText("Amigos");

        btnCargarActas.setText("Cargar Acta");
        btnCargarActas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarActasMouseClicked(evt);
            }
        });
        btnCargarActas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActasActionPerformed(evt);
            }
        });

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
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Amigos");

        jMenuItem3.setText("Agregar Amigos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Buzon");

        jMenuItem6.setText("Mensajeria");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Salir");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Cerrar Sesion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

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
                        .addGap(122, 122, 122)
                        .addComponent(btnCargarActas, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                        .addGap(575, 575, 575)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameUsuarioComunLayout.createSequentialGroup()
                        .addGap(556, 556, 556)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(17, 17, 17)
                        .addComponent(btnCargarActas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

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
                                    .addComponent(tf_ModCorreo)
                                    .addComponent(tf_ModNombre)
                                    .addComponent(tf_ModContra)
                                    .addComponent(tf_ModUsuario)
                                    .addComponent(dtModFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(jLabel10)
                    .addComponent(tf_ModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(FrameModDatosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tf_ModContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModDatosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12))
                    .addGroup(FrameModDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dtModFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_ModCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_ModSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_ModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnRegresarModDatos)
                .addContainerGap())
        );

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
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jLabel19.setText("Usuario");

        jLabel20.setText("Contrasena");

        jLabel21.setText("Fecha de Nacimineto");

        jLabel22.setText("Correo");

        jLabel23.setText("Sexo");

        jLabel24.setText("Nombre Completo");

        tf_ModUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ModUsuario1ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar Datos");

        bt_RegreModDatos1.setText("jButton5");

        javax.swing.GroupLayout jd_ModUsuarioCandidatoLayout = new javax.swing.GroupLayout(jd_ModUsuarioCandidato.getContentPane());
        jd_ModUsuarioCandidato.getContentPane().setLayout(jd_ModUsuarioCandidatoLayout);
        jd_ModUsuarioCandidatoLayout.setHorizontalGroup(
            jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ModUsuarioCandidatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addGap(40, 40, 40)
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_ModUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(tf_ModContra1)
                        .addComponent(tf_ModFecNaci1)
                        .addComponent(tf_ModCorreo1)
                        .addComponent(tf_ModSexo1)
                        .addComponent(tf_ModNombre1)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ModUsuarioCandidatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_RegreModDatos1)
                .addGap(20, 20, 20))
        );
        jd_ModUsuarioCandidatoLayout.setVerticalGroup(
            jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ModUsuarioCandidatoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_ModUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_ModContra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_ModFecNaci1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_ModCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_ModSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuarioCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_ModNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_RegreModDatos1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FrameActas.setResizable(false);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTree1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jLabel25.setText("Jose Alfonzo Diaz");

        jLabel26.setText("Salvador Nasralla");

        jLabel27.setText("Eliseo Vallecillo");

        jLabel28.setText("Lucas Evangelisto");

        jLabel29.setText("Luis Zelaya");

        jLabel30.setText("Romeo Vasquez");

        jLabel31.setText("Isaias Fonseca");

        jLabel32.setText("Marlene Alvarenga");

        jLabel33.setText("Juan Orlando Hernandez");

        btn_GuardarResultados.setText("Guardar");
        btn_GuardarResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GuardarResultadosMouseClicked(evt);
            }
        });

        jButton3.setText("Regresar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameActasLayout = new javax.swing.GroupLayout(FrameActas.getContentPane());
        FrameActas.getContentPane().setLayout(FrameActasLayout);
        FrameActasLayout.setHorizontalGroup(
            FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameActasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameActasLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_JoseAlfonsoDiaz)
                            .addComponent(tf_SalvadorNasralla)
                            .addComponent(tf_EliseoVallecillo)
                            .addComponent(tf_Lucas, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(tf_LuisZelaya)
                            .addComponent(tf_Romeo)
                            .addComponent(tf_isaias)
                            .addComponent(tf_marlenealvarenga)
                            .addComponent(tf_JOH))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameActasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_GuardarResultados)
                        .addGap(157, 157, 157))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameActasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        FrameActasLayout.setVerticalGroup(
            FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameActasLayout.createSequentialGroup()
                .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameActasLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)))
                    .addGroup(FrameActasLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(tf_JoseAlfonsoDiaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tf_SalvadorNasralla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tf_EliseoVallecillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(tf_Lucas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(tf_LuisZelaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(tf_Romeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(tf_isaias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(tf_marlenealvarenga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameActasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(tf_JOH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btn_GuardarResultados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        FrameAmigos.setPreferredSize(new java.awt.Dimension(400, 600));
        FrameAmigos.setSize(new java.awt.Dimension(400, 600));
        FrameAmigos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaUsuariosComunes.setModel(new DefaultListModel());
        ListaUsuariosComunes.setToolTipText("");
        ListaUsuariosComunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaUsuariosComunesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(ListaUsuariosComunes);

        FrameAmigos.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 338, 488));

        jLabel34.setText("Usuarios Comunes");
        FrameAmigos.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        JMIAgregarAmigo.setText("Agregar Amigo");
        JMIAgregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAgregarAmigoActionPerformed(evt);
            }
        });
        POPUPAgregarAmigos.add(JMIAgregarAmigo);

        JMIEliminarAmigo.setText("Eliminar Amigo");
        JMIEliminarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIEliminarAmigoActionPerformed(evt);
            }
        });
        POPUPAmigos.add(JMIEliminarAmigo);

        DialogSeguirCandidato.setPreferredSize(new java.awt.Dimension(500, 500));
        DialogSeguirCandidato.setSize(new java.awt.Dimension(500, 500));

        jList1.setModel(new DefaultListModel());
        jScrollPane7.setViewportView(jList1);

        jLabel35.setText("Candidatos");

        javax.swing.GroupLayout DialogSeguirCandidatoLayout = new javax.swing.GroupLayout(DialogSeguirCandidato.getContentPane());
        DialogSeguirCandidato.getContentPane().setLayout(DialogSeguirCandidatoLayout);
        DialogSeguirCandidatoLayout.setHorizontalGroup(
            DialogSeguirCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogSeguirCandidatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
            .addGroup(DialogSeguirCandidatoLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel35)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        DialogSeguirCandidatoLayout.setVerticalGroup(
            DialogSeguirCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogSeguirCandidatoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel35)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        FrameMensajeria.setPreferredSize(new java.awt.Dimension(800, 650));
        FrameMensajeria.setSize(new java.awt.Dimension(800, 650));

        ListaMensajes.setModel(new DefaultListModel());
        ListaMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMensajesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(ListaMensajes);

        taMensaje.setEditable(false);
        taMensaje.setColumns(20);
        taMensaje.setRows(5);
        jScrollPane9.setViewportView(taMensaje);

        jLabel36.setText("Emisor");

        jLabel37.setText("Receptor");

        tfMensajeriaEmisor.setEditable(false);

        tfMensajeriaReceptor.setEditable(false);

        btnRedactarMensaje.setText("Redacte un Mensaje");
        btnRedactarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRedactarMensajeMouseClicked(evt);
            }
        });

        jLabel41.setText("Mensajes Recibidos");

        javax.swing.GroupLayout FrameMensajeriaLayout = new javax.swing.GroupLayout(FrameMensajeria.getContentPane());
        FrameMensajeria.getContentPane().setLayout(FrameMensajeriaLayout);
        FrameMensajeriaLayout.setHorizontalGroup(
            FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameMensajeriaLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameMensajeriaLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameMensajeriaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameMensajeriaLayout.createSequentialGroup()
                                .addGroup(FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addGap(51, 51, 51)
                                .addGroup(FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMensajeriaEmisor)
                                    .addComponent(tfMensajeriaReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameMensajeriaLayout.createSequentialGroup()
                                .addComponent(lblTituloMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameMensajeriaLayout.createSequentialGroup()
                                .addComponent(btnRedactarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135))))))
            .addGroup(FrameMensajeriaLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel41)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FrameMensajeriaLayout.setVerticalGroup(
            FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameMensajeriaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameMensajeriaLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FrameMensajeriaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(tfMensajeriaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(FrameMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(tfMensajeriaReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(lblTituloMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btnRedactarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        DialogRedactarMensaje.setPreferredSize(new java.awt.Dimension(800, 600));
        DialogRedactarMensaje.setSize(new java.awt.Dimension(800, 600));

        taMensajeEnviar.setColumns(20);
        taMensajeEnviar.setRows(5);
        jScrollPane10.setViewportView(taMensajeEnviar);

        jLabel38.setText("Emisor");

        jLabel39.setText("Receptor");

        tfEnviarEmisor.setEditable(false);

        tfEnviarReceptor.setEditable(false);

        jLabel40.setText("Titulo");

        btnEnviarMensaje.setText("Enviar Mensaje");
        btnEnviarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMensajeMouseClicked(evt);
            }
        });

        ListaEnviarMensajeAmigo.setModel(new DefaultListModel());
        ListaEnviarMensajeAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaEnviarMensajeAmigoMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(ListaEnviarMensajeAmigo);

        javax.swing.GroupLayout DialogRedactarMensajeLayout = new javax.swing.GroupLayout(DialogRedactarMensaje.getContentPane());
        DialogRedactarMensaje.getContentPane().setLayout(DialogRedactarMensajeLayout);
        DialogRedactarMensajeLayout.setHorizontalGroup(
            DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogRedactarMensajeLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogRedactarMensajeLayout.createSequentialGroup()
                        .addComponent(btnEnviarMensaje)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogRedactarMensajeLayout.createSequentialGroup()
                        .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogRedactarMensajeLayout.createSequentialGroup()
                                .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))
                                .addGap(51, 51, 51)
                                .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEnviarEmisor)
                                    .addComponent(tfEnviarReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(DialogRedactarMensajeLayout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(tfEnviarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogRedactarMensajeLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        DialogRedactarMensajeLayout.setVerticalGroup(
            DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogRedactarMensajeLayout.createSequentialGroup()
                .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogRedactarMensajeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(tfEnviarEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(tfEnviarReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogRedactarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEnviarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnEnviarMensaje))
                    .addGroup(DialogRedactarMensajeLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));

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
        if (((String) jC_Usuarios.getSelectedItem()).equalsIgnoreCase("Usuario Comun")) {
            usuario.add(new UsuarioComun(this.tf_usuario.getText(), this.tf_contrasena.getText(), this.dc_fechadenacimiento.getDate(),
                    this.tf_correoelectronico.getText(), this.tf_sexo.getText(), this.tf_nombre.getText()));
        } else if (((String) jC_Usuarios.getSelectedItem()).equalsIgnoreCase("Usuario Candidato")) {
            usuario.add(new UsuarioCandidato(this.tf_usuario.getText(), this.tf_contrasena.getText(), this.dc_fechadenacimiento.getDate(),
                    this.tf_correoelectronico.getText(), this.tf_sexo.getText(), this.tf_nombre.getText()));
        }
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
        FrameModDatos.setVisible(true);
        tf_ModNombre.setText(log.getNombre());
        tf_ModContra.setText(log.getContrasena());
        dtModFecha.setDate(log.getFechadenacimiento());
        tf_ModCorreo.setText(log.getCorreoelectronico());
        tf_ModSexo.setText(log.getSexo());
        tf_ModNombre.setText(log.getNombre());

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
            if (log instanceof UsuarioComun) {
                FrameUsuarioComun.pack();
                FrameUsuarioComun.setLocationRelativeTo(null);
                FrameUsuarioComun.setVisible(true);
                FrameIniciarSesion.setVisible(false);
                
                cargarListaUsuariosComunes();
                cargarPublicaciones();
                cargarAmigos();
            } else if (log instanceof UsuarioCandidato) {
                FrameUsuarioCandidato.pack();
                FrameUsuarioCandidato.setLocationRelativeTo(null);
                FrameUsuarioCandidato.setVisible(true);
                FrameIniciarSesion.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta");
        }
    }//GEN-LAST:event_jB_LogInMouseClicked

    private void mi_modificardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificardatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_modificardatosActionPerformed

    private void tf_ModUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ModUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ModUsuario1ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        jd_ModUsuarioCandidato.setVisible(true);
        FrameUsuarioCandidato.setVisible(false);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        FrameUsuarioCandidato.setVisible(false);
        FrameIniciarSesion.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void btnCargarActasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActasActionPerformed

    private void btnCargarActasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarActasMouseClicked
        FrameUsuarioComun.setVisible(false);
        FrameActas.setVisible(true);
        DefaultTreeModel m = (DefaultTreeModel) jTree1.getModel();
        File f = new File("./src\\Actas");
        m.setRoot(new DefaultMutableTreeNode(f.getName()));
        listartodo(f, (DefaultMutableTreeNode) m.getRoot());
    }//GEN-LAST:event_btnCargarActasMouseClicked
    
    private AdminActas a = null;

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        if (evt.isMetaDown()) {
            DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
            DefaultMutableTreeNode p = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
            String ruta = "";
            for (int i = 0; i < p.getPath().length - 1; i++) {
                if (i + 1 == p.getPath().length - 1) {
                    ruta = ruta + p.getPath()[i + 1];
                } else {
                    ruta = ruta + p.getPath()[i + 1] + "\\";
                }
            }
            ruta = "./src\\Actas\\" + ruta;
            System.out.println(ruta);
            
            a = new AdminActas(ruta);
            try {
                jTextArea1.setText(a.leerArchivo());
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }

    }//GEN-LAST:event_jTree1MouseClicked

    private void btn_GuardarResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarResultadosMouseClicked
        int josealfonso = Integer.parseInt(tf_JoseAlfonsoDiaz.getText());
        int salvadornasralla = Integer.parseInt(tf_SalvadorNasralla.getText());
        int eliseo = Integer.parseInt(tf_EliseoVallecillo.getText());
        int lucas = Integer.parseInt(tf_Lucas.getText());
        int luiszelaya = Integer.parseInt(tf_LuisZelaya.getText());
        int romeo = Integer.parseInt(tf_Romeo.getText());
        int isaias = Integer.parseInt(tf_isaias.getText());
        int marlene = Integer.parseInt(tf_marlenealvarenga.getText());
        int joh = Integer.parseInt(tf_JOH.getText());

//1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0,
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        int[] s = new int[9];
        String nuevosresultados = "";
        
        try {
            archivo = new File("./src\\Resultados\\Results.txt");
            sc = new Scanner(archivo);
            sc.useDelimiter(",");
            int cont = 0;
            String l = "";
            for (int i = 0; i < 9; i++) {
                sc.nextInt();
                s[i] = sc.nextInt();
                l = l + s[i];
            }
            s[0] = s[0] + josealfonso;
            s[1] = s[1] + salvadornasralla;
            s[2] = s[2] + eliseo;
            s[3] = s[3] + lucas;
            s[4] = s[4] + luiszelaya;
            s[5] = s[5] + romeo;
            s[6] = s[6] + isaias;
            s[7] = s[7] + marlene;
            s[8] = s[8] + joh;
            int conteo = 1;
            for (int i = 0; i < 9; i++) {
                nuevosresultados = nuevosresultados + conteo + "," + s[i] + ",";
                conteo++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            archivo = new File("./src\\Resultados\\Results.txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write(nuevosresultados);
            bw.flush();
            JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            
        }
        tf_JoseAlfonsoDiaz.setText("");
        tf_SalvadorNasralla.setText("");
        tf_EliseoVallecillo.setText("");
        tf_Lucas.setText("");
        tf_LuisZelaya.setText("");
        tf_Romeo.setText("");
        tf_isaias.setText("");
        tf_marlenealvarenga.setText("");
        tf_JOH.setText("");

    }//GEN-LAST:event_btn_GuardarResultadosMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        FrameUsuarioComun.setVisible(true);
        FrameActas.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrameAmigos.setVisible(true);
        FrameAmigos.pack();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void b_publicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_publicarMouseClicked
        // TODO add your handling code here:
        if (log_usuario.getText().equalsIgnoreCase("salvadornasralla")) {
            puSalvador.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("romeovasquez")) {
            puRomeo.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("marlenealvarenga")) {
            puMarlene.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("luiszelaya")) {
            puLuis.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("lucasevangelisto")) {
            puLucas.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("juanorlando")) {
            puJOH.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("josealfonzo")) {
            puJoseAlfonzo.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("isaiasfonseca")) {
            puIsaias.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        } else if (log_usuario.getText().equalsIgnoreCase("eliseovallecillo")) {
            puEliseo.add(new Publicaciones(log_usuario.getText(), ta_publicar.getText()));
            escribirPublicaciones();
        }

    }//GEN-LAST:event_b_publicarMouseClicked

    private void ListaUsuariosComunesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUsuariosComunesMouseClicked
        if (evt.isMetaDown()) {
            POPUPAgregarAmigos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ListaUsuariosComunesMouseClicked

    private void JMIAgregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAgregarAmigoActionPerformed
        int x = ListaUsuariosComunes.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) ListaUsuariosComunes.getModel();
        UsuarioComun uc = ((UsuarioComun) modelo.getElementAt(x));
        if (uc.getAmigos().contains((UsuarioComun) log) || ((UsuarioComun) log).getAmigos().contains((uc))) {
            JOptionPane.showMessageDialog(this, "Usuario ya es su Amigo");
        } else if (uc == ((UsuarioComun) log)) {
            JOptionPane.showMessageDialog(this, "No puede agregarse a si mismo");
        } else {
            ((UsuarioComun) log).getAmigos().add(uc);
            uc.getAmigos().add((UsuarioComun) log);
            JOptionPane.showMessageDialog(this, "Amigo Agregado");
            cargarAmigos();
        }
    }//GEN-LAST:event_JMIAgregarAmigoActionPerformed

    private void ListaAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaAmigosMouseClicked
        if (evt.isMetaDown()) {
            POPUPAmigos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ListaAmigosMouseClicked

    private void JMIEliminarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIEliminarAmigoActionPerformed
        int x = ListaAmigos.getSelectedIndex();
        DefaultListModel modelolista = (DefaultListModel) ListaAmigos.getModel();
        UsuarioComun uc = (UsuarioComun) modelolista.getElementAt(x);
        ((UsuarioComun) log).getAmigos().remove(uc);
        uc.getAmigos().remove((UsuarioComun) log);
        cargarAmigos();
        JOptionPane.showMessageDialog(this, "Usuario Comun Eliminado de sus Amigos");
    }//GEN-LAST:event_JMIEliminarAmigoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DialogSeguirCandidato.setVisible(true);
        DialogSeguirCandidato.pack();
        DialogSeguirCandidato.setBounds(500, 500, 800, 300);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        for (Mensaje m : ((UsuarioComun) log).getMensaje()) {
            modelo.addElement(m);
        }
        ListaEnviarMensajeAmigo.setModel(new DefaultListModel());
        DefaultListModel modelo2 = (DefaultListModel) ListaEnviarMensajeAmigo.getModel();
        if (log instanceof UsuarioComun) {
            for (UsuarioComun u : ((UsuarioComun) log).getAmigos()) {
                modelo2.addElement(u);
            }
        }
        ListaEnviarMensajeAmigo.setModel(modelo2);
        ListaMensajes.setModel(modelo);
        FrameMensajeria.setVisible(true);
        FrameMensajeria.pack();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnRedactarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRedactarMensajeMouseClicked
        DialogRedactarMensaje.pack();
        DialogRedactarMensaje.setVisible(true);

    }//GEN-LAST:event_btnRedactarMensajeMouseClicked

    private void ListaEnviarMensajeAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaEnviarMensajeAmigoMouseClicked
        int x = ListaEnviarMensajeAmigo.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) ListaEnviarMensajeAmigo.getModel();
        UsuarioComun uc = (UsuarioComun) modelo.getElementAt(x);
        tfEnviarReceptor.setText("@" + uc.getUsuario());
        tfEnviarEmisor.setText("@" + log.getUsuario());

    }//GEN-LAST:event_ListaEnviarMensajeAmigoMouseClicked

    private void btnEnviarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMensajeMouseClicked
        int x = ListaEnviarMensajeAmigo.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) ListaEnviarMensajeAmigo.getModel();
        String emisor = tfEnviarEmisor.getText();
        String receptor = tfEnviarReceptor.getText();
        String titulo = tfEnviarTitulo.getText();
        String cuerpo = taMensajeEnviar.getText();
        UsuarioComun uc = (UsuarioComun) modelo.getElementAt(x);
        uc.getMensaje().add(new Mensaje(emisor, receptor, titulo, cuerpo));
        tfEnviarEmisor.setText("");
        tfEnviarReceptor.setText("");
        tfEnviarTitulo.setText("");
        taMensajeEnviar.setText("");
        JOptionPane.showMessageDialog(this, "Mensaje Enviado", "Notificacion", INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnEnviarMensajeMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(this, "Cerro Sesion");
        FrameUsuarioComun.setVisible(false);
        this.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void ListaMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMensajesMouseClicked
        /*DefaultListModel model = new DefaultListModel();
        for (Mensaje uc : ((UsuarioComun) log).getMensaje()) {
            model.addElement(uc);
        }
        ListaMensajes.setModel(model);*/
        DefaultListModel modelo2 = (DefaultListModel) ListaMensajes.getModel();
        int x = ListaMensajes.getSelectedIndex();
        Mensaje m = (Mensaje)modelo2.getElementAt(x);
        tfMensajeriaEmisor.setText(m.getEmisor());
        tfMensajeriaReceptor.setText(m.getReceptor());
        lblTituloMensaje.setText(m.getTitulo());
        taMensaje.setText(m.getCuerpo());
        
        
    }//GEN-LAST:event_ListaMensajesMouseClicked
    public File obtenerRuta(DefaultMutableTreeNode p) {
        String ruta = "";
        for (int i = 0; i < p.getPath().length - 1; i++) {
            ruta = ruta + p.getPath()[i + 1] + "\\";
        }
        File f = new File(ruta);
        return f;
    }
    
    private void listartodo(File p_raiz, DefaultMutableTreeNode nodo) {
        try {
            ArrayList<File> l1 = new ArrayList();
            ArrayList<File> l2 = new ArrayList();
            ArrayList<File> l3 = new ArrayList();
            for (File f : p_raiz.listFiles()) {
                if (f.isDirectory()) {
                    l1.add(f);
                } else {
                    l2.add(f);
                }
            }
            l3.addAll(l1);
            l3.addAll(l2);
            
            for (File temp : l3) {
                if (temp.isFile()) {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                } else {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                    listartodo(temp, n);
                }
            }
            
        } catch (Exception e) {
            
        }
    }
    
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
    private javax.swing.JDialog DialogRedactarMensaje;
    private javax.swing.JDialog DialogSeguirCandidato;
    private javax.swing.JFrame FrameActas;
    private javax.swing.JFrame FrameAmigos;
    private javax.swing.JFrame FrameIniciarSesion;
    private javax.swing.JFrame FrameMensajeria;
    private javax.swing.JFrame FrameModDatos;
    private javax.swing.JFrame FrameUsuarioCandidato;
    private javax.swing.JFrame FrameUsuarioComun;
    private javax.swing.JMenuItem JMIAgregarAmigo;
    private javax.swing.JMenuItem JMIEliminarAmigo;
    private javax.swing.JList<String> ListaAmigos;
    private javax.swing.JList<String> ListaEnviarMensajeAmigo;
    private javax.swing.JList<String> ListaMensajes;
    private javax.swing.JList<String> ListaUsuariosComunes;
    private javax.swing.JPopupMenu POPUPAgregarAmigos;
    private javax.swing.JPopupMenu POPUPAmigos;
    private javax.swing.JButton b_publicar;
    private javax.swing.JButton bt_RegreModDatos1;
    private javax.swing.JButton btnCargarActas;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnIniciarSesion1;
    private javax.swing.JButton btnRedactarMensaje;
    private javax.swing.JButton btnRegistro1;
    private javax.swing.JButton btnRegresarModDatos;
    private javax.swing.JButton btn_GuardarResultados;
    private com.toedter.calendar.JDateChooser dc_fechadenacimiento;
    private com.toedter.calendar.JDateChooser dtModFecha;
    private javax.swing.JButton jB_LogIn;
    private javax.swing.JButton jB_Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jC_Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
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
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    private javax.swing.JDialog jd_ModUsuarioCandidato;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JDialog jd_test;
    private javax.swing.JLabel lblTituloMensaje;
    private javax.swing.JPasswordField log_password;
    private javax.swing.JTextField log_usuario;
    private javax.swing.JMenuItem mi_modificardatos;
    private javax.swing.JProgressBar pb_votos;
    private javax.swing.JTextArea taMensaje;
    private javax.swing.JTextArea taMensajeEnviar;
    private javax.swing.JTextArea ta_publicar;
    private javax.swing.JTextField tfEnviarEmisor;
    private javax.swing.JTextField tfEnviarReceptor;
    private javax.swing.JTextField tfEnviarTitulo;
    private javax.swing.JTextField tfMensajeriaEmisor;
    private javax.swing.JTextField tfMensajeriaReceptor;
    private javax.swing.JTextField tf_EliseoVallecillo;
    private javax.swing.JTextField tf_JOH;
    private javax.swing.JTextField tf_JoseAlfonsoDiaz;
    private javax.swing.JTextField tf_Lucas;
    private javax.swing.JTextField tf_LuisZelaya;
    private javax.swing.JTextField tf_ModContra;
    private javax.swing.JTextField tf_ModContra1;
    private javax.swing.JTextField tf_ModCorreo;
    private javax.swing.JTextField tf_ModCorreo1;
    private javax.swing.JTextField tf_ModFecNaci1;
    private javax.swing.JTextField tf_ModNombre;
    private javax.swing.JTextField tf_ModNombre1;
    private javax.swing.JTextField tf_ModSexo;
    private javax.swing.JTextField tf_ModSexo1;
    private javax.swing.JTextField tf_ModUsuario;
    private javax.swing.JTextField tf_ModUsuario1;
    private javax.swing.JTextField tf_Romeo;
    private javax.swing.JTextField tf_SalvadorNasralla;
    private javax.swing.JPasswordField tf_contrasena;
    private javax.swing.JTextField tf_correoelectronico;
    private javax.swing.JTextField tf_isaias;
    private javax.swing.JTextField tf_marlenealvarenga;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_sexo;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuarios> usuario = new ArrayList();
    Usuarios log;
    ArrayList<Publicaciones> puEliseo = new ArrayList();
    ArrayList<Publicaciones> puIsaias = new ArrayList();
    ArrayList<Publicaciones> puJoseAlfonzo = new ArrayList();
    ArrayList<Publicaciones> puJOH = new ArrayList();
    ArrayList<Publicaciones> puLucas = new ArrayList();
    ArrayList<Publicaciones> puLuis = new ArrayList();
    ArrayList<Publicaciones> puMarlene = new ArrayList();
    ArrayList<Publicaciones> puRomeo = new ArrayList();
    ArrayList<Publicaciones> puSalvador = new ArrayList();
    
    public void escribirPublicaciones() {
        if (log_usuario.getText().equalsIgnoreCase("salvadornasralla")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\SalvadorNasralla.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puSalvador) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
            } catch (Exception e) {
                
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        } else if (log_usuario.getText().equalsIgnoreCase("romeovasquez")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\RomeoVasquez.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puRomeo) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
        } else if (log_usuario.getText().equalsIgnoreCase("marlenealvarenga")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\MarleneAlvarenga.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puMarlene) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
                
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
        } else if (log_usuario.getText().equalsIgnoreCase("luiszelaya")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\LuisZelaya.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puLuis) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                    
                }
                bw.flush();
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
        } else if (log_usuario.getText().equalsIgnoreCase("lucasevangelisto")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\LucasEvangelisto.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puLucas) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
                
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
        } else if (log_usuario.getText().equalsIgnoreCase("juanorlando")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\JuanOrlandoHernandez.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puJOH) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
                
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
        } else if (log_usuario.getText().equalsIgnoreCase("josealfonzo")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\JoseAlfonzoDiaz.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puJoseAlfonzo) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
                
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
        } else if (log_usuario.getText().equalsIgnoreCase("isaiasfonseca")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\IsaiasFonseca.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puIsaias) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
                
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
        } else if (log_usuario.getText().equalsIgnoreCase("eliseovallecillo")) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter("./src\\Publicaciones\\EliseoVallecillo.txt", true);
                bw = new BufferedWriter(fw);
                for (Publicaciones t : puEliseo) {
                    bw.write(t.getEmisor() + ";");
                    bw.newLine();
                    bw.write(t.getCuerpo() + ";");
                    bw.newLine();
                }
                bw.flush();
                
            } catch (Exception e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
    }
    
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
    
    private void cargarListaUsuariosComunes() {
        ListaUsuariosComunes.setModel(new DefaultListModel());
        DefaultListModel modeloamigos = (DefaultListModel) ListaUsuariosComunes.getModel();
        for (int i = 0; i < usuario.size(); i++) {
            modeloamigos.addElement(usuario.get(i));
        }
        ListaUsuariosComunes.setModel(modeloamigos);
    }
    
    public void cargarPublicaciones() {
        if (log instanceof UsuarioComun) {
            for (UsuarioCandidato t : ((UsuarioComun) log).getCandidato()) {
                if (t.getNombre().equalsIgnoreCase("salvadornasralla")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\SalvadorNasralla.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puSalvador.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                } else if (t.getNombre().equalsIgnoreCase("romeovasquez")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\RomeoVasquez.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puRomeo.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                } else if (t.getNombre().equalsIgnoreCase("marlenealvarenga")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\MarleneAlvarenga.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puMarlene.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                } else if (t.getNombre().equalsIgnoreCase("luiszelaya")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\LuisZelaya.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puLuis.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                } else if (t.getNombre().equalsIgnoreCase("lucasevangelisto")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\LucasEvangelisto.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puLucas.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                } else if (t.getNombre().equalsIgnoreCase("juanorlando")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\JuanOrlandoHernandez.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puJOH.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                    
                } else if (t.getNombre().equalsIgnoreCase("josealfonzo")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\JoseAlfonzoDiaz.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puJoseAlfonzo.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                } else if (t.getNombre().equalsIgnoreCase("isaiasfonseca")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\IsaiasFonseca.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puIsaias.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                } else if (t.getNombre().equalsIgnoreCase("eliseovallecillo")) {
                    Scanner sc = null;
                    File archivo = new File("./src\\Publicaciones\\EliseoVallecillo.txt");
                    try {
                        sc = new Scanner(archivo);
                        while (sc.hasNextLine()) {
                            String emisor, cuerpo;
                            emisor = sc.nextLine();
                            cuerpo = sc.nextLine();
                            puEliseo.add(new Publicaciones(emisor, cuerpo));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sc.close();
                    
                }
            }
            
        }
        
    }
    
    private void cargarAmigos() {
        ListaAmigos.setModel(new DefaultListModel());
        DefaultListModel modelo = (DefaultListModel) ListaAmigos.getModel();
        if (log instanceof UsuarioComun) {
            for (UsuarioComun u : ((UsuarioComun) log).getAmigos()) {
                modelo.addElement(u);
            }
        }
        ListaAmigos.setModel(modelo);
    }
}
