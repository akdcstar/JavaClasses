package com.playtika.automation.CalculatorNew;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input math expression: ");
        String line = console.nextLine();

        Parser parsedText = new Parser();
        ParserResult parserResult = parsedText.parse(line);

        MathOperationFactory factory = new MathOperationFactory();

        MathOperation operation = factory.selectOperation(parserResult.getOperator());
        double result = operation.calculate(parserResult.getLeft(), parserResult.getRight());

        System.out.println(result);



    }
}
