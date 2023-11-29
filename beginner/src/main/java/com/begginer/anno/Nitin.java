package com.begginer.anno;

import jdk.jfr.Period;

import java.lang.reflect.Method;

public class Nitin {

    public static void main(String[] args) {
        Nitin nitin= new Nitin();
        nitin.printTheElements("Nitin",10000);
    }
    @Myanno
    public void printTheElements(String str,int number){
        Nitin nitin= new Nitin();
        try{
            Class<?>c=nitin.getClass();
            Method m=c.getMethod("printTheElements",String.class,int.class);
            Myanno anno=m.getAnnotation(Myanno.class);
            System.out.println(anno.str()+"---"+anno.val());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
