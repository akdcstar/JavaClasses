package com.playtika.automation.CalculatorNew;

public class MathOperationFactory {

    public MathOperation selectOperation(String operator) {
        if (operator.equals("+")) {
            return new Addition();
        } else if (operator.equals("-")) {
            return new Substraction();
        } else if (operator.equals("*")) {
            return new Multiplication();
        } else if (operator.equals("/")) {
            return new Division();
        } else if (operator.equals("^")) {
            return new Exponentiation();
        } else if (operator.equals("log")) {
            return new Logarithm();
        }else if (operator.equals("sqrt")){
            return new SquareRoot();
        }
        return new WrongOperator();
    }

}
