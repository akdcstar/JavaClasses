package com.playtika.automation.Grep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void read(String filePath, String line) {
        try {
            File file = new File(filePath);
            Scanner scanFile = new Scanner(file);
            int counter = 0;
            while (scanFile.hasNextLine()) {
                String fileText = scanFile.nextLine();
                counter += 1;
                if (fileText.toLowerCase().contains(line)) {

                    System.out.println("Line: " + counter + ".  " + fileText);
                }
            }
            scanFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
