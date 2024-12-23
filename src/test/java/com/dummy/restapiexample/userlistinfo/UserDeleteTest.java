package com.dummy.restapiexample.userlistinfo;


import com.dummy.restapiexample.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserDeleteTest extends TestBase {



    @Test
    public void deleteTheUser(){

        given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .pathParam("id", 4427)
                .when()
                .delete("/delete/{id}")
                .then().log().all()
                .statusCode(204);

    }


}
