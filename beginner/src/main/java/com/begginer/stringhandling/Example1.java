package com.begginer.stringhandling;

import java.util.Arrays;


public class Example1 {
    static String arr[]={"Now","Apple","Cat","banana","Donkey","Ear","Zebra","Mango"};


    public static void main(String[] args) {
        for(int j=0;j<arr.length;j++){
            for(int i=j+1;i<arr.length;i++){
                if(arr[i].compareToIgnoreCase(arr[j])<0){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(arr[j]);
        }
    }
}
