package com.gani.collection.enigma.learn_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExampleMap {
    public static void main(String[] args) {
//        Map<Key, Value> sebuahVariable
//        put() -> menambahkan data dalam map
//        get() -> sama seperti ArrayList untuk dapet index, tapi di Map namanya berubah jadi key
        Map<String, String> countries = new HashMap<>();

        countries.put("Indonesia","Jakarta");
        countries.put("Philippines","Manila");
        countries.put("Thailand","Bangkok");
        countries.put("Japan","Tokyo");

        System.out.println(countries);
        System.out.println(countries.size());
        System.out.println(countries.get("Japan"));
        System.out.println(countries.get("Thailand"));

        countries.replace("Indonesia", "IKN");
        System.out.println(countries);
        System.out.println(countries.size());
        System.out.println();

        System.out.println(countries.values()); // ini mengubah semua value menjadi array
        System.out.println(countries.keySet()); // ini mengubah semua key menjadi array
        System.out.println();

//        Looping Map
        for (String value : countries.values()) {
            System.out.println(value);
        }
        for (String value : countries.keySet()) {
            System.out.println(value);
            System.out.println(countries.get(value) + "++++");
        }

//        entrySet -> agar bisa dilooping , datanya diubah ke set
        for (Map.Entry<String, String> data : countries.entrySet()){
            System.out.println("Key : " + data.getKey());
            System.out.println("Value : " + data.getValue());
        }

        Map<String, Object> newData = new HashMap<>();
        newData.put("Number", 100);
        newData.put("Bool", true);
        newData.put("String", "Si String");
        newData.put("Object", new ExampleSet.Hero("Jhiro"));
        System.out.println();
        System.out.println(newData);

        for (Map.Entry<String, Object> data : newData.entrySet()){
            System.out.println("Key : " + data.getKey());
            System.out.println("Value : " + data.getValue());
        }

//        Immutable
        Map<Integer, ExampleSet.Hero> listHero = Map.of(
                1, new ExampleSet.Hero("Jhiro"),
                2, new ExampleSet.Hero("Sabri"));

        System.out.println(listHero);
//        listHero.replace(1, new ExampleSet.Hero("Adit")); // error karena immutable
        listHero.get(1).setName("Orij");
        System.out.println(listHero);
    }
}
