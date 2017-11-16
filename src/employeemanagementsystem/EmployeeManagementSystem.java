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

/**
 *
 * @author williamqin
 */
public class EmployeeManagementSystem {
    
    // ATTRIBUTES
    
    private MainInterface mMainInterface;
    
    private HashTableEmployeeInfo mDatabase;
    private EmployeeInfo mActiveEmployee;
    private int mActiveIndex;
    
    // METHODS

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
        
        mMainInterface = new MainInterface();
        mMainInterface.setVisible(true);
        mMainInterface.setResizable(false);
        
    }
    
    public void loadDatabase() {
        
        mDatabase = new HashTableEmployeeInfo(10);
        
    }
    
    public void getFieldInfo() {
        
        String empNumInput = mMainInterface.getFieldEmpNum();
        int empNum = 0;
        String firstName = mMainInterface.getFieldFirstName();
        String lastName = mMainInterface.getFieldLastName();
        String sex = mMainInterface.getFieldSex();
        String workLoc = mMainInterface.getFieldWorkLocation();
        String deductRateInput = mMainInterface.getFieldDeductRate();
        
        String type = mMainInterface.getFieldEmploymentType();
        
        
        
        
    }
    
    
    
    public void addEmployee(String numField, String firstName, String lastName, String sex, String workLoc, String deductRateField) {
        
        
        
    }
    
    
    
}
