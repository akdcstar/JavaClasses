package com.playtika.automation.pizza;

public class PepperoniMaker extends AbstractPizzaMaker {
    @Override
    protected void fillIngredients() {
        System.out.println("Next ingredients are added: Sausages, Tomato sauce, Basil, Mozzarella");
    }

    @Override
    protected void bake() {
        System.out.println("Baking is in progress...");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    protected String build() {
        return "Your Pepperoni pizza is done";
    }
}
