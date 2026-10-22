package com.mohan.qa;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiTests {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    public void getExistingPostShouldReturn200AndExpectedId() {
        given()
            .baseUri(BASE_URL)
        .when()
            .get("/posts/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("title", not(emptyOrNullString()));
    }

    @Test
    public void getPostsShouldReturnList() {
        given()
            .baseUri(BASE_URL)
        .when()
            .get("/posts")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0));
    }
}
