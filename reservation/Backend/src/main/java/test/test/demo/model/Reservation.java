package test.test.demo.model;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Reservation {

	public enum STATUS {PENDING,APPROVED,REJECTED};
	
	@JsonProperty("id")
	private final UUID reservationUID = UUID.randomUUID();
	@JsonProperty("clientUid")
	private final UUID reservationClient;
	@JsonProperty("date")
	private final Date reservationDate;
	@JsonProperty("duration")
	private short duration;
	private STATUS status; 
	private ReservationDetails details;
	
	public Reservation (UUID reservationClient, Date reservationDate) {
		this.reservationClient = reservationClient;
		this.reservationDate = reservationDate;
	}
		
	@Data
	private class ReservationDetails {
		private String name;
		private String phoneNumber;
		private String email;
		private String description;
	}
	
}
