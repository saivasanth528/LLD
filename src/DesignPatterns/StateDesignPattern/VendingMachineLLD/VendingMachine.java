package DesignPatterns.StateDesignPattern.VendingMachineLLD;

import DesignPatterns.StateDesignPattern.VendingMachineLLD.States.IdleState;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.States.State;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Coin;
import DesignPatterns.StateDesignPattern.VendingMachineLLD.models.Inventory;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        this.inventory = new Inventory(10);
        this.coinList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
