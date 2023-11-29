package com.begginer.genericlambda;

public class LambdaAsArgumentDemo {
    static String stringOp(StringFunc sf,String s){
        return sf.func(s);
    }
}
