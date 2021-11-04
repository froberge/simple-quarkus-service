package com.thecat;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testGreetingEndpoint() {
        given()
          .when().get("/")
          .then()
             .statusCode(200)
             .body(is("Welcome to your first Quarkus app!!!"));
    }

    @Test
    public void testRhugEndpoint() {
        given()
          .when().get("/welcome")
          .then()
             .statusCode(200)
             .body(is("Bienvenue  au workshop CodeReady 5 Novembre 2021 !!!") );
    }

}