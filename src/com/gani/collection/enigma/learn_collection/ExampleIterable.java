package com.gani.collection.enigma.learn_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ExampleIterable {

    public static void main(String[] args) {
//        generic -> interface/classnya memberikan kebebasan kita untuk menaruh tipe data apapun, tapi harus di state di awal tipe datanya
//        generic harus diiisi dengan tipe data non-primitive


//        Iterable<String> names; // collection of string
//        String[] nama; // array of string

//        Iterable = hanya menyimpan dan menampilkan data // masih mirip array, belum dinamis
//        java version 8 ke bawah -> Arrays.asList()
//        di atas 8 -> List.Of()
//        default dari arrayList panjanganya 10
//        jika data lebih dari 10 maka akan mengcopy sehingga length jadi 20

        Iterable<String> names = new ArrayList<>(Arrays.asList("Jhiro", "Ilham", "Sauqi", "Abun"));
        System.out.println(names);

//        Cara akses / looping iterable
//        Cara lama
//        .iterator() : return iterator yang digunakan untuk mengakses elemen - elemen CollectionIterable kita secara berutun
//        method .next() -> akan menghasilkan data dari hasil iterasi

        Iterator<String> iterator = names.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        System.out.println("====================MENGGUNAKAN WHILE/DO-WHILE========================");
        while (iterator.hasNext()) { // hasNext = apakah data setelah data kita itu masih ada atau tidak
            System.out.println(iterator.next());
        }

//        Cara baru menggunakan for each
        System.out.println("====================MENGGUNAKAN FOR EACH===============================");
        for (var name : names) {
            System.out.println(name);
        }
    }
}
