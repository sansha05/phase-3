package com.authentication;

public class UserAuthentication {

	public boolean authenticate(String username, String password) {
		
		if (username.equals("username") && password.equals("password")) {
			return true;
		} else {
			return false;
		}
	}
}
