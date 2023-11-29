package com.begginer.genericlambda;

public class TestVariablecapture {

    public static void main(String[] args) {
        int num=10;
        num++;
        int finalNum = num;
        VariableCapture vc=(n -> {
            int v= finalNum +n;
            return v;
//            num++;
        });

        System.out.println(vc.func(10));
    }
}
