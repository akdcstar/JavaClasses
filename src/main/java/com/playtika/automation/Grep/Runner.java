package com.playtika.automation.Grep;

import java.util.Scanner;

class Runner {
    public static void main(String[] args) {

        Scanner consoleFilePath = new Scanner(System.in);
        System.out.println("Please input file path (e.g. 'C:\\Users\\akhusainov\\_DC\\_Docs\\JavaTestFile.txt'): ");
        String filePath = consoleFilePath.nextLine();

        Scanner consolePattern = new Scanner(System.in);
        System.out.println("Please input pattern which you would like to check (e.g. ([a-z]{10,10}) or 'slot'): ");
        String pattern = consolePattern.nextLine();

        ReadFile fileFromConsole = new ReadFile();
        fileFromConsole.read(filePath, pattern.toLowerCase());
    }
}
