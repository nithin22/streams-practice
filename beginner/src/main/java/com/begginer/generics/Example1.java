package com.begginer.generics;

public class Example1<T>{
    T obj;

    public Example1(T obj) {
        this.obj = obj;
    }
    T getObj(){
        return obj;
    }
    public void showType(){
        System.out.println("T Type is "+obj.getClass().getName());
    }
}
