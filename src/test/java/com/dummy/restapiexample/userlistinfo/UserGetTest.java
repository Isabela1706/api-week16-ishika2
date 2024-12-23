package com.dummy.restapiexample.userlistinfo;


import com.dummy.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserGetTest extends TestBase {


    @Test
    public void getAllEmployeeData() {

        Response response = given()
                .header("Cookie", "humans_21909=1")
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);

    }

}