package com.playtika.automation.Calculator;

import java.util.Scanner;

public class Calculator {



    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input line: ");
        String line = console.nextLine();
        Parser p = new Parser();
        ParseResult parseResult = p.parse(line);
        BinaryOperationFactory factory = new BinaryOperationFactory();
        BinaryOperation b = factory.create(parseResult.getOperator());
        double final_result = b.calculation(parseResult.getLeft(), parseResult.getRight());
        System.out.println("Result: " + final_result);


    }
}
