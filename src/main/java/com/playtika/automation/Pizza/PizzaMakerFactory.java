package com.playtika.automation.Pizza;

public interface PizzaMakerFactory {
    AbstractPizzaMaker getPizzaMaker(Button button);
}
