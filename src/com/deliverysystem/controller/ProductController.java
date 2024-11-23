package com.deliverysystem.controller;

import com.deliverysystem.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products;

    public ProductController() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    public void deleteProduct(String productId) {
        products.removeIf(p -> p.getProductId().equals(productId));
        System.out.println("Product(s) deleted with ID: " + productId);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            products.forEach(System.out::println);
        }
    }
}