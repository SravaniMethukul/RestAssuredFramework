package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class LoginAPITest2 extends BaseTest{
	@Test(description="Verify if login Api is working correctly")
	public void loginTest() {

		Response response = given().baseUri("http://64.227.160.186:8080")
				.header("Content-Type", "application/json")
				.body("{\"username\": \"Sravani\", "
				+ "\"password\": \"Sravani@1410\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
