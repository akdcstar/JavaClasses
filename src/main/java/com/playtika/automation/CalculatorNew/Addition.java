package com.playtika.automation.CalculatorNew;

public class Addition implements MathOperation {

    @Override
    public double calculate(double left, double right) {
        return left + right;
    }
}
