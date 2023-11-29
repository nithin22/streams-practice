package com.begginer.genericlambda;

public class MethodReference {
    public static String functionString(String s){
        String revString="";
        for(int i=s.length()-1;i>=0;i--){
            revString+=s.charAt(i);
        }
        return revString;
    }
}
