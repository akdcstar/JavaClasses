package com.playtika.automation.CalculatorNew;

public class Multiplication implements MathOperation {
    @Override
    public double calculate(double left, double right) {
        return left * right;
    }
}
