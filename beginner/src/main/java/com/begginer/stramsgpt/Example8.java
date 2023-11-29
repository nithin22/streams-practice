package com.begginer.stramsgpt;

import java.util.Arrays;
import java.util.List;

//Given a list of strings, write a Java Stream to find the count
//        of strings that contain the letter "e"
//        (either lowercase or uppercase) and have a length of at least 5 characters.
public class Example8{

    public static void main(String[] args) {
        List<String> stringlist= Arrays.asList("Nithin","Venkat","Aetur","Elephant","ear","egg","EGG");
        calculateCountOfStringsConatinLetterE(stringlist);
    }

    private static void calculateCountOfStringsConatinLetterE(List<String> stringlist) {
        long ans=stringlist.stream().filter(s->s.toLowerCase().contains("e")).count();
        System.out.println(ans);
    }
}
