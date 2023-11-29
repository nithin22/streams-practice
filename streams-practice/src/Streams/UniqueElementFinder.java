package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElementFinder {
    public static List<Integer> findUniqueElements(List<List<Integer>> lists) {

        Set<Integer> uniqueElements = new HashSet<>();

        for (List<Integer> list : lists) {
            uniqueElements.addAll(list); // Add all elements to the set
        }

        return uniqueElements.stream().filter(e -> Collections.frequency(uniqueElements, e) == 1)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(3, 4, 5, 6, 7),
                Arrays.asList(5, 6, 7, 8, 9)
        );

        List<Integer> uniqueElements = findUniqueElements(lists);

        System.out.println("Unique elements: " + uniqueElements); // Should print "Unique elements: [1, 2, 8, 9]"
    }
}

