package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

//Write a program to print the count of each character in a String?
public class Example2 {

    public static void main(String[] args) {
        String s="This is the main String to be calculated for the count f";

       var ans= Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str->str, LinkedHashMap::new,Collectors.counting()));
        System.out.println(ans);
    }
}
