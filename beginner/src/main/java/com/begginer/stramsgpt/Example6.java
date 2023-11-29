package com.begginer.stramsgpt;

//Given a list of names, write a Java Stream to filter out the names that contain the
//        letter "a" (either lowercase or uppercase) and have a length
//        of at least 5 characters. Return a new list containing only those names.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {

    public static void main(String[] args) {

        List<String> nameList= Arrays.asList("Attur","ANITH","Nithin","Vebnkat","Asdrf","AAAA","AAAAA","AAAAA");
        var names=nameList.stream().filter(s->s.length()==5).filter(s->s.toLowerCase().startsWith("a")).collect(Collectors.toSet());
        System.out.println(names);

    }
}
