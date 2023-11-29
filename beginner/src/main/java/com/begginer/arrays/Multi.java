package com.begginer.arrays;

public class Multi {
    int arr[][]=new int[4][5];
    int count=0;

    public void assignValuestoMatrix(){
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=count++;
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
