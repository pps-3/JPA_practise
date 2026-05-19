package com.example;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer1{

    @Id
    private String email;

    private String name;
    private String number;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setNumber(String number)
    {
        this.number=number;
    }

    public String getNumber()
    {
        return number;
    }
    
}
