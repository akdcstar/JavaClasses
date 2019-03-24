package com.playtika.automation.CalculatorNew;

public class SquareRoot implements MathOperation {
    @Override
    public double calculation(double left, double right) {
        return Math.pow(right, 1.0 / left);
    }
}
