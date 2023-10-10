package com.internet.Reqres.GetMethod;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class SingleResourceNotFound {

    @Test
    public void singleResourceNotFound(){

        Response singleresoursenotfound = given().

                when().
                get("https://reqres.in/api/unknown/23");

        singleresoursenotfound.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(404).log().all();
    }
}
