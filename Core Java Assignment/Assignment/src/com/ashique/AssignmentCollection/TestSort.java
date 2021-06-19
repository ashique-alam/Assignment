package com.ashique.AssignmentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Person> al=new ArrayList<>();

        al.add(new Person(65,5.6,"Ashique"));
        al.add(new Person(45,5.2,"Avinash"));
        al.add(new Person(55,6.2,"Ashwini"));
        al.add(new Person(45,5.0,"Monu"));

        Comparator<Person> sortByWeight= (p,o)->Integer.compare(p.weight,o.weight);
        Comparator<Person> sortByHeight= (p,o)->Double.compare(p.height,o.height);

        al.stream()
                .sorted(
                        sortByWeight
                        .thenComparing(sortByHeight)
                )
                .forEach(
                        person ->
                                System.out.println(person.weight+" "+person.name+" "+person.height)
                );

    }
}
