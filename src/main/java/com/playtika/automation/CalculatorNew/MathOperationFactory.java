package com.playtika.automation.CalculatorNew;

import static com.playtika.automation.CalculatorNew.Operator.ADDITION;
import static com.playtika.automation.CalculatorNew.Operator.DIVISION;
import static com.playtika.automation.CalculatorNew.Operator.EXPONENTIATION;
import static com.playtika.automation.CalculatorNew.Operator.LOGARITHM;
import static com.playtika.automation.CalculatorNew.Operator.MULTIPLICATION;
import static com.playtika.automation.CalculatorNew.Operator.ROOT;
import static com.playtika.automation.CalculatorNew.Operator.SUBTRACTION;

public class MathOperationFactory {

    public MathOperation selectOperation(Operator operator) {
        if (operator == ADDITION) {
            return new Addition();
        }
        if (operator == SUBTRACTION) {
            return new Substraction();
        }
        if (operator == MULTIPLICATION) {
            return new Multiplication();
        }
        if (operator == DIVISION) {
            return new Division();
        }
        if (operator == EXPONENTIATION) {
            return new Exponentiation();
        }
        if (operator == LOGARITHM) {
            return new Logarithm();
        }
        if (operator == ROOT) {
            return new Root();
        }
        throw new IllegalArgumentException("Incorrect Operation");
    }

}
