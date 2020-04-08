package test.test.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("fakeUser")
public class FakeUserDataAccessDao implements UserRepository {

	@Override
	public void createUser(String name, String surname, String login, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

}
