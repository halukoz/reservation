package test.test.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import test.test.demo.model.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
	
	@JsonProperty("clientId")
	private final UUID clientId = UUID.randomUUID();
	@JsonProperty("clientName")
	private final String clientName;
	
	private String description;
	private Address address;
	
	private final List<UUID> userIds = new ArrayList<UUID>();
	private final List<User> users = new ArrayList<User>();
	private final List<String> types = new ArrayList<String>();
	private final List<String> keywords = new ArrayList<String>();
	private final List<Reservation> reservations = new ArrayList<Reservation>(); 
	
	public Client (String clientName) {	
		this.clientName = clientName;
	}
	
	public void addReservation (Reservation reservation) {
		this.reservations.add(reservation);
	}
	
	@Data
	private class Address {
		private UUID id;
		private String street;
		private String state;
		private String city;
		private String buildingNumber;
		private String country;
		private String postCode;
		private String apartmentNumber;
	}
}
