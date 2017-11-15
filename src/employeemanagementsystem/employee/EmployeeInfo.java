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

EmployeeInfo Class

Inherited by:
 - FullTimeEmployee
 - PartTimeEmployee

This class is the super class for holding employee information.

*/

public class EmployeeInfo {

    // ATTRIBUTES

    private int empNum;
    private String firstName;
    private String lastName;
    private int sex; // encode e.g. 0 for M, 1 for F, etc.
    private String workLoc; // encode e.g. 0 for Mississauga, etc.
    private double deductRate; // e.g. 0.21 for 21%

    // CONSTRUCTORS

    public EmployeeInfo(int empNum, String firstName, String lastName, int sex, String workLoc, double deductRate)
    {
        this.empNum = empNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.workLoc = workLoc;
        this.deductRate = deductRate;
    }

    // METHODS

    @Override
    public String toString()
    {
        return firstName + ", " + lastName;
    }

    public double getAnnualGrossIncome()
    {
        return 0;
    }
    public double getAnnualNetIncome()
    {
        return getAnnualGrossIncome() * (1 - deductRate);
    }


    public int getEmpNum() 
    {
        return empNum;
    }

    public void setEmpNum(int empNum)
    {
        this.empNum = empNum;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getWorkLoc()
    {
        return workLoc;
    }

    public void setWorkLoc(String workLoc)
    {
        this.workLoc = workLoc;
    }

    public double getDeductRate()
    {
        return deductRate;
    }

    public void setDeductRate(double deductRate)
    {
        this.deductRate = deductRate;
    }
    
}