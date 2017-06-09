package com.codeclan.example.shoppingbasket;


import android.content.ClipData;

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
}
