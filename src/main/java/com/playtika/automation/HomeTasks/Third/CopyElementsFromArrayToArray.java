package com.playtika.automation.HomeTasks.Third;

import java.util.concurrent.ThreadLocalRandom;

public class CopyElementsFromArrayToArray {
    public static void main(String[] args) {

        copyElementToNewArray(4,4,4);
    }

    public static void copyElementToNewArray(int firstDimension, int secondDimension, int thirdDimension) {
        int[][][] arrayOne = new int[firstDimension][secondDimension][thirdDimension];
        int[][][] arrayTwo = new int[firstDimension][secondDimension][thirdDimension];

        for (int i = 0; i < firstDimension; i++) {
            for (int j = 0; j < secondDimension; j++) {
                for (int k = 0; k < thirdDimension; k++) {

                    arrayOne[i][j][k] = ThreadLocalRandom.current().nextInt(10);
                    System.out.print(arrayOne[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("******************************");
        System.out.println();
        for (int i = 0; i < firstDimension; i++) {
            for (int j = 0; j < secondDimension; j++) {
                for (int k = 0; k < thirdDimension; k++) {

                    arrayTwo[i][j][k] = arrayOne[i][j][k];
                    System.out.print(arrayTwo[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
