/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.views;

import com.client.userapp.Application;
import com.client.userapp.constants.WindowSize;

/**
 *
 * @author LeDat
 */
public class StudentMarksScreen extends javax.swing.JFrame {

    /**
     * Creates new form frmStudentMarksFrame
     */
    public StudentMarksScreen() {
        initComponents();
        
        setIconImage(Application.ICON);
        setSize(WindowSize.NORMAL_WINDOW.getDimension());
        setMinimumSize(WindowSize.TINY_WINDOW.getDimension());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblScoreInfo = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblSubject = new javax.swing.JLabel();
        lblScoreAverage = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        txtScoreAverage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabScoreInfo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblScoreInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblScoreInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreInfo.setText("Thông tin điểm chi tiết");

        lblStudentName.setText("Họ tên:");

        lblID.setText("Mã số:");

        txtStudentName.setEditable(false);
        txtStudentName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });

        txtID.setEditable(false);

        lblSubject.setText("Môn học:");

        lblScoreAverage.setText("Điểm trung bình:");

        txtSubject.setEditable(false);

        txtScoreAverage.setEditable(false);
        txtScoreAverage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tabScoreInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabScoreInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MS", "Điểm", "Hệ số", "Người chấm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabScoreInfo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabScoreInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabScoreInfo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabScoreInfo);
        if (tabScoreInfo.getColumnModel().getColumnCount() > 0) {
            tabScoreInfo.getColumnModel().getColumn(0).setResizable(false);
            tabScoreInfo.getColumnModel().getColumn(0).setHeaderValue("STT");
            tabScoreInfo.getColumnModel().getColumn(1).setResizable(false);
            tabScoreInfo.getColumnModel().getColumn(1).setHeaderValue("Điểm");
            tabScoreInfo.getColumnModel().getColumn(2).setResizable(false);
            tabScoreInfo.getColumnModel().getColumn(2).setHeaderValue("Hệ số");
            tabScoreInfo.getColumnModel().getColumn(3).setResizable(false);
            tabScoreInfo.getColumnModel().getColumn(3).setHeaderValue("Người chấm");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtStudentName))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblScoreAverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubject)
                            .addComponent(txtScoreAverage))))
                .addContainerGap())
            .addComponent(lblScoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblScoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblScoreAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtScoreAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblScoreAverage;
    private javax.swing.JLabel lblScoreInfo;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JTable tabScoreInfo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtScoreAverage;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}
