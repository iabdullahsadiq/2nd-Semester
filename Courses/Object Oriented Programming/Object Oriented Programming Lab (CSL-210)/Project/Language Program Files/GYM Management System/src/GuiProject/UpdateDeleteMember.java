package GuiProject;

import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateDeleteMember extends javax.swing.JFrame {

    public UpdateDeleteMember() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

        nameTxt.setEditable(false);
        fNameTxt.setEditable(false);
        genderTxt.setEditable(false);
        ageTxt.setEditable(false);
        cnicTxt.setEditable(false);
        numberTxt.setEditable(false);
        emailTxt.setEditable(false);
        addressTxt.setEditable(false);
        shiftTxt.setEditable(false);
        amountTxt.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        mainLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        fNameLbl = new javax.swing.JLabel();
        genderLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        cnicLbl = new javax.swing.JLabel();
        numberLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        timingLbl = new javax.swing.JLabel();
        amountLbl = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        shiftTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        amountTxt = new javax.swing.JTextField();
        numberTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        fNameTxt = new javax.swing.JTextField();
        cnicTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        mainLbl.setFont(new java.awt.Font("Britannic Bold", 1, 28)); // NOI18N
        mainLbl.setForeground(new java.awt.Color(0, 118, 221));
        mainLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update & delete member.png"))); // NOI18N
        mainLbl.setText("Update or Delete Members");

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLbl.setForeground(new java.awt.Color(0, 118, 221));
        idLbl.setText("Member ID:");

        idTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idTxt.setForeground(new java.awt.Color(255, 0, 0));
        idTxt.setPreferredSize(new java.awt.Dimension(60, 23));

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 118, 221));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setPreferredSize(new java.awt.Dimension(92, 23));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 118, 221));
        nameLbl.setText("Name");

        fNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fNameLbl.setForeground(new java.awt.Color(0, 118, 221));
        fNameLbl.setText("Father Name");

        genderLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(0, 118, 221));
        genderLbl.setText("Gender");

        ageLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(0, 118, 221));
        ageLbl.setText("Age");

        cnicLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicLbl.setForeground(new java.awt.Color(0, 118, 221));
        cnicLbl.setText("CNIC");

        numberLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numberLbl.setForeground(new java.awt.Color(0, 118, 221));
        numberLbl.setText("Mobile Number");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(0, 118, 221));
        emailLbl.setText("Email");

        addressLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(0, 118, 221));
        addressLbl.setText("Address");

        addressTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressTxt.setForeground(new java.awt.Color(0, 118, 221));

        timingLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timingLbl.setForeground(new java.awt.Color(0, 118, 221));
        timingLbl.setText("Shift");

        amountLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amountLbl.setForeground(new java.awt.Color(0, 118, 221));
        amountLbl.setText("Monthly Fee (Rs)");

        clearBtn.setBackground(new java.awt.Color(0, 118, 221));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 118, 221));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 118, 221));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        shiftTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shiftTxt.setForeground(new java.awt.Color(0, 118, 221));

        genderTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderTxt.setForeground(new java.awt.Color(0, 118, 221));

        ageTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageTxt.setForeground(new java.awt.Color(0, 118, 221));

        emailTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(0, 118, 221));

        amountTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(0, 118, 221));

        numberTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numberTxt.setForeground(new java.awt.Color(0, 118, 221));

        nameTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(0, 118, 221));

        fNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fNameTxt.setForeground(new java.awt.Color(0, 118, 221));

        cnicTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicTxt.setForeground(new java.awt.Color(0, 118, 221));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(closeBtn)
                        .addGap(136, 136, 136)
                        .addComponent(mainLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(idLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fNameLbl)
                                    .addComponent(cnicLbl)
                                    .addComponent(genderLbl)
                                    .addComponent(numberLbl)
                                    .addComponent(emailLbl)
                                    .addComponent(timingLbl)
                                    .addComponent(amountLbl)
                                    .addComponent(addressLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(shiftTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressTxt)
                                    .addComponent(emailTxt)
                                    .addComponent(numberTxt)
                                    .addComponent(nameTxt)
                                    .addComponent(fNameTxt)
                                    .addComponent(cnicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clearBtn)
                                .addGap(82, 82, 82)
                                .addComponent(deleteBtn)
                                .addGap(84, 84, 84)
                                .addComponent(updateBtn)))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(closeBtn))
                    .addComponent(mainLbl))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idLbl)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnicLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shiftTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timingLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLbl))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(clearBtn))
                .addGap(71, 71, 71))
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
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
            setVisible(false);
            new Home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Clear all?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new UpdateDeleteMember().setVisible(true);
        }
    }//GEN-LAST:event_clearBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        int checkId = 0;
        String id = idTxt.getText();
        try {
            Connection con = NewMember.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from newMember where id = '" + id + "'");
            while (rs.next()) {
                checkId = 1;
                idTxt.setEditable(false);
                nameTxt.setEditable(true);
                fNameTxt.setEditable(true);
                genderTxt.setEditable(true);
                ageTxt.setEditable(true);
                cnicTxt.setEditable(true);
                numberTxt.setEditable(true);
                emailTxt.setEditable(true);
                addressTxt.setEditable(true);
                shiftTxt.setEditable(true);
                amountTxt.setEditable(true);
                
                nameTxt.setText(rs.getString(2));
                fNameTxt.setText(rs.getString(3));
                genderTxt.setText(rs.getString(4));
                genderTxt.setEditable(false);
                ageTxt.setText(rs.getString(5));
                cnicTxt.setText(rs.getString(6));
                numberTxt.setText(rs.getString(7));
                emailTxt.setText(rs.getString(8));
                addressTxt.setText(rs.getString(9));
                shiftTxt.setText(rs.getString(10));
                shiftTxt.setEditable(false);
                amountTxt.setText(rs.getString(11));
            }
            if (checkId == 0) {
                JOptionPane.showMessageDialog(null, "Member ID does not exist!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Update info?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            String id = idTxt.getText();
            String name = nameTxt.getText();
            String fatherName = fNameTxt.getText();
            String age = ageTxt.getText();
            String CNIC = cnicTxt.getText();
            String mobileNumber = numberTxt.getText();
            String eMail = emailTxt.getText();
            String address = addressTxt.getText();
            String fee = amountTxt.getText();
            try {
                Connection con = NewMember.getCon();
                PreparedStatement ps = con.prepareStatement("update newMember set name=?,fatherName=?,age=?,CNIC=?,mobileNumber=?,eMail=?,address=?,fee=? where id=?");
                ps.setString(1, name);
                ps.setString(2, fatherName);
                ps.setString(3, age);
                ps.setString(4, CNIC);
                ps.setString(5, mobileNumber);
                ps.setString(6, eMail);
                ps.setString(7, address);
                ps.setString(8, fee);
                ps.setString(9, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfullty Updated.");
                setVisible(false);
                new UpdateDeleteMember().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Delete Member?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            String id = idTxt.getText();
            try {
                Connection con = NewMember.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("delete from newMember where id='" + id + "'");
                JOptionPane.showMessageDialog(null, "Successfully Deleted.");
                setVisible(false);
                new UpdateDeleteMember().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel cnicLbl;
    private javax.swing.JTextField cnicTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel numberLbl;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField shiftTxt;
    private javax.swing.JLabel timingLbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
