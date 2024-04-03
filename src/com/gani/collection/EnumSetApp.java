package com.gani.collection;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum gender{
        MALE, FEMALE, NOT_MENTION;
    }

    public static void main(String[] args) {
//        EnumSet<gender> genders = EnumSet.allOf(gender.class);
        EnumSet<gender> genders = EnumSet.of(gender.MALE, gender.FEMALE, gender.MALE);


        for (var gender : genders) {
            System.out.println(gender);
        }
    }
}
