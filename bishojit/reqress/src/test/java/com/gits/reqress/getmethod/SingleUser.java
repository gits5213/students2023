package com.gits.reqress.getmethod;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SingleUser {
    @Test
    public void singleUsers(){

        Response singleUsers = given().

                when().
                get("https://reqres.in/api/users/2");

        singleUsers.then()
                .assertThat()
                .time(lessThan(2000L))
                .statusCode(200).log().all();

    }
}
