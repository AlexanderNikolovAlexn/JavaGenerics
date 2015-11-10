package com.samodeika.rawtypescompat;

public class InstanceOfExample<T> {

    public boolean equals(Object o) {
        if(o instanceof InstanceOfExample) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(new InstanceOfExample<>() instanceof Object);

    }

}
