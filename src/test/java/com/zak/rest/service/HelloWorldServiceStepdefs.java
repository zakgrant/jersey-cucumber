package com.zak.rest.service;

import com.zak.rest.service.support.HelloWorldServiceSupport;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldServiceStepdefs {

    private HelloWorldServiceSupport helloWorldServiceSupport = new HelloWorldServiceSupport();
    private String actual;

    @Given("^I query person$")
    public void I_query_person() throws Throwable {
    }

    @When("^I make the rest call$")
    public void I_make_the_rest_call() throws Throwable {
        actual = helloWorldServiceSupport.getPeople();
    }

    @Then("^response should contain a collection of people:$")
    public void response_should_contain_a_collection_of_people(String expected) throws Throwable {
        assertActualAgainstExpectedResponse(expected);
    }

    @When("^I make the rest call passing the \"(\\d+)\"$")
    public void I_make_the_rest_call_passing_the_id(int id) throws Throwable {
        actual = helloWorldServiceSupport.getPerson(id);
    }

    @Then("^response should contain a single person \"(.*)\"$")
    public void response_should_contain_a_single_person(String expected) throws Throwable {
        assertActualAgainstExpectedResponse(expected);
    }

    private void assertActualAgainstExpectedResponse(String expected) {
        assertThat(actual.contains(expected), is(true));
    }
}
