package com.samodeika.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 39);
        Person peggyOlson = new Person("Peggy Olson", 60);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        System.out.println(madMen);

        madMen.add(new Person("Bert Cooper", 666));
        System.out.println(madMen);

        System.out.println("Normal for loop!");
        for (int i = 0; i < madMen.size(); i++) {
                Person person = madMen.get(i);
            System.out.println(person);
        }

        System.out.println("Iterator!");
        Iterator<Person> iterator = madMen.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }

        System.out.println("Foreach implementation!");
        for (Person person : madMen) {
            System.out.println(person);
        }

    }

}
