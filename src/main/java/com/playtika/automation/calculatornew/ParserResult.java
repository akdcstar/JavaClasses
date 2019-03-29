package com.playtika.automation.calculatornew;

public class ParserResult {
    private double left;
    private Operator operator;
    private double right;

    public ParserResult(double left, Operator operator, double right) {
        this.left = left;
        this.operator = operator;
        this.right = right;

    }

    public double getLeft() {
        return left;
    }

    public Operator getOperator() {
        return operator;
    }

    public double getRight() {
        return right;
    }
}
