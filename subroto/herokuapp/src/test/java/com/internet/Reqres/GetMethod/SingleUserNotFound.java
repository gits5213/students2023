package com.internet.Reqres.GetMethod;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class SingleUserNotFound {

    @Test
    public void singleUserNotFound(){

        Response singleusernotfound = given().

                when().
                get("https://reqres.in/api/users/23");

        singleusernotfound.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(404).log().all();
    }
}
