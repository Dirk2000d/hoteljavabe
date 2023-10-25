package nl.yc2309.javahotel.rest;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Klant;
import nl.yc2309.javahotel.domein.Reservering;
import nl.yc2309.javahotel.dto.ResponseDto;
import nl.yc2309.javahotel.persistence.KlantenService;

@RestController
public class KlantEndpoint {
	@Autowired
	KlantenService ks;
	
	
	@GetMapping("deklanten")
	public Iterable<Klant> alleKlanten() {
		return ks.geefAlleKlanten();
	}
	@GetMapping("klant/{id}")
	public Optional<Klant> klant(@PathVariable long id) {
		return ks.geefKlant(id);
	}
	
	@PostMapping("voegklanttoe")
	public ResponseDto alleKlanten(@RequestBody Klant klant) {
		boolean succes = ks.slaKlantOp(klant);

		if (succes) {
			return new ResponseDto();
		} else {
			return new ResponseDto(false, Arrays.asList("Email bestaat al"));
		}
	}
	
	@DeleteMapping("verwijderklant/{id}")
	public void verwijderKlant(@PathVariable int id) {
		ks.verwijderKlant(id);
	}
	
	@PutMapping("updateklant")
	public Klant updateKlant(@RequestBody Klant klant) {
		return ks.updateKlant(klant);
	}
	
	@GetMapping("voegreserveringtoe/{klantid}/{reserveringid}")
	public void kenReserveringAanKlantToe(@PathVariable("klantid") long klantid, @PathVariable("reserveringid") long reserveringid){
		ks.kenreserveringtoeaanklant(klantid, reserveringid);
	}
	
	
	
	@PostMapping("loginklant")
	public ResponseDto loginKlant(@RequestBody Klant klant) {
		boolean succes = ks.loginKlant(klant);

		if (succes) {
			return new ResponseDto();
		} else {
			return new ResponseDto(false, Arrays.asList("Email bestaat al of wachtwoord komt niet overeen"));
		}
	}
}
