package com.playtika.automation.Calculator;


public class Parser {

    public ParseResult parse(String line) {

        String[] elements = line.split(" ");
        double left = Double.parseDouble(elements[0]);
        double right = Double.parseDouble(elements[2]);
        String operator = elements[1];
        return new ParseResult(left, right, operator);
    }
}
