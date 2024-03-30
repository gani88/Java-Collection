package com.gani.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Apple");
        collection.add("Banana");
        collection.add("Watermelon");
        collection.addAll(List.of("Honda", "Tesla", "Mazda"));

        for (var value : collection) {
            System.out.println(value);
            if (value == "Watermelon") {
                System.out.println("=============");
            }
        }
        System.out.println("Ukuran collection " + collection.size());
        System.out.println();
        collection.remove("Banana");
        collection.remove("Apple");
        collection.removeAll(List.of("Tesla"));

        for (var value : collection) {
            System.out.println(value);
            if (value == "Watermelon") {
                System.out.println("=============");
            }
        }
        System.out.println();
        System.out.println(collection.contains("Tesla"));
        System.out.println(collection.contains("Apple"));
        System.out.println(collection.contains("Mazda"));
    }
}
