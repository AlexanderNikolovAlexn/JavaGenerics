package com.samodeika.advancedtopics;

import com.samodeika.collections.Person;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class LambdaExamples {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 75);
        Person bertCooper = new Person("Bert Cooper", 100);

        Predicate<Person> isOld = person -> person.getAge() > 80;
        System.out.println(isOld.test(donDraper));
        System.out.println(isOld.test(peggyOlson));

        List<Person> people = new ArrayList<>();
        people.add(donDraper);
        people.add(peggyOlson);
        people.add(bertCooper);

        Map<Boolean, List<Person>> oldAndYoung = people.stream().collect(Collectors.partitioningBy(person -> person.getAge() > 80));
        Map<Boolean, Long> oldAndYoung2 = people.stream().collect(Collectors.partitioningBy(person -> person.getAge() > 80, counting()));

        System.out.println(oldAndYoung);
        System.out.println(oldAndYoung2);
    }

}
