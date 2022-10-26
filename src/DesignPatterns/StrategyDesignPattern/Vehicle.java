package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }


}
