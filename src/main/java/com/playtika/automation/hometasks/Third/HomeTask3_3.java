package com.playtika.automation.hometasks.Third;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeTask3_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input size of array: ");
        int arraySize = console.nextInt();

        printArray(arraySize);
    }

    public static void printArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10000);
            System.out.println(array[i]);
        }
        System.out.println();
        for (int j = 0; j < arraySize; j++) {
            if (array[j] % 3 == 0) {
                System.out.println(array[j]);
            }
        }
    }
}
