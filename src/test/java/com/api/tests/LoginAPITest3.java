package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest3 extends BaseTest{

	@Test(description = "Verify if login Api is working correctly")
	public void loginTest() {

		//serialize data 
		LoginRequest loginRequest = new LoginRequest("Sravani", "Sravani@1410");
		
		AuthService auth = new AuthService();
		Response response = auth.login(loginRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//de-serialize data (convert JSON to java class object)
		LoginResponse loginresponse = response.as(LoginResponse.class);
		
		System.out.println(loginresponse.getToken());
		System.out.println(loginresponse.getEmail());
		System.out.println(loginresponse.getId());
		
		Assert.assertEquals(loginresponse.getEmail(), "sravanisravs1410@gmail.com");
		Assert.assertTrue(loginresponse.getToken() != null);
		Assert.assertEquals(loginresponse.getId(), 1537, "Id is not equal");
	}
}
