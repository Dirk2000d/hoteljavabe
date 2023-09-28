package nl.yc2309.javahotel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Kamer;
import nl.yc2309.javahotel.persistence.KamerService;

@RestController
public class KamerEndpoint {
	@Autowired
	KamerService ks;
	
	
	@GetMapping("dekamers") // wat voor verzoek? in url bar
	public Iterable<Kamer> alleKamers() {
		return ks.geefAlleKamers();
	}
	
	@PostMapping("voegkamertoe")
	public void voegKamerToe(@RequestBody Kamer kamer) {
		ks.slaKamerOp(kamer);
	}
	
	@DeleteMapping("verwijderkamer/{kamerid}")
	public void verwijderKamer(@PathVariable("kamerid") int kamerid) {
		ks.verwijderKamer(kamerid);
	}
	
	@PutMapping("updatekamer/{kamerid}")
	public Kamer updateKamer(@RequestBody Kamer kamer,@PathVariable("kamerid") int kamerid) {
		return ks.updateKamer(kamer, kamerid);
	}
}
