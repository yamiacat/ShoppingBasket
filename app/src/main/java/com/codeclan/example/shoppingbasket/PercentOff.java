package com.codeclan.example.shoppingbasket;


import java.util.ArrayList;

public class PercentOff implements Offering {
    private int lowerLimit;
    private int percentSaving;

    public PercentOff(int lowerLimit, int percentSaving) {
        this.lowerLimit = lowerLimit;
        this.percentSaving = percentSaving;
    }

    @Override
    public int getOffer(ArrayList<Item> allItems, int totalPrice) {
        int saving = 0;
        if (totalPrice >= this.lowerLimit) {
            saving += (totalPrice * this.percentSaving)/100;
        }
        return saving;
    }
}
