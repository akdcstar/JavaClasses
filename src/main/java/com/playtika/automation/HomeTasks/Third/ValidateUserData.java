package com.playtika.automation.HomeTasks.Third;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input user LastName, FirstName and Surname separated by spaces: ");
        String name = console.nextLine();
        System.out.println("Please input user Phone number in format +380XXXXXXXXX : ");
        String phone = console.nextLine();
        System.out.println("Please input user email : ");
        String email = console.nextLine();

        validateName(name);
        validatePhone(phone);
        validateEmail(email);

    }

    public static void validateName(String name) {
        Pattern namePattern = Pattern.compile("^(([A-z][a-z]{0,20})([-][A-Z][a-z]{0,20})?)\\s+(([A-z][a-z]{0,20})([-][A-z][a-z]{0,20})?)\\s+(([A-z][a-z]{0," +
                                                      "20})" +
                                                      "([-][A-z][a-z]{0,20})?)$");

        Matcher validationName = namePattern.matcher(name);
        if (validationName.matches()) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    public static void validatePhone(String phone) {
        Pattern namePattern = Pattern.compile("^\\+(380)(50|66|67|68|96|97|98|99)\\d{7}");
        Matcher validationPhone = namePattern.matcher(phone);
        if (validationPhone.matches()) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    public static void validateEmail(String phone) {
        Pattern namePattern = Pattern.compile("^[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,6}$");
        Matcher validationEmail = namePattern.matcher(phone);
        if (validationEmail.matches()) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
