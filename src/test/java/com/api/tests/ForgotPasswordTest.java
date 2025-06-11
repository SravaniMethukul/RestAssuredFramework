package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description="Verify Forgot password Test")
	public void checkForgotPassword(){
		String email = "john187@gmail.com";
		AuthService auth = new AuthService();
		Response response = auth.forgotPassword(email);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
	}
}
