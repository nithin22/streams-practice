package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordGrouper {
    public static Map<Character, Long> groupAndCountWords(List<String> words) {
        // Your code here
        return words.stream().collect(Collectors.groupingBy(word->word.toLowerCase().charAt(0),Collectors.counting()));
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "lemon", "orange","APLE");

        Map<Character, Long> result = groupAndCountWords(wordList);

        result.forEach((letter, count) -> System.out.println(letter + ": " + count));
    }
}
