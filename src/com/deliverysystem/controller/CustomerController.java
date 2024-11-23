package com.deliverysystem.controller;

import com.deliverysystem.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> customers;

    public CustomerController() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    public void deleteCustomer(String name) {
        customers.removeIf(c -> c.getName().equals(name));
        System.out.println("Customer(s) deleted with name: " + name);
    }

    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            customers.forEach(System.out::println);
        }
    }
}