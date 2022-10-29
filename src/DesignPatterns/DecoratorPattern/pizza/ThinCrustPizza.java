package DesignPatterns.DecoratorPattern.pizza;

public class ThinCrustPizza extends Pizza{

    public ThinCrustPizza() {

    }

    @Override
    public String getDescription() {
        return super.getDescription() +  ", Thin Crust Pizza";
    }

    @Override
    public double getCost() {
        return 310.25;
    }
}
