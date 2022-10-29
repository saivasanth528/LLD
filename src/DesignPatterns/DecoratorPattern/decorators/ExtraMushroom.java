package DesignPatterns.DecoratorPattern.decorators;

import DesignPatterns.DecoratorPattern.pizza.Pizza;

public class ExtraMushroom extends ToppingDecorator{

    public ExtraMushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Extra Mushroom";
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 80;
    }
}
