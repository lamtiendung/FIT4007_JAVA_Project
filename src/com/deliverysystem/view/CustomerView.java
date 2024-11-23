package com.deliverysystem.view;

import com.deliverysystem.controller.CustomerController;
import com.deliverysystem.model.Customer;
import java.util.Scanner;

public class CustomerView {
    private CustomerController customerController;
    private Scanner scanner;

    public CustomerView() {
        this.customerController = new CustomerController();
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nCustomer Management Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Delete Customer");
            System.out.println("3. View All Customers");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    deleteCustomer();
                    break;
                case 3:
                    viewCustomers();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();
        System.out.print("Enter customer phone number: ");
        String phone = scanner.nextLine();
        Customer customer = new Customer(name, address, phone);
        customerController.addCustomer(customer);
    }

    private void deleteCustomer() {
        System.out.print("Enter customer name to delete: ");
        String name = scanner.nextLine();
        customerController.deleteCustomer(name);
    }

    private void viewCustomers() {
        customerController.displayCustomers();
    }
}