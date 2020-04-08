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
import test.test.demo.model.Reservation;
import test.test.demo.service.ClientService;

@RequestMapping("api/v1/client")
@RestController
@AllArgsConstructor
public class ClientController {

	@Autowired
	private final ClientService clientService;
	
	@PostMapping
	public int createClient (@RequestBody Client client) {		
		this.clientService.createClient(client);
		return 1;
	}
	
	@PutMapping(path = "{clientId}")
	public int addReservation (@PathVariable("clientId") UUID clientId, @RequestBody Reservation reservation) {
		this.clientService.addClientReservation(clientId, reservation);
		return 1;
	}
	
	@GetMapping(value = "/reservations/{clientId}")
	public List<Reservation> getClientReservations (@PathVariable("clientId") UUID clientId) {
		return this.clientService.getClientReservations(clientId);
	}
	
	@GetMapping(path = "{clientId}")
	public Client getClient (@PathVariable("clientId") UUID clientId) {
		return this.clientService.findClient(clientId);
	}
	
	@GetMapping
	public List<Client> getClients () {
		return this.clientService.getClients();
	}
}
