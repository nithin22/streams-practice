package com.begginer.io;

import java.io.PrintWriter;

public class Example5 {
    public static void main(String[] args) {
        PrintWriter pw= new PrintWriter(System.out,true);

        int i=10;
        pw.println(i);
        String s="Nithin";
        pw.println(s);
        pw.print(i);
    }
}
