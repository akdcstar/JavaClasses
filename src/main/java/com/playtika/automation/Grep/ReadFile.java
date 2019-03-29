package com.playtika.automation.Grep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

    public void read(String filePath, String pattern) {
        try (Scanner scanFile = new Scanner(new File(filePath))) {
            int counter = 0;

            Pattern linePattern = Pattern.compile(pattern);

            while (scanFile.hasNextLine()) {
                String fileText = scanFile.nextLine();
                counter += 1;
                Matcher lineMatcher = linePattern.matcher(fileText.toLowerCase());
                if (lineMatcher.find()) {

                    System.out.println("Line: " + counter + ".  " + fileText);
                }
                System.out.println("There is no any match in file with your pattern");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
