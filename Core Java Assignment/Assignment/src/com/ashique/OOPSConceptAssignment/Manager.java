package com.ashique.OOPSConceptAssignment;

public class Manager extends Employee{
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance= (15.0/100)*basicSalary;
        salary+=transportAllowance;
        System.out.println("The salary of "+employeeName +"after adding Transport allowance : "+salary);
    }
}
