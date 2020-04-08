package test.test.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import test.test.demo.dao.UserRepository;
import test.test.demo.model.Client;
import test.test.demo.model.User;

@Service
@AllArgsConstructor
public class UserService {

	@Autowired
	@Qualifier("fakeUser")
	private final UserRepository userRepository;
	
	public void createUser(User user) {
	
	}

	public void updateUser(UUID userId, User user) {
		// TODO Auto-generated method stub
		
	}

	public List<Client> getUserClients(UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getuser(UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
