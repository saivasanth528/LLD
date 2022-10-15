package DesignPatterns.StateDesignPattern.VendingMachineLLD.States;

import DesignPatterns.StateDesignPattern.VendingMachineLLD.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Coin;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Item;

import java.util.List;

public interface State {
    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

    public int getChange(int amount) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception;
}
