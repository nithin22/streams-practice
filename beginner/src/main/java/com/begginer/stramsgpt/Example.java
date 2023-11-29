package com.begginer.stramsgpt;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, write a Java Stream to find the average of all the positive integers in the list.
public class Example {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,-1);
        var avg=numbers.stream().filter(s->s>0).mapToInt(Integer::intValue).average();
        System.out.println(avg);

    }
}
