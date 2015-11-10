package com.samodeika.reflection;

import java.util.ArrayList;
import java.util.List;

public class NonRefiableExamples<T> {

    public static void main(String[] args) {
        new NonRefiableExamples<String>().main();
    }

    private void main() {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        System.out.println(strings.getClass());
        System.out.println(integers.getClass());

        List<? extends Number> numbers = new ArrayList<>();
        System.out.println(numbers.getClass());
    }

}
