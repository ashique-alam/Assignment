package com.ashique.collection;

import java.util.HashSet;

public class BookHashSet {

    public static void main(String[] args) {
        Book bk=new Book(101,"Let Us C","Yashwant Kanetkar","BPB",8);
        Book bk1=new Book(102,"Data Structure","Frauzen","McGrawhill",4);
        Book bk2=new Book(103,"Operating System","Galvin","Wiley",6);

        HashSet<Book> hashSet=new HashSet<>();
        hashSet.add(bk);
        hashSet.add(bk1);
        hashSet.add(bk2);

        for (Book b:hashSet
             ) {
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

}
