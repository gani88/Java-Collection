package com.gani.collection.enigma.learn_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ExampleList {
    public static void main(String[] args) {

        /**
         * get() : mengambil elemen berdasarkan index
         * set(index, object, element) -> merubah berdasarkan index
         */

        List<String> names = new ArrayList<>();
        names.add("Jhiro");
        names.add("Ilham");
        names.add("Sauqi");
        names.add("Abun");
        names.add("Luky");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println("Kinda Like Slicing : " + names.subList(0,3));

        names.set(0, "Sabri");
        System.out.println(names);
        names.remove("Sabri");  // Menghapus by value
        System.out.println(names);
        names.remove(2);        // Menghapus by index
        System.out.println(names);
        System.out.println("========================");

        List<String> car = new LinkedList<>();
        printList(car);
        printList(new ArrayList<>());
        printList(names);
        printList(new Vector<>());

        System.out.println("================LOOP=================");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("===============IMMUTABLE==================");
//        Immutable List , tidak bisa diubah
        List<String> finalNames = List.of("Ilham", "Sauqi", "Luky");
        List<String> mutableNames = new ArrayList<>(List.of("Ilham", "Sauqi", "Luky"));
        mutableNames.add("Abun");
        System.out.println("Immutable : " + finalNames);
        System.out.println("Mutable : " + mutableNames);

    }

    public static void printList(List<String> arrayList) {
//        Datanya kalau kita butuh method khusus dari class implementasinya tinggal kita casting
        System.out.println(arrayList);

    }
}
