package com.ashique.ExceptionAssignmet;

public class CalculatorSimulator {

    public static void main(String[] args) {
        TaxCalculator taxCalculator=new TaxCalculator();

        System.out.println("The tax amount is "+taxCalculator.calculateTax("Ron",false,34000));

        System.out.println("The tax amount is "+taxCalculator.calculateTax("Tim",true,1000));

        System.out.println("The tax amount is "+taxCalculator.calculateTax("Jack",true,55000));

        System.out.println("The tax amount is "+taxCalculator.calculateTax("",true,3000));



    }

}
