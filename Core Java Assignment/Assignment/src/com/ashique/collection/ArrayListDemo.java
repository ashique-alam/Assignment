package com.ashique.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ashique");
        list.add("Ashwini");
        list.add("Avinash");
        list.add("Ashique");

        Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
