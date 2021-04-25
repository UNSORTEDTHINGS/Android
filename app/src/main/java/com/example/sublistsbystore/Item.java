package com.example.sublistsbystore;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Represents an Item
 *
 * uses Room's Entity annotation (see http://marker.to/KZyJdO)
 */
@Entity
public class Item {
    @PrimaryKey
    private int uid;
    private String name;
    private int quantity = 1;

    public Item() {
    }

    public Item(int uid) {
        this.uid = uid;
    }

    public Item(int uid, String name) {
        this.uid = uid;
        this.setName(name);
    }

    public Item(int uid, String name, int quantity) {
        this.uid = uid;
        this.setName(name);
        this.setQuantity(quantity);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 1) {
            throw new IllegalArgumentException("Cannot set item quantity lower than 1");
        }
        this.quantity = quantity;
    }
}
