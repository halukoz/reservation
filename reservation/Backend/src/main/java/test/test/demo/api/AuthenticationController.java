package test.test.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import test.test.demo.model.User;
import test.test.demo.service.AuthenticationService;

@RequestMapping("api/v1/authenticate")
@RestController
@AllArgsConstructor
public class AuthenticationController {

	@Autowired
	private final AuthenticationService authenticateService;
	
	@PostMapping(path = "/login")
	public boolean login (String userName, String password) {
		return authenticateService.authenticateUser(userName, password);
	}
	
	@PostMapping(path = "/logout")
	public boolean logout (User user) {
		return authenticateService.logout(user);
	}
	
}
