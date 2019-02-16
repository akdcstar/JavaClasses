package com.playtika.automation.Courses;

import java.util.concurrent.ThreadLocalRandom;

public class Temp {
    public static void main(String[] args) {

        calculateMax();
    }

    public static String m1(String s) {

        return s;
    }

    public static long m2(double x, int y, float z) {
        long s = (long) (x + y + z);
        return s;
    }

    public static void m2(String s) {

        System.out.println(s.length());

    }

    public static void m3(int a) {
        if (a > 0) {
            System.out.println(Math.sqrt(a));
        } else if (a < 0) {
            System.out.println(Math.pow(a, 2));
        } else {
            System.out.println("Divided by zero");
        }

    }

    public static void calculate(int x) {
        switch (x) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }

    }

    public static void calculate2(int y) {
        while (y == 5) {
            y++;
            System.out.println(y);
        }
    }

    public static void calculate3(int z) {
        for (int i = 0; i >= 0; i--) {
            System.out.println(z);
        }

    }

    public static void calculate4() {
        int[][] asArrays = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asArrays[i][j] = ThreadLocalRandom.current().nextInt(100);
                System.out.print(" " + asArrays[i][j]);
            }
            System.out.println();
        }

        for (int k = 0; k < 5; k++) {
            int p = 4 - k;
            System.out.println(asArrays[k][p]);

        }
    }

    public static void calculateSum() {
        int[][] asArrays = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asArrays[i][j] = ThreadLocalRandom.current().nextInt(10);
            }
        }
        int sum = 0;
        for (int k = 0; k < 5; k++) {
            for (int p = 0; p < 4; p++) {
                System.out.print(" " + asArrays[k][p]);
                sum = sum + asArrays[k][p];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
    public static void calculateMax() {
        int[][] asArrays = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asArrays[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
        int max = asArrays[0][0];
        for (int k = 0; k < 5; k++) {
            for (int p = 0; p < 4; p++) {
                System.out.print(" " + asArrays[k][p]);
                if (asArrays[k][p] > max){
                    max = asArrays[k][p];
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
