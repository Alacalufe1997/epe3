//Copyright 2019 Nicolas Lobos Carcamo,Diego Parada Sepulveda,Bruny Vidal Lazzaro
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
package Interfaz;
import javax.swing.ButtonGroup;
import Interfaz.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        ImageIcon icono = new ImageIcon (Login.class.getResource("/imagenes/barrelxs.png"));
        this.setIconImage(icono.getImage());
        setLocationRelativeTo(null);
        setTitle("Los Viñedos");
        setResizable(false);
        configurarRB();
        configurarRB2();
        bloquear();
    }
    public void configurarRB(){
        
        ButtonGroup usuario = new ButtonGroup();
        usuario.add(rb_agregar);
        usuario.add(rb_modificar);
        usuario.add(rb_eliminar);
        usuario.add(rb_ver);
        rb_ver.setSelected(true);
    }
    public void configurarRB2(){
        
        ButtonGroup producto = new ButtonGroup();
        producto.add(rb_ingreso);
        producto.add(rb_salida);
        producto.add(rb_productos);
        producto.add(rb_registroIngreso);
        producto.add(rb_registroSalida);
        rb_productos.setSelected(true);
    }
    public void bloquear(){
        String user = Login.user2;
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultados = null;
        String driver = "org.sqlite.JDBC";
        String nombreBD = "LosVinedos.s3db";
        String url = "jdbc:sqlite:"+nombreBD;
        try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "SELECT cargo FROM usuario where user='"+user+"'";
        resultados = sentencia.executeQuery(sql);
             if (resultados.next()) {
                 String cargo = resultados.getString("cargo");
                 if ("bodeguero".equals(cargo)) {
                     jTabbedPane1.setEnabledAt(1, false);
                     
                 }
                 if ("guardia".equals(cargo)) {
                     jTabbedPane1.setEnabledAt(1, false);
                     
                 }
             }
             
        resultados.close();
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          System.out.println("Error: "+e.getMessage());
      }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        rb_ingreso = new javax.swing.JRadioButton();
        rb_salida = new javax.swing.JRadioButton();
        rb_productos = new javax.swing.JRadioButton();
        btn_acpetproducto = new javax.swing.JButton();
        rb_registroIngreso = new javax.swing.JRadioButton();
        rb_registroSalida = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rb_agregar = new javax.swing.JRadioButton();
        rb_modificar = new javax.swing.JRadioButton();
        rb_eliminar = new javax.swing.JRadioButton();
        rb_ver = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        rb_ingreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_ingreso.setText("Ingreso de productos");

        rb_salida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_salida.setText("Salida de productos");

        rb_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_productos.setText("Ver productos");

        btn_acpetproducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_acpetproducto.setText("ACEPTAR");
        btn_acpetproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acpetproductoActionPerformed(evt);
            }
        });

        rb_registroIngreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_registroIngreso.setText("Ver registros de ingreso");

        rb_registroSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_registroSalida.setText("Ver registros de salida");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vino.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_acpetproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_salida)
                                .addComponent(rb_ingreso)
                                .addComponent(rb_productos)
                                .addComponent(rb_registroIngreso)
                                .addComponent(rb_registroSalida)))
                        .addGap(106, 106, 106)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_ingreso)
                .addGap(18, 18, 18)
                .addComponent(rb_salida)
                .addGap(18, 18, 18)
                .addComponent(rb_productos)
                .addGap(18, 18, 18)
                .addComponent(rb_registroIngreso)
                .addGap(18, 18, 18)
                .addComponent(rb_registroSalida)
                .addGap(18, 18, 18)
                .addComponent(btn_acpetproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos", jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        rb_agregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_agregar.setText("Agregar Usuario");

        rb_modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_modificar.setText("Modificar Usuario");

        rb_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_eliminar.setText("Eliminar Usuario");

        rb_ver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_ver.setText("Ver Usuarios");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vino.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_ver)
                    .addComponent(rb_eliminar)
                    .addComponent(rb_modificar)
                    .addComponent(rb_agregar))
                .addGap(158, 158, 158))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(rb_agregar)
                .addGap(18, 18, 18)
                .addComponent(rb_modificar)
                .addGap(18, 18, 18)
                .addComponent(rb_eliminar)
                .addGap(18, 18, 18)
                .addComponent(rb_ver)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuarios", jPanel2);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Desconectar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login lg = new Login();
            lg.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rb_ver.isSelected()) {
            VerUsuarios vu = new VerUsuarios();
            vu.setVisible(true);
            this.dispose();
        }
        if (rb_agregar.isSelected()) {
            Agregar ag = new Agregar();
            ag.setVisible(true);
            this.dispose();
        }
        if (rb_eliminar.isSelected()) {
            Eliminar el = new Eliminar();
            el.setVisible(true);
            this.dispose();
        }
        if (rb_modificar.isSelected()) {
            Modificar md = new Modificar();
            md.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_acpetproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acpetproductoActionPerformed
        if (rb_productos.isSelected()) {
            VerProductos vp = new VerProductos();
            vp.setVisible(true);
            this.dispose();
        }
        if (rb_ingreso.isSelected()) {
            IngresoProducto ip = new IngresoProducto();
            ip.setVisible(true);
            this.dispose();
        }
        if (rb_salida.isSelected()) {
            SalidaProducto sp = new SalidaProducto();
            sp.setVisible(true);
            this.dispose();
        }
        if (rb_registroIngreso.isSelected()) {
            VerRegistro_ingreso vri = new VerRegistro_ingreso();
            vri.setVisible(true);
            this.dispose();
        }
        if (rb_registroSalida.isSelected()) {
            VerRegistro_salida vrs = new VerRegistro_salida();
            vrs.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_acpetproductoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acpetproducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rb_agregar;
    private javax.swing.JRadioButton rb_eliminar;
    private javax.swing.JRadioButton rb_ingreso;
    private javax.swing.JRadioButton rb_modificar;
    private javax.swing.JRadioButton rb_productos;
    private javax.swing.JRadioButton rb_registroIngreso;
    private javax.swing.JRadioButton rb_registroSalida;
    private javax.swing.JRadioButton rb_salida;
    private javax.swing.JRadioButton rb_ver;
    // End of variables declaration//GEN-END:variables
}
