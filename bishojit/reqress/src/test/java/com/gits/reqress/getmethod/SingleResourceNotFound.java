package com.gits.reqress.getmethod;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class SingleResourceNotFound {
    @Test
    public void singleResourceNotFound(){

        Response singleResourceNotFound = given().

                when().
                get("https://reqres.in/api/unknown/23");

        singleResourceNotFound.then()
                .assertThat()
                .time(lessThan(3000L))
                .statusCode(404).log().all();
    }
}
