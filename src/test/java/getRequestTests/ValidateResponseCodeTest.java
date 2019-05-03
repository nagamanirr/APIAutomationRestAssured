package getRequestTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateResponseCodeTest {



     @Test
    public void validateResponseCode()
    {

        Response response=RestAssured.get("https://reqres.in/api/users?page=all");
        Assert.assertTrue(response.getStatusCode()==200);
        System.out.println("Response code is "+response.getStatusCode());

    }











}
