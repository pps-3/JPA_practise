package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CoursesMain {
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
        
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Location l=new Location();

        l.setInstituteName("ANITS");
        l.setAddress("sanghivalasa");
        l.setCity("visakhapatnam");

        Courses c=new Courses();
        
        c.setId(1);
        c.setTitle("Computer Science Engineering");
        c.setLocation(l);
        c.setCourseFee(20000.00);

        em.persist(c);


        em.getTransaction().commit();

        System.out.println("Inserted succesfully");

    }
    
}
    