package DesignPatterns.StrategyDesignPattern.strategy;

public class RacingStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Racing strategy is invoked");
    }
}
