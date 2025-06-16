package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest1 {

	@Test(description="Verify if login Api is working correctly")
	public void loginTest() {
		
		RestAssured.baseURI = "http://64.227.160.186:8080";
		RequestSpecification x = RestAssured.given();
		RequestSpecification y = x.header("Content-Type", "application/json");
		RequestSpecification z = y.body("{\"username\": \"Sravani\", "
				+ "\"password\": \"Sravani@1410\"}");
		Response response = z.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
