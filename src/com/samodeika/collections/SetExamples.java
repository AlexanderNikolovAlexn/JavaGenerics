package com.samodeika.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 39);
        Person peggyOlson = new Person("Peggy Olson", 60);
        Person bertCooper = new Person("Bert Cooper", 666);

        Set<Person> madMen = new HashSet<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(donDraper);

        for (Person person : madMen) {
            System.out.println(person);
        }

        System.out.println(madMen.contains(donDraper));
        System.out.println(madMen.contains(bertCooper));
    }

}
