package com.playtika.automation.Calculator;

public class ParseResult {
    private double left;
    private double right;
    private String operator;

    public ParseResult(double left, double right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }


    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
}
