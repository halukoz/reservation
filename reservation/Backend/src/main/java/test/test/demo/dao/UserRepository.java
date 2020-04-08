package test.test.demo.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import test.test.demo.model.User;

public interface UserRepository {

	public void createUser (String name, String surname, String login, String password);
	
	public void updateUser ();
	
	public void deleteUser ();
}
