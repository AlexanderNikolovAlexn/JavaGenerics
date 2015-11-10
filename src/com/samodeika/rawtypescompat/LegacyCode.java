package com.samodeika.rawtypescompat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("abc");
        list.add(1);
        list.add(new Object());

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(15);
        // no problem here
        List newList = integers;
        for (Object o : integers) {
            System.out.println(o);
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }

    }

}
