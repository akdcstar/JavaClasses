package com.playtika.automation.CalculatorNew;

public class WrongOperator implements MathOperation{

    @Override
    public double calculation(double left, double right) {
        String s = "Wrong operation";
        return Double.parseDouble(s);
    }
}
