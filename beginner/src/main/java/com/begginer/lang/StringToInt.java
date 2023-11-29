package com.begginer.lang;

public class StringToInt {

    public static void main(String[] args) {
        String str="12345aaa";
        String newString="";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) {
                newString += str.charAt(i);
            }
        }
        int i=Integer.parseInt(newString);
        System.out.println(i);
    }
}
