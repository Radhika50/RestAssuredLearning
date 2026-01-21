package Demo;

//packages
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
public class Demo9Post {
	
	@Test
	public void postRequestDemo() {
		baseURI="https://jsonplaceholder.typicode.com";
		Map<String,Object> requestBody=new HashMap<>();
		requestBody.put("title","restAssu");
		requestBody.put("body","post req");
		requestBody.put("userId", 120);
		
		given().contentType("application/json").body(requestBody)
			.when().post("/posts")
			.then()
				.statusCode(201)
				.body("title", equalTo("restAssu"))
				.body("userId", equalTo(120));
	}
	
}
