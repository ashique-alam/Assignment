package com.ashique.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Ashique");
        list.add("Ashwini");
        list.add("Avinash");
        list.add("Assim");

        //iterates using listIterator

        System.out.println("Using listIterator");

        ListIterator<String> listIterator=list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            String str=listIterator.previous();
            System.out.println(str);
        }

        //iterate using for loop
        System.out.println("Using for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //iterate using forEach()
        System.out.println("Using forEach method");
        list.forEach(a -> {
            System.out.println(a);
        });

        //forEachRemaining
        System.out.println("Using forEachRemaining");
        Iterator<String> iterator=list.iterator();
        iterator.forEachRemaining(a -> {
            System.out.println(a);
        });

    }

}
