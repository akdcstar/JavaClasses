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
        int sum = 0;
        for (int i = 1; i <= numberOfDevelopers; i++) {

            int interviewCount = i - 1;
            System.out.println(interviewCount);
            sum = sum + interviewCount;
        }
/*      implementation in one line using formula
        int sum = numberOfDevelopers * (numberOfDevelopers - 1) / 2;
*/
        System.out.println(sum);

    }

}

