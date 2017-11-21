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
    
    private boolean addEmployee(String numField, String firstName, String lastName, String sex, String workLoc, String deductRateField, String type) {
        int num = 0;
        double deductRate = 0;
        
        try {
            num = Integer.parseInt(numField);
            deductRate = Double.parseDouble(deductRateField);
        } catch(NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
        
        
        
        return true;
        
    }
    
    
    
}
