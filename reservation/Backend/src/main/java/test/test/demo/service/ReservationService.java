package test.test.demo.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import test.test.demo.dao.ReservationRepository;
import test.test.demo.model.Reservation;

@Service
@AllArgsConstructor
public class ReservationService {

	@Autowired
	@Qualifier("fakeRes")
	private final ReservationRepository reservationDao;

	public void createReservation (UUID clientUid, Date date) {
		this.reservationDao.createReservation(clientUid, date);
	}
	
	public void createReservation (Reservation reservation) {
		this.reservationDao.insertReservation(reservation);
	}
	
	public List<Reservation> getReservations () {
		return this.reservationDao.getReservations();
	}
	
}
