package DesignPatterns.StateDesignPattern.VendingMachineLLD.States;

import DesignPatterns.StateDesignPattern.VendingMachineLLD.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Coin;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Item;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState() {
        System.out.println("Currently Vending machine is in Idle State");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("Currently Vending Machine is in IdleState");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new getMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("First you need to click on insert Cash Button");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You cannot insert the coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("You cannot change product in idle state");
    }

    @Override
    public int getChange(int amount) throws Exception {
        throw new Exception("You cannot get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be dispensed in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Money can't be refunded in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        vendingMachine.getInventory().addItem(item, codeNumber);
    }
}
