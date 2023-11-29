package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Question:
        You are given a list of strings. Write a Java program to count the number of strings
        that have a length of exactly three characters and contain the letter 'a'.*/



public class StringCount {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "bat", "rat", "mat", "cab", "hat","Nan");

        // Your code here
        var ans=words.stream().filter(s->s.length()==3).filter(s->s.contains("a")).count();

        System.out.println("Number of strings with length 3 and containing 'a': " + ans);
    }
}

