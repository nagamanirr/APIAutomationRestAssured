package getRequestTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateResponseDataTest {



    @Test
    public void validateResponseData() {

        ObjectMapper mapper=new ObjectMapper();
        Response response=RestAssured.get("https://reqres.in/api/users/2");
        Assert.assertTrue(response.getStatusCode()==200);
        System.out.println("Response code is "+response.getStatusCode());
     //   String username = response.jsonPath().getJsonObject("data");

        Map<String,String> testData = new HashMap<String, String>();
        testData.put("id","2");
        testData.put("first_name","Janet");
        testData.put("last_name","Weaver");
        testData.put("avatar","avatar -> https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg");

        Map<String,String> userAttributes = response.jsonPath().getMap("data");
        System.out.println(userAttributes.get("last_name"));

        Assert.assertEquals(userAttributes.get("last_name"),testData.get("last_name"));



    }

}