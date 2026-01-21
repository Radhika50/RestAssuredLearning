package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
//import io.restassured.RestAssured;
import io.restassured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoTest {
	 @Test
	    public void firstTest() {
		 /* REST 2.1
		 	Response response;
		 	// https://reqres.in/api/users/2
		 	response=RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
		 	String responseBody=response.getBody().asString();
		 	System.out.println("response "+responseBody);
		 	*/
		 /* Demo 2
		 RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		 RestAssured.basePath="/posts";
		 RequestSpecification httpRequest=RestAssured.given();
		 Response response=httpRequest.pathParam("id",1).request(Method.GET,"/{id}");
		 String responseBody=response.getBody().asString();
		 System.out.println("response "+responseBody);
		 */
		 
		 /*Demo 3
		 //getContent and getSession 
		 Response response;
		 response=RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
		 String id=response.getSessionId();
		 System.out.println("Session ID:"+id);
		 String contentType=response.getContentType();
		 System.out.println("Content type value(json/xml)::"+contentType);
		 */
		 
		 //getStatusCode and getStatusLine
		 Response response;
		 response=RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
		 int statusCode=response.getStatusCode();
		 System.out.println("SCode"+statusCode);
		 
		 String statusLine=response.getStatusLine();
		 System.out.println("Status Line:"+ statusLine);
	     System.out.println("TestNG is working");
	    }
}
