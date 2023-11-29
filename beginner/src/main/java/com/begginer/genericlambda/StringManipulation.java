package com.begginer.genericlambda;

public class StringManipulation {

    public static void main(String[] args) {

        FunctionalInterface<String> fs=(s)->{
            String reverseString="";
            for(int i=s.length()-1;i>=0;i--){
                reverseString+=s.charAt(i);
            }
            return reverseString;
        };

        System.out.println(fs.function("ABCDE"));

//        The same Functionanl Interface for Integer Type

        FunctionalInterface<Integer> fis=(s)->{
            int result=1;

            for(int i=1;i<=s;i++){
                result*=i;
            }
            return result;
        };

        System.out.println(fis.function(5));
    }
}
