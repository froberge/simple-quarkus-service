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
          .when().get("/greeting")
          .then()
             .statusCode(200)
             .body(is("Welcome to your first Quarkus app!"));
    }

    @Test
    public void testUserGroupEndpoint() {
        given()
          .when().get("/greeting/usergroup")
          .then()
             .statusCode(200)
             .body(is("Bonjour demo iClic") );
    }
}