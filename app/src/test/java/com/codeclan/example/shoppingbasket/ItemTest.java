package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemHasDetails() {
        Item item = new Item("Celery", 90);

        assertEquals("Celery", item.getDescription());
        assertEquals(90, item.getPrice());
    }

}