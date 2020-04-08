package test.test.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import test.test.demo.model.Client;
import test.test.demo.model.Reservation;

@Repository("fakeCli")
public class FakeClientDataAccessService implements ClientRepository {

	private static List<Client> DB_Cli = new ArrayList<Client>();
	
	@Override
	public void createClient(String name) {		
		DB_Cli.add(new Client(name));
	}

	@Override
	public void insertClient(Client client) {
		DB_Cli.add(client);
	}
	
	@Override
	public void updateClient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteClient(UUID clientUid) {
		Iterator<Client> iterator = DB_Cli.iterator();
		while (iterator.hasNext()) {
			Client next = iterator.next();
			if (next.getClientId().equals(clientUid)) {
				iterator.remove();
			}
		}
	}

	@Override
	public List<Client> getClients() {
		return DB_Cli;
	}

	@Override
	public Client getClient(UUID clientUid) {
		for (Client client : DB_Cli) {
			if (client.getClientId().equals(clientUid)) {
				return client;
			}
		}
		return null;
	}

	@Override
	public void addReservation(Client client, Reservation reservation) {
		int indexOf = DB_Cli.indexOf(client);
		if (indexOf != -1) {
			DB_Cli.get(indexOf).addReservation(reservation);
		}
	}

	@Override
	public List<Client> findClientsByType(List<String> types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findClientsByKeyword(List<String> keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findClientsByFreeTime(String type, Date date) {
		List <Client> freeClients = new ArrayList<Client>();
		
		for (Client client : DB_Cli) {
			if ( client.getTypes().contains(type) ) {				
				freeClients.add(client);
			}
		}
	}
}
