package com.playtika.automation.pizza;

public class PolloMaker extends AbstractPizzaMaker {
    @Override
    protected void fillIngredients() {
        System.out.println("Next ingredients are added: Chicken, Cheese, olives, Tomatoes");
    }

    @Override
    protected void bake() {
        System.out.println("Baking is in progress...");

        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    protected String build() {
        return "Your Pollo pizza is done";
    }
}
