package com.begginer.stramsgpt;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, write a Java Stream to count the number of
//        strings that have a length of 3 characters.
public class Example5 {

    public static void main(String[] args) {
        List<String> stringNames= Arrays.asList("Nithin","AVN","VNC","Atturu");

        var ans=stringNames.stream().filter(s->s.length()==3).collect(Collectors.toList());
        System.out.println(ans);
    }
}
