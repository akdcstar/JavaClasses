package com.playtika.automation;

public class HomeTask1_3 {
    public static void main(String[] args) {
        double x = 5;
        double y = 0;
        double z = 0;
        double vectorLength = Math.sqrt(x * x + y * y + z * z);
        double x1 = x / vectorLength;
        double y1 = y / vectorLength;
        double z1 = z / vectorLength;

        System.out.println("(" + x1 + ", " + y1 + ", " + z1 + ")");
    }
}
