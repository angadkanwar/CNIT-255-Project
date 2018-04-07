/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Logins.Register;// importing other GUI
import Logins.TextBox;// importing other GUI

public class Login extends javax.swing.JFrame {
    private ArrayList<User> userArray = new ArrayList<User>();
    
    public Login()
    {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        JUsername = new javax.swing.JLabel();
        JLabelPass = new javax.swing.JLabel();
        JPass = new javax.swing.JPasswordField();
        JtxtUsername = new javax.swing.JTextField();
        Jbtn_login = new javax.swing.JButton();
        Jbtn_Exit = new javax.swing.JButton();
        Jbtn_Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 500));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 20));

        JUsername.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        JUsername.setText("Username");

        JLabelPass.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        JLabelPass.setText("Password");

        JPass.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        JPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        JtxtUsername.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        JtxtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        JtxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtUsernameActionPerformed(evt);
            }
        });

        Jbtn_login.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Jbtn_login.setText("Login");
        Jbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_loginActionPerformed(evt);
            }
        });

        Jbtn_Exit.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Jbtn_Exit.setText("Exit");
        Jbtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_ExitActionPerformed(evt);
            }
        });

        Jbtn_Register.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Jbtn_Register.setText("Register");
        Jbtn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelPass)
                            .addComponent(JUsername))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jbtn_login)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JPass, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jbtn_Register)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(Jbtn_Exit)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JUsername)
                    .addComponent(JtxtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(JLabelPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_Register)
                    .addComponent(Jbtn_login)
                    .addComponent(Jbtn_Exit))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 100, 520, 270);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setText("Login System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 331, 58);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_loginActionPerformed
        String Username = JtxtUsername.getText();
        String Password = JPass.getText();
        for (int i = 0; i < userArray.size();i++){
        if(Username.equals(userArray.get(i).userID) && userArray.get(i).password){
                JtxtUsername.setText(null);
                JPass.setText(null);
                systemExit();
                TextBox info = new TextBox(); 
                info.setVisible(true);
              
       }else{
                JOptionPane.showMessageDialog(null, "Invalid Login Details", " Login Errors", JOptionPane.ERROR_MESSAGE);
             }
        }
    }//GEN-LAST:event_Jbtn_loginActionPerformed

    private void Jbtn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RegisterActionPerformed
        systemExit();
        Register r = new Register();
        r.setVisible(true);
    }//GEN-LAST:event_Jbtn_RegisterActionPerformed

    private void Jbtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Jbtn_ExitActionPerformed

    private void JtxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtUsernameActionPerformed

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
    private void systemExit(){
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelPass;
    private javax.swing.JPasswordField JPass;
    private javax.swing.JLabel JUsername;
    private javax.swing.JButton Jbtn_Exit;
    private javax.swing.JButton Jbtn_Register;
    private javax.swing.JButton Jbtn_login;
    private javax.swing.JTextField JtxtUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
