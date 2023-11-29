package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementFinder {
    public static List<Integer> findDuplicates(int[] arr) {

        Set<Integer>set= new HashSet<>();
        // Your code here
        var li=Arrays.stream(arr).filter(s->!set.add(s)).boxed().collect(Collectors.toList());
        return li;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 5, 6, 7, 8, 9, 9};

        List<Integer> duplicates = findDuplicates(array);

        System.out.println("Duplicate elements: " + duplicates);
    }
}

