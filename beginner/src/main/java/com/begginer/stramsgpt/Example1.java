package com.begginer.stramsgpt;


//Question:
//        Given a list of strings, write a Java Stream to filter out the strings that start with the letter "A"
//        and return a new list containing only those strings.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {

        ArrayList<String> al= new ArrayList<>();
        al.add("Nithin");
        al.add("Venkat");
        al.add("Apple");
        al.add("apple");
        al.add("Atturu");
        al.add("Test");
        List<String> als = al.stream().filter((a) -> a.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.println(als);
    }
}
