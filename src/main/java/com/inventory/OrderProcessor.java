package com.inventory;

import java.util.PriorityQueue;

public class OrderProcessor {

    private PriorityQueue<Order<?>> orders;

    public OrderProcessor(PriorityQueue<Order<?>> orders) {
        this.orders = orders;
    }

    public void addOrder(Order<?> order) {
        orders.offer(order);
    }

    public void processOrder() {
        if(orders.isEmpty()) {
            System.out.println("No orders to process");
            return;
        }

        while(!orders.isEmpty()) {
            System.out.println("Processing: " + orders.poll());
        }
        System.out.println("Your orders are processed");
    }
}
