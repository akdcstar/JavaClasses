package com.playtika.automation.Pizza;

public class CheeseMaker extends AbstractPizzaMaker {
    @Override
    protected void fillIngredients() {
        System.out.println("Next ingredients are added: Cheese 1, Cheese 2, Cheese 3, Cheese 4");
    }

    @Override
    protected void bake() {
        System.out.println("Baking is in progress...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    protected String build() {
        return "Your Cheese pizza is done";
    }
}
