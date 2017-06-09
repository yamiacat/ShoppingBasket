package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;


public class BOGOFTest {

    @Test
    public void checkOutCanAcceptBOGOFMultipleTimes() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);

        BOGOF bogof = new BOGOF(item2);
        CheckOut checkOut = new CheckOut(shoppingBasket);

        checkOut.applyOffer(bogof);

        assertEquals(290, checkOut.getPrice());
    }

    @Test
    public void checkOutAppliesBOGOFOnceWhenThreeItems() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);
        shoppingBasket.addToBasket(item2);

        BOGOF bogof = new BOGOF(item2);
        CheckOut checkOut = new CheckOut(shoppingBasket);

        checkOut.applyOffer(bogof);

        assertEquals(290, checkOut.getPrice());
    }


}