package test.test.demo.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class User {


	private  UUID id;
	private  String name;
	private  String surname;
	private  String login;
	private  String password;
	private List<UUID> clients;
	
	public User (UUID id, String name, String surname, String login, String password) {
		this.id = id == null ? UUID.randomUUID() : id;
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.password = password;
	}
}
