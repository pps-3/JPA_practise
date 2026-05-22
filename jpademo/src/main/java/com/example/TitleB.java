package com.example;
import javax.persistence.*;

@Entity
public class TitleB {

@Id
@GeneratedValue
private int titleId;

private String titleName;
private double price;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="publisher_id")
private PublisherB publisher;

    public void setTitleName(String titleName)
    {
        this.titleName=titleName;
    }

    public String getTitleName()
    {
        return titleName;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }   

    public double getPrice()
    {
        return price;
    }

}
