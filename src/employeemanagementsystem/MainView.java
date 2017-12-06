/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author williamqin
 */
public class MainView extends javax.swing.JFrame {
    
    // METHODS
    
    /**
     * Creates new form MainInterface
     */
    public MainView() {
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

        panelMain = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        labelPrompt = new javax.swing.JLabel();
        fieldSearch = new javax.swing.JTextField();
        buttonNew = new javax.swing.JButton();
        buttonOpen = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        panelViewEmp = new javax.swing.JPanel();
        labelViewTitle = new javax.swing.JLabel();
        panelEmp = new javax.swing.JPanel();
        labelEmpSubtitle = new javax.swing.JLabel();
        labelEmpNum = new javax.swing.JLabel();
        labelVarEmpNum = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        labelVarFirstName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelVarLastName = new javax.swing.JLabel();
        labelSex = new javax.swing.JLabel();
        labelVarSex = new javax.swing.JLabel();
        labelWorkLocation = new javax.swing.JLabel();
        labelVarWorkLoc = new javax.swing.JLabel();
        labelPayrollSubtitle = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        labelVarType = new javax.swing.JLabel();
        labelDeductRate = new javax.swing.JLabel();
        labelVarDeductRate = new javax.swing.JLabel();
        labelIncome = new javax.swing.JLabel();
        labelVarIncome = new javax.swing.JLabel();
        labelHoursPerWeek = new javax.swing.JLabel();
        labelVarHoursPerWeek = new javax.swing.JLabel();
        labelWeeksPerYear = new javax.swing.JLabel();
        labelVarWeeksPerYear = new javax.swing.JLabel();
        labelGrossIncome = new javax.swing.JLabel();
        labelVarGrossIncome = new javax.swing.JLabel();
        labelDeduction = new javax.swing.JLabel();
        labelVarDeduction = new javax.swing.JLabel();
        labelNetIncome = new javax.swing.JLabel();
        labelVarNetIncome = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        panelDatabase = new javax.swing.JPanel();
        labelViewTitle1 = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        labelVarSearch = new javax.swing.JLabel();
        scrollPaneDatabase = new javax.swing.JScrollPane();
        tableDatabase = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        labelTitle.setText("Employee Database");
        labelTitle.setToolTipText("");

        buttonSearch.setText("Search");

        buttonAdd.setText("Add New Employee");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        labelPrompt.setText("Welcome!");

        buttonNew.setText("New");
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        buttonOpen.setText("Open");

        buttonSave.setText("Save");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(buttonNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonOpen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSave)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(fieldSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearch))
                    .addComponent(buttonAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonNew)
                            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonOpen)
                                .addComponent(buttonSave)
                                .addComponent(labelPrompt)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(fieldSearch))
                        .addGap(17, 17, 17))))
        );

        panelViewEmp.setEnabled(false);

        labelViewTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelViewTitle.setText("View Employee");
        labelViewTitle.setToolTipText("");

        panelEmp.setBackground(new java.awt.Color(204, 204, 204));

        labelEmpSubtitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelEmpSubtitle.setText("Employee Information");
        labelEmpSubtitle.setToolTipText("");

        labelEmpNum.setText("Employee Number");

        labelVarEmpNum.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarEmpNum.setText("Select an employee...");

        labelFirstName.setText("First Name");

        labelVarFirstName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        labelLastName.setText("Last Name");

        labelVarLastName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        labelSex.setText("Sex");

        labelVarSex.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        labelWorkLocation.setText("Work Location");

        labelVarWorkLoc.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        labelPayrollSubtitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelPayrollSubtitle.setText("Payroll Information");

        labelType.setText("Employement Type");

        labelVarType.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        labelDeductRate.setText("Deduction Rate");

        labelVarDeductRate.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarDeductRate.setText("%");

        labelIncome.setText("Annual Salary");

        labelVarIncome.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarIncome.setText("$");

        labelHoursPerWeek.setText("Hours Per Week");
        labelHoursPerWeek.setEnabled(false);

        labelVarHoursPerWeek.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarHoursPerWeek.setEnabled(false);

        labelWeeksPerYear.setText("Weeks Per Year");
        labelWeeksPerYear.setEnabled(false);

        labelVarWeeksPerYear.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarWeeksPerYear.setEnabled(false);

        labelGrossIncome.setText("Gross Income");

        labelVarGrossIncome.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarGrossIncome.setText("$");

        labelDeduction.setText("Deduction");

        labelVarDeduction.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarDeduction.setText("$");

        labelNetIncome.setText("Net Income");

        labelVarNetIncome.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelVarNetIncome.setText("$");

        javax.swing.GroupLayout panelEmpLayout = new javax.swing.GroupLayout(panelEmp);
        panelEmp.setLayout(panelEmpLayout);
        panelEmpLayout.setHorizontalGroup(
            panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpLayout.createSequentialGroup()
                        .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmpSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPayrollSubtitle))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEmpLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmpLayout.createSequentialGroup()
                                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelWorkLocation)
                                    .addComponent(labelLastName)
                                    .addComponent(labelSex)
                                    .addComponent(labelFirstName)
                                    .addComponent(labelEmpNum))
                                .addGap(47, 47, 47)
                                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEmpLayout.createSequentialGroup()
                                        .addComponent(labelVarEmpNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addComponent(labelVarFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelVarSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelEmpLayout.createSequentialGroup()
                                        .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelVarLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelVarWorkLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panelEmpLayout.createSequentialGroup()
                                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEmpLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelNetIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelHoursPerWeek, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelWeeksPerYear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelGrossIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(12, 12, 12))
                                    .addGroup(panelEmpLayout.createSequentialGroup()
                                        .addComponent(labelType)
                                        .addGap(42, 42, 42))
                                    .addGroup(panelEmpLayout.createSequentialGroup()
                                        .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelEmpLayout.createSequentialGroup()
                                                .addComponent(labelDeductRate)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(labelIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(44, 44, 44)))
                                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelVarHoursPerWeek, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelVarWeeksPerYear, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelVarGrossIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelVarDeduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelVarNetIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelVarIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelVarDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelVarType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)))))
                .addContainerGap())
        );
        panelEmpLayout.setVerticalGroup(
            panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelEmpSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpNum)
                    .addComponent(labelVarEmpNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFirstName)
                    .addComponent(labelVarFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastName)
                    .addComponent(labelVarLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSex)
                    .addComponent(labelVarSex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVarWorkLoc)
                    .addComponent(labelWorkLocation))
                .addGap(18, 18, 18)
                .addComponent(labelPayrollSubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelType)
                    .addComponent(labelVarType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDeductRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVarDeductRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVarIncome)
                    .addComponent(labelIncome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHoursPerWeek)
                    .addComponent(labelVarHoursPerWeek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWeeksPerYear)
                    .addComponent(labelVarWeeksPerYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGrossIncome)
                    .addComponent(labelVarGrossIncome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeduction)
                    .addComponent(labelVarDeduction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNetIncome)
                    .addComponent(labelVarNetIncome))
                .addGap(25, 25, 25))
        );

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonRemove.setText("Remove");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewEmpLayout = new javax.swing.GroupLayout(panelViewEmp);
        panelViewEmp.setLayout(panelViewEmpLayout);
        panelViewEmpLayout.setHorizontalGroup(
            panelViewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewEmpLayout.createSequentialGroup()
                .addGroup(panelViewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewEmpLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelViewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelViewEmpLayout.createSequentialGroup()
                                .addComponent(buttonRemove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelViewTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelViewEmpLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(panelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelViewEmpLayout.setVerticalGroup(
            panelViewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewEmpLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelViewTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        labelViewTitle1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelViewTitle1.setText("View Database");
        labelViewTitle1.setToolTipText("");

        labelSearch.setText("Searched Term:");

        labelVarSearch.setText("asdf");

        tableDatabase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp. Number", "Type", "First Name", "Last Name", "Work Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneDatabase.setViewportView(tableDatabase);
        if (tableDatabase.getColumnModel().getColumnCount() > 0) {
            tableDatabase.getColumnModel().getColumn(0).setPreferredWidth(90);
            tableDatabase.getColumnModel().getColumn(1).setPreferredWidth(80);
            tableDatabase.getColumnModel().getColumn(2).setPreferredWidth(80);
            tableDatabase.getColumnModel().getColumn(3).setPreferredWidth(80);
            tableDatabase.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout panelDatabaseLayout = new javax.swing.GroupLayout(panelDatabase);
        panelDatabase.setLayout(panelDatabaseLayout);
        panelDatabaseLayout.setHorizontalGroup(
            panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatabaseLayout.createSequentialGroup()
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatabaseLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelViewTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatabaseLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatabaseLayout.createSequentialGroup()
                                .addComponent(labelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelVarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelDatabaseLayout.setVerticalGroup(
            panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatabaseLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelViewTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearch)
                    .addComponent(labelVarSearch))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelViewEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelViewEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        
        InterfaceIO.getInstance().beginFormAddEmployee();
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        // TODO add your handling code here:
        
        InterfaceIO.getInstance().reloadView();
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        // TODO add your handling code here:
        
        InterfaceIO.getInstance().removeCurrentEmployee();
    }//GEN-LAST:event_buttonRemoveActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        
        InterfaceIO.getInstance().editCurrentEmployee();
        
    }//GEN-LAST:event_buttonEditActionPerformed

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
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
   
    public void addRowToTable(Object[] row) {
        
        DefaultTableModel model = (DefaultTableModel) tableDatabase.getModel();
        model.addRow(row);
        
    }
    
    public void clearTable() {
        
        DefaultTableModel model = (DefaultTableModel) tableDatabase.getModel();
        if (model.getTableModelListeners().length > 0)
            model.removeTableModelListener(model.getTableModelListeners()[0]);
        model.setRowCount(0);
        InterfaceIO.getInstance().addListenerToTable();
        
    }
    
    public javax.swing.JTable getTableDatabase() {
        return tableDatabase;
    }
    
    public void setVarEmpNum(int empNum) {
        labelVarEmpNum.setText(String.valueOf(empNum));
    } 
    public void setVarFirstName(String firstName) {
        labelVarFirstName.setText(firstName);
    }
    public void setVarLastName(String lastName) {
        labelVarLastName.setText(lastName);
    }
    public void setVarSex(String sex) {
        labelVarSex.setText(sex);
    }
    public void setVarWorkLoc(String workLoc) {
        labelVarWorkLoc.setText(workLoc);
    }
    
    public void setVarEmploymentType(String type) {
        labelVarType.setText(type);
    }
    public void setVarDeductRate(double deductRate) {
        labelVarDeductRate.setText(String.format("%.2f", deductRate) + "%");
    }
    public void setVarIncome(double income) {
        labelVarIncome.setText("$" + String.format("%.2f", income));
    }
    public void setVarHoursPerWeek(double hoursPerWeek) {
        labelVarHoursPerWeek.setText(String.format("%.1f", hoursPerWeek));
    }
    public void setVarWeeksPerYear(double weeksPerYear) {
        labelVarWeeksPerYear.setText(String.format("%.1f", weeksPerYear));
    }
    public void setVarGrossIncome(double grossIncome) {
        labelVarGrossIncome.setText("$" + String.format("%.2f", grossIncome));
    }
    public void setVarDeduction(double deduction) {
        labelVarDeduction.setText("$" + String.format("%.2f", deduction));
    }
    public void setVarNetIncome(double netIncome) {
        labelVarNetIncome.setText("$" + String.format("%.2f", netIncome));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonOpen;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JLabel labelDeductRate;
    private javax.swing.JLabel labelDeduction;
    private javax.swing.JLabel labelEmpNum;
    private javax.swing.JLabel labelEmpSubtitle;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelGrossIncome;
    private javax.swing.JLabel labelHoursPerWeek;
    private javax.swing.JLabel labelIncome;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelNetIncome;
    private javax.swing.JLabel labelPayrollSubtitle;
    private javax.swing.JLabel labelPrompt;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSex;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelVarDeductRate;
    private javax.swing.JLabel labelVarDeduction;
    private javax.swing.JLabel labelVarEmpNum;
    private javax.swing.JLabel labelVarFirstName;
    private javax.swing.JLabel labelVarGrossIncome;
    private javax.swing.JLabel labelVarHoursPerWeek;
    private javax.swing.JLabel labelVarIncome;
    private javax.swing.JLabel labelVarLastName;
    private javax.swing.JLabel labelVarNetIncome;
    private javax.swing.JLabel labelVarSearch;
    private javax.swing.JLabel labelVarSex;
    private javax.swing.JLabel labelVarType;
    private javax.swing.JLabel labelVarWeeksPerYear;
    private javax.swing.JLabel labelVarWorkLoc;
    private javax.swing.JLabel labelViewTitle;
    private javax.swing.JLabel labelViewTitle1;
    private javax.swing.JLabel labelWeeksPerYear;
    private javax.swing.JLabel labelWorkLocation;
    private javax.swing.JPanel panelDatabase;
    private javax.swing.JPanel panelEmp;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelViewEmp;
    private javax.swing.JScrollPane scrollPaneDatabase;
    private javax.swing.JTable tableDatabase;
    // End of variables declaration//GEN-END:variables
}
