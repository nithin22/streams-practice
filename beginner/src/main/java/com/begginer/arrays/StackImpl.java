package com.begginer.arrays;

public class StackImpl {
    private int arr[]= new int[10];
    int index;
    public StackImpl(){
        index=-1;
    }

    public void push(int i){
        if(index>9){
            System.out.println("Stack is Full");
        }
        else{
            arr[++index]=i;
        }
    }

    public int pop(){
        if(index<0){
            System.out.println("Stack is UnderFlow");
            return 0;
        }
        else{
            return arr[index--];
        }
    }

}
