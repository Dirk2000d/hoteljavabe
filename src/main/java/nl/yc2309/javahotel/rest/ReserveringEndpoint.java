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
import nl.yc2309.javahotel.dto.SaveReserveringDto;
import nl.yc2309.javahotel.persistence.KamerService;
import nl.yc2309.javahotel.persistence.KlantenService;
import nl.yc2309.javahotel.persistence.ReserveringService;


@RestController
public class ReserveringEndpoint {

	@Autowired
	ReserveringService rs;
	
	@Autowired
	private KamerService kamerService;
	
	@Autowired
	private KlantenService klantService;
	
	@GetMapping("deReservering") // wat voor verzoek? in url bar
	public Iterable<Reservering> alleReserveringen() {
		return rs.geefAlleReserveringen();
	}
	
	@GetMapping("reservering/{id}")
	public Optional<Reservering> reservering(@PathVariable long id) {
		return rs.geefReservering(id);
	}
	
	@PostMapping("voegreserveringtoe")
	public Reservering voegReserveringToe(@RequestBody SaveReserveringDto dto) {
		System.out.println("Hij doet het!");
		
		Optional<Kamer> kamerOptional = kamerService.geefKamer(dto.getKamerId());
		if (kamerOptional.isEmpty()) {
			return null;
		}

		Optional<Klant> klantOptional = klantService.geefKlant(dto.getKlantId());
		if (klantOptional.isEmpty()) {
			return null;
		}

		Reservering reservering = new Reservering();
		reservering.setAankomstDatum(dto.getAankomstDatum());
		reservering.setAantalPersonen(dto.getAantalPersonen());
		reservering.setBetaald(false);
		reservering.setKlant(klantOptional.get());
		reservering.setKamer(kamerOptional.get());
		reservering.setOntbijt(dto.isOntbijt());
		reservering.setVertrekdatum(dto.getVertrekdatum());
		
		rs.slaReserveringOp(reservering);
		
		return reservering;
	}
	
	@PutMapping("updatereservering/{id}")
	public Reservering updateReservering(@PathVariable long id, @RequestBody SaveReserveringDto dto) {
		Optional<Reservering> reserveringOptional = rs.geefReservering(id);
		if (reserveringOptional.isEmpty()) {
			return null;
		}

		Optional<Kamer> kamerOptional = kamerService.geefKamer(dto.getKamerId());
		if (kamerOptional.isEmpty()) {
			return null;
		}

		Optional<Klant> klantOptional = klantService.geefKlant(dto.getKlantId());
		if (klantOptional.isEmpty()) {
			return null;
		}

		Reservering reservering = reserveringOptional.get();
		reservering.setAankomstDatum(dto.getAankomstDatum());
		reservering.setAantalPersonen(dto.getAantalPersonen());
		reservering.setKlant(klantOptional.get());
		reservering.setKamer(kamerOptional.get());
		reservering.setOntbijt(dto.isOntbijt());
		reservering.setVertrekdatum(dto.getVertrekdatum());
		
		return rs.updateReservering(reservering);
	}
	
	@DeleteMapping("verwijderReservering/{ReserveringID}")
	public void verwijderReservering(@PathVariable("ReserveringID") int reserveringID) {
		rs.verwijderReservering(reserveringID);
	}

	
	
}
