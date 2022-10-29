package DesignPatterns.DecoratorPattern.decorators;

import DesignPatterns.DecoratorPattern.pizza.Pizza;

public class ExtraCheese extends ToppingDecorator {

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Extra cheese";
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 50.123;
    }
}
