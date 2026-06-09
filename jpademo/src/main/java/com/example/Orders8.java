package com.example;

import javax.persistence.*;
import java.util.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private int orderId;

    private String orderDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "OrderProducts",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return orderId + " " + orderDate;
    }
}
