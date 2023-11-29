package string;

import java.util.Arrays;
import java.util.List;

/*Question:
        You are given a list of strings. Write a Java program to find and print the count of words
        that have the letter 'a' occurring exactly twice. java*/


public class WordsWithDoubleA {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "grape", "papaya", "avocado", "kangaroo");

        var count=words.stream().filter(s->s.chars().filter(ch->ch=='a').count()==2).count();
        // Your code here

        System.out.println("Count of words with 'a' occurring exactly twice: " + count);
    }
}

