package com.zak.rest.resource;

import com.sun.jersey.api.JResponse;
import com.sun.jersey.api.NotFoundException;
import com.zak.rest.vo.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/person")
public class PersonResource {

    private static Person[] persons = {
            createPerson(1, "suzuki", "Tokyo"),
            createPerson(2, "satou", "Osaka"),
            createPerson(3, "tanaka", "Naogya")};

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public JResponse<List<Person>> getPersons() {
        List<Person> personsList = new ArrayList<>(Arrays.asList(persons));
        return JResponse.ok(personsList).build();
    }

    @Path("{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public JResponse<Person> getPerson(@PathParam("id") Integer id) {
        if (id > persons.length) {
            throw new NotFoundException("No such person.");
        }
        return JResponse.ok(persons[id - 1]).build();
    }

    private static Person createPerson(Integer id, String name, String address) {
        return new Person().setId(id)
                           .setName(name)
                           .setAddress(address);
    }
}
