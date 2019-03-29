package com.playtika.automation.hometasks.Third;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        validateName(console);
        validatePhone(console);
        validateEmail(console);

    }

    public static void validateName(Scanner console) {
        System.out.println("Please input user LastName, FirstName and Surname separated by spaces: ");
        String name = console.nextLine();

        Pattern namePattern = Pattern.compile("^(([A-z][a-z]{0,20})([-][A-Z][a-z]{0,20})?)\\s+(([A-z][a-z]{0,20})([-][A-z][a-z]{0,20})?)\\s+(([A-z][a-z]{0," +
                                                      "20})" +
                                                      "([-][A-z][a-z]{0,20})?)$");
        Matcher validationName = namePattern.matcher(name);

        if (validationName.matches()) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name, please try again");
            validateName(console);
        }
    }

    public static void validatePhone(Scanner console) {
        System.out.println("Please input user Phone number in format +380XXXXXXXXX : ");
        String phone = console.nextLine();

        Pattern namePattern = Pattern.compile("^\\+(380)(50|66|67|68|96|97|98|99)\\d{7}");
        Matcher validationPhone = namePattern.matcher(phone);

        if (validationPhone.matches()) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number, please try again");
            validatePhone(console);
        }
    }

    public static void validateEmail(Scanner console) {
        System.out.println("Please input user email : ");
        String email = console.nextLine();

        Pattern namePattern = Pattern.compile("^[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,6}$");
        Matcher validationEmail = namePattern.matcher(email);

        if (validationEmail.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email, please try again");
            validateEmail(console);
        }
    }
}
