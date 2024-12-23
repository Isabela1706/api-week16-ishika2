package com.dummy.restapiexample.userlistinfo;

import com.dummy.restapiexample.model.EmployeePojo;
import com.dummy.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

;import static io.restassured.RestAssured.given;

public class UserPutTest extends TestBase {



    @Test
    public void updateEmployeeInfo(){

        EmployeePojo employeePojo=new EmployeePojo();
        employeePojo.setName("Tiger Nixon");
        employeePojo.setSalary(320000);
        employeePojo.setAge(63);
        employeePojo.setImage(" ");

        Response response= given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .pathParam("id",624)
                .when()
                .body(employeePojo)
                .put("/update/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }


}
