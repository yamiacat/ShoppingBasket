package com.codeclan.example.shoppingbasket;


public class Item {
    private String description;
    private int price;


    public Item(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice() {
        return price;
    }
}
