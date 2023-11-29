package com.begginer.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {
        int i;
        FileInputStream fis;
        File file=new File("/Users/nithinatturu/Desktop/JAVA-SE/beginner/src/main/java/com/begginer/files/Nithin.txt");
        System.out.println(file);

        try{
            fis=new FileInputStream(file);

        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }

        try{
            do{
                i=fis.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }while (i!=-1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }

        try{
            fis.close();
        }catch (IOException e){
            System.out.println("Error Closing File");
        }
    }

    public void anotherMethod(){
        System.out.println("This is the another method");
    }

    public static void staticMethod(){
        System.out.println("This is the static method");
    }

}
