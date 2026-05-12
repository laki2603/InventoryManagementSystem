package com.inventory;

import java.util.HashMap;

public class Order<T extends Item> implements Comparable<Order<T>>{
    private String orderId;
    private boolean isExpress;
    private HashMap<T, Integer> orderItems;
    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
        this.orderItems = new HashMap<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void addItemsToOrder(T item) {
        orderItems.put(item, orderItems.getOrDefault(item, 0) + 1);
    }

    public HashMap<T, Integer> getOrderItems() {
        return orderItems;
    }

    @Override
    public int compareTo(Order<T> o) {
        if(this.isExpress() && !o.isExpress()) {
            return -1;
        }
        if(!this.isExpress() && o.isExpress()) {
            return 1;
        }
        return this.getOrderId().compareTo(o.getOrderId());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", isExpress=" + isExpress +
                ", orderItems=" + orderItems +
                '}';
    }
}
