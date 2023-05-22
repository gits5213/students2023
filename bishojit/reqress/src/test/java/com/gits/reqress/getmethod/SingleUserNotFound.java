package com.gits.reqress.getmethod;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class SingleUserNotFound {

    @Test
    public void singleUserNotFound(){

        Response singleUserNotFound = given().

                when().
                get("https://reqres.in/api/users/23");

        singleUserNotFound.then()
                .assertThat()
                .time(lessThan(3000L))
                .statusCode(404).log().all();
    }
}
