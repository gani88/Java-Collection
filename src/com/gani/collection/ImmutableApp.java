package com.gani.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> only = Collections.singletonList("One only data");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Rain");
        mutable.add("Thunderstorm");
        List<String> immutable = Collections.unmodifiableList(mutable);
//        immutable.add("Strom"); error karena immutable
        List<String> element = List.of("Semarang", "Jakarta", "Bandung");


    }
}
