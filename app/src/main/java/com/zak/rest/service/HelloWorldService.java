package com.zak.rest.service;

import com.zak.rest.resource.PersonResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloWorldService extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<>();
        s.add(PersonResource.class);
        return s;
    }
}