package com.inventory;

import java.util.HashMap;

public class Inventory<T extends Item> {
    private HashMap<String, T> map;

    public Inventory() {
        this.map = new HashMap<>();
    }

    public void add(T item) throws DuplicateItemException, InvalidQuantityException {
        if(map.containsKey(item.getId())) {
            throw new DuplicateItemException("Duplicate id");
        }
        if(item.getQty() < 0) {
            throw new InvalidQuantityException("Invalid qty");
        }
        map.put(item.getId(), item);
    }
    public T remove(T item) {

        return map.remove(item.getId());

    }

    public T get(String id) {
        return map.get(id);
    }

    public HashMap<String, T> getAll() {
        return map;
    }
}
