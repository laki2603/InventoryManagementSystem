package com.inventory;

public class Book extends Item{
    private String author;

    public Book(String id, String name, double price, int qty, String author) {
        super(id, name, price, qty);
        this.author = Author()
    }

    public String getAuthor() {
        return author;
    }

}
