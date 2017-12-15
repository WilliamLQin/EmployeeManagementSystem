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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    
    private final String SAVE_NAME = "employees.txt";
    private final int DATABASE_BUCKETS = 10;
    private final String DATA_SEPARATOR = ",";
    
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
        
        mDatabase = new HashTableEmployeeInfo(DATABASE_BUCKETS);
        
    }
    
    public boolean addEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double annualSalary) {
        
        return addEmployee(new FullTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, annualSalary));
        
    }
    
    public boolean addEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weeksPerYear) {
        
        return addEmployee(new PartTimeEmployee(empNum, firstName, lastName, sex, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear));
        
    }
    
    private boolean addEmployee(EmployeeInfo emp) {
        
        boolean success = mDatabase.addEmployee(emp);
        if (success) {
            InterfaceIO.getInstance().populateTable(emp);
            InterfaceIO.getInstance().populateEmployeeInfo(emp);
        }
        return success;
        
    }
    
    public boolean editEmployee(int prevEmpNum, int currEmpNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double annualSalary) {
        
        return editEmployee(prevEmpNum, new FullTimeEmployee(currEmpNum, firstName, lastName, sex, workLoc, deductRate, annualSalary));
        
    }
    
    public boolean editEmployee(int prevEmpNum, int currEmpNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weeksPerYear) {
        
        return editEmployee(prevEmpNum, new PartTimeEmployee(currEmpNum, firstName, lastName, sex, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear));
        
    }
    
    private boolean editEmployee(int prevEmpNum, EmployeeInfo emp) {
        
        boolean success = mDatabase.editEmployee(prevEmpNum, emp);
        if (success) {
            InterfaceIO.getInstance().reloadTable();
            InterfaceIO.getInstance().populateEmployeeInfo(emp);
        }
        return success;
        
    }
    
    public EmployeeInfo searchEmployee(int empNum) {
        return mDatabase.searchEmployee(empNum);
    }
    
    public void reloadFullDatabase() {
        
        ArrayList<EmployeeInfo> empList = mDatabase.getAllEmployees();
        
        InterfaceIO.getInstance().clearTable();
        
        for (EmployeeInfo emp : empList) {
            InterfaceIO.getInstance().populateTable(emp);
        }
        
    }
    
    public EmployeeInfo removeEmployee(EmployeeInfo emp) {
        
        return mDatabase.removeEmployee(emp.getEmpNum());
        
    }
    
    public void searchDatabase(String term, String type) {
        
        ArrayList<EmployeeInfo> empList = mDatabase.searchEmployees(term, type);
        
        InterfaceIO.getInstance().clearTable();
        
        for (EmployeeInfo emp : empList) {
            InterfaceIO.getInstance().populateTable(emp);
        }
        
    }
    
    public void clearDatabase() {
        
        ArrayList<EmployeeInfo> empList = mDatabase.getAllEmployees();
        
        InterfaceIO.getInstance().clearTable();
        
        for (EmployeeInfo emp : empList) {
            mDatabase.removeEmployee(emp.getEmpNum());
        }
        
    }
    
    public boolean saveDatabaseToFile() {
        
        File file = new File("." + File.separator + SAVE_NAME);
            
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
           
            ArrayList<EmployeeInfo> empList = mDatabase.getAllEmployees();
            for (EmployeeInfo emp : empList) {
                bw.write(emp.toString());
                bw.newLine();
            }
            
            bw.close();
            
            System.out.println("Save file success!");
            return true;
            
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            
        }
    }
    
    public boolean readDatabaseFromFile() {
        
        File file = new File("." + File.separator + SAVE_NAME);
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            String line = br.readLine();
            
            clearDatabase();
            
            while (line != null) {
                
                String[] params = line.split(DATA_SEPARATOR);
                for (int i = 0; i < params.length; i++) {
                    if (params[i].equals(" "))
                        params[i] = "";
                }
                
                if (params[0].equals("FT")) {
                    int empNum = Integer.valueOf(params[1]);
                    double deductRate = Double.valueOf(params[6]);
                    double yearlySalary = Double.valueOf(params[7]);
                    addEmployee(empNum, params[2], params[3], params[4], params[5], deductRate, yearlySalary);
                }
                else if (params[0].equals("PT")) {
                    int empNum = Integer.valueOf(params[1]);
                    double deductRate = Double.valueOf(params[6]);
                    double hourlyWage = Double.valueOf(params[7]);
                    double hoursPerWeek = Double.valueOf(params[8]);
                    double weeksPerYear = Double.valueOf(params[9]);
                    addEmployee(empNum, params[2], params[3], params[4], params[5], deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
                }
                else {
                    System.out.println("Warning: found an employee that's not part time or full time.");
                }
                
                line = br.readLine();
            }
            
            
            return true;
        }
        catch(IOException e) {
            e.printStackTrace();
            return false;
        }
        catch(NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
