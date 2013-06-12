package com.zak.rest.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.zak.rest.resource.PersonResource;

public class HelloWorldService extends Application {
    @ Override
    public Set <Class <? >> getClasses () {
        Set <Class <? >> s = new HashSet<>();
        s.add (PersonResource.class);
        return s;
    }
}