package test.test.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import test.test.demo.model.Reservation;

@Repository("fakeRes")
public class FakeReservationDataAccessService implements ReservationRepository {

	private static List<Reservation> DB_Res = new ArrayList<Reservation>();
	
	@Override
	public void createReservation(UUID reservationClient, Date reservationDate) {
		DB_Res.add(new Reservation(reservationClient, reservationDate));
	}
	
	@Override
	public void insertReservation(Reservation reservation) {
		DB_Res.add(reservation);		
	}

	@Override
	public void updateReservation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReservation(UUID reservationUid) {
		Iterator<Reservation> iterator = DB_Res.iterator();
		while (iterator.hasNext()) {
			Reservation next = iterator.next();
			if (next.getReservationUID().equals(reservationUid)) {
				iterator.remove();
			}
		}

	}

	@Override
	public List<Reservation> getReservations() {
		return DB_Res;
	}

	@Override
	public Reservation getReservation(UUID reservationUid) {
		for (Reservation reservation : DB_Res) {
			if (reservation.getReservationUID().equals(reservationUid)) {
				return reservation;
			}
		}
		return null;
	}


}
