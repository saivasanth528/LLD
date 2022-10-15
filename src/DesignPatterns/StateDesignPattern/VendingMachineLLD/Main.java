package DesignPatterns.StateDesignPattern.VendingMachineLLD;

import DesignPatterns.StateDesignPattern.VendingMachineLLD.States.State;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Coin;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Item;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.ItemShelf;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.ItemType;

public class Main {
    public static void main(String args[]) {
        VendingMachine vendingMachine  = new VendingMachine();
        try {

            System.out.println("Filling up the inventory");
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);
            System.out.println("Clicking on insert coin button");

            State vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.clickOnInsertCashButton(vendingMachine);
            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);
            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);
            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);
            vendingMachineState.insertCoin(vendingMachine, Coin.FIVE);


            System.out.println("Click on product selection button");
            vendingMachineState.clickOnStartProductSelectionButton(vendingMachine);
            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.chooseProduct(vendingMachine, 101);
            displayInventory(vendingMachine);
        } catch (Exception e) {
            System.out.println(e);
            displayInventory(vendingMachine);
        }
    }



    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();

        for(int i = 0; i < slots.length; i++) {
            Item item = null;
            if(i >= 0 && i < 2) {
                item = new Item(ItemType.COKE, 30);
            } else if(i >= 2 && i < 4) {
                item = new Item(ItemType.PEPSI, 30);
            } else if(i >= 4 && i < 6) {
                item = new Item(ItemType.LAYS, 10);
            } else if(i >=6 && i < 8) {
                item = new Item(ItemType.JUICE, 35);
            } else {
                item = new Item(ItemType.SODA, 20);
            }
            slots[i].setItem(item);
            slots[i].setSoldOut(false);
        }
    }


    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelves = vendingMachine.getInventory().getInventory();
        for(ItemShelf itemShelf: itemShelves) {
            System.out.println("Code Number: " + itemShelf.getCode() +
                    "  Item: " + itemShelf.getItem().getItemType() +
                    "  Price: " + itemShelf.getItem().getPrice() +
                    "  isAvailable: " + !itemShelf.isSoldOut());
        }
    }
}
