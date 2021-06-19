package com.ashique.InterfaceAssignment;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
        KidUsers kidUsers=new KidUsers(10,"Kids");
        kidUsers.registerAccount();
        kidUsers.requestBook();
        System.out.println("===========================================================");

        KidUsers kidUsers1=new KidUsers(18,"Fiction");
        kidUsers1.registerAccount();
        kidUsers1.requestBook();
        System.out.println("===========================================================");

        AdultUsers adultUsers=new AdultUsers(5,"Kids");
        adultUsers.registerAccount();
        adultUsers.requestBook();
        System.out.println("===========================================================");

        AdultUsers adultUsers1=new AdultUsers(23,"Fiction");
        adultUsers1.registerAccount();
        adultUsers1.requestBook();
    }

}
