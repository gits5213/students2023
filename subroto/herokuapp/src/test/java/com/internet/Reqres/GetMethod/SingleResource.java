package com.internet.Reqres.GetMethod;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class SingleResource {

    @Test
    public void singleResource(){

        Response singleresourse = given().

                when().
                get("https://reqres.in/api/users?page=2");

        singleresourse.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(200).log().all()
                .body("page",equalTo(2))
                .body("per_page",equalTo( 6))
                .body("total",equalTo( 12))
                .body("total_pages",equalTo(2));
    }
}
