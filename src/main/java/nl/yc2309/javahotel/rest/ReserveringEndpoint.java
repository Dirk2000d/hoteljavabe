package nl.yc2309.javahotel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Kamer;
import nl.yc2309.javahotel.domein.Reservering;
import nl.yc2309.javahotel.persistence.KamerService;
import nl.yc2309.javahotel.persistence.ReserveringService;


@RestController
public class ReserveringEndpoint {
	@Autowired
	ReserveringService ks;
	
	
	@GetMapping("deReservering") // wat voor verzoek? in url bar
	public Iterable<Reservering> alleReserveringen() {
		return ks.geefAlleReserveringen();
	}
	
	@PostMapping("voegReserveringToe")
	public void voegReserveringToe(@RequestBody Reservering reservering) {
		System.out.println("Hij doet het!");
		ks.slaReserveringOp(reservering);
	}
	
	@DeleteMapping("verwijderReservering/{ReserveringID}")
	public void verwijderReservering(@PathVariable("ReserveringID") int reserveringID) {
		ks.Reservering(reserveringID);
	}
	
	
}
