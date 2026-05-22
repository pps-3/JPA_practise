package com.example;
import javax.persistence.Embeddable;

@Embeddable
public class Location {
    
    private String instituteName;
    private String address;
    private String city;

    public void setInstituteName(String instituteName)
    {
        this.instituteName = instituteName;

    }  
    public String getInstituteName()
    {
        return instituteName;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
     public String getAddress()
    {
        return address;
    }
     public void setCity(String city)
    {
        this.city=city;
    }
     public String getCity()
    {
        return city;
    }

}
