package com.samodeika.introduction;

import java.util.ArrayList;
import java.util.List;

public class IntroductionExamples {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("string a");
        list.add("string b");
        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("5 % 3 = " + 5%4);

    }

}
