package com.playtika.automation.filereadingandsortresult;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {

    public void read(String filePath) {
        System.out.println(filePath);
        TreeMap<String, Integer> textFromFile = new TreeMap();

        try (Scanner scanFile = new Scanner(new File(filePath))) {

            while (scanFile.hasNext()) {
                String word = scanFile.next().toLowerCase();
                Integer counter = textFromFile.getOrDefault(word, 0);
                textFromFile.put(word, counter + 1);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Integer> entry : textFromFile.entrySet()) {
            System.out.println(entry.getKey() + "\t - \t" + entry.getValue());
        }
    }
}
