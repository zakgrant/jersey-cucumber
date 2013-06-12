package com.zak.rest.resource;

import com.sun.jersey.api.NotFoundException;
import com.zak.rest.vo.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {

    //TODO: Inject these with Guice ?
    private static Person[] persons = {
            createPerson(1, "suzuki", "Tokyo"),
            createPerson(2, "satou", "Osaka"),
            createPerson(3, "tanaka", "Naogya")};

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Person[] getPersons() {
        return persons;
    }

    @Path("{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Person getperson(@PathParam("id") Integer id) {
        if (id > persons.length) {
            throw new NotFoundException("No such person.");
        }
        return persons[id - 1];
    }

    private static Person createPerson(Integer id, String name, String address) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAddress(address);
        return person;
    }
}
