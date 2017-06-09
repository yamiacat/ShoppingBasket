package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;


public class ShoppingBasket {
    private ArrayList<Item> items;

    public ShoppingBasket() {
        this.items = new ArrayList<>();
    }



    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addToBasket(Item item) {
        this.items.add(item);
    }

    public void emptyBasket() {
        this.items = new ArrayList<>();
    }

    public String inspectBasket() {
        String reportString = "";
        int itemNumber = 0;

        if (0 == this.items.size()) {
            reportString += "Basket is empty";
        }
        else {
            for (Item item : this.items) {
                itemNumber++;
                reportString += itemNumber + ": " + item.getDescription() + " - ";
            }
        }
        return reportString;
        }

    public void removeItem(int itemToRemove) {
        if (itemToRemove <= this.items.size()) {
            this.items.remove(itemToRemove - 1);
        }
    }
}
