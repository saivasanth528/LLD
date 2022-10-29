package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.decorators.ExtraCheese;
import DesignPatterns.DecoratorPattern.decorators.ExtraMushroom;
import DesignPatterns.DecoratorPattern.pizza.Pizza;
import DesignPatterns.DecoratorPattern.pizza.ThickCrustPizza;
import DesignPatterns.DecoratorPattern.pizza.ThinCrustPizza;

public class Main {
    public static void main(String args[]) {
        Pizza pizza = new ExtraCheese(new ThickCrustPizza());
        System.out.println("Your ordered  " + pizza.getDescription() + " cost " + pizza.getCost());
        Pizza pizza1 = new ExtraMushroom(new ThinCrustPizza());
        System.out.println("Your ordered  " + pizza1.getDescription() + " cost " + pizza1.getCost());
    }
}
