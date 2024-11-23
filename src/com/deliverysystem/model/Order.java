package com.deliverysystem.model;

import java.util.UUID;

public class Order {
    private String orderId;
    private String orderDetails;
    private Customer customer;

    public Order(String orderDetails, Customer customer) {
        this.orderId = UUID.randomUUID().toString(); // Generate random ID
        this.orderDetails = orderDetails;
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderDetails=" + orderDetails + ", customer=" + customer + "]";
    }
}