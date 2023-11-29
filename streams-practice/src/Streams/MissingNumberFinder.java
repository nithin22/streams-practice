package Streams;

import java.util.Arrays;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums, int N) {
        int expectedSum=N * (N + 1) / 2;
        // Your code here
        int result=Arrays.stream(nums).sum();
        return expectedSum-result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int N = 10;

        int missingNumber = findMissingNumber(array, N);

        System.out.println("The missing number is: " + missingNumber); // Should print "The missing number is: 4"
    }
}
