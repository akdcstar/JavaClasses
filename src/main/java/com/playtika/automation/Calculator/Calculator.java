package com.playtika.automation.Calculator;

public class Calculator {

    public double calculate(double value1, double value2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }
        return operation.calculation(value1, value2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("+".equals(operator)) {
            return new Addition();
        } else if ("-".equals(operator)) {
            return new Substraction();
        } else if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)){
            return new Exponentiation();
        } return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(123.123, 123.123, "+"));
        System.out.println(calculator.calculate(123.123, 123.123, "-"));
        System.out.println(calculator.calculate(123.123, 123.123, "*"));
        System.out.println(calculator.calculate(123.123, 123.123, "/"));
        System.out.println(calculator.calculate(123.123, 123.123, "^"));

    }
}
