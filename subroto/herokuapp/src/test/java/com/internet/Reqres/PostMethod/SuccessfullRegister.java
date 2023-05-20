package com.internet.Reqres.PostMethod;

import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class SuccessfullRegister {

    @Test
    void registersuccess(){

        HashMap data = new HashMap();

        data.put("email","eve.holt@reqres.in");
        data.put("password","pistol");
        data.put("id","2");
        data.put("token","QpwL5tke4Pnpja7X4");

        given()
                .contentType("application/json")
                .body(data)

                .when()
                .post("https://reqres.in/api/register")

                .then()
                .assertThat()
                .statusCode(200).log().all()
                .time(lessThan(5000L))
                .body("email",equalTo("eve.holt@reqres.in"))
                .body("password",equalTo("pistol"))
                .body("id",equalTo("2"))
                .body("token",equalTo("QpwL5tke4Pnpja7X4"))
                .header("Content-Type","application/json; charset=utf-8");


    }
}
