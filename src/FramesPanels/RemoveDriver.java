/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesPanels;

import pl.pro.Driver;

/**
 *
 * @author dell
 */
public class RemoveDriver extends javax.swing.JPanel {

    /**
     * Creates new form RemoveDriver
     */
    public RemoveDriver() {
        initComponents();
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
        Remove = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldExper = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelExper = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jTextFieldPhoto = new javax.swing.JTextField();
        jLabelCo_B = new javax.swing.JLabel();
        jTextFieldCo_B = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        FNot = new javax.swing.JLabel();
        jLabelFNot = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        Remove.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Remove.setForeground(new java.awt.Color(255, 255, 255));
        Remove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Remove.setText("Remove A Driver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(54, 33, 89));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("Name");

        jLabelGender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(54, 33, 89));
        jLabelGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGender.setText("Gender");

        jLabelPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPhone.setForeground(new java.awt.Color(54, 33, 89));
        jLabelPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPhone.setText("Phone_NO");

        jLabelAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAddress.setForeground(new java.awt.Color(54, 33, 89));
        jLabelAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddress.setText("Address");

        jLabelExper.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelExper.setForeground(new java.awt.Color(54, 33, 89));
        jLabelExper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExper.setText("Experience");

        jLabelPhoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPhoto.setForeground(new java.awt.Color(54, 33, 89));
        jLabelPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPhoto.setText("Photo");

        jTextFieldPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhotoActionPerformed(evt);
            }
        });

        jLabelCo_B.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCo_B.setForeground(new java.awt.Color(54, 33, 89));
        jLabelCo_B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCo_B.setText("Company Brande");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(54, 33, 89));
        jButtonSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(54, 33, 89));
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonRemove.setBackground(new java.awt.Color(54, 33, 89));
        jButtonRemove.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonRemove.setForeground(new java.awt.Color(54, 33, 89));
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCo_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPhoto)
                                    .addComponent(jTextFieldCo_B, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelExper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldName)
                                    .addComponent(jTextFieldGender)
                                    .addComponent(jTextFieldPhone)
                                    .addComponent(jTextFieldAddress)
                                    .addComponent(jTextFieldExper, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(FNot, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabelFNot, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldSearch)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelFNot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGender)
                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPhone)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelExper, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldExper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCo_B)
                            .addComponent(jTextFieldCo_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FNot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhotoActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        if(!jTextFieldSearch.getText().equals("")){
            Driver x = new Driver();
            Driver returned = x.searchDriverByID(Integer.parseInt(jTextFieldSearch.getText()));
            if(returned.getID()>0){
                jLabelFNot.setText("Found ..");
            }else{
                jLabelFNot.setText("Not Found ..");
            }
            
        }else{
            jLabelFNot.setText("Missing Required Fields ..! Please , Complete them before Submit");
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        if(!jTextFieldName.getText().equals("")&&!jTextFieldGender.getText().equals("")&&!jTextFieldPhone.getText().equals("")&&!jTextFieldAddress.getText().equals("")&&!jTextFieldExper.getText().equals("")&&!jTextFieldPhoto.getText().equals("")&&!jTextFieldCo_B.getText().equals("")){
            Driver x= new Driver();
            if(x.RemoveDriver(Integer.parseInt(jTextFieldSearch.getText()))){
                FNot.setText("Deleted Succesfully ..");
                resetPanelData();
            }else{
                FNot.setText("Failed To Delete ..");
            }
        }else{
            FNot.setText("Missing Required Fields ..! Please , Complete them before Submit ");
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    protected void resetPanelData(){
        jTextFieldName.setText("");
        jTextFieldGender.setText("");
        jTextFieldPhone.setText("");
        jTextFieldAddress.setText("");
        jTextFieldExper.setText("");
        jTextFieldPhoto.setText("");
        jTextFieldCo_B.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FNot;
    private javax.swing.JLabel Remove;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCo_B;
    private javax.swing.JLabel jLabelExper;
    private javax.swing.JLabel jLabelFNot;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCo_B;
    private javax.swing.JTextField jTextFieldExper;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldPhoto;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
