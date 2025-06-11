package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.ProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	
	@Test(description="Verify update profile Info")
	public void updateProfileInfo() {
		AuthService authservice = new AuthService();
		LoginRequest request = new LoginRequest("Sravani", "Sravani@1410");
		Response response = authservice.login(request);
		LoginResponse loginresponse = response.as(LoginResponse.class);
		System.out.println(loginresponse.getToken());
		String tokenObtained = loginresponse.getToken();
		
		System.out.println("--------------------------------------------------");
		
		UserManagementService userService = new UserManagementService();
		response = userService.getProfile(tokenObtained);
		System.out.println(response.asPrettyString());
		ProfileResponse userResponse = response.as(ProfileResponse.class);
		Assert.assertEquals(userResponse.getUsername(), "Sravani");
		
		System.out.println("--------------------------------------------------");
		
		ProfileRequest profilerequest = new ProfileRequest.Builder().firstName("Sravani14")
				.lastName("M10")
				.mobileNumber("7890123456")
				.email("sravanisravs1410@gmail.com").build();
		response = userService.updateProfile(tokenObtained, profilerequest);
		System.out.println(response.asPrettyString());
		ProfileResponse userresponse2 = response.as(ProfileResponse.class);
		System.out.println(userresponse2.getUsername());
	}
}
