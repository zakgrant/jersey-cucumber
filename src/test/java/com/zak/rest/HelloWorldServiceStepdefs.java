package com.zak.rest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloWorldServiceStepdefs {
    @Given("^I query person$")
    public void I_query_person() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I make the rest call$")
    public void I_make_the_rest_call() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^response should contain:$")
    public void response_should_contain(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Given("^I query person by \"([^\"]*)\"$")
    public void I_query_person_by(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^response should contain \"([^\"]*)\"address\"([^\"]*)\"Tokyo\"([^\"]*)\"name\"([^\"]*)\"suzuki\"([^\"]*)\"id\"([^\"]*)\"$")
    public void response_should_contain_address_Tokyo_name_suzuki_id(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^response should contain \"([^\"]*)\"address\"([^\"]*)\"Osaka\"([^\"]*)\"name\"([^\"]*)\"satou\"([^\"]*)\"id\"([^\"]*)\"$")
    public void response_should_contain_address_Osaka_name_satou_id(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^response should contain \"([^\"]*)\"address\"([^\"]*)\"Naogya\"([^\"]*)\"name\"([^\"]*)\"tanaka\"([^\"]*)\"id\"([^\"]*)\"$")
    public void response_should_contain_address_Naogya_name_tanaka_id(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
