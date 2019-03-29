package com.playtika.automation.calculatornew;

public class Division implements MathOperation {
    @Override
    public double calculate(double left, double right) {
        if (right != 0) {
            return left / right;
        }
        throw new ArithmeticException("Divisiopn by zero");
    }
}
