package com.stepDefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class MyStepdefs {

    RequestSpecification request;
    Response response;

    @Given("^User sets the base API request <.*>$")
    public void userSetsTheBaseAPIRequestURL(String url) {
        RestAssured.baseURI =url;
    }

    @And("^User authenticates the API request with <.*>$")
    public void userAuthenticatesTheAPIRequestWithToken(String token) {
        request = given().auth().oauth2(token);
    }

    @When("^User sends the API request to get all the repositories$")
    public void userSendsTheAPIRequestToGetAllTheRepositories() {
        String path = "/user/repos";
        response=request.get(path).then().extract().response();
    }

    @Then("^User validates the response status is <.*>$")
    public void userValidatesTheResponseStatusIsCode(int code) {
        Assert.assertEquals(code,response.getStatusCode());
    }
}

