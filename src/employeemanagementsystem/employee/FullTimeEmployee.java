/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem.employee;

/**
 *
 * @author williamqin
 */
/*

FullTimeEmployee class
Superclass: EmployeeInfo

This class holds employee information specific to full time employees.

*/
public class FullTimeEmployee extends EmployeeInfo {

    // ATTRIBUTES

    private double yearlySalary;

    // CONSTRUCTORS

    public FullTimeEmployee(int empNum, String firstName, String lastName, String sex, String workLoc, double deductRate, double yearlySalary)
    {
        super(empNum, firstName, lastName, sex, workLoc, deductRate);
        this.yearlySalary = yearlySalary;
        
    }

    // METHODS

    @Override
    public double getAnnualGrossIncome()
    {
        return yearlySalary;
    }

    public double getYearlySalary()
    {
        return yearlySalary;
    }
    public void setYearlySalary(double yearlySalary)
    {
        this.yearlySalary = yearlySalary;
    }

}
