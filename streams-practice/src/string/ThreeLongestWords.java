package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeLongestWords {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Grape", "Pear", "Mango");

        // Your code here
//         var threeLongestWords=words.stream().sorted((a,b)->Integer.compare(b.length(),a.length())).limit(3).sorted().collect(Collectors.toList());
        var threeLongestWords = words.stream()
                .sorted((a, b) -> Integer.compare(b.length(), a.length())) // Sort by length in descending order
                .limit(3) // Take the first three elements
                .sorted() // Sort alphabetically
                .collect(Collectors.toList());

        System.out.println("Three longest words (sorted): " + threeLongestWords);
    }
}

