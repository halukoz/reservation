package test.test.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DerbyInMemoryEmbeddedDatabase derbyDb = DerbyInMemoryEmbeddedDatabase.getInstance();
		try {
			derbyDb.setUpDB();
			derbyDb.test();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
