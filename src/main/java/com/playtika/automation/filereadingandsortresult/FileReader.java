package com.playtika.automation.filereadingandsortresult;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {

    public void read(String filePath) {
        System.out.println(filePath);
        TreeMap textFromFile = new TreeMap();

        try (Scanner scanFile = new Scanner(new File(filePath))) {
            while (scanFile.hasNext())

                if(textFromFile.containsKey(scanFile.next())){
                    textFromFile.put(scanFile.next(), n + 1);
                }
                textFromFile.put(scanFile.next(), );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; 1 < textFromFile.size(); i++) {
            System.out.println(textFromFile.get(i));
        }
    }
}
