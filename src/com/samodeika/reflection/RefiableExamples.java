package com.samodeika.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RefiableExamples {

    public static class StringList extends ArrayList<String> {

    }

    public static void main(String[] args) {
        /*
        System.out.println(int.class);

        System.out.println(String.class);

        List<?> wildcards = new ArrayList<>();
        System.out.println(wildcards.getClass());
        List raw = new ArrayList();
        System.out.println(raw.getClass());

        System.out.println(int[].class);
        */

        List<String> strings = new ArrayList<>();
        Class<?> arrayList = strings.getClass();
        final TypeVariable<? extends Class<?>>[] typeParameters = arrayList.getTypeParameters();
        System.out.println(Arrays.toString(typeParameters));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.toGenericString());

        ParameterizedType arrayListOfString = (ParameterizedType) StringList.class.getGenericSuperclass();
        System.out.println(Arrays.toString(arrayListOfString.getActualTypeArguments()));

    }

}
