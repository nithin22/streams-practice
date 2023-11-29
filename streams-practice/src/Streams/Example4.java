package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
        public static List<String> findLongestWords(List<String> words) {
            // Your code here
            var res=words.stream().mapToInt(String::length).max().orElse(0);
            return words.stream().filter(s->s.length()==res).collect(Collectors.toList());

        }

        public static void main(String[] args) {
            List<String> wordList = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "lemon", "orange");

            List<String> longestWords = findLongestWords(wordList);

            System.out.println("Longest word(s): " + longestWords);
        }
    }

