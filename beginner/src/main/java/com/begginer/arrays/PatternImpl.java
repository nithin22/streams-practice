package com.begginer.arrays;

public class PatternImpl {


        int arr[][] = new int[4][5];

        int count = 0;
    public void assignVales(){
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                arr[i][j]=count;
                count++;
            }
        }
    }

    public void printArrayValues(){
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }


}
