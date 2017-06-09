package com.codeclan.example.shoppingbasket;


import java.util.ArrayList;

public class BOGOF implements Offering {
    private Item offerProduct;

    public BOGOF(Item offerProduct) {
        this.offerProduct = offerProduct;
    }

    @Override
    public int getOffer(ArrayList<Item> allItems) {
        int savings = 0;
        int eligibleItems = 0;
        for (Item item : allItems) {
            if (item.getDescription().equals(this.offerProduct.getDescription())) {
                eligibleItems ++;
            }
        }
        savings += (eligibleItems/2) * offerProduct.getPrice();
        return savings;
    }
}
