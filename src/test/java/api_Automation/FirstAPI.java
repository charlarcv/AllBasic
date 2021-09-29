package api_Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class FirstAPI {

	private String name;
	private String job;
	
	public String getName() {
		return name;
	}
	public void getName(String name) {
		this.name=name;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job=job;
	}
	
	
	// Failure Test case
	//@Test
	public void TC001_API() {
		
		Response resp = when().
		get("https://reqres.in/api/users?page=2");
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
		}
	
	//Success test case 
	//@Test
	public void STC002() {
		
		Response resp = when().
		get("https://reqres.in/api/users?page=2");
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.asString());
		
		}
	
	//Post success
	//@Test
	public void STC003() {
		
		Response resp = 
				given().
				body("{\n"
						+ "    \"name\": \"morpheus\",\n"
						+ "    \"job\": \"leader\"\n"
						+ "}").
		
		when().
		contentType(ContentType.JSON).
		post("https://reqres.in/api/users");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
		
		
		}
	
	
	//@Test
	public void TC004() {
		
		FirstAPI post =new FirstAPI();
		post.setJob(job);
		post.setJob(name);
		Response resp =
		given().
		when().
		contentType(ContentType.JSON).
		body(post).
		post("https://reqres.in/api/users");
		System.out.println("Response " + resp);
		
	}
	
	//@Test
	public void TEST005() {
		
		FirstAPI post= new FirstAPI();
		
		post.setJob("morpheus");
		post.setJob("zion resident");
		Response resp=
		given().
		when().
		contentType(ContentType.JSON).
		body(post).
		put("https://reqres.in/api/users/2");
		System.out.println("Put response "+ resp.asString());
		Assert.assertEquals(resp.getStatusCode(), 200);
		
			
	}
	
	//@Test
	public void TC006() {
		Response resp=
		given().
		body("{\n"
				+ "    \"name\": \"morpheus\",\n"
				+ "    \"job\": \"zion resident rcvvvv\"\n"
				+ "}").
		when().
		contentType(ContentType.JSON).
		patch("https://reqres.in/api/users/2");
		Assert.assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.asString());
		
	}
	
	@Test
	public void TC008() {
		Response resp = given().
				when().
				delete("https://reqres.in/api/users/2");
		Assert.assertEquals(resp.getStatusCode(), 204);
		System.out.println(resp.asString());
		
				
		
	}
	
	
	
}
