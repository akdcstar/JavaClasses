package com.playtika.automation.calculatornew;

public class Multiplication implements MathOperation {
    @Override
    public double calculate(double left, double right) {
        return left * right;
    }
}
