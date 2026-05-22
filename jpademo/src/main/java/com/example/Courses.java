package com.example;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses 
{
    
    @Id
    private int id;

    private String title;
    
    @Embedded
    private Location location;

    private double courseFee;

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()

    {
        return id;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return title;
    }
    
    public void setLocation(Location location)
    {
        this.location=location;
    }
    public Location getLocation()
    {
        return location;
    }
    public void setCourseFee(double fee)
    {
        this.courseFee=fee;
    }
    public double getCourseFee()
    {
        return courseFee;
    }

}
