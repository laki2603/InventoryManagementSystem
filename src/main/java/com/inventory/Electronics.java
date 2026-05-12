package com.inventory;

public class Electronics extends Item{
    private int warranty; // in months

    public Electronics(String id, String name, double price, int qty, int warranty) {
        super(id, name, price, qty);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

}
