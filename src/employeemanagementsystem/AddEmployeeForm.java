/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

/**
 *
 * @author williamqin
 */
public class AddEmployeeForm extends javax.swing.JFrame {

    private String mCurrentEmploymentType = "FT";
    
    /**
     * Creates new form AddEmployeeForm
     */
    public AddEmployeeForm() {
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

        labelAddEmpTitle = new javax.swing.JLabel();
        labelEmpSubtitle = new javax.swing.JLabel();
        labelEmpNum = new javax.swing.JLabel();
        fieldEmpNum = new javax.swing.JTextField();
        labelFirstName = new javax.swing.JLabel();
        fieldFirstName = new javax.swing.JTextField();
        fieldLastName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        labelSex = new javax.swing.JLabel();
        fieldSex = new javax.swing.JTextField();
        labelWorkLocation = new javax.swing.JLabel();
        fieldWorkLocation = new javax.swing.JTextField();
        labelPayrollSubtitle = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        buttonType = new javax.swing.JButton();
        labelDeductRate = new javax.swing.JLabel();
        fieldDeductRate = new javax.swing.JTextField();
        labelIncome = new javax.swing.JLabel();
        labelHoursPerWeek = new javax.swing.JLabel();
        fieldHoursPerWeek = new javax.swing.JTextField();
        labelWeeksPerYear = new javax.swing.JLabel();
        fieldWeeksPerYear = new javax.swing.JTextField();
        fieldIncome = new javax.swing.JTextField();
        labelDollarSign = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAddEmpTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelAddEmpTitle.setText("Add Employee");
        labelAddEmpTitle.setToolTipText("");

        labelEmpSubtitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelEmpSubtitle.setText("Employee Information");
        labelEmpSubtitle.setToolTipText("");

        labelEmpNum.setText("Employee Number");

        fieldEmpNum.setToolTipText("");

        labelFirstName.setText("First Name");

        fieldFirstName.setToolTipText("");

        fieldLastName.setToolTipText("");

        labelLastName.setText("Last Name");

        labelSex.setText("Sex");

        fieldSex.setToolTipText("");

        labelWorkLocation.setText("Work Location");

        fieldWorkLocation.setToolTipText("");

        labelPayrollSubtitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelPayrollSubtitle.setText("Payroll Information");

        labelType.setText("Employement Type");

        buttonType.setText("Full Time");
        buttonType.setToolTipText("Click on this button to change between full time and part time.");
        buttonType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTypeActionPerformed(evt);
            }
        });

        labelDeductRate.setText("Deduction Rate (%)");

        fieldDeductRate.setToolTipText("");

        labelIncome.setText("Annual Salary");

        labelHoursPerWeek.setText("Hours/Week");
        labelHoursPerWeek.setEnabled(false);

        fieldHoursPerWeek.setToolTipText("");
        fieldHoursPerWeek.setEnabled(false);

        labelWeeksPerYear.setText("Weeks/Year");
        labelWeeksPerYear.setEnabled(false);

        fieldWeeksPerYear.setToolTipText("");
        fieldWeeksPerYear.setEnabled(false);

        fieldIncome.setToolTipText("");

        labelDollarSign.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelDollarSign.setText("$");

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPayrollSubtitle)
                    .addComponent(labelEmpNum)
                    .addComponent(fieldEmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelEmpSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelFirstName)
                                .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelLastName)
                                .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(labelAddEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelDollarSign)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fieldIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(labelIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(labelHoursPerWeek)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fieldHoursPerWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(labelWeeksPerYear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fieldWeeksPerYear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(16, 16, 16))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelDeductRate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSex)
                                    .addComponent(fieldSex, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelWorkLocation)
                                    .addComponent(fieldWorkLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonCancel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelAddEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmpSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmpNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldSex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelWorkLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldWorkLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labelPayrollSubtitle)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelType)
                    .addComponent(buttonType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeductRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIncome)
                    .addComponent(labelHoursPerWeek)
                    .addComponent(fieldHoursPerWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelWeeksPerYear)
                        .addComponent(fieldWeeksPerYear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelDollarSign)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTypeActionPerformed

        // Switch employment type
        mCurrentEmploymentType = "FT".equals(mCurrentEmploymentType) ? "PT" : "FT";

        // New employment type is Full Time
        if ("FT".equals(mCurrentEmploymentType)) {

            buttonType.setText("Full Time");
            labelIncome.setText("Annual Salary");
            labelHoursPerWeek.setEnabled(false);
            labelWeeksPerYear.setEnabled(false);
            fieldHoursPerWeek.setEnabled(false);
            fieldWeeksPerYear.setEnabled(false);

        }
        // New employment type if Part Time
        else {

            buttonType.setText("Part Time");
            labelIncome.setText("Hourly Wage");
            labelHoursPerWeek.setEnabled(true);
            labelWeeksPerYear.setEnabled(true);
            fieldHoursPerWeek.setEnabled(true);
            fieldWeeksPerYear.setEnabled(true);

        }

    }//GEN-LAST:event_buttonTypeActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        
        InterfaceIO.getInstance().cancelFormAddEmployee();
        
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        
        InterfaceIO.getInstance().addFormAddEmployee();
        
    }//GEN-LAST:event_buttonAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeForm().setVisible(true);
            }
        });
    }
    
    // Field value getters
    public String getFieldEmpNum() {
        return fieldEmpNum.getText();
    }
    
    public String getFieldFirstName() {
        return fieldFirstName.getText();
    }
    
    public String getFieldLastName() {
        return fieldLastName.getText();
    }
    
    public String getFieldSex() {
        return fieldSex.getText();
    }
   
    public String getFieldWorkLocation() {
        return fieldWorkLocation.getText();
    }
    
    public String getFieldEmploymentType() {
        return mCurrentEmploymentType;
    }
    
    public String getFieldDeductRate() {
        return fieldDeductRate.getText();
    }
    
    public String getFieldIncome() {
        return fieldIncome.getText();
    }
    
    public String getFieldHoursPerWeek() {
        return fieldHoursPerWeek.getText();
    }
    
    public String getFieldWeeksPerYear() {
        return fieldWeeksPerYear.getText();
    }
    
    public void fillFieldsWithEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double yearlySalary) {
        
        fillGenericFields(empNum, firstName, lastName, sex, workLoc, deductRate, yearlySalary);
        
        mCurrentEmploymentType = "FT";
        buttonType.setText("Full Time");
        labelIncome.setText("Annual Salary");
        labelHoursPerWeek.setEnabled(false);
        labelWeeksPerYear.setEnabled(false);
        fieldHoursPerWeek.setEnabled(false);
        fieldWeeksPerYear.setEnabled(false);
        
    }
    
    public void fillFieldsWithEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weeksPerYear) {
        
        fillGenericFields(empNum, firstName, lastName, sex, workLoc, deductRate, hourlyWage);
        
        mCurrentEmploymentType = "PT";
        buttonType.setText("Part Time");
        labelIncome.setText("Hourly Wage");
        labelHoursPerWeek.setEnabled(true);
        labelWeeksPerYear.setEnabled(true);
        fieldHoursPerWeek.setEnabled(true);
        fieldWeeksPerYear.setEnabled(true);
        
        fieldHoursPerWeek.setText(String.valueOf(hoursPerWeek));
        fieldWeeksPerYear.setText(String.valueOf(weeksPerYear));
        
    }
    
    private void fillGenericFields(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double income) {
        
        buttonAdd.setText("Finish");
        labelAddEmpTitle.setText("Edit Employee");
        
//        fieldEmpNum.setEnabled(false);
        
        fieldEmpNum.setText(String.valueOf(empNum));
        fieldFirstName.setText(firstName);
        fieldLastName.setText(lastName);
        fieldSex.setText(sex);
        fieldWorkLocation.setText(workLoc);
        
        fieldDeductRate.setText(String.valueOf(deductRate));
        fieldIncome.setText(String.valueOf(income));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonType;
    private javax.swing.JTextField fieldDeductRate;
    private javax.swing.JTextField fieldEmpNum;
    private javax.swing.JTextField fieldFirstName;
    private javax.swing.JTextField fieldHoursPerWeek;
    private javax.swing.JTextField fieldIncome;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldSex;
    private javax.swing.JTextField fieldWeeksPerYear;
    private javax.swing.JTextField fieldWorkLocation;
    private javax.swing.JLabel labelAddEmpTitle;
    private javax.swing.JLabel labelDeductRate;
    private javax.swing.JLabel labelDollarSign;
    private javax.swing.JLabel labelEmpNum;
    private javax.swing.JLabel labelEmpSubtitle;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelHoursPerWeek;
    private javax.swing.JLabel labelIncome;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPayrollSubtitle;
    private javax.swing.JLabel labelSex;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelWeeksPerYear;
    private javax.swing.JLabel labelWorkLocation;
    // End of variables declaration//GEN-END:variables
}
