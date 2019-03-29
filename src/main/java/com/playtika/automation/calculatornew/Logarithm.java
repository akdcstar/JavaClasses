package com.playtika.automation.calculatornew;

public class Logarithm implements MathOperation {
    @Override
    public double calculate(double left, double right) {
        return Math.log(right)/Math.log(left);
    }
}
