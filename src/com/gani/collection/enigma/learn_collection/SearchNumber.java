package com.gani.collection.enigma.learn_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class SearchNumber {
    public static void main(String[] args) {
//        System.out.println("Please input numbers : ");
//        Scanner input = new Scanner(System.in);
//        List<Integer> myNumber = new List<>();
//        while (input.hasNextInt()) {
//            myNumber.add(input.nextInt());
//        }
//
//
//        input.close();

        // BIG & SMALL
        List<Integer> numbers = List.of(1, 4, 5, 6, 7, 6, -100, 50, 5, -10, 100, 67, -99);
        Integer tempBig = numbers.get(0);
        Integer tempSmall = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > tempBig) {
                tempBig = numbers.get(i);
            }else if (numbers.get(i) < tempSmall) {
                tempSmall = numbers.get(i);
            }
        }
        System.out.println("Angka Terbesar : " + tempBig);
        System.out.println("Angka Terkecil : " + tempSmall);

        System.out.println("===============Using method================");
        System.out.println("MAX : " + Collections.max(numbers));
        System.out.println("MIN : " + Collections.min(numbers));
    }
}
