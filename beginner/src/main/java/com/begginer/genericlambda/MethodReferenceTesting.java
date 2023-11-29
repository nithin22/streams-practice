package com.begginer.genericlambda;

public class MethodReferenceTesting {


    static String stringOp(StringFunc sf,String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inputString="This is the Input String to be tested";
        String outPutString;
        outPutString=stringOp(MethodReference::functionString,inputString);
        System.out.println(outPutString);
    }
}
