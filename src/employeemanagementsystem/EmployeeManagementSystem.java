/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import employeemanagementsystem.employee.EmployeeInfo;
import employeemanagementsystem.employee.FullTimeEmployee;
import employeemanagementsystem.employee.PartTimeEmployee;
import employeemanagementsystem.employee.HashTableEmployeeInfo;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author williamqin
 */
public class EmployeeManagementSystem {
    
    // ATTRIBUTES
    
    private MainView mMainView;
    
    private HashTableEmployeeInfo mDatabase;
    
    // METHODS

    /**
     * @param argv the command line arguments
     */
    public static void main(String[] argv) {
        // TODO code application logic here
        
        EmployeeManagementSystem manager = new EmployeeManagementSystem();
        
        InterfaceIO.getInstance().setManager(manager);
        InterfaceIO.getInstance().loadView();
        
    }
    
    public EmployeeManagementSystem() {
        
        mDatabase = new HashTableEmployeeInfo(10);
        
    }
    
    public boolean addEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double annualSalary) {
        
        return addEmployee(new FullTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, annualSalary));
        
    }
    
    public boolean addEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, int hoursPerWeek, int weeksPerYear) {
        
        return addEmployee(new PartTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear));
        
    }
    
    private boolean addEmployee(EmployeeInfo emp) {
        
        boolean success = mDatabase.addEmployee(emp);
        if (success) {
            InterfaceIO.getInstance().populateTable(emp);
            if (mDatabase.getAllEmployees().isEmpty())
                InterfaceIO.getInstance().populateEmployeeInfo(emp);
        }
        
        return success;
        
    }
    
    public boolean editEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double annualSalary) {
        
        return editEmployee(new FullTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, annualSalary));
        
    }
    
    public boolean editEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, int hoursPerWeek, int weeksPerYear) {
        
        return editEmployee(new PartTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear));
        
    }
    
    private boolean editEmployee(EmployeeInfo emp) {
        
        boolean success = mDatabase.editEmployee(emp);
        if (success) {
            loadDatabase();
            if (mDatabase.getAllEmployees().size() <= 1)
                InterfaceIO.getInstance().populateEmployeeInfo(emp);
        }
        return success;
        
    }
    
    public EmployeeInfo searchEmployee(int empNum) {
        return mDatabase.searchEmployee(empNum);
    }
    
    public void loadDatabase() {
        
        ArrayList<EmployeeInfo> empList = mDatabase.getAllEmployees();
        
        InterfaceIO.getInstance().clearTable();
        
        for (EmployeeInfo emp : empList) {
            InterfaceIO.getInstance().populateTable(emp);
        }
        
    }
    
    public EmployeeInfo removeEmployee(EmployeeInfo emp) {
        
        return mDatabase.removeEmployee(emp.getEmpNum());
        
    }
    
    
}
