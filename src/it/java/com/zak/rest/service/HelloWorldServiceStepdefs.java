package com.zak.rest.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;

import com.zak.rest.vo.Person;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.path.json.JsonPath.from;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsEqual.equalTo;

public class HelloWorldServiceStepdefs {

    private Person actualPerson;
    private List<Person> actualPersons;

    public HelloWorldServiceStepdefs() {
        RestAssured.baseURI  = "http://localhost";
        RestAssured.port     = 8080;
        RestAssured.basePath = "/rest";
    }

    @Given("^I query person$")
    public void I_query_person() throws Throwable {
    }

    @When("^I make the rest call$")
    public void I_make_the_rest_call() throws Throwable {
        String result = expect().statusCode(200).when().get("person/").asString();
        actualPersons = new ArrayList<>(Arrays.asList(from(result).getObject("person", Person[].class)));
    }

    @Then("^response should contain a collection of people:$")
    public void response_should_contain_a_collection_of_people(String expected) throws Throwable {
        List<Person> expectedPersons = new ObjectMapper().readValue(expected, new TypeReference<List<Person>>() { });
        for(Person person : expectedPersons) {
            assertThat(actualPersons, hasItem(person));
        }
    }

    @When("^I make the rest call passing the \"(\\d+)\"$")
    public void I_make_the_rest_call_passing_the_id(int id) throws Throwable {
        actualPerson = expect().statusCode(200).when().get("/person/" + id).as(Person.class);
    }

    @Then("^response should contain a single person \"(.*)\"$")
    public void response_should_contain_a_single_person(String expected) throws Throwable {
        Person expectedPerson = new ObjectMapper().readValue(expected, Person.class);
        assertThat(actualPerson, equalTo(expectedPerson));
    }
}
