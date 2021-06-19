package com.ashique.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String[] args) {
        NavigableMap<Integer,String> map=new TreeMap<>();

        map.put(100,"Amit");
        map.put(102,"Ashwini");
        map.put(101,"Ashique");
        map.put(103,"Sumit");
        map.put(100,"Avinash");

        System.out.println("Descending map : "+map.descendingMap());

        System.out.println("Head Map: "+map.headMap(102,true));

        System.out.println("Head Map: "+map.headMap(102,false));

        System.out.println("Tail Map: "+map.tailMap(102,true));

        System.out.println("Sub Map : "+map.subMap(100,true,102,false));

        System.out.println("Sub Map : "+map.subMap(100,true,102,true));
    }

}
