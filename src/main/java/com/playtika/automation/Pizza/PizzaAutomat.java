package com.playtika.automation.Pizza;

public class PizzaAutomat {

    private final PizzaMakerFactory pizzaMakerFactory;

    public PizzaAutomat(PizzaMakerFactory pizzaMakerFactory) {
        this.pizzaMakerFactory = pizzaMakerFactory;
    }

    public static void main(String[] args) {
        PizzaAutomat pizzaAutomat = new PizzaAutomat(new UkraineMakerFactory());
        String pizza = pizzaAutomat.getPizza(Button.BUTTON_1);
        System.out.println(pizza);
    }

    public String getPizza(Button button) {
        AbstractPizzaMaker maker = pizzaMakerFactory.getPizzaMaker(button);
        return maker.makePizza();
    }
}
