package com.playtika.automation.HomeTasks.Second;

import java.util.Scanner;

public class HomeTask2_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input number to receive sum of its digits and press Enter key: ");
        long number = console.nextLong();

        sumDigits(number);
    }

    public static void sumDigits(long number) {
        long sum = 0;
        while (number != 0) {
            sum = (number % 10) + sum;
            number = number / 10;
        }
        System.out.println(Math.abs(sum));

    }
}
