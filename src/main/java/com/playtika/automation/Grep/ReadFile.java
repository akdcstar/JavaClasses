package com.playtika.automation.Grep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ReadFile {

    void read(String filePath, String pattern) {
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
            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
