package com.playtika.automation.courses;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class PasswordGenerator {

    public static final String SPEC_ALPHABET = "!@#$%^&*()";
    public static final String DIGITS_ALPHABET = "0123456789";
    public static final String CHAR_ALPHABET = "QWERTYUIOPasdfghjklZXCVBNM";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input lengthToPoint of the password: ");
        int passwordLength = console.nextInt();

        for (int i = 0; i < 10; i++){
        System.out.println(generatPassword(passwordLength));}

    }


    public static char getRandomChar(String alphabet) {
        int index = ThreadLocalRandom.current().nextInt(alphabet.length());
        return alphabet.charAt(index);

    }

    public static String generatPassword(int passwordLength) {
        StringBuilder password = new StringBuilder(passwordLength);

        boolean specCharFlag = false;
        int digitCharFlag = 0;


        while (password.length() < passwordLength) {
            int path = ThreadLocalRandom.current().nextInt(3);
            char currentLetter = 0;
            switch (path) {
                case 0:
                    if (!specCharFlag) {
                        currentLetter = getRandomChar(SPEC_ALPHABET);
                        specCharFlag = true;
                    } else {
                        continue;
                    }
                    break;
                case 1:
                    if (digitCharFlag < 3) {
                        currentLetter = getRandomChar(DIGITS_ALPHABET);
                        digitCharFlag++;
                    break;} else {
                        continue;
                    }
                case 2:
                    currentLetter = getRandomChar(CHAR_ALPHABET);

            }
            if (password.length() == 0 || (password.charAt(password.length() - 1)) != currentLetter){
                password.append(currentLetter);
            }

        }

        return password.toString();
    }
}
