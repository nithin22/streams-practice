package com.begginer.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter q to stop");

        do{
            c=(char) br.read();
            System.out.println(c);
        }while (c !='q');
    }
}
