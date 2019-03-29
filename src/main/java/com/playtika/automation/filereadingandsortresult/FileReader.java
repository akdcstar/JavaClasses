package com.playtika.automation.filereadingandsortresult;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {

    public void read(String filePath) {
        System.out.println(filePath);
        TreeMap<String, Integer> textFromFile = new TreeMap();
//        Integer i = textFromFile.get(scanFile.next());

        try (Scanner scanFile = new Scanner(new File(filePath))) {
            Integer i = textFromFile.get(scanFile.next());
            while (scanFile.hasNext())

                if (i == null) {
                    textFromFile.put(scanFile.next(), 1);
                } else textFromFile.put(scanFile.next(), i + 1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; 1 < textFromFile.size(); i++) {
            System.out.println(textFromFile??????);
        }
    }
}
