package day1;

public class IImmutableStringExample {
    public static void main(String[] args) {
        // Creating a string
        String originalString = "Hello, World!";

        // Concatenating strings creates a new string
        String newString = originalString.concat(" Welcome");

        // Printing the original and new strings
        System.out.println("Original String: " + originalString);
        System.out.println("New String: " + newString);

        // The original string remains unchanged
        System.out.println("Original String after concatenation: " + originalString);
    }
}

