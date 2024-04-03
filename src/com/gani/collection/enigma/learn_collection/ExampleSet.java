package com.gani.collection.enigma.learn_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExampleSet {

    public static void main(String[] args) {
//        Set menyimpan data yang unique (berbeda)
//        Data integer langsung diurutkan
//        Set tidak bisa akses index

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(4);
        System.out.println(integerSet);
        System.out.println("Size : " + integerSet.size());

//        Data yang unique juga berlaku untuk string
        Set<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Arif");
        names.add("Fahrul");
        names.add("Ayu");
        names.add("Ayu2");
        names.remove("Ayu2");
        System.out.println(names);

        Set<String> newNames = Set.of("Sheila", "Ayu", "Alsa");
        System.out.println(newNames);

        Hero sabri = new Hero("Sabri");
        Hero sabrina = new Hero("Sabri");
        Hero ferdy = new Hero("Ferdy");
        Hero adit = new Hero("Adit");

        Set<Hero> heroes = new HashSet<>();
        heroes.add(sabri);
        heroes.add(sabrina);
        heroes.add(ferdy);
        heroes.add(adit);

        System.out.println(heroes);

//        Immutable
//        kalau diimmutable tidak bisa langsung auto terbuang, harus manual
        Set<Hero> newHeroes = Set.of(sabri,ferdy,adit);
        System.out.println(newHeroes);
    }

    public static class Hero {
        private String name;

        // import constructor & toString
        public Hero(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    '}';
        }

        // generate equals & hashcode agar duplicate hilang
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hero hero = (Hero) o;
            return Objects.equals(name, hero.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
