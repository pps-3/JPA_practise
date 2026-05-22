package com.example;
import java.util.*;

import javax.persistence.*;


public class PublisherTitleUni {
    public static void main(String args[])
    {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("myjpa");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();

        PublisherU p = new PublisherU();
        p.setPublisherName("Mc GrawHill");

        TitleU t1= new TitleU();

        t1.setTitleName("Autumn fall");
        t1.setPrice(2000.00);

        TitleU t2=new TitleU();
        t2.setTitleName("Last Leaf");
        t2.setPrice(9000.00);

        List<TitleU> list = new ArrayList<>();

        list.add(t1);
        list.add(t2);

        p.setTitles(list);

        em.persist(p);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }    
}
