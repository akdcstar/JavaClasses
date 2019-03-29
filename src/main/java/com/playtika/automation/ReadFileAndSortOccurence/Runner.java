package com.playtika.automation.ReadFileAndSortOccurence;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input file path (e.g. 'C:\\Users\\akhusainov\\_DC\\_Docs\\JavaTestFile.txt'): ");
        String filePath = console.nextLine();

        ReadFile file = new ReadFile();
        file.read(filePath);

    }

}
