package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

public class CheckOut {
    private int totalPrice;
    private ArrayList<Item> allItems;


    public CheckOut(ShoppingBasket shoppingBasket) {
        this.allItems = shoppingBasket.getItems();
        this.totalPrice = calculateStartTotal();
    }

    public int getPrice() {
        return this.totalPrice;
    }

    private int calculateStartTotal() {
        int returnTotal = 0;
        for (Item item : this.allItems) {
            returnTotal += item.getPrice();
        }
        return returnTotal;
    }

    public void applyOffer(Offering offer) {
        int savings = offer.getOffer(this.allItems);
        this.totalPrice -= savings;

    }


}
