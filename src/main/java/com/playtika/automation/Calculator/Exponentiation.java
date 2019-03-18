package com.playtika.automation.Calculator;

public class Exponentiation implements BinaryOperation {

    @Override
    public double calculation(double left, double right) {
        return Math.pow(left, right);
    }
}
