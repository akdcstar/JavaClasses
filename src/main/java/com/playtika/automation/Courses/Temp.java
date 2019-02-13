package com.playtika.automation.Courses;

public class Temp {
    public static void main(String[] args) {

        calculate2(5);
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
    public static void calculate2(int y){
        while (y == 5){
            y++;
            System.out.println(y);
        }
    }

    public static void calculate3(int z) {
        for (int i = 0; i >= 0; i--){
            System.out.println(z);
        }

    }
}
