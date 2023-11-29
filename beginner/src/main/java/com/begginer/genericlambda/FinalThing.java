package com.begginer.genericlambda;

import java.util.function.Function;

public class FinalThing {
    public static void main(String[] args) {
        Function<Integer,Integer> func=(s)->{
            int result=1;
            for(int i=1;i<=s;i++){
                result*=i;
            }
            return result;
        };
        System.out.println(func.apply(3));
    }
}
