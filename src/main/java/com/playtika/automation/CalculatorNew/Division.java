package com.playtika.automation.CalculatorNew;

public class Division implements MathOperation {
    @Override
    public double calculation(double left, double right) {
        if (right != 0) {
            return left / right;
        }
        throw new ArithmeticException("Divisiopn by zero");
    }
}
