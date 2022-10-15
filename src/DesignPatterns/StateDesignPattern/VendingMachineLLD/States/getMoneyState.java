package DesignPatterns.StateDesignPattern.VendingMachineLLD.States;

import DesignPatterns.StateDesignPattern.VendingMachineLLD.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Coin;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Item;

import java.util.List;

public class getMoneyState implements State{

    public getMoneyState() {
        System.out.println("Currently the system is in hasMoneyState");
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("You need to click on Start product selection button first");
    }

    @Override
    public int getChange(int amount) throws Exception {
        throw new Exception("You can't get Money in product selection state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product can't be dispensed in getMoneyState");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned the full amount back in coin dispensed tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("You cannot update the Inventory in getMoneyState");
    }
}
