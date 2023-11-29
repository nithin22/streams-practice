package com.begginer.generics;



public class TestExample1 {

    public static void main(String[] args) {
        Example1<Integer> example1= new Example1(88);
        example1.showType();
        System.out.println("The value is ->" +example1.getObj());
        Example1<String> example2= new Example1("Nithin");
        example2.showType();
        System.out.println("The value is ->" +example2.getObj());
    }
}
