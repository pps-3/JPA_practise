package com.example;
import javax.persistence.*;

@Entity
public class TitleU {

@Id
@GeneratedValue
private int titleId;

private String titleName;
private double price;

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
