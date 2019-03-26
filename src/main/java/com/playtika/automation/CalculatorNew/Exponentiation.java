package com.playtika.automation.CalculatorNew;

public class Exponentiation implements MathOperation {
    @Override
    public double calculation(double base, double power) {
        return Math.pow(base, power);
    }
}
