package DesignPatterns.StateDesignPattern.VendingMachineLLD.models;

public class ItemShelf {
    int code;
    Item item;

    boolean soldOut;

    public ItemShelf(int code, Item item) {
        this.code = code;
        this.item = item;
    }

    public int getCode() {
        return code;
    }

    public Item getItem() {
        return item;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
