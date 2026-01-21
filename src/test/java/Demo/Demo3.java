package Demo;

/*

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Demo3 {

    @Test
    public void user() {

        // Create a reference for Response interface
        Response response;

        // Public API instead of localhost
        response = RestAssured.get(
            "https://jsonplaceholder.typicode.com/users/1"
        );

        // Get JsonPath object from response
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Fetch value using JsonPath
        String name = jsonPathEvaluator.getString("name");

        // Print the value
        System.out.println("Name of the user is: " + name);

        // Direct fetch and print
        System.out.println("Name of the user is: " +
                jsonPathEvaluator.getString("name"));

        // Validate the value
        Assert.assertEquals(
            name, 
            "Leanne Graham",
            "Incorrect user name"
        );
    }
}
*/

import java.util.List;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Demo3 {

    @Test
    public void f() {

        // Step 1: Send GET request
        Response response = RestAssured.get(
            "https://jsonplaceholder.typicode.com/users"
        );

        // Step 2: Create JsonPath object
        JsonPath path = response.jsonPath();

        // Step 3: Fetch list of names from JSON array
        List<String> names = path.getList("name");

        // Step 4: Print total number of elements
        System.out.println("Total number of users: " + names.size());

        // Step 5: Print the entire list
        System.out.println("Names of the users are: " + names);

        // Step 6: Iterate through list
        for (String name : names) {
            System.out.println(name);
        }
        String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
    }
}

