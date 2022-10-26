package DesignPatterns.StrategyDesignPattern.strategy;

public class MountainDrivingStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving on the mountain roads");
    }
}
