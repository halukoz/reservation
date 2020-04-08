package test.test.demo.dao;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import test.test.demo.model.Client;
import test.test.demo.model.Reservation;

public interface ClientRepository {

	public void createClient (String name);
	
	public void insertClient (Client client);
	
	public void updateClient ();
	
	public void deleteClient (UUID clientUid);
	
	public List<Client> getClients ();
	
	public Client getClient (UUID clientUid);
	
	public void addReservation (Client client, Reservation reservation);
	
	public List<Client> findClientsByType (List<String> types);
	
	public List<Client> findClientsByKeyword (List<String> keywords);

	public void findClientsByFreeTime(String type, Date date);
	
}
