package com.example;
import javax.persistence.*;

import java.util.*;


@Entity
public class PublisherU {


@Id
@GeneratedValue
private int publisherId;

private String publisherName;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="publisher_id")
private List<TitleU> titles;


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


