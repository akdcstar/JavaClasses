package com.playtika.automation.pizza;

public abstract class AbstractPizzaMaker {

    public final String makePizza() {
        takeBase();
        fillIngredients();
        bake();
        cut();
        pack();

        return build();
    }

    private void takeBase() {
        System.out.println("Pizza Base is taken");
    }

    protected abstract void fillIngredients();

    protected abstract void bake();

    protected abstract String build();

    private void cut() {
        System.out.println("Pizza is cutted on 6 pieces");
    }

    private void pack() {
        System.out.println("Pizza is packed");
    }




}
