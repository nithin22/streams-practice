package string;

import java.util.Arrays;
import java.util.List;

//Question:
//        You are given a list of strings representing sentences.
//        Write a Java program to find the average number of words in sentences that contain the word "Java".

public class AverageWordsInJavaSentences {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is a programming language.",
                "Python is also a programming language.",
                "Java is widely used in web development.",
                "Streams API makes Java programming more efficient."
        );
        double averageWords = sentences.stream()
                .filter(sentence -> sentence.contains("Java"))
                .mapToInt(sentence -> sentence.split("\\s+").length)
                .average()
                .orElse(0.0);

        // Your code here

        System.out.println("Average number of words in sentences containing 'Java': " + averageWords);
    }
}
