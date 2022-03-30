package com.testauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.authentication.UserAuthentication;

@RunWith(JUnitPlatform.class)
public class TestUserAuthentication {
	
	
	@Test
	public void testAuthentication() {
		UserAuthentication auth = new UserAuthentication();
		Assertions.assertEquals(true, auth.authenticate("username", "password"), "username and password is matched");
	}
	

}
