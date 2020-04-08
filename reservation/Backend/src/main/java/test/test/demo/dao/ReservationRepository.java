package test.test.demo.dao;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import test.test.demo.model.Reservation;

public interface ReservationRepository {

	public void createReservation (UUID reservationClient, Date reservationDate);
	
	public void insertReservation (Reservation reservation);
	
	public void updateReservation ();
	
	public void deleteReservation (UUID reservationUid);
	
	public List<Reservation> getReservations ();
	
	public Reservation getReservation (UUID reservationUid);
}
