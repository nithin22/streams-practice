package Streams;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Your code here
        str=str.toLowerCase();

//        Another method

//        String reversed=new StringBuilder(str).reverse().toString();
        for(int i=0;i<str.length()/2;i++){
            for(int j=str.length()-1;j>=str.length()/2;j--){
                if(str.charAt(i)==str.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String word1 = "racecar";
        String word2 = "hello";
        String word3 = "A man a plan a canal Panama";

        boolean result1 = isPalindrome(word1);
        boolean result2 = isPalindrome(word2);
        boolean result3 = isPalindrome(word3);


        System.out.println("Is word1 a palindrome? " + result1); // Should print "Is word1 a palindrome? true"
        System.out.println("Is word2 a palindrome? " + result2); // Should print "Is word2 a palindrome? false"
        System.out.println("Is word3 a palindrome? " + result3); // Should print "Is word3 a palindrome? true"
    }
}

