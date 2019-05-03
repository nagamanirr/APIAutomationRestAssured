package postRequestTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateResponseCodeTest {


    @Test
    public void validateResponseCode() {


        Response response = RestAssured.get("https://reqres.in/api/users");
        Assert.assertTrue(response.getStatusCode() == 200);
        System.out.println("Response code is " + response.getStatusCode());

        System.out.println("Response String " + response.asString());

        System.out.println("Users details " + response.getBody());

        //  String strjson = response.asString();

        String usernames = response.jsonPath().getString("data");
        System.out.println("User Details " + usernames);
        String total = response.jsonPath().getString("total");
        System.out.println(total);
      validateData(response);

}

    public void validateData(Response response) {
        List<Map<String, ?>> actualData = response.jsonPath().getList("data");



       List<Map<String,?>> expectedList =  getExpectedUserList();
        System.out.println("Expected List"+expectedList);







           for(int i=0;i<expectedList.size();i++)
           {
               System.out.println("from first forloop");

            System.out.println("Id="+expectedList.get(i).get("id").toString());
            System.out.println("FirstName="+expectedList.get(i).get("first_name").toString());
            System.out.println("LastName="+expectedList.get(i).get("last_name").toString());
            //System.out.println("Avatar="+expectedList.get(i).get("avatar").toString());





           }



        String ExpectedFirstName=actualData.get(1).get("first_name").toString();
        Assert.assertTrue(ExpectedFirstName.equals("Janet"),"Name Not present");

          for (int i = 0; i < actualData.size(); i++) {
              System.out.println("from second forloop");
            System.out.println("Id="+actualData.get(i).get("id").toString());
            System.out.println("FirstName="+actualData.get(i).get("first_name").toString());
            System.out.println("LastName="+actualData.get(i).get("last_name").toString());
            System.out.println("Avatar="+actualData.get(i).get("avatar").toString());
            





        }

       if(actualData.size()==expectedList.size())
       {






           
       }
       else
       {


       }






















    }

    private List<Map<String,?>> getExpectedUserList() {
         Map expectedUserMap1 = new HashMap();
          Map expectedUserMap2 = new HashMap();
           Map expectedUserMap3 = new HashMap();


         expectedUserMap1.put("id",1);
         expectedUserMap1.put("first_name","George");
         expectedUserMap1.put("last_name","Bluth");

          expectedUserMap2.put("id",2);
           expectedUserMap2.put("first_name","Janet");
          expectedUserMap2.put("last_name","Weaver");

          expectedUserMap3.put("id",3);
           expectedUserMap3.put("first_name","Emma")  ;
          expectedUserMap3.put("last_name","Wong");

         List expectedList = new ArrayList();
         expectedList.add(expectedUserMap1);
         expectedList.add(expectedUserMap2);
         expectedList.add(expectedUserMap3);


         return expectedList;
    }


    public static class ValidateRegisterUser {














    }
}
