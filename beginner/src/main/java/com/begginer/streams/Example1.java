package com.begginer.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer>myList= new ArrayList<>();
        myList.add(7);
        myList.add(8);
        myList.add(1);
        myList.add(5);
        myList.add(2);
        myList.add(4);
        myList.add(3);
        myList.add(9);
        myList.add(11);
        System.out.println("Original List"+myList);
        Stream<Integer>myStream=myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()){
            System.out.println("Minimum Value is "+minVal.get());
        }
        myStream=myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compare);
        if(maxValue.isPresent()){
            System.out.println("Max value  is -->"+maxValue.get());
        }
        myStream=myList.stream();
        var sortedStream=myStream.sorted();
        sortedStream.forEach((n)-> System.out.println(n));
        myStream=myList.stream();
        System.out.println("THE odd Numbers are:");
        Stream<Integer> oddValues = myStream.sorted().filter((n)->(n % 2)==1);
        oddValues.forEach((n)-> System.out.println(n));
        myStream=myList.stream();
        System.out.println("The Even Numbers");
        Stream<Integer>evenNumebers=myStream.sorted().filter((n)->(n%2)==0);
        evenNumebers.forEach((n)-> System.out.println(n));
        myStream=myList.stream();
        System.out.println("Odd Greater than 5");
        Stream<Integer>oddStreamNumners=myStream.sorted().filter((n)->(n%2)==1).filter((n)->n>5);
//        Stream<Integer>greaterNumbers=oddStreamNumners.sorted().filter((n)->n>5);
        oddStreamNumners.forEach((n)-> System.out.println(n));
        myStream=myList.stream();
        var product=myList.stream().reduce((a,b)->a*b);
        System.out.println("The Product is "+product);
        var evenProduct=myList.stream().reduce(1,(a,b)->{
            if(b%2==0) return a*b; else return a;
        });
        System.out.println("Even Product is"+evenProduct);

        }
}
