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
    private EmployeeInfo mActiveEmployee;
    private int mActiveIndex;
    
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
        
        return mDatabase.addEmployee(new FullTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, annualSalary));
        
    }
    
    public boolean addEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, int hoursPerWeek, int weeksPerYear) {
        
        return mDatabase.addEmployee(new PartTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear));
        
    }
    
    
    
    
}
