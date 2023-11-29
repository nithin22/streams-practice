package com.begginer.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleAutoClose {

    public static void main(String[] args) {
        int i;
        File file=new File("/Users/nithinatturu/Desktop/JAVA-SE/beginner/src/main/java/com/begginer/files/Nithin.txt");
        System.out.println(file);
        try(FileInputStream fis= new FileInputStream(file)){

            do{
                i=fis.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }while (i!=-1);
        }catch (FileNotFoundException e){
            System.out.println("Unable to locate File");
        }
        catch (IOException e) {
            System.out.println("Error Reading File");
        }
    }

}
