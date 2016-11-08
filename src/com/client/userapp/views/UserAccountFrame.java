/*
 * The MIT License
 *
 * Copyright 2016 Giang.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.client.userapp.views;

import com.client.service.Teacher;
import com.client.userapp.Application;
import com.client.userapp.constants.WebMethods;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;
import java.util.Date;

/**
 *
 * @author Giang
 */
public class UserAccountFrame extends javax.swing.JPanel {

    /**
     * Creates new form UserAccountFrame1
     */
    public UserAccountFrame() {
        initComponents();
        
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChangePass = new javax.swing.JButton();
        spr = new javax.swing.JSeparator();
        lblRecentLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblRecentEditInfo = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblNewPass = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        lblRetype = new javax.swing.JLabel();
        txtRetypePassword = new javax.swing.JPasswordField();
        lblUserAccount = new javax.swing.JLabel();
        lblLastLogin = new javax.swing.JLabel();
        lblLastChange = new javax.swing.JLabel();
        lblErrors = new javax.swing.JLabel();

        btnChangePass.setText("Đổi mật khẩu");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        lblRecentLogin.setText("Lần đăng nhập gần nhất:");

        jLabel1.setText("Tên đăng nhập:");

        lblRecentEditInfo.setText("Lần thay đổi thông tin gần nhất:");

        lblPass.setText("Mật khẩu:");

        txtName.setEditable(false);
        txtName.setToolTipText("");

        lblNewPass.setText("Mật khẩu mới:");

        lblRetype.setText("Nhập lại:");

        txtRetypePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetypePasswordActionPerformed(evt);
            }
        });

        lblUserAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserAccount.setText("Tài khoản");

        lblLastLogin.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblLastLogin.setText("{last_login}");

        lblLastChange.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblLastChange.setText("{last_change}");

        lblErrors.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblErrors.setText("{error_context}");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addGap(124, 124, 124)
                        .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRetype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNewPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblErrors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRetypePassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addComponent(txtName)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRecentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRecentEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLastChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLastLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(spr)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePass))
                .addGap(11, 11, 11)
                .addComponent(spr, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPass)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetype)
                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(lblErrors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecentLogin)
                    .addComponent(lblLastLogin))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecentEditInfo)
                    .addComponent(lblLastChange))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRetypePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetypePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetypePasswordActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            String pass = new String(txtPassword.getPassword());
            Teacher t = WebMethods.teacherLogin(txtName.getText(), pass);
            if (!Application.TEACHER.equals(t)) {
                lblErrors.setText("Mật khẩu cũ không đúng");
                return;
            }
            WebMethods.updateTeacherPassword(pass);
        }
    }//GEN-LAST:event_btnChangePassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblErrors;
    private javax.swing.JLabel lblLastChange;
    private javax.swing.JLabel lblLastLogin;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRecentEditInfo;
    private javax.swing.JLabel lblRecentLogin;
    private javax.swing.JLabel lblRetype;
    private javax.swing.JLabel lblUserAccount;
    private javax.swing.JSeparator spr;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRetypePassword;
    // End of variables declaration//GEN-END:variables

    private void initData() {
        try {
            lblErrors.setText("");
            txtName.setText(Application.TEACHER.getUsername());
            
            System.out.println(Application.TEACHER.getInfo());
            Information i = Json.DeserializeObject(Application.TEACHER.getInfo(), Information.class);
            long login = Long.parseLong(i.getValue("LastLogin"));
            lblLastLogin.setText(Application.DATE_FORMAT.format(new Date(login)));
        } catch (Exception ex) {
            lblLastLogin.setText("?");
        }
        lblLastChange.setVisible(false);
        lblRecentEditInfo.setVisible(false);
    }

    private boolean validateForm() {
        String pass, newp, re, err="";
        pass = new String(txtPassword.getPassword());
        newp = new String(txtNewPassword.getPassword());
        re = new String(txtRetypePassword.getPassword());
        if (pass.length()<5 || newp.length()<5 || re.length()<5) {
            err+="Mật khẩu quá ngắn";
        }
        if (!newp.equals(re)) {
            err = err.equals("")?"":err+" ; " + "Mật khẩu không trùng nhau";
        }
        lblErrors.setText(err);
        return err.length()<=0;
    }
}
