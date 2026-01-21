package Demo;

//packages
import org.testng.*;
import org.testng.annotations.Test;

import io.restassured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class Demo7 {

	//annotate as Test
	 @Test
	public void user() {
		Response response;
		response=RestAssured.get("https://jsonplaceholder.typicode.com/users");
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200,"Incorrect");
		

		//Validating STATUS LINE from response
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine , "HTTP/1.1 200 OK" , "INCorrect status Line returned");
		
		//Validating CONTENT TYPE from response
		String contentType = response.getContentType();
		Assert.assertEquals(contentType , "application/json; charset=utf-8");
		
		//value from body--node based use jsonPath
		JsonPath jsonPath=response.jsonPath();
		String namee=jsonPath.getString("name");
		System.out.println(namee);
		
		
		
	}
}
