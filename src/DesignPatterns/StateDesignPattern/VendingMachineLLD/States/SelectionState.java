package DesignPatterns.StateDesignPattern.VendingMachineLLD.States;

import DesignPatterns.StateDesignPattern.VendingMachineLLD.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Coin;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Inventory;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Item;

import java.util.List;

public class SelectionState implements State{

    public SelectionState() {
        System.out.println("Currently vending machine is in selection state");
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cannot click on insert cash button in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You cannot insert the coin in selection State");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
       Item item = vendingMachine.getInventory().getItem(codeNumber);
       int amountPaidByTheUser = 0;

       for(Coin coin: vendingMachine.getCoinList()) {
           amountPaidByTheUser += coin.value;
       }

       if(amountPaidByTheUser < item.getPrice()) {
           System.out.println("InSufficient amount for the product you selected for the price " + item.getPrice() + " your " +
                   "paid amount" + amountPaidByTheUser);
           refundFullMoney(vendingMachine);
           throw new Exception("Insufficient amount");
       } else if(amountPaidByTheUser > item.getPrice()) {
           getChange(amountPaidByTheUser - item.getPrice());
           vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, codeNumber));
       }

    }

    @Override
    public int getChange(int amount) throws Exception {
        System.out.println("Returning the change in coin dispensed tray " + amount);
        return amount;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product cant be dispensed in selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returning the amount in coin dispensed tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can't be updated in selection state");
    }
}
