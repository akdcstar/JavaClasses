package com.playtika.automation.pizza;

public interface PizzaMakerFactory {
    AbstractPizzaMaker getPizzaMaker(Button button);
}
