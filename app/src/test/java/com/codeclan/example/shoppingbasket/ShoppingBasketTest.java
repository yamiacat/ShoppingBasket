package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    @Test
    public void basketStartsEmpty() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        assertEquals(0, shoppingBasket.getItems().size());
    }

    @Test
    public void itemCanBeAddedToBasket() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        shoppingBasket.addToBasket(item);
        assertEquals(1, shoppingBasket.getItems().size());
    }

    @Test
    public void multipleItemsCanBeAddedToBasket() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);

        assertEquals(2, shoppingBasket.getItems().size());
    }

}