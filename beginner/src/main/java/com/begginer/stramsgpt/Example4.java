package com.begginer.stramsgpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of names, write a Java Stream to filter out the names that start with the letter "J" and
//        are exactly 5 characters long. Return a new list containing only those names.
public class Example4 {

    public static void main(String[] args) {
        List<String> namesList= Arrays.asList("Nithin","Jaa","JAAAA","JAGAn","JARS","Venkat");
        List<String> newNames = namesList.stream().filter(s -> s.toLowerCase().length() == 5).collect(Collectors.toList());
        System.out.println(newNames);
    }
}
