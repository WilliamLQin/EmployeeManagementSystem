/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import employeemanagementsystem.employee.EmployeeInfo;
import employeemanagementsystem.employee.FullTimeEmployee;
import employeemanagementsystem.employee.PartTimeEmployee;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author williamqin
 */
public class InterfaceIO {
    
    // Necessary to make InterfaceIO as a Singleton
    
    private static InterfaceIO instance;
    
    public static InterfaceIO getInstance() {
        return instance == null ? instance = new InterfaceIO() : instance;
    }
    
    // ATTRIBUTES
    
    private EmployeeManagementSystem mManager;
    private AddEmployeeForm mAddForm;
    private MainView mMainView;
    private EmployeeInfo mCurrentEmployee;
    
    private boolean mEditing = false;
    
    // METHODS
    
    public void setManager(EmployeeManagementSystem manager) {
        System.out.println(manager);
        mManager = manager;
    }
    
    public void beginFormAddEmployee() {
        
        mAddForm = new AddEmployeeForm();
        mAddForm.setVisible(true);
        mAddForm.setAlwaysOnTop(true);
        mAddForm.setResizable(false);
        mAddForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        mAddForm.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                confirmCloseFormAddEmployee();
            }
        });
        
        mMainView.setEnabled(false);
        mMainView.setFocusable(false);
        
    }
    
    private void confirmCloseFormAddEmployee() {
        if (JOptionPane.showConfirmDialog(mAddForm, 
            "Are you sure to close this window?", "Really Closing?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            closeFormAddEmployee();
        }
    }
    
    private void closeFormAddEmployee() {
        mAddForm.dispose();
        mMainView.setEnabled(true);
        mMainView.setFocusable(true);
    }
    
    public void cancelFormAddEmployee() {
        mEditing = false;
        confirmCloseFormAddEmployee();
    }
    
    public void addFormAddEmployee() {
        // TODO: get info from form and add employee
        
        String numField = mAddForm.getFieldEmpNum();
        String firstName = mAddForm.getFieldFirstName();
        String lastName = mAddForm.getFieldLastName();
        String sex = mAddForm.getFieldSex();
        String workLoc = mAddForm.getFieldWorkLocation();
        String deductRateField = mAddForm.getFieldDeductRate();
        String type = mAddForm.getFieldEmploymentType();
        
        String incomeField = mAddForm.getFieldIncome();
        String hoursPerWeekField = mAddForm.getFieldHoursPerWeek();
        String weeksPerYearField = mAddForm.getFieldWeeksPerYear();
        
        int empNum = 0;
        double deductRate = 0;
        double income = 0;
        int hoursPerWeek = 0;
        int weeksPerYear = 0;
        
        try {
            empNum = Integer.parseInt(numField);
            
            deductRate = Double.parseDouble(deductRateField);
            
            income = Double.parseDouble(incomeField);
            
            if (!type.equals("FT")) {
                hoursPerWeek = Integer.parseInt(hoursPerWeekField);
                weeksPerYear = Integer.parseInt(weeksPerYearField);
            }
        } catch(NumberFormatException e) {
            
            e.printStackTrace();
            String dialogAppend = ", Hourly Wage, Hours Per Week, and Weeks Per Year";
            if (type.equals("FT")) {
                dialogAppend = ", and Annual Salary";
            }
            
            JOptionPane.showConfirmDialog(mAddForm, 
                "Please ensure that the Employee Number, Deduct Rate" + dialogAppend + " fields are numbers. Employee Numbers above 2147483647 are not supported.", "Number Format Error!", 
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        
        boolean success = false;
        
        if (mEditing) {
            if (type.equals("FT")) {

                success = mManager.editEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, income);

            }
            else { 

                success = mManager.editEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, income, hoursPerWeek, weeksPerYear);

            }
            if (!success) {
                JOptionPane.showConfirmDialog(mAddForm, 
                    "Editing employee failed. (Employee may not be in database anymore)", "Edit failed!", 
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE);
            }
            else {
                closeFormAddEmployee();
            }
        }
        else {
            if (type.equals("FT")) {

                success = mManager.addEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, income);

            }
            else { 

                success = mManager.addEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, income, hoursPerWeek, weeksPerYear);

            }

            if (!success) {
                JOptionPane.showConfirmDialog(mAddForm, 
                    "Employee with employee number already exists!", "Employee exists!", 
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE);
            }
            else {
                closeFormAddEmployee();
            }
        }
        
        
    }
    
    public void reloadView() {
        
        if (JOptionPane.showConfirmDialog(mMainView, 
            "Close current window and open new window?", "Create new?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            
            mMainView.dispose();
            
            loadView();
        }
        
        
    }

    public void loadView() {
        mMainView = new MainView();
        mMainView.setVisible(true);
        mMainView.setResizable(false);
        mMainView.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        mMainView.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(mMainView, 
                    "Exit Employee Management System?", "Close?", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    
                    System.exit(0);
                    
                }
            }
        });
        
        addListenerToTable();
        
    }
    
    public void addListenerToTable() {
        mMainView.getTableDatabase().getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                // Selected element in database table
                int empNum = (int) mMainView.getTableDatabase().getValueAt(mMainView.getTableDatabase().getSelectedRow(), 0);
                populateEmployeeInfo(mManager.searchEmployee(empNum));
            }
        });
    }
    
    public void clearTable() {
        mMainView.clearTable();
    }
    
    public void populateTable(EmployeeInfo employee) {

        Object[] row = new Object[5];
        row[0] = employee.getEmpNum();
        if (employee instanceof FullTimeEmployee)
            row[1] = "Full Time";
        else if (employee instanceof PartTimeEmployee)
            row[1] = "Part Time";
        else
            row[1] = "null";
        row[2] = employee.getFirstName();
        row[3] = employee.getLastName();
        row[4] = employee.getWorkLoc();

        mMainView.addRowToTable(row);
        
    }
    
    public void populateEmployeeInfo(EmployeeInfo employee) {
        
        mCurrentEmployee = employee;
        
        mMainView.setVarEmpNum(employee.getEmpNum());
        mMainView.setVarFirstName(employee.getFirstName());
        mMainView.setVarLastName(employee.getLastName());
        mMainView.setVarSex(employee.getSex());
        mMainView.setVarWorkLoc(employee.getWorkLoc());
        
        String type = "null";
        if (employee instanceof FullTimeEmployee)
            type = "Full Time";
        else if (employee instanceof PartTimeEmployee)
            type = "Part Time";
        mMainView.setVarEmploymentType(type);
        
        mMainView.setVarDeductRate(employee.getDeductRate());
        
        if (employee instanceof FullTimeEmployee) {
            FullTimeEmployee fullTimeEmp = (FullTimeEmployee) employee;
            mMainView.setVarIncome(fullTimeEmp.getYearlySalary());
            mMainView.setVarHoursPerWeek(0);
            mMainView.setVarWeeksPerYear(0);
        }
        else if (employee instanceof PartTimeEmployee) {
            PartTimeEmployee partTimeEmp = (PartTimeEmployee) employee;
            mMainView.setVarIncome(partTimeEmp.getHourlyWage());
            mMainView.setVarHoursPerWeek(partTimeEmp.getHoursPerWeek());
            mMainView.setVarWeeksPerYear(partTimeEmp.getWeeksPerYear());
        }
        
        mMainView.setVarGrossIncome(employee.getAnnualGrossIncome());
        mMainView.setVarDeduction(employee.getAnnualGrossIncome() - employee.getAnnualNetIncome());
        mMainView.setVarNetIncome(employee.getAnnualNetIncome());
        
    }
    
    public void removeCurrentEmployee() {
        
        mManager.removeEmployee(mCurrentEmployee);
        
        mCurrentEmployee.setEmpNum(0);
        mCurrentEmployee.setFirstName("employee");
        mCurrentEmployee.setLastName("removed");
        
        populateEmployeeInfo(mCurrentEmployee);
        mCurrentEmployee = null;
        
        mManager.loadDatabase();
        
    }
    
    public void editCurrentEmployee() {
        
        int num = mCurrentEmployee.getEmpNum();
        String firstName = mCurrentEmployee.getFirstName();
        String lastName = mCurrentEmployee.getLastName();
        String sex = mCurrentEmployee.getSex();
        String workLoc = mCurrentEmployee.getWorkLoc();
        double deductRate = mCurrentEmployee.getDeductRate();
        
        if (mCurrentEmployee instanceof FullTimeEmployee) {
            FullTimeEmployee fullEmp = (FullTimeEmployee) mCurrentEmployee;
            double yearlySalary = fullEmp.getYearlySalary();
            
            beginFormAddEmployee();
            
            mAddForm.fillFieldsWithEmployee(num, firstName, lastName, sex, workLoc, deductRate, yearlySalary);
        }
        else if (mCurrentEmployee instanceof PartTimeEmployee) {
            PartTimeEmployee partEmp = (PartTimeEmployee) mCurrentEmployee;
            double hourlyWage = partEmp.getHourlyWage();
            double hoursPerWeek = partEmp.getHoursPerWeek();
            double weeksPerYear = partEmp.getWeeksPerYear();
            
            beginFormAddEmployee();
            
            mAddForm.fillFieldsWithEmployee(num, firstName, lastName, sex, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
        }
        else {
            System.out.println("Employee is a generic employee info (or some other random type)! This should not be happening.");
            return; // shouldn't happen but just in case
        }
        
        mEditing = true;        
        
        
        
        
    }
    
    
}
