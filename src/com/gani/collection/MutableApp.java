package com.gani.collection;

import com.gani.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person1 = new Person("Zarek", List.of("Basketball"));
        person1.addHobby("Coding");
        person1.addHobby("Gaming");

//        getButChanging(person1.getHobbies());
        for (var value : person1.getHobbies()) {
            System.out.println(value);
        }

    }

    public static void getButChanging(List<String> hobby) {
        hobby.add("Ini Bukan Hobby"); // jika diterapkan ke immutable list maka akan muncul pesan error
    }
}


