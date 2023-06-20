package GuiProject;

import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainLbl = new javax.swing.JLabel();
        upanddltBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        listofMemBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        newMemberBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        logoutLbl = new javax.swing.JLabel();
        newMemberLbl = new javax.swing.JLabel();
        paymentLbl = new javax.swing.JLabel();
        listofMemberLbl = new javax.swing.JLabel();
        upandDltLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 118, 221));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        mainLbl.setFont(new java.awt.Font("Britannic Bold", 1, 42)); // NOI18N
        mainLbl.setForeground(new java.awt.Color(255, 255, 255));
        mainLbl.setText("Welcome to Gym Management System");

        upanddltBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update & delete member.png"))); // NOI18N
        upanddltBtn.setPreferredSize(new java.awt.Dimension(65, 65));
        upanddltBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upanddltBtnMouseClicked(evt);
            }
        });
        upanddltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upanddltBtnActionPerformed(evt);
            }
        });

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        exitBtn.setPreferredSize(new java.awt.Dimension(33, 33));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        listofMemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/list of members.png"))); // NOI18N
        listofMemBtn.setMinimumSize(new java.awt.Dimension(85, 85));
        listofMemBtn.setPreferredSize(new java.awt.Dimension(65, 65));
        listofMemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listofMemBtnMouseClicked(evt);
            }
        });
        listofMemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listofMemBtnActionPerformed(evt);
            }
        });

        paymentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/payment.png"))); // NOI18N
        paymentBtn.setPreferredSize(new java.awt.Dimension(65, 65));
        paymentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentBtnMouseClicked(evt);
            }
        });
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        newMemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new member.png"))); // NOI18N
        newMemberBtn.setPreferredSize(new java.awt.Dimension(65, 65));
        newMemberBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newMemberBtnMouseClicked(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(0, 118, 221));
        logOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logOutBtn.setBorder(null);
        logOutBtn.setMaximumSize(new java.awt.Dimension(55, 55));
        logOutBtn.setMinimumSize(new java.awt.Dimension(55, 55));
        logOutBtn.setPreferredSize(new java.awt.Dimension(55, 55));
        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtnMouseClicked(evt);
            }
        });

        logoutLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutLbl.setForeground(new java.awt.Color(255, 255, 255));
        logoutLbl.setText("Logout");

        newMemberLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        newMemberLbl.setForeground(new java.awt.Color(255, 255, 255));
        newMemberLbl.setText("New Member");

        paymentLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        paymentLbl.setForeground(new java.awt.Color(255, 255, 255));
        paymentLbl.setText("Payments");

        listofMemberLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        listofMemberLbl.setForeground(new java.awt.Color(255, 255, 255));
        listofMemberLbl.setText("List of Members");

        upandDltLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        upandDltLbl.setForeground(new java.awt.Color(255, 255, 255));
        upandDltLbl.setText("Update or Delete Member");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(newMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(upanddltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(newMemberLbl)
                        .addGap(18, 18, 18)
                        .addComponent(upandDltLbl)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentLbl)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(listofMemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(listofMemberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(648, 648, 648)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(logoutLbl))
                            .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLbl)
                .addGap(68, 68, 68)
                .addComponent(mainLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upanddltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listofMemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upandDltLbl)
                    .addComponent(newMemberLbl)
                    .addComponent(paymentLbl)
                    .addComponent(listofMemberLbl))
                .addGap(205, 205, 205))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listofMemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listofMemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listofMemBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void upanddltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upanddltBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upanddltBtnActionPerformed

    private void logOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Logout?","Select",JOptionPane.YES_NO_OPTION);
        if (a == 0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logOutBtnMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you want to Exit?","Select",JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnMouseClicked

    private void newMemberBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newMemberBtnMouseClicked
        new NewMember().setVisible(true);
    }//GEN-LAST:event_newMemberBtnMouseClicked

    private void upanddltBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upanddltBtnMouseClicked
        new UpdateDeleteMember().setVisible(true);
    }//GEN-LAST:event_upanddltBtnMouseClicked

    private void listofMemBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listofMemBtnMouseClicked
        new ListOfMembers().setVisible(true);
    }//GEN-LAST:event_listofMemBtnMouseClicked

    private void paymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtnMouseClicked
        new Payment().setVisible(true);
    }//GEN-LAST:event_paymentBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listofMemBtn;
    private javax.swing.JLabel listofMemberLbl;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel logoutLbl;
    private javax.swing.JLabel mainLbl;
    private javax.swing.JButton newMemberBtn;
    private javax.swing.JLabel newMemberLbl;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JLabel paymentLbl;
    private javax.swing.JLabel upandDltLbl;
    private javax.swing.JButton upanddltBtn;
    // End of variables declaration//GEN-END:variables
}
