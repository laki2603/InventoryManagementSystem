package com.inventory;

import java.util.Objects;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private double price;
    private int qty;

    public Item(String id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public int getQty() {
        return qty;
    }


    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
