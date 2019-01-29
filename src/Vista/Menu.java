package Vista;
import Control.Tablas;
import Control.Usuario;
import Modelo.Conexion;
import Modelo.SqlUsuario;
import static Vista.Login.txtIu;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Menu extends javax.swing.JFrame {
    SqlUsuario mod;
    Tablas t=new Tablas();
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.setExtendedState(Menu.MAXIMIZED_BOTH);
         t.LLTablaAbono();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        PanelPrestamoExterno = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Agregar_Usuario = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaAbono = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        buttonAction3 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction4 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction6 = new org.edisoncor.gui.button.ButtonAction();
        jSeparator8 = new javax.swing.JSeparator();
        textFieldRectBackground7 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnGuardarPrestamo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPrestamoInterno = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        textFieldRectBackground1 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        textFieldRectBackground2 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        textFieldRectBackground3 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        textFieldRectBackground5 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        textFieldRectBackground6 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        buttonAction5 = new org.edisoncor.gui.button.ButtonAction();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPrestamoExterno = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        btnBudcsrNombre = new javax.swing.JButton();
        btnBuscarPrestamo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AGREGAR CLIENTE NUEVO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        Agregar_Usuario.setText("AGREGAR");
        Agregar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_UsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Agregar_Usuario)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Agregar_Usuario)
                .addGap(25, 25, 25))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Abono De Cliente Registrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel18.setText("NOMBRE");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 31, -1, -1));
        jPanel9.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 188, -1));

        TablaAbono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaAbono);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 147, 1300, 165));

        jLabel19.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel19.setText("ID");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 77, -1, -1));
        jPanel9.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 154, -1));

        jLabel20.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel20.setText("NOMBRE");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 337, -1, -1));

        jLabel21.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel21.setText("APELLIDO PATERNO");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 337, -1, -1));

        jLabel22.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel22.setText("APELLIDO MATERNO");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 337, -1, -1));

        jLabel23.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel23.setText("<html>CANTIDAD DE PRESTAMO</html>");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 375, 77, -1));

        jLabel24.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel24.setText("<html>FECHA DE PRESTAMO</html>");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 375, 78, -1));
        jPanel9.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 336, 182, -1));
        jPanel9.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 374, 139, -1));
        jPanel9.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 336, 182, -1));
        jPanel9.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 374, 182, -1));
        jPanel9.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(987, 336, 179, -1));

        buttonAction3.setText("Buscar");
        buttonAction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction3ActionPerformed(evt);
            }
        });
        jPanel9.add(buttonAction3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 31, 89, 27));

        buttonAction4.setText("Buscar");
        jPanel9.add(buttonAction4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 89, 27));

        buttonAction6.setText("Añadir Nuevo Abono");
        jPanel9.add(buttonAction6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 391, 180, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 210, 10));

        textFieldRectBackground7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textFieldRectBackground7.setColorDeBorde(new java.awt.Color(255, 255, 255));
        jPanel9.add(textFieldRectBackground7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 190, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        PanelPrestamoExterno.addTab("INICIO", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), "Nuevo Prestamo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel4.setText("CANTIDAD");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel5.setText("APELLIDO PATERNO");

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel6.setText("APELLIDO MATERNO");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGuardarPrestamo.setText("Guardar Prestamo");

        btnLimpiar.setText("Limpiar Campos");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel29.setText("DIRECCION");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardarPrestamo))
                .addGap(61, 61, 61))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11)
                            .addComponent(jTextField12))
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarPrestamo)
                .addGap(34, 34, 34))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pago De Prestamo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaPrestamoInterno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaPrestamoInterno);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 356, 790, 248));

        jLabel25.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel25.setText("<html>BUSCAR POR NOMBRE</html>");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel26.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel26.setText("NO. PRESTAMO");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 36, -1, -1));

        jLabel27.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel27.setText("NOMBRE");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel28.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel28.setText("CANTIDAD");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel31.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel31.setText("<html>BUSCAR POR NO. PRESTAMO</html>");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));

        textFieldRectBackground1.setBorder(null);
        textFieldRectBackground1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        textFieldRectBackground1.setColorDeTextoBackground(new java.awt.Color(204, 204, 204));
        textFieldRectBackground1.setDescripcion(" ingrese el texto aquí");
        textFieldRectBackground1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPanel10.add(textFieldRectBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 150, -1));

        textFieldRectBackground2.setBorder(null);
        textFieldRectBackground2.setColorDeBorde(new java.awt.Color(255, 255, 255));
        textFieldRectBackground2.setColorDeTextoBackground(new java.awt.Color(204, 204, 204));
        textFieldRectBackground2.setDescripcion("ingrese el nombre aquí");
        textFieldRectBackground2.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        textFieldRectBackground2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPanel10.add(textFieldRectBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, -1));

        textFieldRectBackground3.setBorder(null);
        textFieldRectBackground3.setColorDeBorde(new java.awt.Color(255, 255, 255));
        textFieldRectBackground3.setColorDeTextoBackground(new java.awt.Color(204, 204, 204));
        textFieldRectBackground3.setDescripcion("ingrese el cantidad aquí");
        textFieldRectBackground3.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        textFieldRectBackground3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPanel10.add(textFieldRectBackground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, -1));

        textFieldRectBackground5.setBorder(null);
        textFieldRectBackground5.setColorDeBorde(new java.awt.Color(255, 255, 255));
        textFieldRectBackground5.setColorDeTextoBackground(new java.awt.Color(204, 204, 204));
        textFieldRectBackground5.setDescripcion("ingrese el No. Prestamo aquí");
        textFieldRectBackground5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPanel10.add(textFieldRectBackground5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 180, -1));

        textFieldRectBackground6.setBorder(null);
        textFieldRectBackground6.setColorDeBorde(new java.awt.Color(255, 255, 255));
        textFieldRectBackground6.setDescripcion("ingrese el nombre aquí");
        textFieldRectBackground6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPanel10.add(textFieldRectBackground6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 200, -1));

        buttonAction1.setText("Buscar");
        jPanel10.add(buttonAction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 82, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 20));

        buttonAction2.setText("Nuevo Pago");
        jPanel10.add(buttonAction2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 110, 40));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 220, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, 10));

        buttonAction5.setText("Buscar");
        jPanel10.add(buttonAction5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 82, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrestamoExterno.addTab("CLIENTES INTERNOS", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nuevo Prestamo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Apellido Paterno");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nombre");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 52, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Apellido Materno");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, 20));
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, -1));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, -1));
        jPanel8.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 130, -1));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        jButton5.setText("<html>Guardar Prestamo</html>");
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 70, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pago De Prestamo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel10.setText("NO. PRESTAMO");

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel11.setText("NOMBRE");

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel12.setText("CANTIDAD");

        jButton8.setText("Nuevo PAgo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        TablaPrestamoExterno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaPrestamoExterno);

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel13.setText("BUSCAR POR NOMBRE");

        jButton9.setText("Buscar");

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel14.setText("BUSCAR POR NO. PRESTAMO");

        jButton10.setText("Buscar");

        btnBudcsrNombre.setText("Buscar Por Nombre");

        btnBuscarPrestamo.setText("Buscar Por No. Prestamo");

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel15.setText("APELLIDO PATERNO");

        jLabel16.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel16.setText("APELLIDO MATERNO");

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel17.setText("DIRECCION");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5)
                            .addComponent(jTextField7)
                            .addComponent(jTextField15)
                            .addComponent(jTextField17)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addComponent(btnBudcsrNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(btnBuscarPrestamo)
                        .addGap(75, 75, 75))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(4, 4, 4)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)
                    .addComponent(btnBudcsrNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jButton10)
                    .addComponent(btnBuscarPrestamo))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelPrestamoExterno.addTab("PRESTAMO EXTERNO", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrestamoExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrestamoExterno)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_UsuarioActionPerformed
        Agregar_Usuario a=new Agregar_Usuario();
    }//GEN-LAST:event_Agregar_UsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VistaUsuario v=new VistaUsuario();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void buttonAction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction3ActionPerformed

    }//GEN-LAST:event_buttonAction3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Usuario;
    private javax.swing.JTabbedPane PanelPrestamoExterno;
    public static javax.swing.JTable TablaAbono;
    private javax.swing.JTable TablaPrestamoExterno;
    private javax.swing.JTable TablaPrestamoInterno;
    private javax.swing.JButton btnBudcsrNombre;
    private javax.swing.JButton btnBuscarPrestamo;
    private javax.swing.JButton btnGuardarPrestamo;
    private javax.swing.JButton btnLimpiar;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonAction3;
    private org.edisoncor.gui.button.ButtonAction buttonAction4;
    private org.edisoncor.gui.button.ButtonAction buttonAction5;
    private org.edisoncor.gui.button.ButtonAction buttonAction6;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground1;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground2;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground3;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground5;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground6;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground7;
    // End of variables declaration//GEN-END:variables
}