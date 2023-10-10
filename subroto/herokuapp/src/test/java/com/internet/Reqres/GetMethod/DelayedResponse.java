package com.internet.Reqres.GetMethod;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class DelayedResponse {

    @Test
    public void delayedResponse(){

        Response delayedresponse = given().

                when().
                get("https://reqres.in/api/users?page=2");

        delayedresponse.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(200).log().all()
                .body("page",equalTo( 2),
                             "per_page",equalTo( 6),
                             "total",equalTo( 12),
                             "total_pages",equalTo( 2));


    }
}
