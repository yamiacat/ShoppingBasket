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
    public void checkOutCanAcceptBOGOFmultipleItems() {
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


}