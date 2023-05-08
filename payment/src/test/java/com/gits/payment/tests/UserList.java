package com.gits.payment.tests;

import io.restassured.response.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class UserList {

    @Test
    public void userList(){
        Response useList = given().
                when().
                get("https://reqres.in/api/users?page=2");
        useList.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(200)
                .body("page", equalTo(2),
                        "per_page", equalTo(6),
                        "total", equalTo (12),
                        "total_pages", equalTo (2));





    }
}
