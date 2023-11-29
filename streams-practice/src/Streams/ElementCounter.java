package Streams;


/*Write a Java program to count the number of occurrences of each element in an array of integers
        and store the results in a
        map where the keys are the elements, and the values are their respective counts.*/
import java.util.*;
import java.util.stream.Collectors;

public class ElementCounter {
    public static Map<Integer, Integer> countOccurrences(int[] arr) {
        // Your code here
        var ans=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,Collectors.summingInt(e->1)));
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 3, 6, 7, 6, 8, 9, 9};

        Map<Integer, Integer> occurrenceMap = countOccurrences(array);

        occurrenceMap.forEach((element, count) -> System.out.println(element + " occurs " + count + " times."));
    }
}

