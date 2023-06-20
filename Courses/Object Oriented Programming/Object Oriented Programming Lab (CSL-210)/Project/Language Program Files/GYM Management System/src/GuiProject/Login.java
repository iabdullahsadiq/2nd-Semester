package GuiProject;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        incorrectUNLbl.setVisible(false);
        incorrectPWLbl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtn = new javax.swing.JButton();
        loginLbl = new javax.swing.JLabel();
        incorrectUNLbl = new javax.swing.JLabel();
        incorrectPWLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        MainheadLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        ShowPassCb = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setForeground(new java.awt.Color(0, 118, 221));
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        loginLbl.setFont(new java.awt.Font("Britannic Bold", 1, 30)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(0, 118, 221));
        loginLbl.setText("Login");
        getContentPane().add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        incorrectUNLbl.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        incorrectUNLbl.setForeground(new java.awt.Color(255, 0, 0));
        incorrectUNLbl.setText("Incorrect Username!");
        getContentPane().add(incorrectUNLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 40));

        incorrectPWLbl.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        incorrectPWLbl.setForeground(new java.awt.Color(255, 0, 0));
        incorrectPWLbl.setText("Incorrect Password!");
        getContentPane().add(incorrectPWLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, 20));

        usernameTxt.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(0, 118, 221));
        usernameTxt.setText("Enter Username");
        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTxtFocusLost(evt);
            }
        });
        getContentPane().add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 230, -1));

        passwordTxt.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(0, 118, 221));
        passwordTxt.setText("Enter Password");
        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTxtFocusLost(evt);
            }
        });
        getContentPane().add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 230, -1));

        MainheadLbl.setFont(new java.awt.Font("Britannic Bold", 1, 34)); // NOI18N
        MainheadLbl.setForeground(new java.awt.Color(0, 118, 221));
        MainheadLbl.setText("GYM Management System");
        getContentPane().add(MainheadLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        loginBtn.setBackground(new java.awt.Color(0, 118, 221));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 230, -1));

        ShowPassCb.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ShowPassCb.setForeground(new java.awt.Color(0, 118, 221));
        ShowPassCb.setText("Show Password");
        ShowPassCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassCbActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login background.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -90, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowPassCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassCbActionPerformed
        // TODO add your handling code here:
        if (ShowPassCb.isSelected()){
            passwordTxt.setEchoChar((char)0);
        }
        else{
            passwordTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassCbActionPerformed

    private void usernameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusGained
        // TODO add your handling code here:
        incorrectUNLbl.setVisible(false);
        incorrectPWLbl.setVisible(false);
        if(usernameTxt.getText().equals("Enter Username")){
            usernameTxt.setText("");
            usernameTxt.setForeground(new Color(0,118,221));       
        }
    }//GEN-LAST:event_usernameTxtFocusGained

    private void usernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusLost
        // TODO add your handling code here:
        incorrectUNLbl.setVisible(false);
        incorrectPWLbl.setVisible(false);
        if (usernameTxt.getText().equals("")){
            usernameTxt.setText("Enter Username");   
            usernameTxt.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_usernameTxtFocusLost

    private void passwordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusGained
        // TODO add your handling code here:
        incorrectUNLbl.setVisible(false);
        incorrectPWLbl.setVisible(false);
        if(passwordTxt.getText().equals("Enter Password")){
            passwordTxt.setText("");
            passwordTxt.setForeground(new Color(0,118,221));       
        }
    }//GEN-LAST:event_passwordTxtFocusGained

    private void passwordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusLost
        incorrectUNLbl.setVisible(false);
        incorrectPWLbl.setVisible(false);
        if (passwordTxt.getText().equals("")){
            passwordTxt.setText("Enter Password");   
            passwordTxt.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_passwordTxtFocusLost

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you want to Exit?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if ((usernameTxt.getText().equals("iabdullah") && passwordTxt.getText().equals("81962")) || (usernameTxt.getText().equals("abdulwahabaslam") && passwordTxt.getText().equals("81988"))){
            setVisible(false);
            new Home().setVisible(true);
        }
        else if (usernameTxt.getText().equals("iabdullah") || usernameTxt.getText().equals("abdulwahabaslam")){
            incorrectUNLbl.setVisible(false);
        }
        else {
            incorrectUNLbl.setVisible(true);
        }
        if (passwordTxt.getText().equals("81962") || passwordTxt.getText().equals("81988")){
            incorrectPWLbl.setVisible(false);
        }
        else{
            incorrectPWLbl.setVisible(true);
        }
        if ((usernameTxt.getText().equals("iabdullah") && passwordTxt.getText().equals("81988")) || (usernameTxt.getText().equals("abdulwahabaslam") && passwordTxt.getText().equals("81962"))){
            incorrectPWLbl.setVisible(true);  
        } 
    }//GEN-LAST:event_loginBtnActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainheadLbl;
    private javax.swing.JCheckBox ShowPassCb;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel incorrectPWLbl;
    private javax.swing.JLabel incorrectUNLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
