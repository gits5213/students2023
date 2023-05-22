package com.gits.reqress.getmethod;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;


public class ListResource {
    @Test
    public void listResource(){

        Response listResource = given().

                when()
                .get("https://reqres.in/api/unknown");

     listResource.then()
                .assertThat()
                .time(lessThan(2000L))
                .statusCode(200).log().all()
                .body("page",equalTo(1),
                        "per_page",equalTo( 6),
                        "total",equalTo(12),
                        "total_pages",equalTo(2));
    }
}
