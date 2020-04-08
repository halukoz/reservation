package test.test.demo.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import test.test.demo.model.User;

@Service
@AllArgsConstructor
public class AuthenticationService {
	
	public boolean authenticateUser (String userName, String password) {
		return false;
	}
	
	public boolean login (String userName, String password) {
		return authenticateUser(userName, password);
	}
	
	public boolean logout (User user) {
		return false;
	}

	public String getSession () {
		return "";
	}
	
	public String checkSession (String session) {
		return "";
	}
	
	public boolean voidSession (String session) {
		return false;
	}
	
}
