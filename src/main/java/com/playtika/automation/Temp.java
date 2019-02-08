package com.playtika.automation;

public class Temp {
    public static void main(String[] args) {
        m2("sdhjfhjdsf");

        m3(4);

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
}
