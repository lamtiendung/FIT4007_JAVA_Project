package com.deliverysystem.view;

import com.deliverysystem.controller.ProductController;
import com.deliverysystem.model.Product;
import java.util.Scanner;

public class ProductView {
    private ProductController productController;
    private Scanner scanner;

    public ProductView() {
        this.productController = new ProductController();
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nProduct Management Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. View All Products");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    viewProducts();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        Product product = new Product(productId, productName, quantity);
        productController.addProduct(product);
    }

    private void deleteProduct() {
        System.out.print("Enter product ID to delete: ");
        String productId = scanner.nextLine();
        productController.deleteProduct(productId);
    }

    private void viewProducts() {
        productController.displayProducts();
    }
}