package com.ashique.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        Iterator<String> itr=hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //adding duplicate
        hashSet.add("Three");
        System.out.println("After adding duplicate");
        Iterator<String> itr1=hashSet.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }

        hashSet.removeIf(str->str.contains("Three"));
        System.out.println("After removing Three hashSet is :"+hashSet);
    }

}
