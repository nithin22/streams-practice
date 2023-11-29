package Streams;

import java.util.Arrays;
import java.util.Comparator;

public class MinMaxFinder {
    public static int findSmallest(int[] nums) {
        // Your code here
        int num=Arrays.stream(nums).min().orElse(0);
        return num;
    }

    public static int findLargest(int[] nums) {
        // Your code here
        int ans=Arrays.stream(nums).max().orElse(0);
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {12, 6, 3, 8, 17, 25, 9, 31, 5};

        int smallest = findSmallest(array);
        int largest = findLargest(array);

        System.out.println("Smallest element: " + smallest); // Should print the smallest element
        System.out.println("Largest element: " + largest); // Should print the largest element
    }
}

