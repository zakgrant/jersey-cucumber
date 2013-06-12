package com.zak.rest.vo;

import javax.xml.bind.annotation.XmlRootElement;

@ XmlRootElement
public class Person {
    private Integer id;
    private String name;
    private String address;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }
}

