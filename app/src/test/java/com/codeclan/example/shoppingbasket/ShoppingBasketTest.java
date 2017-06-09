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

    @Test
    public void basketCanBeEmptied() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);

        shoppingBasket.emptyBasket();

        assertEquals(0, shoppingBasket.getItems().size());
    }

    @Test
    public void basketContentsCanBeReported() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);

        assertEquals("1: Celery - 2: Houmous - ", shoppingBasket.inspectBasket());
    }


    @Test
    public void emptyBasketCanBeReported() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        assertEquals("Basket is empty", shoppingBasket.inspectBasket());
    }


    @Test
    public void itemCanBeRemovedFromBasketByReportNumber() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);

        shoppingBasket.removeItem(2);

        assertEquals("1: Celery - ", shoppingBasket.inspectBasket());
    }

    @Test
    public void removingInvalidNumberDoesntBreakStuff() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item item = new Item("Celery", 90);
        Item item2 = new Item("Houmous", 100);
        shoppingBasket.addToBasket(item);
        shoppingBasket.addToBasket(item2);

        shoppingBasket.removeItem(4);

        assertEquals("1: Celery - 2: Houmous - ", shoppingBasket.inspectBasket());
    }

}