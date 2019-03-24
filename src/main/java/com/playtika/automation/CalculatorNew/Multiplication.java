package com.playtika.automation.CalculatorNew;

public class Multiplication implements MathOperation {
    @Override
    public double calculation(double left, double right) {
        return left * right;
    }
}
