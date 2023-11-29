package com.begginer.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println("Before Mapping"+al);
        Stream<Integer> res=al.stream().sorted().filter((n)->(n%2)==0).map((n)->0);
        res.forEach((n)-> System.out.println("After Replacing"+n));

    }
}
