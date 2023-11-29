package string;

import java.util.Arrays;
import java.util.List;

public class AverageLength {



    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Grape", "pear", "Mango");

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        // Your code here

        double averageLength = words.stream()
                .filter(word -> vowels.contains(Character.toLowerCase(word.charAt(0))))
                .mapToInt(String::length)
                .average()
                .orElse(0.0);


        System.out.println("Average length of words starting with a vowel: " + averageLength);
    }
}

