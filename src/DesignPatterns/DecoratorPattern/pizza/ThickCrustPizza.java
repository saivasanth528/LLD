package DesignPatterns.DecoratorPattern.pizza;

public class ThickCrustPizza extends Pizza{

    public ThickCrustPizza() {

    }

    @Override
    public String getDescription() {
        return super.getDescription() +  ", Thick crust pizza";
    }

    @Override
    public double getCost() {
        return 250.0;
    }
}
