package com.zak.rest.service.support;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

import static com.jayway.restassured.RestAssured.expect;

public class HelloWorldServiceSupport {

    public HelloWorldServiceSupport() {
        RestAssured.baseURI  = "http://localhost";
        RestAssured.port     = 8080;
        RestAssured.basePath = "/helloWorldWebApp/rest";
    }

    public String getPeople() {
        String path = "/person";
        Response response = expect().statusCode(200).when().get(path);
        ResponseBody body = response.getBody();
        return body.asString();
    }

    public String getPerson(int id) {
        String path = "/person/" + id;
        Response response = expect().statusCode(200).when().get(path);
        ResponseBody body = response.getBody();
        return body.asString();
    }
}
