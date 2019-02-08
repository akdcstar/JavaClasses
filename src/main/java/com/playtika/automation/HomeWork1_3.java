package com.playtika.automation;

public class HomeWork1_3 {
    public static void main(String[] args) {
        double x = 5;
        double y = 0;
        double z = 0;
        double vectorLength = Math.sqrt(x * x + y * y + z * z);
        double x1 = x / vectorLength;
        double y1 = y / vectorLength;
        double z1 = z / vectorLength;

        System.out.println("(" + x1 + ", " + y1 + ", " + z1 + ")");
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
        } else if (a < 0)
        {
            System.out.println(Math.pow(a, 2));
        } else{
            System.out.println("Divided by zero");
        }

    }
}
