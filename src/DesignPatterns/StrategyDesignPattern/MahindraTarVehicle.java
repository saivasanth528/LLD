package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.DriveStrategy;
import DesignPatterns.StrategyDesignPattern.strategy.MountainDrivingStrategy;

public class MahindraTarVehicle extends Vehicle{

    public MahindraTarVehicle() {
        super(new MountainDrivingStrategy());
    }
}
