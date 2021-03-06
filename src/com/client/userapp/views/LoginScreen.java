/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.views;

import com.client.userapp.Application;
import com.client.userapp.constants.WebMethods;
import com.client.userapp.constants.WindowUtility;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;
import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Callable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Giang
 */
public class LoginScreen extends JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();

        setIconImage(Application.ICON);
        setLocationRelativeTo(null);
        initInfo();
        lblErrors.setText("");
        txtUser.setText(readUserFromFile());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSchoolName = new javax.swing.JLabel();
        lblInformation = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblErrors = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        mniAbout = new javax.swing.JMenu();
        mniHelp = new javax.swing.JMenuItem();
        mniForgot = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý điểm - Đăng nhập");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>QUẢN LÝ ĐIỂM - Dành cho <b>Giáo viên</b></html>");

        lblSchoolName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSchoolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSchoolName.setText("{school_name}");

        lblInformation.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformation.setText("Học kì: {semester} - Năm học {school_year}");

        jLabel4.setLabelFor(txtUser);
        jLabel4.setText("Tên đăng nhập:");

        jLabel5.setLabelFor(txtPass);
        jLabel5.setText("Mật khẩu:");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/client/userapp/images/login.png"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblErrors.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblErrors.setForeground(new java.awt.Color(153, 0, 0));
        lblErrors.setText("{error_message}");

        jMenu1.setText("Chương trình");

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/client/userapp/images/logout.png"))); // NOI18N
        mniExit.setText("Thoát");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        jMenu1.add(mniExit);

        jMenuBar1.add(jMenu1);

        mniAbout.setText("Trợ giúp");

        mniHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/client/userapp/images/howto.png"))); // NOI18N
        mniHelp.setText("Hướng dẫn đăng nhập");
        mniHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHelpActionPerformed(evt);
            }
        });
        mniAbout.add(mniHelp);

        mniForgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/client/userapp/images/recover.png"))); // NOI18N
        mniForgot.setText("Quên mật khẩu");
        mniForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniForgotActionPerformed(evt);
            }
        });
        mniAbout.add(mniForgot);
        mniAbout.add(jSeparator3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/client/userapp/images/info.png"))); // NOI18N
        jMenuItem4.setText("Giới thiệu");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mniAbout.add(jMenuItem4);

        jMenuBar1.add(mniAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSchoolName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(lblInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addGap(18, 18, 18)
                                .addComponent(lblErrors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtUser)
                            .addComponent(txtPass))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSchoolName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(lblErrors))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        exit(1);
    }//GEN-LAST:event_mniExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        // Disable form
        lblErrors.setText("");
        disableForm();

        new Thread(() -> {
            LoadingScreen load = new LoadingScreen("Đang xác thực...");
            load.setVisible(true);
            loginProcess();
            load.dispose();
        }).start();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
        btnLoginActionPerformed(evt);
    }//GEN-LAST:event_txtPassActionPerformed

    private void mniForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniForgotActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                this, 
                "Vui lòng liên hệ quản trị viên để đặt lại mật khẩu:\n\n"+
                        Application.PROP.get("admin_contact"), 
                "Đặt lại mật khẩu", 
                JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_mniForgotActionPerformed

    private void mniHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHelpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                this, 
                "1. Điền tên tài khoản người dùng đã được cấp\n"
                        + "2. Điền mật khẩu\n"
                        + "3. Nhấn ENTER hoặc nút \"Đăng nhập\"\n\n"
                        + "Việc sử dụng cần kết nối Internet. Hãy liên hệ quản lý để biết rõ hơn.",
                "Hướng dẫn đăng nhập", 
                JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_mniHelpActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                this, 
                String.format("Phần mềm Quản lý & Chấm điểm\n"
                        + "Phiên bản: Giáo viên - v1.0\n\n"
                        + "Cấp phát cho đơn vị %s\n"
                        + "Năm học: %s\n\n"
                        + "Vui lòng đăng nhập để biết thêm thông tin.",
                        lblSchoolName.getText().toUpperCase(),
                        Application.PROP.get("school_year")),
                "Thông tin phần mềm", 
                JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblErrors;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblSchoolName;
    private javax.swing.JMenu mniAbout;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniForgot;
    private javax.swing.JMenuItem mniHelp;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void saveUserToFile(String text) {
        File f = new File("userid.cfg");
        try {
            if (f.exists()) {
                f.delete();
            }
            Files.write(f.toPath(), text.getBytes(), StandardOpenOption.CREATE_NEW);
        } catch (IOException ex) {
            // ignore
        }
    }

    private String readUserFromFile() {
        String r="";
        File f = new File("userid.cfg");
        try {
            if (!f.exists()) {
                return r;
            }
            r = new String(Files.readAllBytes(f.toPath()));
        } catch (IOException ex) {
            // ignore
        }
        if (r.length()>0) {
            txtPass.requestFocus();
        }
        return r;
    }
    
    private void initInfo() {
        try {
            lblSchoolName.setText(Application.PROP.get("school_name").toString());
            lblInformation.setText(
                    String.format("<html>Học kì <b>%s</b> - Năm học <b>%s</b></html>", 
                            Application.PROP.get("semester"),
                            Application.PROP.get("school_year")));
            if (Application.PROP.get("app_status").toString().trim().equals("0")) {
                disableForm();
                lblErrors.setText("Không hoạt động");
                jMenuBar1.setEnabled(false);
                JOptionPane.showMessageDialog(
                        this, 
                        "Hệ thống đang đóng đối với phần mềm cho giáo viên.\n"
                                + "Vui lòng trở lại sau hoặc liên hệ quản lý để biết thêm chi tiết.", 
                        "Hệ thống đang đóng", 
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            // ignore
            ex.printStackTrace();
        }
    }

    private void disableForm() {
        btnLogin.setEnabled(false);
        txtUser.setEnabled(false);
        txtPass.setEnabled(false);
    }

    private void enableForm() {
        btnLogin.setEnabled(true);
        txtUser.setEnabled(true);
        txtPass.setEnabled(true);
    }

    private Callable loginProcess() {
        // Validate
        String user = txtUser.getText();
        String pass = new String(txtPass.getPassword());
        if (user.length() < 5 || pass.length() < 5) {
            lblErrors.setText("Dữ liệu không hợp lệ");
        } else {
            // Authenticate
            try {
                Application.TEACHER = WebMethods.teacherLogin(user, pass);
                if (Application.TEACHER != null) {
                    JFrame frmMain = new MainScreen();
                    saveUserToFile(user);
                    this.setVisible(false);
                    frmMain.setVisible(true);
                }
                lblErrors.setText("Sai thông tin");
                txtPass.setText("");
            } catch (Exception ex) {
                lblErrors.setText("Lỗi đường truyền");
            }
        }

        // Re-enable form
        enableForm();
        return null;
    }
}
