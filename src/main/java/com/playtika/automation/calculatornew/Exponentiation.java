package com.playtika.automation.calculatornew;

public class Exponentiation implements MathOperation {
    @Override
    public double calculate(double base, double power) {
        return Math.pow(base, power);
    }
}
