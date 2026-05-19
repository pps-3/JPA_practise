package com.example;
import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();

        Products p2=new Products();

        p2.setId(2);
        p2.setName("cell phone");
        p2.setPrice(500000.00);
        p2.setType("metal");

        em.persist(p2);

    
        System.out.println("Inserted");

        //displaying the name,price,features

        Products pd = em.find(Products.class,2);
        System.out.println("The details are:Name:"+pd.getName()+"Product_Id:"+pd.getId()+"price:"+pd.getPrice()+
                            "features:"+pd.getType());

        em.getTransaction().commit();

        em.close();
        emf.close(); 
        
    }

}

//Deal with transaction taking two products" Commit / Roll back + handle exception.