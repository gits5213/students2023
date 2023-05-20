package com.internet.Reqres.PostMethod;

import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class Create {

    @Test
    void createpostmethod(){

        HashMap data = new HashMap();

        data.put("name","morpheus");
        data.put("job","leader");
        data.put("id","744");

        given()
                .contentType("application/json")
                .body(data)

                .when()
                .post("https://reqres.in/api/users")

                .then()
                .assertThat()
                .statusCode(201).log().all()
                .time(lessThan(5000L))
                .body("name",equalTo("morpheus"))
                .body("job",equalTo("leader"))
                .body("id",equalTo("744"))
                .header("Content-Type","application/json; charset=utf-8");
    }
}
