/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import employeemanagementsystem.employee.EmployeeInfo;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
                "Please ensure that the Employee Number, Deduct Rate" + dialogAppend, "Number Format Error!", 
                JOptionPane.OK_OPTION,
                JOptionPane.ERROR_MESSAGE);
        }
        
        boolean success = false;
        
        if (type.equals("FT")) {
            
            success = mManager.addEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, income);
            
        }
        else { 
            
            success = mManager.addEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, income, hoursPerWeek, weeksPerYear);
            
        }
        
        if (!success) {
            JOptionPane.showConfirmDialog(mAddForm, 
                "Employee with employee number already exists!", "Employee exists!", 
                JOptionPane.OK_OPTION,
                JOptionPane.ERROR_MESSAGE);
        }
        else {
            
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
    }
    
    
    public void populateTable(ArrayList<EmployeeInfo> employees) {
        
        
        
        
    }
    
    
}
