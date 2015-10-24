package com.samodeika.generics;

import java.util.Comparator;

public class AgerComparator implements Comparator<Person> {

    public int compare(final Person left, final Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }

}
