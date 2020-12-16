package com.example.restAssuredDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;

@SpringBootTest
public class myFirstRestAssuredTest {

    @Test
    public void getResponseBody() {
        given()
                .when().get("http://localhost:8080/api/v1/students/123").then().assertThat().statusCode(200);

    }
}
