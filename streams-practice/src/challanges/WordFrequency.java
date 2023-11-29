package challanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void main(String[] args) {
        String s="This is a sample text This text is a sample";
        String[] al=s.split(" ");


        var ans=Arrays.stream(al).map(word->word.toLowerCase()).collect(Collectors.groupingBy(word->word,Collectors.counting()));

        Map<String, Long> frequencyMap = Arrays.stream(al)
                .map(word -> word.toLowerCase())  // Convert to lowercase for case-insensitive counting
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(ans);
        System.out.println(frequencyMap);



    }
}
