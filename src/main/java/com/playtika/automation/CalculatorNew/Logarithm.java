package com.playtika.automation.CalculatorNew;

public class Logarithm implements MathOperation {
    @Override
    public double calculation(double left, double right) {
        return Math.log(right)/Math.log(left);
    }
}
