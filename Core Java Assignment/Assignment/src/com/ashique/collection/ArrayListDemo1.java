package com.ashique.collection;

import java.util.*;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ashique");
        list.add("Ashwini");
        list.add("Avinash");
        list.add("Ashique");

        list.set(3,"Aasim");

        System.out.println("Value at index 2 is"+list.get(2));

        Collections.sort(list);

        for (String name:list
             ) {
            System.out.println(name);
        }
    }

}
