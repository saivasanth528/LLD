package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.RacingStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new RacingStrategy());
    }
}
