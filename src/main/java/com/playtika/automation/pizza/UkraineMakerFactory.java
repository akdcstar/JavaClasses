package com.playtika.automation.pizza;

public class UkraineMakerFactory implements PizzaMakerFactory {

    @Override
    public AbstractPizzaMaker getPizzaMaker(Button button) {
        switch (button) {
            case BUTTON_1:
                return new CarbonaraMaker();
            case BUTTON_2:
                return new CheeseMaker();
            case BUTTON_3:
                return new PepperoniMaker();
            case BUTTON_4:
                return new PolloMaker();
        }
        throw new IllegalStateException();

    }
}
