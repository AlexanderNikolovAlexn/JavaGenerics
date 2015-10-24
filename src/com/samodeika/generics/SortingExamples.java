package com.samodeika.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExamples {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 39);
        Person peggyOlson = new Person("Peggy Olson", 60);
        Person bertCooper = new Person("Bert Cooper", 44);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        System.out.println(madMen);

        Collections.sort(madMen, new AgerComparator());
        System.out.println(madMen);

        Collections.sort(madMen, new ReverseComparator<>(new AgerComparator()));
        System.out.println(madMen);
    }
}
