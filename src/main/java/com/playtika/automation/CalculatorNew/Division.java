package com.playtika.automation.CalculatorNew;

public class Division implements MathOperation {
    @Override
    public double calculation(double left, double right) {
        return left / right;
    }
}
