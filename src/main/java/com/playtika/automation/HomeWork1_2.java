package com.playtika.automation;

import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Please input 5-digit number and press Enter key: ");
        int n = console.nextInt();

        calculate(n);

    }

    public static void calculate(int n) {
        int a = n / 10000;
        int b = (n - a * 10000) / 1000;
        int c = (n - a * 10000 - b * 1000) / 100;
        int d = (n - a * 10000 - b * 1000 - c * 100) / 10;
        int e = (n - a * 10000 - b * 1000 - c * 100 - d * 10);

        System.out.println(n + " - is inputted number");
        System.out.println(a + " - is the first digit");
        System.out.println(b + " - is the second digit");
        System.out.println(c + " - is the third digit");
        System.out.println(d + " - is the fourth digit");
        System.out.println(e + " - is the fifth digit");
    }

}
