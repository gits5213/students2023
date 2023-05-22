package com.gits.reqress.getmethod;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class SingleResource {
    @Test
    public void singleResource(){

        Response singleResource = given().

                when().
                get("https://reqres.in/api/users?page=2");

        singleResource.then()
                .assertThat()
                .time(lessThan(3000L))
                .statusCode(200).log().all()
                .body("page",equalTo(2))
                .body("per_page",equalTo( 6))
                .body("total",equalTo( 12))
                .body("total_pages",equalTo(2));
    }
}
