package com.example;

import javax.persistence.*;
import java.util.*;

public class OrderProductDemo {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myjpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p1 = new Product();
        p1.setProductName("Laptop");
        p1.setPrice(50000);

        Product p2 = new Product();
        p2.setProductName("Mouse");
        p2.setPrice(1000);

        Product p3 = new Product();
        p3.setProductName("Keyboard");
        p3.setPrice(2000);

        Orders o1 = new Orders();
        o1.setOrderDate("01-06-2026");

        Orders o2 = new Orders();
        o2.setOrderDate("02-06-2026");

        o1.getProducts().add(p1);
        o1.getProducts().add(p2);

        o2.getProducts().add(p1);
        o2.getProducts().add(p3);

        em.persist(o1);
        em.persist(o2);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Data Inserted");
    }
}
