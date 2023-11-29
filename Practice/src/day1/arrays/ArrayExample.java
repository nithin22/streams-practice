package day1.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args){
        int[] arr = new int[5];
        insertFiveToTen(arr);
        printingArraytoConsole(arr);

    }
    private static void printingArraytoConsole(int[] arr) {
        for (int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void insertFiveToTen(int[] arr) {
        for(int i=1;i<arr.length;i++){
            arr[i] = 5+i;
            break;
        }

    }
}
