package DesignPatterns.StrategyDesignPattern;

public class Main {

    public static void main(String args[]) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new MahindraTarVehicle();
        vehicle1.drive();
    }
}
