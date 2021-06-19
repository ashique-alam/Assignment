package com.ashique.OOPSConceptAssignment;

public class Employee {

    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance;
    double hra;
    double salary;

    public Employee() {
    }

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
        this.specialAllowance=250.80;
        this.hra=1000.50;
    }

    public void calculateSalary(){
        salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
        System.out.println("The salary of "+employeeName +" : "+salary);

    }

    public void calculateTransportAllowance(){
        double transportAllowance=(10.0/100)*basicSalary;
        salary+=transportAllowance;
        System.out.println("The salary of "+employeeName +"after adding Transport allowance : "+salary);

    }
}
