/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesPanels;

import pl.pro.Vehicle;

/**
 *
 * @author dell
 */
public class CheckDamage extends javax.swing.JPanel {

    /**
     * Creates new form CheckDamage
     */
    public CheckDamage() {
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

        simplepanel = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        jTextFieldCheck = new javax.swing.JTextField();
        jButtonCheck = new javax.swing.JButton();
        DamNot = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        simplepanel.setBackground(new java.awt.Color(54, 33, 89));

        Add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setText("Check Damage");

        javax.swing.GroupLayout simplepanelLayout = new javax.swing.GroupLayout(simplepanel);
        simplepanel.setLayout(simplepanelLayout);
        simplepanelLayout.setHorizontalGroup(
            simplepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simplepanelLayout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(Add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        simplepanelLayout.setVerticalGroup(
            simplepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simplepanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Add)
                .addContainerGap())
        );

        jTextFieldCheck.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButtonCheck.setBackground(new java.awt.Color(54, 33, 89));
        jButtonCheck.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonCheck.setForeground(new java.awt.Color(54, 33, 89));
        jButtonCheck.setText("Check");
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });

        DamNot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DamNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamNotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simplepanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jTextFieldCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jButtonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(DamNot, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(simplepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCheck)
                    .addComponent(jButtonCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130)
                .addComponent(DamNot, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DamNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamNotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DamNotActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
        // TODO add your handling code here:
        if(!jTextFieldCheck.getText().equals("")){
            Vehicle x = new Vehicle();
            int returned = x.getVehicleCapacity(Integer.parseInt(jTextFieldCheck.getText()));
            if(returned>0){
                jTextFieldCheck.setText("Not Damaged ..");
            }else{
                jTextFieldCheck.setText("Damaged ..");
            }
            
        }else{
            jTextFieldCheck.setText("Missing Required Fields ..! Please , Complete them before Submit");
        }
    }//GEN-LAST:event_jButtonCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JTextField DamNot;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JTextField jTextFieldCheck;
    private javax.swing.JPanel simplepanel;
    // End of variables declaration//GEN-END:variables
}