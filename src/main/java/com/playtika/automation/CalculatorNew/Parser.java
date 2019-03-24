package com.playtika.automation.CalculatorNew;

public class Parser {

    public ParserResult parse(String line) {
        String[] splittedData = line.split(" ");
        double left = Double.parseDouble(splittedData[0]);
        String operator = splittedData[1];
        double right = Double.parseDouble((splittedData[2]));
        if ((splittedData[0] != null && splittedData[1] != null && splittedData[2] != null)) {
            return new ParserResult(left, operator, right);
        }

        return new ParserResult();


    }
}
