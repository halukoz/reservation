package test.test.demo.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import test.test.demo.model.Reservation;
import test.test.demo.service.ClientService;
import test.test.demo.service.ReservationService;

@RequestMapping("api/v1/reservation")
@RestController
@AllArgsConstructor
public class ReservationController {

	@Autowired
	private final ReservationService reservationService;
	
	@Autowired
	private final ClientService clientService;
	
	@PostMapping
	public void createReservation (@RequestBody Reservation reservation) {
		this.reservationService.createReservation(reservation);
	}
	
	@GetMapping
	public void getReservation () {
		this.reservationService.getReservations();
	}
	
	@PostMapping (value = "/find")
	public void findReservation (@RequestParam("type") String type, @RequestParam("date") Date date) {
		this.clientService.findReservations(type, date);
	}
}
