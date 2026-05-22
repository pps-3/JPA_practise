package com.example;
import javax.persistence.*;

import java.util.*;


@Entity
public class PublisherB {

@Id
@GeneratedValue
private int publisherId;

private String publisherName;

@OneToMany(mappedBy="publisher",
cascade=CascadeType.ALL)
private List<TitleB> titles;

public void setPublisherName(String publisherName)
{
    this.publisherName=publisherName;
}

public String getPublisherName()
{
    return publisherName;
}

public void setTitles(List<TitleU> titles)
{
    this.titles=titles;
}

public List<TitleU> getTitles()
{
    return titles;

}



}
