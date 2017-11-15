/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem.employee;

import java.util.ArrayList;

/**
 *
 * @author williamqin
 */
public class HashTableEmployeeInfo {
    
    // ATTRIBUTES

    // buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
    private ArrayList<EmployeeInfo>[] buckets;

    // CONSTRUCTOR

    public HashTableEmployeeInfo(int numberOfBuckets) {
        // Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

        // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[numberOfBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets[i] = new ArrayList<>();  // Instantiate the ArrayList for bucket i.
        }
    }

    // METHODS
    
    @Override
    public String toString() {

        // Return string form of HashTable, including the employee numbers for 
        // the employees stored in each bucket's ArrayList, starting with 
        // bucket 0, then bucket 1, and so on.

        String output = "";
        
        for (int i = 0; i < buckets.length; i++) {

            // For the current bucket, print out the emp num for each item in its ArrayList.

            int listSize = buckets[i].size();
            output += "\nExamining the ArrayList for bucket " + i + ", size: " + listSize;

            if (listSize == 0) {
                output += "\n  Nothing in this ArrayList!";
            }
            else {

                for (int j = 0; j < listSize; j++) {
                    int theEmpNum = buckets[i].get(j).getEmpNum();
                    output += "\n  Employee " + theEmpNum;
                }
            }

        }
        
        return output;

    }

    public int calcBucket(int keyValue) {
        // Hashing algorithm for determining buckets
        // Current hashing algorithm: modulo
        
        // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
        return(keyValue % buckets.length);
    }

    public boolean addEmployee(EmployeeInfo theEmployee) {

        // Add the employee to the hash table.  Return true if employee is added successfully,
        // return false otherwise.

        int key = theEmployee.getEmpNum();

        return buckets[calcBucket(key)].add(theEmployee);
    }

    public int findEmployeeIndex(int employeeNum) {

        // Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
        // If the employee is not found, return -1.
        
        int key = employeeNum;

        ArrayList<EmployeeInfo> bucket = buckets[calcBucket(key)];

        if (bucket.size() > 0) {
            int index = 0;
            for(EmployeeInfo emp : bucket)
            {
                if (emp.getEmpNum() == key)
                    return index;
                index += 1;
            }
        }
        return -1;
    }

    public EmployeeInfo removeEmployee(int employeeNum) {

        // Remove the employee from the hash table and return the reference to that employee.
        // If the employee is not in the hash table, return null.

        int key = employeeNum;

        ArrayList<EmployeeInfo> bucket = buckets[calcBucket(key)];
        
        int index = findEmployeeIndex(employeeNum);
        
        if (index != -1)
            return bucket.remove(index);
        return null;

    }
    
    public EmployeeInfo searchEmployee(int employeeNum) {
        
        // Return the reference to the employee from the hash table
        // If the employee is not in the hash table, return null.
        
        int key = employeeNum;
        
        ArrayList<EmployeeInfo> bucket = buckets[calcBucket(key)];
        
        int index = findEmployeeIndex(employeeNum);
        
        if (index != -1)
            return bucket.get(index);
        return null;
        
    }
    
    
}
