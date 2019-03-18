package com.playtika.automation.Calculator;

public class Multiplication implements BinaryOperation {

    @Override
    public double calculation(double left, double right) {
        return left * right;
    }
}
