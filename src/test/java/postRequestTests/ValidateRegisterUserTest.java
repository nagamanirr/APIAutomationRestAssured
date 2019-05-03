package postRequestTests;

import groovy.json.JsonException;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateRegisterUserTest {


@Test
    public void validateRegistrationofUsersTest()
{

    RequestSpecification request= RestAssured.given();
    request.header("Content-Type","Application/json");
    JSONObject requestjson=new JSONObject();

    try
    {

        requestjson.put("email","sydney@fife");
        requestjson.put("password","pistol");



    }
    catch(JsonException e)
    {

        System.out.println(e.getMessage());
    }

    request.body(requestjson.toString());

    Response responseRegister= request.post("https://reqres.in/api/register");
    System.out.println( "Response body "+responseRegister.getBody().prettyPrint());
    Assert.assertEquals(responseRegister.getStatusCode(),201);








}





















}
