package com.begginer.arrays;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Average {

    double nums[]={10.1,11.2,12.3,13.4,14.5};
    double result;
    double sum=0;

    public void calculateAvg(){
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        result=sum/nums.length;
        System.out.println(result);
        System.out.println("----------");
         var rsul=Arrays.stream(nums).average();
        System.out.println(rsul.toString());
    }
}
