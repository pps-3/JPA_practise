package com.example;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;


//Create an entity to represent a product which 
// Contains product id, name, price and features. display name, price & features.


@Entity
public class Products{

    @Id
    private int prod_id;

    private String name;
    private double price;
    private String type;

    public void setId(int id)
    {
        this.prod_id=id;
    }

    public int getId()
    {
        return prod_id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }

    public double getPrice()
    {
        return price;
    }
    public void setType(String type)
    {
        this.type=type;
    }

    public String getType()
    {
        return type;
    }

    


    
}