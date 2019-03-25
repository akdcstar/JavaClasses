package com.playtika.automation.CalculatorNew;

public class Parser {

    public ParserResult parse(String line) {
        String[] splittedData = line.split(" ");

        if (splittedData.length == 3) {

            double left = Double.parseDouble(splittedData[0]);
            String operator = splittedData[1];
            double right = Double.parseDouble((splittedData[2]));

//            return new ParserResult(left, operator, right);
            if (operator == "+") {
                return Operator.ADDITION;
            } else if (operator == "-") {
                return Operator.SUBTRACTION;
            } else if (operator == "*") {
                return Operator.MULTIPLICATION;
            } else if (operator == "/") {
                return Operator.DIVISION;
            } else if (operator == "^") {
                return Operator.EXPONENTIATION;
            } else if (operator == "log") {
                return Operator.LOGARITHM;
            } else if (operator == "sqrt") {
                return Operator.SQUARE_ROOT;
            } throw new IllegalArgumentException("Incorrect operator");


        }

        throw new IllegalArgumentException("Incorrect expression");


    }
}
