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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MainInterface main = new MainInterface();
        main.setVisible(true);
        main.setResizable(false);
        
        HashTableEmployeeInfo hashTable = new HashTableEmployeeInfo(2);

        hashTable.addEmployee(new EmployeeInfo(1, "a", "b", 0, "Mississauga", 23.4));
        System.out.println(hashTable.findEmployeeIndex(1));

        System.out.println(hashTable.toString());

        System.out.println(hashTable.removeEmployee(1));

        System.out.println(hashTable.toString());
        
        FullTimeEmployee someEmp = new FullTimeEmployee(12, "daffy", "duck", 0, "Toronto", 0.13, 65000);
        System.out.println(someEmp.getAnnualNetIncome());

        PartTimeEmployee partEmp = new PartTimeEmployee(13, "foo", "bar", 1, "Windsor", 0.99, 10, 40, 50);

        hashTable.addEmployee(someEmp);
        hashTable.addEmployee(partEmp);

        EmployeeInfo emp = hashTable.removeEmployee(12);
        if (emp instanceof FullTimeEmployee) {
            FullTimeEmployee theEmp = (FullTimeEmployee) emp;
            theEmp.setYearlySalary(100000);
        }
        else if (emp instanceof PartTimeEmployee) {
            PartTimeEmployee theEmp = (PartTimeEmployee) emp;
            theEmp.setHourlyWage(15.00);
        }
        System.out.println(emp.getAnnualNetIncome());
        
    }
    
}
