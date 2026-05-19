package com.example;
import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        
        //creating entity manager factory 
        EntityManagerFactory emf= 
         Persistence.createEntityManagerFactory("myjpa");

        //create entity manager
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();

        Customer1 c1=new Customer1();

        c1.setName("Preethi");
        c1.setEmail("preeti@123.gamil.com");
        c1.setNumber("967602112");
        
        em.persist(c1);

        em.getTransaction().commit();

         System.out.println("Inserted");

         em.close();
         emf.close();

    }
}