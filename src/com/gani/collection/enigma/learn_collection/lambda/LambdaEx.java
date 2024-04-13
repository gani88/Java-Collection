package com.gani.collection.enigma.learn_collection.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx {
    public static void main(String[] args) {
        // Lambda expressions for Greeting interface
        Greeting hello = name -> System.out.println(name + ", Congrats! You've been chosen to become the next player.");
        hello.sayHello("Atros");
        System.out.println();

        // Using Consumer interface to square each number in a list
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        Consumer<Integer> square = number -> System.out.println(number * number);
        nums.forEach(square);
        System.out.println();

        // Using inline lambda expression directly in forEach
        System.out.println("Using inLine lambda expression directly");
        nums.forEach(number -> System.out.println(number * number));
        System.out.println();

        // Using Function interface to triple each income in a list
        Function<Integer, Integer> tripleIncome = income -> income * 3;
        List<Integer> incomes = List.of(5_000_000, 1_000_000, 2_000_000, 3_000_000, 8_000_000, 6_000_000);
        List<Integer> tripledIncomes = incomes.stream().map(tripleIncome).toList();
        System.out.println("Original List: " + incomes);
        System.out.println("Tripled List: " + tripledIncomes);

        // Print each income using forEach
        tripledIncomes.forEach(System.out::println);

        System.out.println();

        // Using Predicate interface to filter high incomes
//        Predicate<Integer> isHighIncome = income -> income > 5_000_000;
//        List<Integer> highIncomes = incomes.stream().filter(isHighIncome).toList();
        List<Integer> highIncomes = incomes.stream().filter(income -> income > 5_000_000).toList();
        System.out.println("High Incomes after Filtering: " + highIncomes);

        /**
         * Readability: Using a named predicate (isHighIncome) can make the code more readable, especially if the filtering condition is complex or if it's used in multiple places within the code.
         * Reusability: If the same filtering condition is used in multiple places within the code, defining it as a named predicate allows for better reusability. You can then reuse the predicate wherever needed without duplicating the filtering logic.
         * In this specific case, since the filtering condition is simple and used only once, the inline lambda expression approach is concise and readable. However, if the filtering condition becomes more complex or if it's used in multiple places, defining a named predicate might be a better approach for improved readability and reusability.
         */
    }
}
