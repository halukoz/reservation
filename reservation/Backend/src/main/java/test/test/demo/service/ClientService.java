package test.test.demo.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import test.test.demo.dao.ClientRepository;
import test.test.demo.model.Client;
import test.test.demo.model.Reservation;

@Service
@AllArgsConstructor
public class ClientService {
	
	@Autowired
	@Qualifier("fakeCli")
	private final ClientRepository clientnDao;

	public void createClient (String name) {
		this.clientnDao.createClient(name);
	}
	
	public void createClient (Client client) {
		this.clientnDao.insertClient(client);
	}
		
	public List<Client> getClients () {
		return this.clientnDao.getClients();
	}
	
	public Client findClient(UUID clientUid) {
		 return this.clientnDao.getClient(clientUid);
	}
	
	public List<Reservation> getClientReservations(UUID clientUid) {
		Client client = this.clientnDao.getClient(clientUid);
		return client.getReservations();
	}
	
	public void addClientReservation(UUID clientUid, Reservation reservation) {
		Client client = this.clientnDao.getClient(clientUid);
		this.clientnDao.addReservation(client, reservation);
	}

	public void findReservations(String type, Date date) {
		this.clientnDao.findClientsByFreeTime(type, date);
	}
}
