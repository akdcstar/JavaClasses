package com.playtika.automation.HomeTasks.Third;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input user LastName, FirstName and Surname separated by spaces: ");
//        String lastName = console.nextLine();
//        System.out.println("Please input user FirstName: ");
//        String firstName = console.nextLine();
//        System.out.println("Please input user Surname: ");
        String name = console.nextLine();

        validateName(name);
        if (validateName(name)){
            System.out.println("Correct");
        } else {
            System.out.println("You've inputted incorrect data, please use only alphabetical characters and spaces");

        }
    }
    public static boolean validateName(String name){
        Pattern namePattern = Pattern.compile("^([a-z]*((\\s)))+[a-z]*((\\s))+[a-z]*$");
        Matcher validation = namePattern.matcher(name);
        validation.matches();
        return validation.matches();

    }
}
