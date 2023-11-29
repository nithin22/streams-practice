package com.begginer.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("Nithin");
        ts.add("Atturu");
        ts.add("venkat");


        for (String s:ts
             ) {
            System.out.println(s);
        }
    }
}
