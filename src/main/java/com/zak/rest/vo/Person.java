package com.zak.rest.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
    private Integer id;
    private String name;
    private String address;

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }
}

