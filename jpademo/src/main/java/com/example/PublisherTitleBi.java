package com.example;
import java.util.*;

import javax.persistence.*;


public class PublisherTitleBi{
   public static void main(String args[])
    {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("myjpa");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();

        PublisherU p = new PublisherU();
        p.setPublisherName("Mc awHill");

        TitleU t1= new TitleU();

        t1.setTitleName("Autumn fall");
        t1.setPrice(2000.00);

        TitleU t2=new TitleU();
        t2.setTitleName("Last Leaf");
        t2.setPrice(9000.00);

        List<TitleB> list1 = new ArrayList<>();

        list1.add(t1);
        list1.add(t2);

        p.setTitles(list1);

        em.persist(p);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }    
}
