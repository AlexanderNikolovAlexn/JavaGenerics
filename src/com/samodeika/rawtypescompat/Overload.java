package com.samodeika.rawtypescompat;

import java.util.List;

public class Overload {

    public void print(String param) {

    }

    public void print(Integer param) {

    }

    public void print(List<String> param) {

    }

    // Can`t have this, because both methods have same erasure
    /*public void print(List<Integer> param) {

    }*/

}
