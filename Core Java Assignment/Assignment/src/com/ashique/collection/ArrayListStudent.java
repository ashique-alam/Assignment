package com.ashique.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudent {

    public static void main(String[] args) {
        Student s1=new Student(1,"Ashique",22);
        Student s2=new Student(2,"Avinash",21);
        Student s3=new Student(3,"Ashwini",22);

        ArrayList<Student> sl=new ArrayList<>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        Iterator iterator= sl.iterator();
        while (iterator.hasNext()){
            Student st=(Student) iterator.next();
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }

}
