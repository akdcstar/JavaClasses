package com.playtika.automation.HomeTasks.Second;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask2_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input number of developers: ");
        int numberOfDevelopers = console.nextInt();

    sumOfInterview(numberOfDevelopers);
    }

    public static void sumOfInterview(int numberOfDevelopers) {
//        int[] interviewArray = new int [numberOfDevelopers];
//        for (int i = numberOfDevelopers; i >= 1; i--){
//            int interviewCount = i-1;
//            System.out.println(interviewCount);
//            interviewArray[i-1] = interviewCount;
//            System.out.println(Arrays.;
        int sum = numberOfDevelopers * (numberOfDevelopers - 1) / 2;
        System.out.println(sum);

        }

}

