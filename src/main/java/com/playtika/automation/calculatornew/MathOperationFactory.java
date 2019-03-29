package com.playtika.automation.calculatornew;

public class MathOperationFactory {

    public MathOperation selectOperation(Operator operator) {
        if (operator == Operator.ADDITION) {
            return new Addition();
        }
        if (operator == Operator.SUBTRACTION) {
            return new Substraction();
        }
        if (operator == Operator.MULTIPLICATION) {
            return new Multiplication();
        }
        if (operator == Operator.DIVISION) {
            return new Division();
        }
        if (operator == Operator.EXPONENTIATION) {
            return new Exponentiation();
        }
        if (operator == Operator.LOGARITHM) {
            return new Logarithm();
        }
        if (operator == Operator.ROOT) {
            return new Root();
        }
        throw new IllegalArgumentException("Incorrect Operation");
    }

}
