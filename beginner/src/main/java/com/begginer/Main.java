package com.begginer;

import com.begginer.arrays.*;
import com.begginer.operators.IncrDec;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"] :"+args[i]);
        }
        System.out.println("##################");
        Average average = new Average();
        average.calculateAvg();
        System.out.println("_________-");
        Multi m= new Multi();
        m.assignValuestoMatrix();
        m.printArrayValues();
        System.out.println("_________-");
        PatternImpl pattern= new PatternImpl();
        pattern.assignVales();
        pattern.printArrayValues();
        System.out.println("_________-");
        IncrDec incrDec= new IncrDec();
        incrDec.printInfo();
        System.out.println("_________-");
        PatternNew patternNew= new PatternNew();
        patternNew.petternDraw();

        System.out.println("_________-");
        System.out.println("_________-");
        System.out.println("_________-");
        StackImpl stack= new StackImpl();
        StackImpl stack2= new StackImpl();
        for(int i=0;i<10;i++){
            stack.push(i);
            stack2.push(10+i);

        }

        for(int i=0;i<10;i++){
            System.out.println("Stack-1  --> "+stack.pop());
            System.out.println("Stack2   --> "+stack2.pop());
        }
        System.out.println("_________-");
        System.out.println("_________-");
        System.out.println("_________-");
    }
}