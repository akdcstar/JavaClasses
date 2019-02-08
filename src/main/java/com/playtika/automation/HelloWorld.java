package com.playtika.automation;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        System.out.printf("You've entered: %s.%n", s);

        String hello = "Hello World!";
        int a = 110;
        int b = 20;
        //a++;
        int c = a / b;
        System.out.println(hello + c);
        System.out.println(c);
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
