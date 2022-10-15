package DesignPatterns.StateDesignPattern.VendingMachineLLD.models;

public class Inventory {
    ItemShelf[] inventory = null;

    public Inventory(int noOfShelves) {
        this.inventory = new ItemShelf[noOfShelves];
        initializeEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initializeEmptyInventory() {
        int startCode = 101;
        for(int i = 0; i < inventory.length; i++) {
            ItemShelf itemShelf = new ItemShelf(101, null);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.code == codeNumber) {
                itemShelf.setItem(item);
                itemShelf.setSoldOut(false);
            } else {
                throw new Exception("Item already present, you cannot add item here");
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.code == codeNumber) {
                if(itemShelf.isSoldOut()) {
                    throw new Exception("Item already sold out");
                } else {
                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid code");
    }

    public void updateSoldOutItem(int codeNumber) {
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.getCode() == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }


}
