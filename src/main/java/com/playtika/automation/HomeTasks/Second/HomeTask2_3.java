package com.playtika.automation.HomeTasks.Second;

import java.util.Scanner;

public class HomeTask2_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input number of developers: ");
        int numberOfDevelopers = console.nextInt();

    sumOfInterview(numberOfDevelopers);
    }

    public static void sumOfInterview(int numberOfDevelopers) {
        for (int i = 0; numberOfDevelopers < 0; i++) {
            int x = numberOfDevelopers - 1;
            System.out.println(x);
        }

    }
}

