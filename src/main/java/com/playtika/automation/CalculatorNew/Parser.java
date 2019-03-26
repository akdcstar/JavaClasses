package com.playtika.automation.CalculatorNew;

public class Parser {


    public ParserResult parse(String line) {
        String[] splittedData = line.split(" ");

        if (splittedData.length == 3) {

            double left = Double.parseDouble(splittedData[0]);
            String operator = splittedData[1];
            double right = Double.parseDouble((splittedData[2]));
            Operator op = selectOperator(operator);
            return new ParserResult(left, op, right);
        }
        throw new IllegalArgumentException("Incorrect expression");
    }

    private Operator selectOperator(String operator) {

        if (operator.equals("+")) {
            return Operator.ADDITION;
        }
        if (operator.equals("-")) {
            return Operator.SUBTRACTION;
        }
        if (operator.equals("*")) {
            return Operator.MULTIPLICATION;
        }
        if (operator.equals("/")) {
            return Operator.DIVISION;
        }
        if (operator.equals("^")) {
            return Operator.EXPONENTIATION;
        }
        if (operator.equals("log")) {
            return Operator.LOGARITHM;
        }
        if (operator.equals("sqrt")) {
            return Operator.ROOT;
        }
        throw new IllegalArgumentException("Incorrect operator");
    }
}

