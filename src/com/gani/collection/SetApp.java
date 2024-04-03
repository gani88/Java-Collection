package com.gani.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        System.out.println("HASH SET");
        Set<String> names = new HashSet<>();
        names.add("Flower");
        names.add("Tree");
        names.add("Animal");
        names.add("Animal");
        names.add("Tree");
        names.add("Flower");

        for (var name : names) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("LINKED HASHSET");
        Set<String> type = new LinkedHashSet<>();
        type.add("Flower");
        type.add("Tree");
        type.add("Animal");
        type.add("Animal");
        type.add("Tree");
        type.add("Flower");

        for (var name : type) {
            System.out.println(name);
        }
    }
}
