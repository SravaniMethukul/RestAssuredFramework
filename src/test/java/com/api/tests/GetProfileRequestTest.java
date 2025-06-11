package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.ProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test(description="Get User Profile Details")
	public void getProfileDetails() {
		
		AuthService authservice = new AuthService();
		LoginRequest request = new LoginRequest("Sravani", "Sravani@1410");
		Response response = authservice.login(request);
		LoginResponse loginresponse = response.as(LoginResponse.class);
		System.out.println(loginresponse.getToken());
		String tokenObtained = loginresponse.getToken();
		
		UserManagementService userService = new UserManagementService();
		Response response1 = userService.getProfile(tokenObtained);
		// de-serialize the JSON to java class
		ProfileResponse profileResponse = response1.as(ProfileResponse.class);
		System.out.println(profileResponse.getId());
		System.out.println(profileResponse.getUsername());
		
	}
}
