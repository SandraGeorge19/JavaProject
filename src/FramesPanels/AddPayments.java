/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesPanels;

import Frames.Payments;

/**
 *
 * @author dell
 */
public class AddPayments extends javax.swing.JPanel {

    /**
     * Creates new form AddPayments
     */
    public AddPayments() {
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
        AddPayments = new javax.swing.JLabel();
        EmployeeName = new javax.swing.JLabel();
        CustomerName = new javax.swing.JLabel();
        CompanyBrande = new javax.swing.JLabel();
        CustomerPhoneNO = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        NoOfRentingDays = new javax.swing.JLabel();
        RentPerDay = new javax.swing.JLabel();
        TotalRent = new javax.swing.JLabel();
        jTextFieldEmp = new javax.swing.JTextField();
        jTextFieldCust = new javax.swing.JTextField();
        jTextFieldCO = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldAmount = new javax.swing.JTextField();
        jTextFieldNoRent = new javax.swing.JTextField();
        jTextFieldRent = new javax.swing.JTextField();
        jTextFieldToRent = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        succes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        AddPayments.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AddPayments.setForeground(new java.awt.Color(255, 255, 255));
        AddPayments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddPayments.setText("Add A Payments");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(AddPayments)
                .addContainerGap())
        );

        EmployeeName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmployeeName.setForeground(new java.awt.Color(54, 33, 89));
        EmployeeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeName.setText("Employee Name");

        CustomerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerName.setForeground(new java.awt.Color(54, 33, 89));
        CustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerName.setText("Customer Name");

        CompanyBrande.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CompanyBrande.setForeground(new java.awt.Color(54, 33, 89));
        CompanyBrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CompanyBrande.setText("Company Brande");

        CustomerPhoneNO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerPhoneNO.setForeground(new java.awt.Color(54, 33, 89));
        CustomerPhoneNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerPhoneNO.setText("Customer Phone NO");

        Amount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amount.setForeground(new java.awt.Color(54, 33, 89));
        Amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Amount.setText("Amount");

        NoOfRentingDays.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NoOfRentingDays.setForeground(new java.awt.Color(54, 33, 89));
        NoOfRentingDays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoOfRentingDays.setText("No Of Renting Days");

        RentPerDay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RentPerDay.setForeground(new java.awt.Color(54, 33, 89));
        RentPerDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RentPerDay.setText("Rent Per Day");

        TotalRent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalRent.setForeground(new java.awt.Color(54, 33, 89));
        TotalRent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalRent.setText("Total Rent");

        jTextFieldEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(54, 33, 89));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(54, 33, 89));
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_50px.png"))); // NOI18N
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CustomerPhoneNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompanyBrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NoOfRentingDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RentPerDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TotalRent, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldEmp)
                    .addComponent(jTextFieldCust)
                    .addComponent(jTextFieldCO)
                    .addComponent(jTextFieldPhone)
                    .addComponent(jTextFieldAmount)
                    .addComponent(jTextFieldNoRent)
                    .addComponent(jTextFieldRent)
                    .addComponent(jTextFieldToRent, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(succes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeName)
                    .addComponent(jTextFieldEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerName)
                    .addComponent(jTextFieldCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyBrande)
                    .addComponent(jTextFieldCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerPhoneNO)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoOfRentingDays)
                    .addComponent(jTextFieldNoRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RentPerDay)
                    .addComponent(jTextFieldRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalRent)
                    .addComponent(jTextFieldToRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(succes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        if(!jTextFieldEmp.getText().equals("")&&!jTextFieldCust.getText().equals("")&&!jTextFieldCO.getText().equals("")&&!jTextFieldPhone.getText().equals("")&&!jTextFieldAmount.getText().equals("")&&!jTextFieldNoRent.getText().equals("")&&!jTextFieldRent.getText().equals("")&&!jTextFieldToRent.getText().equals("")){
            Payments x= new Payments();
            x.setEmployee_name(jTextFieldEmp.getText());
            x.setCustomer_name(jTextFieldCust.getText());
            x.setCompany_brand(jTextFieldCO.getText());
            x.setCustomer_phone_no(jTextFieldPhone.getText());
            x.setAmount(Integer.parseInt(jTextFieldAmount.getText()));
            x.setNo_of_renting_days(Integer.parseInt(jTextFieldNoRent.getText()));
            x.setRent_per_day(Float.parseFloat(jTextFieldRent.getText()));
            x.setTotal_rent(Float.parseFloat(jTextFieldToRent.getText()));
            if(x.add_payments()){
                succes.setText("Added Succesfully ..");
                resetPanelData();
            }else{
                succes.setText("Failed To Insert ..");
            }
        }else{
            succes.setText("Missing Required Fields ..! Please , Complete them before Submit ");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    protected void resetPanelData(){
        jTextFieldEmp.setText("");
        jTextFieldCust.setText("");
        jTextFieldPhone.setText("");
        jTextFieldCO.setText("");
        jTextFieldAmount.setText("");
        jTextFieldNoRent.setText("");
        jTextFieldRent.setText("");
        jTextFieldToRent.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddPayments;
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel CompanyBrande;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JLabel CustomerPhoneNO;
    private javax.swing.JLabel EmployeeName;
    private javax.swing.JLabel NoOfRentingDays;
    private javax.swing.JLabel RentPerDay;
    private javax.swing.JLabel TotalRent;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldCO;
    private javax.swing.JTextField jTextFieldCust;
    private javax.swing.JTextField jTextFieldEmp;
    private javax.swing.JTextField jTextFieldNoRent;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldRent;
    private javax.swing.JTextField jTextFieldToRent;
    private javax.swing.JLabel succes;
    // End of variables declaration//GEN-END:variables
}