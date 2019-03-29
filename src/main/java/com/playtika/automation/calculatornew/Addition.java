package com.playtika.automation.calculatornew;

public class Addition implements MathOperation {

    @Override
    public double calculate(double left, double right) {
        return left + right;
    }
}
