package com.ashique.collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumSet1 {

    public static void main(String[] args) {
        Set<days> set= EnumSet.of(days.TUESDAY,days.WEDNESDAY);

        Iterator<days> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<days> set1=EnumSet.allOf(days.class);
        System.out.println("Days Of Week : "+set1);

        Set<days> set2=EnumSet.noneOf(days.class);
        System.out.println("Days Of Week : "+set2);

    }

}
