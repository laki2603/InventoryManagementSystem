package com.inventory;

import java.util.LinkedList;
import java.util.List;

public class View<T extends Item> {
    private final int MAX_SIZE;
    private LinkedList<T> items;


    public View(int maxSize) {
        MAX_SIZE = maxSize;
        this.items = new LinkedList<>();
    }

    public void viewItem(T item) {
        items.remove(item);
        items.addFirst(item);

        if(items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public List<T> getRecentlyViewed() {
        System.out.println(items);
        return items;
    }
}
