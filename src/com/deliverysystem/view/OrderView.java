package com.deliverysystem.view;

import com.deliverysystem.controller.OrderController;
import com.deliverysystem.model.Order;
import com.deliverysystem.model.Customer;
import java.util.Scanner;

public class OrderView {
    private OrderController orderController;
    private Scanner scanner;

    public OrderView() {
        this.orderController = new OrderController();
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nOrder Management Menu:");
            System.out.println("1. Add Order");
            System.out.println("2. Delete Order");
            System.out.println("3. View All Orders");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addOrder();
                    break;
                case 2:
                    deleteOrder();
                    break;
                case 3:
                    viewOrders();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addOrder() {
        System.out.print("Enter order details: ");
        String orderDetails = scanner.nextLine();
        System.out.print("Enter customer name for this order: ");
        String customerName = scanner.nextLine();

        // Create a dummy customer for simplicity
        Customer customer = new Customer(customerName, "Address", "Phone");
        Order order = new Order(orderDetails, customer);
        orderController.addOrder(order);
    }

    private void deleteOrder() {
        System.out.print("Enter order ID to delete: ");
        String orderId = scanner.nextLine();
        orderController.deleteOrder(orderId);
    }

    private void viewOrders() {
        orderController.displayOrders();
    }
}