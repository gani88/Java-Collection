package com.gani.collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Mercury");
        strings.add("Venus");
        strings.add("Earth");
        System.out.println(strings);
        System.out.println();

        strings.set(1, "Damnation Planet");
        System.out.println(strings);
        System.out.println();

        strings.remove(1);
        System.out.println(strings);
        System.out.println();

        System.out.println(strings.get(0));
        System.out.println();

        for (var nilai : strings) {
            System.out.println(nilai);
        }



    }
}
