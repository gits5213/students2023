package com.internet.Reqres.GetMethod;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SingleUser {

    @Test
    public void singleUser(){

        Response singleuser = given().

                when().
                get("https://reqres.in/api/users/2");

        singleuser.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(200).log().all();

    }

}
