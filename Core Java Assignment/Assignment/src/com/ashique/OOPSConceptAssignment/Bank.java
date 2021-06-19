package com.ashique.OOPSConceptAssignment;

abstract class GeneralBank{
    public abstract void getSavingInterestRate();
    public abstract void getFixedInterestRate();

}

class ICICIBank extends GeneralBank{

    @Override
    public void getSavingInterestRate() {
        System.out.println("ICICI Bank Saving Interest Rate : 4%");
    }

    @Override
    public void getFixedInterestRate() {
        System.out.println("ICICI Bank Fixed Interest Rate : 8.5%");
    }
}

class KotMBank extends GeneralBank{

    @Override
    public void getSavingInterestRate() {
        System.out.println("Kotak Mahindra Bank Saving Interest Rate : 6%");
    }

    @Override
    public void getFixedInterestRate() {
        System.out.println("Kotak Mahindra Bank Fixed Interest Rate : 9%");
    }
}

public class Bank {

    public static void main(String[] args) {
        ICICIBank iciciBank=new ICICIBank();
        iciciBank.getSavingInterestRate();
        iciciBank.getFixedInterestRate();
        System.out.println("===========================================================");

        KotMBank kotMBank=new KotMBank();
        kotMBank.getSavingInterestRate();
        kotMBank.getFixedInterestRate();
        System.out.println("===========================================================");

        GeneralBank generalBank=new ICICIBank();
        generalBank.getSavingInterestRate();
        generalBank.getFixedInterestRate();
        System.out.println("===========================================================");

        GeneralBank generalBank1=new KotMBank();
        generalBank1.getSavingInterestRate();
        generalBank1.getFixedInterestRate();
    }

}
