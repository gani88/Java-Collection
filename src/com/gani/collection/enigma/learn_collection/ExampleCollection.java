package com.gani.collection.enigma.learn_collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollection {

    public static void main(String[] args) {
        /**
         *  add() : Digunakan untuk menambah data sesuai dengan tipe data yang ditentukan di awal.
         *  remove() : Digunakan untuk menghapus data berdasarkan value
         *  name[] : bentuk ini tidak bisa di sini
         *  contains() : apakah data mengandung data yang diminta atau tidak, mencari data dalam array
         *
         *  di Collection tidak bisa mendapatkan index
         */

        Collection<String> names = new ArrayList<>();
        names.add("Jhiro");
        names.add("Ilham");
        names.add("Sauqi");
        names.add("Abun");
        names.add("Luky");
        System.out.println(names);
        names.remove("Luky");
        System.out.println(names);
        names.remove("Ilham");
        System.out.println(names);
        System.out.println(names.contains("Jhiro"));
        System.out.println(names.contains("Luky"));

        Collection<String> userNames = new ArrayList<>();
        userNames.add("Haqi");
        userNames.add("Zarek");
        names.addAll(userNames);

        System.out.println(names);

        System.out.println();
        System.out.println("Size of Collection Names : " + names.size());
        System.out.println("++++++++++++++++++++++++++++++");
        for (var name : names) {
            System.out.println(name);
        }
    }
}
