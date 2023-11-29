package com.begginer.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str[]= new String[100];
        for(int i=0;i<100;i++){
            str[i]= br.readLine();
            if(str[i].equals("stop"))
            {
                break;
            }
        }
        System.out.println("Here is your File");
        for(int i=0;i<100;i++){
            if(str[i].equals("stop")){
                break;
            }
            else {
                System.out.println(str[i]);
            }
        }
    }
}
