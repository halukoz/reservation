package test.test.demo.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import test.test.demo.model.Client;
import test.test.demo.model.User;
import test.test.demo.service.UserService;


@RequestMapping("api/v1/user")
@RestController
@AllArgsConstructor
public class UserController {
	
	@Autowired
	private final UserService userService;
	
	@PostMapping
	public int createUser (@RequestBody User user) {		
		this.userService.createUser(user);
		return 1;
	}
	
	@PutMapping(path = "{userId}")
	public int updateUser (@PathVariable("userId") UUID userId, @RequestBody User user) {
		this.userService.updateUser(userId, user);
		return 1;
	}
	
	@GetMapping(value = "/clients/{userId}")
	public List<Client> getUserClients (@PathVariable("userId") UUID userId) {
		return this.userService.getUserClients(userId);
	}
	
	@GetMapping(path = "{userId}")
	public User getUser (@PathVariable("userId") UUID userId) {
		return this.userService.getuser(userId);
	}
	
	@GetMapping
	public List<User> getUsers () {
		return this.userService.getUsers();
	}
}
