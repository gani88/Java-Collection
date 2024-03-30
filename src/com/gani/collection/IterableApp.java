package com.gani.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {

    public static void main(String[] args) {

        Iterable<String> laptop = List.of("Lenovo", "Asus", "Dell", "Acer");
        for (var product : laptop) {
            System.out.println(product);
        }
        System.out.println("=============ITERATOR==================");
        Iterator<String> iterator = laptop.iterator();
        while (iterator.hasNext()) {
            String prod = iterator.next();
            System.out.println(prod);
        }
    }
}
