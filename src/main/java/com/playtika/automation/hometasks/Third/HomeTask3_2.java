package com.playtika.automation.hometasks.Third;

import java.util.Scanner;

public class HomeTask3_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input sequence of characters with spaces: ");
        String chars = console.nextLine();

        reverseWordsInLine(chars);
    }

    public static void reverseWordsInLine(String chars) {

        String[] splittedChars = chars.split(" ");

        for (int i = 0; i < splittedChars.length; i++) {
            StringBuilder reversedChars = new StringBuilder(splittedChars[i]);
            String result = reversedChars.reverse().toString();
            System.out.print(result);
            if (i < (splittedChars.length) - 1) {
                System.out.print(" ");
            }
        }
    }
}
