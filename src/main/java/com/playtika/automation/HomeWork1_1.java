package com.playtika.automation;

public class HomeWork1_1 {
    public static void main(String[] args) {
        calculationInLong();
        calculationInInt();
        calculationInFloat();
        calculationInDouble();
    }

    public static void calculationInLong() {
        long x = 1;
        long y = 2;
        long z = 3;
        long n = 4;

        long task1 = (x - (y + 123) / z * n);
        System.out.println("Result of calculation in long: " + task1);
    }

    public static void calculationInInt() {
        int x = 1;
        int y = 2;
        int z = 3;
        int n = 4;

        int task2 = (x + (50 - y * z) / n) - x;
        System.out.println("Result of calculation in int: " + task2);
    }

    public static void calculationInFloat() {
        float x = 1;
        float y = 2;
        float z = 3;
        float n = 4;

        float task3 = (x / (y * (z - 1) - 564) + n);
        System.out.println("Result of calculation in float: " + task3);
    }

    public static void calculationInDouble() {
        double x = 1;
        double y = 2;
        double z = 3;
        double n = 4;

        double task4 = -x / -y + z / (n + 15);
        System.out.println("Result of calculation in double: " + task4);
    }
}

