package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest extends BaseTest{
	
	@Test(description="Verify if Account creation is working")
	public void createAccountTest() {
		
		SignUpRequest signUpRequest = new SignUpRequest.Builder().username("user189")
		.password("user1234")
		.email("john179@gmail.com")
		.firstName("john")
		.lastName("k")
		.mobileNumber("9165938367").build();
		
		AuthService auth = new AuthService();
		Response response = auth.signUp(signUpRequest);
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200, "user not created successfully");
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}
}
