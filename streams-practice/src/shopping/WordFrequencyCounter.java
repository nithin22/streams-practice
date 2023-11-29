package shopping;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(List<String> words) {
        // Your code here
        return words.stream().map(String::toLowerCase).collect(Collectors.toMap(
                s->s,s->1,Integer::sum
        ));
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList(
                "apple", "banana", "orange", "apple", "grape",
                "banana", "banana", "orange", "apple", "kiwi"
        );

        Map<String, Integer> wordFrequency = countWordFrequency(wordList);

        System.out.println("Word Frequency:");
        wordFrequency.forEach((word, frequency) -> System.out.println(word + ": " + frequency));
    }
}
