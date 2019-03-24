package com.playtika.automation.CalculatorNew;

public class Exponentiation implements MathOperation {
    @Override
    public double calculation(double left, double right) {
        return Math.pow(left, right);
    }
}
