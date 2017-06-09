package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;


public class PercentOffTest {

    @Test
    public void checkOutCanAcceptPercentOff() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        Item item3 = new Item("Single Malt", 2500);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item3);


        PercentOff percentOff = new PercentOff(2000, 10);
        CheckOut checkOut = new CheckOut(shoppingBasket);

        checkOut.applyOffer(percentOff);

        assertEquals(2511, checkOut.getPrice());
    }

    @Test
    public void checkOutCanAcceptPercentOffAfterBOGOF() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        Item item3 = new Item("Single Malt", 2500);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item3);

        BOGOF bogof = new BOGOF(item2);
        PercentOff percentOff = new PercentOff(2000, 10);
        CheckOut checkOut = new CheckOut(shoppingBasket);

        checkOut.applyOffer(bogof);
        checkOut.applyOffer(percentOff);

        assertEquals(2421, checkOut.getPrice());
    }

}