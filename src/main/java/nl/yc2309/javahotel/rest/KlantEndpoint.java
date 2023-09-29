package nl.yc2309.javahotel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Klant;
import nl.yc2309.javahotel.persistence.KlantenService;

@RestController
public class KlantEndpoint {
	@Autowired
	KlantenService ks;
	
	
	@GetMapping("deklanten")
	public Iterable<Klant> alleKlanten() {
		return ks.geefAlleKlanten();
	}
	@PostMapping("voegklanttoe")
	public String alleKlanten(@RequestBody Klant klant) {
		ks.slaKlantOp(klant);
		return "klant Toegevoegd";
	}
	
	@DeleteMapping("verwijderklant/{klantid}")
	public void verwijderKlant(@PathVariable("klantid") int klantid) {
		ks.verwijderKamer(klantid);
	}
	
	@PutMapping("updateklant")
	public Klant updateKlant(@RequestBody Klant klant) {
		return ks.updateKlant(klant);
	}
}
