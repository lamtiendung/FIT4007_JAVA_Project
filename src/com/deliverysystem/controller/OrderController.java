package com.deliverysystem.controller;

import com.deliverysystem.model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderController {
    private List<Order> orders;

    public OrderController() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order added: " + order);
    }

    public void deleteOrder(String orderId) {
        orders.removeIf(o -> o.getOrderId().equals(orderId));
        System.out.println("Order(s) deleted with ID: " + orderId);
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            orders.forEach(System.out::println);
        }
    }
}