package com.playtika.automation.Pizza;

public class CarbonaraMaker extends AbstractPizzaMaker {
    @Override
    protected void fillIngredients() {
        System.out.println("Next ingredients are added: Bacon, Cheese, Eggs, Sour cream sauce");
    }

    @Override
    protected void bake() {
        System.out.println("Baking is in progress...");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    protected String build() {
        return "Your Carbonara pizza is done";
    }
}
