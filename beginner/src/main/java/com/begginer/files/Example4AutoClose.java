package com.begginer.files;

import java.io.*;

public class Example4AutoClose {

    public static void main(String[] args) {
        int i;

        File file=new File("/Users/nithinatturu/Desktop/JAVA-SE/beginner/src/main/java/com/begginer/files/Nithin.txt");
        File fileOutput=new File("/Users/nithinatturu/Desktop/JAVA-SE/beginner/src/main/java/com/begginer/files/Nithin2.txt");
        System.out.println(file);
        try(FileInputStream fis= new FileInputStream(file);
        FileOutputStream fos= new FileOutputStream(fileOutput)){
            do{
                i=fis.read();
                if(i!=-1){
                    fos.write(i);
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
