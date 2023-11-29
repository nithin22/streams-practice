package Streams;

import java.util.Arrays;

public class AnagramDetector {
    public static boolean areAnagrams(String str1, String str2) {
        // Your code here
        char[] chars=str1.toCharArray();
        char[] charset2=str2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charset2);
        String s=chars.toString();
        String d=chars.toString();
        if(s.equals(d)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        boolean result = areAnagrams(word1, word2);

        System.out.println("Are the words anagrams? " + result); // Should print "Are the words anagrams? true"
    }
}
