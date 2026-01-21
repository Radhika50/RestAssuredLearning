package Demo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class Demo2 {
	@Test
	public void user() {
		
		/* Demo 5
		//Create a reference for Response interface
	    Response response;
	    
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
	    response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
	    
		// Get all the headers, return value is of type Headers.
		Headers allHeaders = response.getHeaders();
		// Headers class implements Iterable interface.
		// Iterate over all the Headers using an advance for loop as shown in the code below
		for (Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
		*/
		//Create a reference for Response interface
	    Response response;
	    
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
	    response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
	    
		// Reader header is passed with exact header name as argument.
	    // In the below line,we will get header named "Content-Type"
    	String contentType = response.header("Content-Type");
    	System.out.println("Content-Type value: " + contentType);
    	
        // Reader header is passed with exact header name as argument.
	    // In the below line,we will get header named "Server"
    	String serverType =  response.header("Server");
    	System.out.println("Server value: " + serverType);
    	
    	// Reader header is passed with exact header name as argument.
	    // In the below line,we will get header named "Date"
	    String date = response.header("Date");
    	System.out.println("Date value: " + date);
    
        // Reader header is passed with exact header name as argument.
	    // In the below line,we will get header named "Content-Encoding"
    	String contentEnco = response.header("Content-Encoding");
    	System.out.println("Content-Encoding: " + contentEnco);
    	
    	// Reader header is passed with exact header name as argument.
	    // In the below line,we will get header named "Transfer-Encoding"
    	String transferEnco = response.header("Transfer-Encoding");
    	System.out.println("Transfer-Encoding value: " + transferEnco);
    	
		System.out.println("TestNG is working");
	}
	

}
