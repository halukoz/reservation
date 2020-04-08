package test.test.demo;

import java.sql.*;

public class DerbyInMemoryEmbeddedDatabase {

	private static DerbyInMemoryEmbeddedDatabase instance= null;
	
	public static DerbyInMemoryEmbeddedDatabase getInstance () {
		if (instance == null) {
			instance = new DerbyInMemoryEmbeddedDatabase();
		} 
		return instance;
	}
	
	private String reservation  = "CREATE TABLE Reservation (id int NOT NULL AUTO_INCREMENT, "
			+ " uid varchar(128) NOT NULL, "
			+ " clientUid varchar(128) NOT NULL,"
			+ " date  datetime NOT NULL,"
			+ " duration tinyint,"
			+ " status bit,"
			+ " details varchar(MAX) NOT NULL,"
			+ " PRIMARY KEY (uid), "  
			+ " CONSTRAINT FK_ClientUid FOREIGN KEY (clientUid) "
			+ " REFERENCES Client(uid))";
	
	private String client  = "CREATE TABLE Client (id int NOT NULL AUTO_INCREMENT, "
			+ " uid varchar(128) NOT NULL, "
			+ " clientUid varchar(128) NOT NULL,"
			+ " name varchar(128) NOT NULL,"
			+ " description varchar(MAX),"
			+ " address varchar(128),"
			+ " PRIMARY KEY (uid) " ;
	
	private String [] queires = { client, reservation };
	
	
	public void setUpDB () throws SQLException {
		
		String databaseURL = "jdbc:derby:Reservation;create=true";
		 
		Connection conn = DriverManager.getConnection(databaseURL);
		Statement statement = conn.createStatement();
		
		for (String query : queires) {
			statement.execute(query);
		}

		statement.close();
	}

	public void tearDownDB () {
		
		try {
		    DriverManager.getConnection("jdbc:derby:;shutdown=true");
		 
		} catch (SQLException ex) {
		    if (ex.getSQLState().equals("XJ015")) {
		        System.out.println("Derby shutdown normally");
		    } else {
		        // could not shutdown the database
		        // handle appropriately
		    }
		}
	}
	
	private boolean doesTableExists(String tableName, Connection conn) throws SQLException {
		DatabaseMetaData meta = conn.getMetaData();
		ResultSet result = meta.getTables(null, null, tableName.toUpperCase(), null);
		return result.next();
	}
	
	public void test() throws SQLException {
		
		String databaseURL = "jdbc:derby:Reservation";
		
		Connection conn = DriverManager.getConnection(databaseURL);
		Statement statement = conn.createStatement();
		 
		String sql = "SELECT * FROM Client";
		ResultSet result = statement.executeQuery(sql);
		
		while (result.next()) {
			System.out.println(result.getString("uid"));
		}
		
		statement.close();
	}
}
