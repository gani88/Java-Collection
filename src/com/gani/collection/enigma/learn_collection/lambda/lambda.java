package com.gani.collection.enigma.learn_collection.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class lambda {

    public static void main(String[] args) {
//        Greeting hello = new Greeting() {
//            @Override
//            public void sayHello() {
//                System.out.println("Congrat's You've been Choosen to Become Next Player");
//            }
//        };

//        hello.sayHello();

//        Easy Way
//        Greeting hello1 = (String name) -> {
//            System.out.println(name + ", Congrat's You've been Choosen to Become Next Player");
//        };
//
//        hello1.sayHello("Atros");

//        Greeting hello = (String name) -> System.out.println((name + ", Congrat's You've been Choosen to Become Next Player"));
//
//        hello.sayHello("Atros");
//        Greeting hello = name -> System.out.println((name + ", Congrat's You've been Choosen to Become Next Player"));
//
//        hello.sayHello("Atros");
//
//        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6));
//
//        Consumer<Integer> kuadrat = number -> {
//          int result = number * number;
//          System.out.println(result);
//        };
//
//        nums.forEach(kuadrat);
//
//        System.out.println();
//
//        nums.forEach(number -> {
//            int result = number * number;
//            System.out.println(result);
//        });
//
//        System.out.println();
//
//        nums.forEach(number -> System.out.println(number * number));


        Function<Integer, Integer> newIncome = avg1 -> {
            return avg1 * 3;
        };

        List<Integer> avg = new ArrayList<>(List.of(5_000_000, 1_000_000, 2_000_000, 3_000_000, 8_000_000, 6_000_000));
        List<Integer> income = avg.stream().map(newIncome)
//                .collect(Collectors.toList());
                  .toList();
        System.out.println("List Awal : " + avg);
        System.out.println("List Akhir : " + income);

        income.forEach(System.out::println);

        System.out.println();


//        Predicate<String> isContain = sentence -> sentence.contains("a");
//        boolean validate = isContain.test("Enigma");
//        System.out.println(validate);

        List<Integer> highIncome = avg.stream().filter((avge -> {return avge > 5_000_000;})).toList();
        System.out.println("List Setelah Filter : " + highIncome);
    }
}
