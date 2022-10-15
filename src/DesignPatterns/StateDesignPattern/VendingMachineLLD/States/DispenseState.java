package DesignPatterns.StateDesignPattern.VendingMachineLLD.States;

import DesignPatterns.StateDesignPattern.VendingMachineLLD.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Coin;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Item;

import java.util.List;

public class DispenseState implements State{

    public DispenseState(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Currently Vending Machine is in dispense state");
        dispenseProduct(vendingMachine, codeNumber);
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Insert cash button cannot be clicked on dispensed state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Product selection button cannot be clicked in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Coin cannot be inserted in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product can't be chooses in dispensed state");
    }

    @Override
    public int getChange(int amount) throws Exception {
        throw new Exception("Change can't be returned in dispensed state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

        Item item = vendingMachine.getInventory().getItem(codeNumber);
        System.out.println("Product has be dispensed " + item.getItemType());
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setVendingMachineState(new IdleState());
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Refund can't be happen in dispense state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can't be updated in dispensed state");
    }
}
