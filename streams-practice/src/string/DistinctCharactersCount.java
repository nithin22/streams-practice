package string;

import java.util.Arrays;
import java.util.List;

public class DistinctCharactersCount {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "api", "hello");

        // Your code here
        var distinctCharactersCount=words.stream().flatMapToInt(String::chars).distinct().count();

        System.out.println("Count of distinct characters: " + distinctCharactersCount);
    }
}
