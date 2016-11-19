/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.views;

import com.client.service.Bulk;
import com.client.service.Clazz;
import com.client.service.Subject;
import com.client.userapp.Application;
import com.client.userapp.constants.WebMethods;
import com.client.userapp.constants.WindowUtility;
import javax.swing.DefaultListModel;

/**
 *
 * @author HuongUD
 */
public class ClassSummariseFrame extends javax.swing.JPanel {

    private Clazz clazz;

    /**
     * Creates new form ClassSummeriseFrame
     */
    public ClassSummariseFrame(Clazz clazz) {
        this.clazz = clazz;
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

        lblKhoi = new javax.swing.JLabel();
        btnViewScores = new javax.swing.JButton();
        btnEditScores = new javax.swing.JButton();
        btnArchive = new javax.swing.JButton();
        lblLop = new javax.swing.JLabel();
        lblSiSo = new javax.swing.JLabel();
        lblNamHoc = new javax.swing.JLabel();
        spr2 = new javax.swing.JSeparator();
        spr = new javax.swing.JSeparator();
        lblClass = new javax.swing.JLabel();
        lblStudentCount = new javax.swing.JLabel();
        lblSchoolYear = new javax.swing.JLabel();
        lblBulkName = new javax.swing.JLabel();
        btnViewStudentList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSubjects = new javax.swing.JList<>();

        lblKhoi.setText("Khối:");

        btnViewScores.setText("Xem điểm");
        btnViewScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewScoresActionPerformed(evt);
            }
        });

        btnEditScores.setText("Nhập/Sửa điểm");
        btnEditScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditScoresActionPerformed(evt);
            }
        });

        btnArchive.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnArchive.setText("Tổng kết");
        btnArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchiveActionPerformed(evt);
            }
        });

        lblLop.setText("Lớp:");

        lblSiSo.setText("Sĩ số:");

        lblNamHoc.setText(" ");

        spr2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblClass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClass.setText("{lblClass}");

        lblStudentCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStudentCount.setText("{lblStudents}");

        lblSchoolYear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSchoolYear.setText("{lblSchoolYear}");

        lblBulkName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBulkName.setText("{lblBulkName}");

        btnViewStudentList.setText("Danh sách học sinh");
        btnViewStudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentListActionPerformed(evt);
            }
        });

        jLabel1.setText("Các môn học:");

        lstSubjects.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstSubjects);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditScores, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(btnViewScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(spr2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnArchive, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBulkName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(spr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNamHoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(lblLop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSiSo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSchoolYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStudentCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnViewStudentList)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLop)
                    .addComponent(lblClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSiSo)
                    .addComponent(lblStudentCount)
                    .addComponent(btnViewStudentList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamHoc)
                    .addComponent(lblSchoolYear))
                .addGap(1, 1, 1)
                .addComponent(spr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhoi)
                    .addComponent(lblBulkName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewScores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditScores))
                            .addComponent(btnArchive, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addComponent(spr2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditScoresActionPerformed
        // TODO add your handling code here:
        MainScreen.setViewPort(new MarksViewFrame(clazz));
    }//GEN-LAST:event_btnEditScoresActionPerformed

    private void btnViewScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewScoresActionPerformed
        // TODO add your handling code here:
        ClassViewFrame.selectTab(2);
    }//GEN-LAST:event_btnViewScoresActionPerformed

    private void btnViewStudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentListActionPerformed
        // TODO add your handling code here:
        ClassViewFrame.selectTab(1);
    }//GEN-LAST:event_btnViewStudentListActionPerformed

    private void btnArchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchiveActionPerformed
        // TODO add your handling code here:
        WindowUtility.showMessage(this, "Tổng kết điểm", "Điểm số của những học sinh đã được tổng kết và chốt sổ điểm\nsẽ không thể thay đổi được.", WindowUtility.WARNING);
        WindowUtility.showModalDialog(null, "Tổng kết & chốt sổ điểm", new ScoreArchiveScreen(clazz));
    }//GEN-LAST:event_btnArchiveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchive;
    private javax.swing.JButton btnEditScores;
    private javax.swing.JButton btnViewScores;
    private javax.swing.JButton btnViewStudentList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBulkName;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblKhoi;
    private javax.swing.JLabel lblLop;
    private javax.swing.JLabel lblNamHoc;
    private javax.swing.JLabel lblSchoolYear;
    private javax.swing.JLabel lblSiSo;
    private javax.swing.JLabel lblStudentCount;
    private javax.swing.JList<String> lstSubjects;
    private javax.swing.JSeparator spr;
    private javax.swing.JSeparator spr2;
    // End of variables declaration//GEN-END:variables

    private void initData() {
        lblClass.setText(clazz.getName());
        lblStudentCount.setText(WebMethods.getStudentsByClass(clazz).size() + "");
        lblSchoolYear.setText(String.format("Học kì %s | Năm học %s",
                Application.PROP.get("semester").toString(),
                Application.PROP.get("school_year").toString()));
        lblBulkName.setText(clazz.getBulkId().getName());
        DefaultListModel<String> model = new DefaultListModel<>();
        lstSubjects.setModel(model);
        Bulk b = WebMethods.getBulkById(clazz.getBulkId().getId());
        if (b.getSubjectList().size()<=0) {
            model.addElement("--không có môn học--");
            return;
        }
        for (Subject s : b.getSubjectList()) {
            model.addElement(s.getName());
        }
    }
}
