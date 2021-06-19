package com.ashique.ExceptionAssignmet;

public class TaxCalculator {

    double taxAmount ;

    public double calculateTax(String empName,boolean isIndian,double empSal){

        try {
            if (isIndian==false){
                throw new MyException("The employee should be an Indian citizen for calculating tax.");

            }
            else if (empName==null || empName.isEmpty()){
                throw new MyException("The employee name cannot be empty");
            }
            else if (empSal>100000){
                return empSal*8/100;
            }
            else if (empSal > 50000 && empSal < 100000){
                return empSal*6/100;
            }
            else if (empSal > 30000 && empSal < 50000){
                return empSal*5/100;
            }
            else if (empSal > 10000 && empSal < 30000){
                return empSal *4/100;
            }
            else {
                throw new MyException("The employee does not need to pay tax");
            }

          
        }catch (MyException e){
            e.printStackTrace();
        }

        return taxAmount;
    }

}
