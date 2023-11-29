package com.begginer.operators;

public class IncrDec {
    int a=100;
    int b=200;

    int c;

    public void printInfo(){
        System.out.println("A original "+a);
        System.out.println("B original "+b);
        int c=++a;
        System.out.println("A after ++ "+a);
        System.out.println("C Value is "+c);

    }
}
