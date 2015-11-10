package com.samodeika.rawtypescompat;

import java.util.AbstractList;
import java.util.List;

public class CustomArrayList<T> extends AbstractList<T> {

    private T[] values;

    public CustomArrayList() {
        values = (T[]) new Object[0];
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean add(T o) {
        T[] newValues = (T[]) new Object[size() + 1];
        for (int i = 0; i < size(); i++) {
            newValues[i] = values[i];
        }
        newValues[size()] = o;
        values = newValues;
        return true;
    }

    public static void main(String[] args) {

//        String[] strings = new String[3];
//        Object[] objects = strings;
//        objects[0] = 1;

        //Generics
        List<Integer> arrayList = new CustomArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));


    }

}
