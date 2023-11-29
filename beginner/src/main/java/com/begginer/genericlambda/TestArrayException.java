package com.begginer.genericlambda;

public class TestArrayException {

    public static void main(String[] args) throws EmptyArrayException {
        double values[]={1.0,2.0,3.0,4.0,5.0};
        double values2[]= new double[10];

        ArrayInterFace avg=(n)->{
            double result = 0;
            if(n.length==0){
                throw new EmptyArrayException();
            }
            for(int i=0;i<n.length;i++){
                result+=n[i];
            }
            double finalResult=result/n.length;
            return finalResult;
        };

        System.out.println("The avg of the array is"+avg.func(new double[0]));
    }
}
