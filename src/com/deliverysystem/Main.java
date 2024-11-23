package com.deliverysystem;

import com.deliverysystem.view.CustomerView;
import com.deliverysystem.view.ProductView;
import com.deliverysystem.view.OrderView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerView customerView = new CustomerView();
        ProductView productView = new ProductView();
        OrderView orderView = new OrderView();

        while (true) {
            System.out.println("\nDelivery System Menu:");
            System.out.println("1. Manage Customers");
            System.out.println("2. Manage Products");
            System.out.println("3. Manage Orders");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    customerView.showMenu();
                    break;
                case 2:
                    productView.showMenu();
                    break;
                case 3:
                    orderView.showMenu();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}