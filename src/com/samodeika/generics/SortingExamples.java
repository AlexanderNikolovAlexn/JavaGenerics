package com.samodeika.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        final Person youngestPerson = min(madMen, new AgerComparator());
        System.out.println(youngestPerson);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(11);
        System.out.println(min(numbers, Integer::compare));
    }

    public static <T> T min(List<T> values, Comparator<T> comparator) {
        if(values.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }
        T lowestElement = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);
            if(comparator.compare(element, lowestElement) < 0) {
                lowestElement = element;
            }
        }

        return lowestElement;
    }

}
