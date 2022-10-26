package DesignPatterns.StrategyDesignPattern.strategy;

public class NormalDrivingStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Driving strategy is invoked");
    }
}
