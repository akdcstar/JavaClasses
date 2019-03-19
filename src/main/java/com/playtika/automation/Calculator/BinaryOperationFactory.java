package com.playtika.automation.Calculator;

public class BinaryOperationFactory {

    public BinaryOperation create(String operator){
        if ("+".equals(operator)) {
            return new Addition();
        } else if ("-".equals(operator)) {
            return new Substraction();
        } else if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)){
            return new Exponentiation();
        } return null;
    }
}
