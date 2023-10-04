package nl.yc2309.javahotel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Betaling;
import nl.yc2309.javahotel.persistence.BetalingService;

@RestController
public class BetalingEndpoint {
	@Autowired
	BetalingService bs;
	
	@GetMapping("debetalingen")
	public Iterable<Betaling> alleBetalingen(){
		return bs.geefAlleBetalingen();
	}
	
	@PostMapping("voegbetalingtoe")
	public void voegBetalingToe(@RequestBody Betaling betaling) {
		bs.slaBetalingOp(betaling);
	}
	
	@PutMapping("updatebetaling")
	public Betaling updateBetaling(@RequestBody Betaling betaling) {
		return bs.updateBetaling(betaling);
	}
	
	@DeleteMapping("verwijderBetaling/{betalingid}")
	public void verwijderBetaling(@PathVariable("betalingid")int betalingid) {
		bs.verwijderBetaling(betalingid);
	}
}
