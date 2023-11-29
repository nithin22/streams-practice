package string;
import java.util.Arrays;
import java.util.List;

public class LongestNames {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        // Your code here

        var longestNames=names.stream().max((a,b)->Integer.compare(a.length(),b.length())).orElse(null);

        System.out.println("Longest name(s): " + longestNames);
    }
}
