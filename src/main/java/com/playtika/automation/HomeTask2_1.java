package com.playtika.automation;


import java.util.Scanner;

public class HomeTask2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите одно из чисел (3, 6, 9): ");
        int n = console.nextInt();


        for (int w = 0; w < 4; w++) {
            web(n);
        }
        stars(n);
    }

    public static void web(int n) {
        if (n % 3 != 0 || n > 9) {
            System.out.println("Вы ввели недопустимое число");
            return;
        } else if (n == 3) {
            stars(n);
        } else if (n == 6) {
            stars(n);
        } else {
            stars(n);

        }
        for (int ch = 0; ch < (n / 3); ch++) {
            chain(n);
        }

    }


    public static void chain(int n) {
        System.out.print("*");
        for (int z = 0; z < 4; z++) {
            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }

    public static void stars(int n) {
        System.out.println();
        int f = 5 + n * 4;
        for (int s = 0; s < f; s++) {
            System.out.print("*");
        }
        System.out.println();

    }
}

