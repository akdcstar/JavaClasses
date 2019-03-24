package com.playtika.automation.CalculatorNew;

public class ParserResult {
    private double left;
    private String operator;
    private double right;

    public ParserResult(){
        System.out.println("Wrong expression");
    }

    public ParserResult(double left, String operator, double right) {
        this.left = left;
        this.operator = operator;
        this.right = right;

    }

    public double getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }

    public double getRight() {
        return right;
    }
}
