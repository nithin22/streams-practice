package com.begginer.stramsgpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a list of strings, write a Java Stream to find the length of the longest string in the list.
public class Example3 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Nithin","Atturu","Avenkat","Venkat Nihtin","Venkat Nithin Atturu","Atturu Venkat Nithin");
        lengthOftheLongestString(list);
    }

    private static void lengthOftheLongestString(List<String> list) {
        int lenght=list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(lenght);

    }


}
