package com.samodeika.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 39);
        Person peggyOlson = new Person("Peggy Olson", 60);
        Person bertCooper = new Person("Bert Cooper", 666);

        Map<String, Person> madMen = new HashMap<>();
        madMen.put(donDraper.getName(), donDraper);
        madMen.put(peggyOlson.getName(), peggyOlson);
        madMen.put(bertCooper.getName(), bertCooper);

        System.out.println(madMen);

        for (Map.Entry<String, Person> entry : madMen.entrySet()) {
            System.out.println(entry);
        }

    }

}
