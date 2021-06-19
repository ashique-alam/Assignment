package com.ashique.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort1 {

    public static void main(String[] args) {
        ArrayList<Student1> al=new ArrayList<>();

        al.add(new Student1(100,"Ashique",22));
        al.add(new Student1(106,"Vijay",24));
        al.add(new Student1(104,"Sonu",27));

        Comparator<Student1> cm1=Comparator.comparing(Student1::getName);
        Collections.sort(al,cm1);
        for (Student1 st:al
             ) {
            System.out.println(st.getRollno()+" "+st.getName()+" "+ st.getAge());
        }

    }

}
