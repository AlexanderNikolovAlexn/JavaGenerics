package com.samodeika.collections;

import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 39);
        Person peggyOlson = new Person("Peggy Olson", 60);

        Person[] madName = { donDraper, peggyOlson };
        System.out.println(Arrays.toString(madName));

        Person bertCooper = new Person("Bert Cooper", 121);
        madName = add(madName, bertCooper);

        System.out.println(Arrays.toString(madName));

        // no easy add(you should make a copy)
        // no contains(you should write it on your own)
    }

    private static Person[] add(Person[] array, Person person) {
        int length = array.length;
        array = Arrays.copyOf(array, length + 1);
        array[length] = person;
        return array;
    }

}
