package com.example;

import javax.persistence.*;
import java.util.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int productId;

    private String productName;

    private double price;

    @ManyToMany(mappedBy = "products")
    private List<Orders> orders = new ArrayList<>();

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + price;
    }
}
