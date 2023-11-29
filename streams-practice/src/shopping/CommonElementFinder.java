package shopping;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElementFinder {
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        // Your code here
        return list1.stream().filter(list2::contains).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        List<Integer> commonElements = findCommonElements(list1, list2);

        System.out.println("Common Elements:");
        commonElements.forEach(element -> System.out.println(element));
    }
}

