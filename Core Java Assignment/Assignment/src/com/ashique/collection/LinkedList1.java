package com.ashique.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Ajay");
        ll.add("Vijay");
        ll.add("Ravi");

        Iterator<String> iterator=ll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ll.add(1,"Gaurav");

        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("Sonu");
        ll1.add("Monu");
        ll1.addAll(ll);
        Iterator<String> iterator1=ll1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        String[] array=ll1.toArray(new String[ll1.size()]);
        System.out.println("Printing list in form of array"+ Arrays.toString(array));

    }

}
