package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

public class APITest {

    private static final String BASE_URL = "https://";  // Base URL

    @BeforeClass
    public void setup() {
        
        RestAssured.baseURI = BASE_URL;
    }

    // valid POST request
    @Test
    public void testValidRequest() {
        String requestPayload = TestHelper.generateValidPayload();

        given()
            .contentType(ContentType.JSON)
            .body(requestPayload)
        .when()
            .post()
        .then()
            .statusCode(201)  // Check for HTTP Status Code 201
            .time(lessThan(5000L), TimeUnit.MILLISECONDS)  // Check if response time is less than 5 seconds
            .body("name", equalTo("QA Test"))  // Validate response data
            .body("email", equalTo("testmanager@test.com"));
    }

    // invalid POST request (with missing name field)
    @Test
    public void testInvalidRequest() {
        String invalidPayload = "{\n" +
                "  \"name\": \"\",\n" +  // Invalid empty name
                "  \"email\": \"testmanager@test.com\",\n" +
                "  \"phoneNumber\": 591097511,\n" +
                "  \"companyName\": \"QA Corner\",\n" +
                "  \"strategicGoals\": \"The goals is to prepare team for the QA testing and execution.\"\n" +
                "}";

        given()
            .contentType(ContentType.JSON)
            .body(invalidPayload)
        .when()
            .post()
        .then()
            .statusCode(400);  // Check for HTTP Status Code 400 (Bad Request)
    }

    // response time validation
    @Test
    public void testResponseTime() {
        String requestPayload = TestHelper.generateValidPayload();

        given()
            .contentType(ContentType.JSON)
            .body(requestPayload)
        .when()
            .post()
        .then()
            .time(lessThan(3000L), TimeUnit.MILLISECONDS);  // Check that response time is less than 3 seconds
    }
}
