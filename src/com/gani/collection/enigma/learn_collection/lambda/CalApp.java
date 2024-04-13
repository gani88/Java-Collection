package com.gani.collection.enigma.learn_collection.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class CalApp {

    public static void main(String[] args) {
//        Calculation sub = (firstNum, secondNum) -> {
//            return firstNum + secondNum;
//        };
//
//        int num = sub.doCalc(10, 100);
//        System.out.println(num);
//
        Calculation sub = (firstNum, secondNum) -> firstNum + secondNum;
        int num = sub.doCalc(10, 100);
        System.out.println(num);

//        Built-in Function Interface
//        Interface Customer

        Consumer<String> greeting = name -> System.out.println("Hello " + name);
        greeting.accept("Valkyrie");

//        Interface Function
        Function<Integer, Boolean> isOdd = angka -> angka % 2 ==1;
        System.out.println(isOdd.apply(10));

    }
}
