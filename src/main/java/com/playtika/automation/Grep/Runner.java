package com.playtika.automation.Grep;

public class Runner {
    public static void main(String[] args) {
       String filePath = "C:\\Users\\akhusainov\\_DC\\_Docs\\JavaTestFile.txt";
       String comparedLine = "slot";

       ReadFile fileFromConsole = new ReadFile();
       fileFromConsole.read(filePath, comparedLine.toLowerCase());
    }
}
