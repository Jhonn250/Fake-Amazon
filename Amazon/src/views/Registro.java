package views;

import classes.User;
import classes.RandomAccess;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhonn250
 */
public class Registro extends javax.swing.JFrame {
    RandomAccess ra = new RandomAccess();

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        deactivate();
    }
    
    public void activate(){
        IDTXT.setEnabled(true);
        NAMETXT.setEnabled(true);
        APTXT.setEnabled(true);
        AMTXT.setEnabled(true);
        ADDRESSTXT.setEnabled(true);
        PHONETXT.setEnabled(true);
        COUNTRYCBX.setEnabled(true);
        CITYTXT.setEnabled(true);
        PasswordTXT.setEnabled(true);
        V_PasswordTXT.setEnabled(true);
        FINDTXT.setEnabled(true);
        
        btnSAVE.setEnabled(true);
        btnCANCEL.setEnabled(true);
        btnDELETE.setEnabled(true);
        btnEDIT.setEnabled(true);
        btnFIND.setEnabled(true);
        
    }
    
    public void deactivate(){
        IDTXT.setEnabled(false);
        NAMETXT.setEnabled(false);
        APTXT.setEnabled(false);
        AMTXT.setEnabled(false);
        ADDRESSTXT.setEnabled(false);
        PHONETXT.setEnabled(false);
        COUNTRYCBX.setEnabled(false);
        CITYTXT.setEnabled(false);
        PasswordTXT.setEnabled(false);
        V_PasswordTXT.setEnabled(false);
        FINDTXT.setEnabled(false);
        
        btnSAVE.setEnabled(false);
        btnCANCEL.setEnabled(false);
        btnDELETE.setEnabled(false);
        btnEDIT.setEnabled(false);
        btnFIND.setEnabled(false);
    }
    
    public void clearTXT(){
        IDTXT.setText("");
        NAMETXT.setText("");
        APTXT.setText("");
        AMTXT.setText("");
        ADDRESSTXT.setText("");
        PHONETXT.setText("");
        COUNTRYCBX.setSelectedIndex(-1);
        CITYTXT.setText("");
        PasswordTXT.setText("");
        V_PasswordTXT.setText("");
        FINDTXT.setText("");
        
    }
    
    public User addUser() {
        User u = new User();
        u.setID(IDTXT.getText());
        u.setName(NAMETXT.getText());
        u.setLast(APTXT.getText());
        u.setSLast(AMTXT.getText());
        u.setAddress(ADDRESSTXT.getText());
        u.setPhone(PHONETXT.getText());
        //u.setEmail(EmailText.getText());
 
        u.setState((String) COUNTRYCBX.getSelectedItem());
        u.setCity(CITYTXT.getText());
        //if(PasswordTXT.getPassword() == V_PasswordTXT.getPassword()){
            u.setPassword(PasswordTXT.getText());
        //}

        return u;
    }
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        PHONETXT = new javax.swing.JTextField();
        NAMETXT = new javax.swing.JTextField();
        btnFIND = new javax.swing.JButton();
        btnNEW = new javax.swing.JButton();
        ADDRESSTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IDTXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FINDTXT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        APTXT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CITYTXT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        COUNTRYCBX = new javax.swing.JComboBox<>();
        btnDELETE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEDIT = new javax.swing.JButton();
        btnCANCEL = new javax.swing.JButton();
        btnSAVE = new javax.swing.JButton();
        AMTXT = new javax.swing.JTextField();
        PasswordTXT = new javax.swing.JPasswordField();
        V_PasswordTXT = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese Nombre Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 400, 4));
        getContentPane().add(PHONETXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 230, -1));
        getContentPane().add(NAMETXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, -1));

        btnFIND.setText("FIND");
        btnFIND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDActionPerformed(evt);
            }
        });
        getContentPane().add(btnFIND, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 60, 60));

        btnNEW.setText("Nuevo");
        btnNEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWActionPerformed(evt);
            }
        });
        getContentPane().add(btnNEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 120, 50));
        getContentPane().add(ADDRESSTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 230, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Crear Cuenta");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 60));
        getContentPane().add(IDTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        getContentPane().add(FINDTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 230, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellido Paterno:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(APTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirmar password:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));
        getContentPane().add(CITYTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 230, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ciudad");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Estado:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Teléfono:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Dirección:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Apellido Materno:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Password:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        COUNTRYCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Distrito Federal", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        COUNTRYCBX.setSelectedIndex(-1);
        getContentPane().add(COUNTRYCBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 190, 235, -1));

        btnDELETE.setText("Remover");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });
        getContentPane().add(btnDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/amazon logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 320, 120));

        btnEDIT.setText("Editar");
        btnEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITActionPerformed(evt);
            }
        });
        getContentPane().add(btnEDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 120, 50));

        btnCANCEL.setText("Cancelar");
        btnCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELActionPerformed(evt);
            }
        });
        getContentPane().add(btnCANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 120, 50));

        btnSAVE.setText("Guardar");
        btnSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAVEActionPerformed(evt);
            }
        });
        getContentPane().add(btnSAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 120, 50));
        getContentPane().add(AMTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, -1));
        getContentPane().add(PasswordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 230, -1));
        getContentPane().add(V_PasswordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buyer view.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        setSize(new java.awt.Dimension(800, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void btnNEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWActionPerformed
        // TODO add your handling code here:
        try {
            activate();
            ra.createFile();
        } catch (Exception ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "NO FUNCIONA");
        }
    }//GEN-LAST:event_btnNEWActionPerformed

    private void btnSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAVEActionPerformed
        try {
            // TODO add your handling code here:
            ra.addEnd(addUser());
        } catch (Exception ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSAVEActionPerformed

    private void btnCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELActionPerformed
        // TODO add your handling code here:
        deactivate();
        clearTXT();
    }//GEN-LAST:event_btnCANCELActionPerformed

    private void btnEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEDITActionPerformed

    private void btnFINDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFINDActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESSTXT;
    private javax.swing.JTextField AMTXT;
    private javax.swing.JTextField APTXT;
    private javax.swing.JTextField CITYTXT;
    private javax.swing.JComboBox<String> COUNTRYCBX;
    private javax.swing.JTextField FINDTXT;
    private javax.swing.JTextField IDTXT;
    private javax.swing.JTextField NAMETXT;
    private javax.swing.JTextField PHONETXT;
    private javax.swing.JPasswordField PasswordTXT;
    private javax.swing.JPasswordField V_PasswordTXT;
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnEDIT;
    private javax.swing.JButton btnFIND;
    private javax.swing.JButton btnNEW;
    private javax.swing.JButton btnSAVE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}