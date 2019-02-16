package com.playtika.automation.HomeTasks.Third;

import java.util.Scanner;

public class HomeTask3_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input sequence of characters without spaces: ");
        String chars = console.nextLine();

        validatePalindrome(chars);
    }

    public static void validatePalindrome(String chars) {
        chars = chars.toLowerCase();
        chars = chars.trim();

        StringBuilder reversedChars = new StringBuilder(chars);
        reversedChars.reverse();
        String reversedCharsToString = reversedChars.toString();

        if (chars.equals(reversedCharsToString)) {
            System.out.println("Inputted word is palindrome");
        } else
            System.out.println("Inputted word is not palindrome");
    }
}

