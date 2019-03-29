package com.playtika.automation.calculatornew;

public class Root implements MathOperation {
    @Override
    public double calculate(double degree, double radicant) {
        if (degree != 0 && radicant >= 0) {
            return Math.pow(degree, 1.0 / radicant);
        } throw new ArithmeticException("Degree of expression is equal to zero or radicant is negative");
    }
}
