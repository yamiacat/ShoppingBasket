package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;


public class CheckOutTest {

    @Test
    public void checkOutCanGetTotalPrice() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);

        CheckOut checkOut = new CheckOut(shoppingBasket);

        assertEquals(190, checkOut.getPrice());
    }

    @Test
    public void checkOutCanAcceptBOGOFOffer() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);

        BOGOF bogof = new BOGOF(item2);
        CheckOut checkOut = new CheckOut(shoppingBasket);

        checkOut.applyOffer(bogof);

        assertEquals(190, checkOut.getPrice());
    }


    @Test
    public void checkOutCanAcceptAllOffersAtOnce() {
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
        PercentOff loyaltyCard = new PercentOff(0, 2);

        CheckOut checkOut = new CheckOut(shoppingBasket);

        checkOut.applyOffer(bogof);
        checkOut.applyOffer(percentOff);
        checkOut.applyOffer(loyaltyCard);

        assertEquals(2373, checkOut.getPrice());
    }


}