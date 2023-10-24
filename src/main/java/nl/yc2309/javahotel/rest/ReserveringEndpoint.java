package nl.yc2309.javahotel.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Kamer;
import nl.yc2309.javahotel.domein.Klant;
import nl.yc2309.javahotel.domein.Reservering;
import nl.yc2309.javahotel.persistence.KamerService;
import nl.yc2309.javahotel.persistence.ReserveringService;


@RestController
public class ReserveringEndpoint {
	@Autowired
	ReserveringService rs;
	
	
	@GetMapping("deReservering") // wat voor verzoek? in url bar
	public Iterable<Reservering> alleReserveringen() {
		return rs.geefAlleReserveringen();
	}
	
	@GetMapping("reservering/{id}")
	public Optional<Reservering> reservering(@PathVariable long id) {
		return rs.geefReservering(id);
	}
	
	@PostMapping("voegreserveringtoe")
	public void voegReserveringToe(@RequestBody Reservering reservering) {
		System.out.println("Hij doet het!");
		rs.slaReserveringOp(reservering);
	}
	
	@PutMapping("updatereservering")
	public Reservering updateReservering(@RequestBody Reservering reservering) {
		return rs.updateReservering(reservering);
	}
	
	@DeleteMapping("verwijderReservering/{ReserveringID}")
	public void verwijderReservering(@PathVariable("ReserveringID") int reserveringID) {
		rs.verwijderReservering(reserveringID);
	}
	
	
}
