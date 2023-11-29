package com.begginer.stramsgpt;


//Given a list of integers, write a Java Stream to find the product of all the even numbers in the list.


import java.util.Arrays;
import java.util.List;

public class Example7 {

    public static void main(String[] args) {
            List<Integer> numbers= Arrays.asList(1,2,3,4,6,7,9);
        var ans=numbers.stream().filter(n->(n%2==0)).reduce(1,(a,b)->a*b);
        System.out.println(ans);
        findTheMaxinTheStream(numbers);
        findTheMinOftheStream(numbers);
        sumOfOnlyEvenNumbers(numbers);
    }

    private static void sumOfOnlyEvenNumbers(List<Integer> numbers) {
        var ans=numbers.stream().filter(n->(n%2==0)).reduce(0,(a,b)->a+b);
        System.out.println(ans);
    }

    private static void findTheMinOftheStream(List<Integer> numbers) {
        var ans=numbers.stream().reduce(Integer.MAX_VALUE,(a,b)->Math.min(a,b));
        System.out.println(ans);
    }

    private static void findTheMaxinTheStream(List<Integer> numbers) {
        var ans=numbers.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
        System.out.println(ans);
    }






}
