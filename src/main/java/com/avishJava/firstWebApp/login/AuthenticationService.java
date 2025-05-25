package com.avishJava.firstWebApp.login;

import java.beans.JavaBean;

import org.springframework.stereotype.Service;

@Service
@JavaBean
public class AuthenticationService {
	public boolean authenticate(String UserId, String Password) {
		if(UserId.equalsIgnoreCase("avish") && Password.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
	}
}
